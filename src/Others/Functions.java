package Others;

import Database.*;
import UI.LoginPage;
import UI.PopUp.DataDeleted;
import UI.PopUp.NoConnection;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import rakibs.traders.RakibsTraders;
import java.lang.Math;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Functions {
    
    public static void logoutLog(){
        Connection con = DBConnectionProvider.getDBConnection();
        String query = "update user_log set log_out=? where SL=?";
        try{
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setObject(1, dateTime());
            pstmt.setInt(2, LoginPage.getRef().sl());
            pstmt.executeUpdate();
                
        }catch(Exception ex){
            System.out.println("Failed to get DBConn:: "+ex.getMessage());
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);
        }
    }
    
    private static String dateTime(){
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = new Date();
        String date = dFormat.format(d);
        return date;
    }
    
    public static String empIDGenerator(String date){
        Connection con = DBConnectionProvider.getDBConnection();
        String query = "select count(emp_ID) as rowcount from employee where StartingDate = ?";
        String query2 = "select count(emp_ID) as rowcount from employee where emp_ID = ?";
        String id = "null";
        String year = date.substring(6);
        String month = date.substring(3,5);
        String date1 = date.substring(0,date.indexOf("/"));
        date = year + "-" + month + "-" + date1;
        boolean flag = true;
        //System.out.println(date);
        try{
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1,date);
//            System.out.println(pstmt);
            ResultSet rs= pstmt.executeQuery();
            Integer number = 0;
            while(rs.next())
                number=rs.getInt("rowcount");//to get rowcount
            //System.out.println(number);
            year = date.substring(0, date.indexOf("-"));
            month = date.substring(5,7);
            date1 = date.substring(date.lastIndexOf("-")+1);
            date=date1+month+year;
            PreparedStatement pstmt1 = con.prepareStatement(query2);
            while(flag){
                id = "EMP#" + date + "-" + Integer.toString(number++);
                pstmt1.setString(1,id);
                ResultSet rs2= pstmt1.executeQuery();
                while(rs2.next()){
                    if(rs2.getInt("rowcount") == 0)
                        flag = false;
                }
            } 
            //System.out.println(id);
        }catch(Exception ex){
            System.out.println("No database connection"+ex);
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);
        }
        return id;
    }
    
    public static String expIDGenerator(String date){
        Connection con = DBConnectionProvider.getDBConnection();
        String query = "select count(exp_ID) as rowcount from expenses where date = ?";
        String query2 = "select count(exp_ID) as rowcount from expenses where exp_id = ?";
        String id = "null";
        String year = date.substring(6);
        String month = date.substring(3,5);
        String date1 = date.substring(0,date.indexOf("/"));
        date = year + "-" + month + "-" + date1;
        boolean flag = true;
        //System.out.println(date);
        try{
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1,date);
//            System.out.println(pstmt);
            ResultSet rs= pstmt.executeQuery();
            Integer number = 0;
            while(rs.next())
                number=rs.getInt("rowcount");//to get rowcount
            //System.out.println(number);
            year = date.substring(0, date.indexOf("-"));
            month = date.substring(5,7);
            date1 = date.substring(date.lastIndexOf("-")+1);
            date=date1+month+year;
            PreparedStatement pstmt1 = con.prepareStatement(query2);
            while(flag){
                id = "EXP#" + date + "-" + Integer.toString(number++);
                pstmt1.setString(1,id);
                ResultSet rs2= pstmt1.executeQuery();
                while(rs2.next()){
                    if(rs2.getInt("rowcount") == 0)
                        flag = false;
                }
            } 
            //System.out.println(id);
        }catch(Exception ex){
            System.out.println("No database connection"+ex);
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);
        }
        return id;
    }
    
    
    public static String productIDGenerator(String model){
        Connection con = DBConnectionProvider.getDBConnection();
        String query1= "select count(products_id) as rowcount from products";
        String query2= "select count(products_id) as rowcount from products where products_id = ?";
        String id="0";
        boolean flag = true;
        try{
            Statement stmt = con.createStatement();
            ResultSet rs= stmt.executeQuery(query1);
            Integer number = 0;
            while(rs.next())
                number=rs.getInt("rowcount");//to get rowcount
            //System.out.println(number);
            PreparedStatement pstmt1 = con.prepareStatement(query2);
            while(flag){
                id = "#" + model + "-" + Integer.toString(number++);
                pstmt1.setString(1,id);
                ResultSet rs2= pstmt1.executeQuery();
                while(rs2.next()){
                    if(rs2.getInt("rowcount") == 0)
                        flag = false;
                }
            }
        }catch(Exception ex){
            System.out.println("No database connection"+ex);
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);
        }
        return id;
    }
    
    
    public static String vendorIDGenerator(String num){
        Connection con = DBConnectionProvider.getDBConnection();
        String query= "select count(vendor_id) as rowcount from vendors";
        String query2= "select count(vendor_id) as rowcount from vendors where vendor_id = ?";
        String id="0";
        boolean flag = true;
        try{
            Statement stmt = con.createStatement();
            ResultSet rs= stmt.executeQuery(query);
            Integer number = 0;
            while(rs.next())
                number=rs.getInt("rowcount");//to get rowcount
            //System.out.println(number);
            PreparedStatement pstmt1 = con.prepareStatement(query2);
            while(flag){
                id = "#V" + num + "-" + Integer.toString(number++);
                pstmt1.setString(1,id);
                ResultSet rs2= pstmt1.executeQuery();
                while(rs2.next()){
                    if(rs2.getInt("rowcount") == 0)
                        flag = false;
                }
                //System.out.println(id);
            }    
        }catch(Exception ex){
            System.out.println("No database connection"+ex);
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);
        }
        return id;
    }
    
    public static String customerIDGenerator(String num){
        Connection con = DBConnectionProvider.getDBConnection();
        String query= "select count(customer_ID) as rowcount from customer";
        String query2= "select count(customer_ID) as rowcount from customer where customer_ID = ?";
        String id="0";
        boolean flag = true;
        try{
            Statement stmt = con.createStatement();
            ResultSet rs= stmt.executeQuery(query);
            Integer number = 0;
            while(rs.next())
                number=rs.getInt("rowcount");//to get rowcount
            //System.out.println(number);
            PreparedStatement pstmt1 = con.prepareStatement(query2);
            while(flag){
                id = "#C" + num + "-" + Integer.toString(number++);
                pstmt1.setString(1,id);
                ResultSet rs2= pstmt1.executeQuery();
                while(rs2.next()){
                    if(rs2.getInt("rowcount") == 0)
                        flag = false;
                }
                //System.out.println(id);
            }    
        }catch(Exception ex){
            System.out.println("No database connection"+ex);
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);
        }
        return id;
    }
    
     public static String invoiceIDGenerator( String date ){
        Connection con = DBConnectionProvider.getDBConnection();
        String query = "select count(invoice_ID) as rowcount from invoice_list where date = ?";
        String query2 = "select count(invoice_ID) as rowcount from invoice_list where invoice_ID = ?";
        
        String id = "null";
        String year = date.substring(6);
        String month = date.substring(3,5);
        String date1 = date.substring(0,date.indexOf("/"));
        date = year + "-" + month + "-" + date1;
        boolean flag = true;
        
        try{
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1,date);
//            System.out.println(pstmt);
            ResultSet rs = pstmt.executeQuery();
            Integer number = 0;
            while( rs.next() )
                number = rs.getInt("rowcount"); // Getting the rowcount
//            System.out.println(number + "");
            year = date.substring(0,date.indexOf("-"));
            month = date.substring(5,7);
            date1 = date.substring(date.lastIndexOf("-")+1);
//            System.err.println(date1);
            date = date1 + month + year;
            PreparedStatement pstmt1 = con.prepareStatement(query2);
            while(flag){
                id = "INV#" + date + "-" + Integer.toString(number++);
                pstmt1.setString(1,id);
                ResultSet rs2= pstmt1.executeQuery();
                while(rs2.next()){
                    if(rs2.getInt("rowcount") == 0)
                        flag = false;
                }
            }

        }catch(Exception ex){
            System.out.println("No database connection"+ex);
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);
        }
        
        return id;
        
    }
    
    
    public static String billIDGenerator(String date){
        Connection con = DBConnectionProvider.getDBConnection();
        String query= "select count(billing_id) as rowcount from bill_list where date = ?";
        String query2= "select count(billing_id) as rowcount from bill_list where billing_id = ?";
        String id="null";
        String year = date.substring(6);
        String month = date.substring(3,5);
        String date1 = date.substring(0,date.indexOf("/"));
        date = year + "-" + month + "-" + date1;
        boolean flag = true;
        //System.out.println(date);
        try{
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1,date);
//            System.out.println(pstmt);
            ResultSet rs= pstmt.executeQuery();
            Integer number = 0;
            while(rs.next())
                number=rs.getInt("rowcount");//to get rowcount
            //System.out.println(number);
            year = date.substring(0, date.indexOf("-"));
            month = date.substring(5,7);
            date1 = date.substring(date.lastIndexOf("-")+1);
            date=date1+month+year;
            PreparedStatement pstmt1 = con.prepareStatement(query2);
            while(flag){
                id = "B#" + date + "-" + Integer.toString(number++);
                pstmt1.setString(1,id);
                ResultSet rs2= pstmt1.executeQuery();
                while(rs2.next()){
                    if(rs2.getInt("rowcount") == 0)
                        flag = false;
                }
            } 
            //System.out.println(id);
        }catch(Exception ex){
            System.out.println("No database connection"+ex);
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);
        }
        return id;
    }
    
    
    public static Integer receiptIdPayGenerator(String invoicID){
        Integer number = 0;
        Connection con = DBConnectionProvider.getDBConnection();
        String query1= "select count(ID) as rowcount from payment where ID = ?";
        String query2= "select count(ID) as rowcount from payment where ID = ? and receipt_ID = ?";
        boolean flag = true;
        try{
            PreparedStatement stmt = con.prepareStatement(query1);
            stmt.setString(1,invoicID);
            ResultSet rs= stmt.executeQuery();
            
            while(rs.next())
                number=rs.getInt("rowcount");//to get rowcount
//            System.out.println("VALUE = " + number);
            PreparedStatement pstmt1 = con.prepareStatement(query2);
            while( flag ){
                number++;
                pstmt1.setString(1,invoicID);
                pstmt1.setInt(2,number);
                ResultSet rs2= pstmt1.executeQuery();
                while(rs2.next()){
                    if(rs2.getInt("rowcount") == 0)
                        flag = false;
                }
            }
        }catch(Exception ex){
            System.out.println("No database connection"+ex);
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);
        }
        
        return number;
    
    }
    
    public static Double quantity(Double box, Double pcs, String productId){
            Double qty = 0.0;
            Integer pcs_per_box = 0;
            String itemUnit = "";
            Connection con = DBConnectionProvider.getDBConnection();
            String query= "select pcs_per_box, item_unit from products where products_id = ?";
            //model.add("11Start point");
            try{
                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setString(1,productId);
                ResultSet rs= pstmt.executeQuery();
                while(rs.next()){
                    pcs_per_box = rs.getInt("pcs_per_box");
                    itemUnit = rs.getString("item_unit");
                }
                    
            }catch(Exception ex){
                System.out.println("No database connection"+ex);
                NoConnection no = new NoConnection();
                RakibsTraders.popUp(no);

            }
            if(itemUnit.equals("Box") || itemUnit.equals("box") && pcs_per_box > 0){
                Double addBox = pcs/pcs_per_box;
                box+=addBox;
                qty=box;
            }else if(itemUnit.equals("Pcs") || itemUnit.equals("PCs") || itemUnit.equals("PCS") && pcs_per_box > 0){
                Double addPcs = pcs_per_box*box;
                pcs+=addPcs;
                qty=pcs;
            
            }
            return qty;
    }
    
    private static String feetToBox(Double feet, String productId){
        String boxAndPcs = "0";
        Connection con = DBConnectionProvider.getDBConnection();
        String query= "select pcs_per_box, dimension from products where products_id = ?";
        //model.add("11Start point");
        try{
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1,productId);
            ResultSet rs= pstmt.executeQuery();
            while(rs.next()){
                Integer pcs_per_box = rs.getInt("pcs_per_box");
                String dimension = rs.getString("dimension");
                Double width = 0.0;
                Double height = 0.0;
                if(dimension.indexOf("*")>0){
                    width = Double.parseDouble(dimension.substring(0,dimension.indexOf("*")));
                    height = Double.parseDouble(dimension.substring(dimension.indexOf("*")+1));
                }else if(dimension.indexOf("X")>0){
                    width = Double.parseDouble(dimension.substring(0,dimension.indexOf("X")));
                    height = Double.parseDouble(dimension.substring(dimension.indexOf("X")+1));
                }else if(dimension.indexOf("x")>0){
                    width = Double.parseDouble(dimension.substring(0,dimension.indexOf("x")));
                    height = Double.parseDouble(dimension.substring(dimension.indexOf("x")+1));
                }
                
                //System.out.println(""+width+" "+height);
                Double feetPerPcs = (width*height)/144;
                //System.out.println(""+width);
                Double pcs =  Math.ceil(feet/feetPerPcs);
                //System.out.println("pcs after ceil: "+pcs);
                //System.out.println(""+height);
                //System.out.println(""+pcs);
                
                Double extra = Math.ceil(pcs%pcs_per_box);
                //System.out.println("Etra: "+extra);
                Double box =  Math.ceil(pcs-extra)/pcs_per_box;
                //System.out.println(""+extra);
                //System.out.println("box: "+box);
                boxAndPcs = ""+box+":"+extra;
            }

        }catch(Exception ex){
            System.out.println("No database connection"+ex);
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);

        }
        return boxAndPcs;
    }
    
    private static String boxAndPcsToFeet(Double box, Double pcs, String productId){
        String feet="0";
        Connection con = DBConnectionProvider.getDBConnection();
        String query= "select pcs_per_box, dimension from products where products_id = ?";
        //model.add("11Start point");
        try{
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1,productId);
            ResultSet rs= pstmt.executeQuery();
            while(rs.next()){
                Integer pcs_per_box = rs.getInt("pcs_per_box");
                String dimension = rs.getString("dimension");
                Double width = 0.0;
                Double height = 0.0;
                if(dimension.indexOf("*")>0){
                    width = Double.parseDouble(dimension.substring(0,dimension.indexOf("*")));
                    height = Double.parseDouble(dimension.substring(dimension.indexOf("*")+1));
                }else if(dimension.indexOf("X")>0){
                    width = Double.parseDouble(dimension.substring(0,dimension.indexOf("X")));
                    height = Double.parseDouble(dimension.substring(dimension.indexOf("X")+1));
                }else if(dimension.indexOf("x")>0){
                    width = Double.parseDouble(dimension.substring(0,dimension.indexOf("x")));
                    height = Double.parseDouble(dimension.substring(dimension.indexOf("x")+1));
                }
                //System.out.println(""+width+" "+height);
                Double boxPcs =  Math.ceil(box*pcs_per_box);
                Double sumPcs = pcs+boxPcs;
                Double ft =  sumPcs*((width*height)/144);
                NumberFormat nf = NumberFormat.getInstance();
                nf.setMaximumFractionDigits(3);            
                nf.setGroupingUsed(false);
                feet = nf.format(ft);
            }

        }catch(Exception ex){
            System.out.println("No database connection"+ex);
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);

        }
        //return feet.substring(0, feet.indexOf("."+4));
        return feet;
    } 
    
    private static boolean isAdjusting(JComboBox cbInput) {
        if (cbInput.getClientProperty("is_adjusting") instanceof Boolean) {
            return (Boolean) cbInput.getClientProperty("is_adjusting");
        }
        return false;
    }

    private static void setAdjusting(JComboBox cbInput, boolean adjusting) {
        cbInput.putClientProperty("is_adjusting", adjusting);
    }
    
    public static  ArrayList<String> productID(){
        Connection con = DBConnectionProvider.getDBConnection();
        String query= "select products_id from products";
        ArrayList<String> productID = new ArrayList<>();
        //companyName.add("11Start point");
        try{
            Statement stmt = con.createStatement();
            ResultSet rs= stmt.executeQuery(query);
            while(rs.next())
                productID.add(rs.getString("products_id"));
        }catch(Exception ex){
            System.out.println("No database connection"+ex);
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);
        }
        return productID;
    }
    
    public static  ArrayList<String> vendorID(){
        Connection con = DBConnectionProvider.getDBConnection();
        String query= "select vendor_id from vendors";
        ArrayList<String> vendorID = new ArrayList<>();
        //companyName.add("11Start point");
        try{
            Statement stmt = con.createStatement();
            ResultSet rs= stmt.executeQuery(query);
            while(rs.next())
                vendorID.add(rs.getString("vendor_id"));
        }catch(Exception ex){
            System.out.println("No database connection"+ex);
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);
        }
        return vendorID;
    }
    
    public static  ArrayList<String> customerID(){
        Connection con = DBConnectionProvider.getDBConnection();
        String query= "select customer_ID from customer";
        ArrayList<String> customerID = new ArrayList<>();
        //companyName.add("11Start point");
        try{
            Statement stmt = con.createStatement();
            ResultSet rs= stmt.executeQuery(query);
            while(rs.next())
                customerID.add(rs.getString("customer_ID"));
        }catch(Exception ex){
            System.out.println("No database connection"+ex);
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);
        }
        return customerID;
    }
    
    public static  ArrayList<String> employeeID(){
        Connection con = DBConnectionProvider.getDBConnection();
        String query= "select emp_ID from employee";
        ArrayList<String> employeeID = new ArrayList<>();
        //companyName.add("11Start point");
        try{
            Statement stmt = con.createStatement();
            ResultSet rs= stmt.executeQuery(query);
            while(rs.next())
                employeeID.add(rs.getString("emp_ID"));
        }catch(Exception ex){
            System.out.println("No database connection"+ex);
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);
        }
        return employeeID;
    }
    
    public static  ArrayList<String> employeeIDAndName(){
        Connection con = DBConnectionProvider.getDBConnection();
        String query= "select emp_ID, employee_name from employee";
        ArrayList<String> employeeIDName = new ArrayList<>();
        //companyName.add("11Start point");
        try{
            Statement stmt = con.createStatement();
            ResultSet rs= stmt.executeQuery(query);
            while(rs.next()){
                employeeIDName.add(rs.getString("emp_ID"));
                employeeIDName.add(rs.getString("employee_name"));
            }
                
        }catch(Exception ex){
            System.out.println("No database connection"+ex);
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);
        }
        return employeeIDName;
    }
    
    public static  ArrayList<String> companyName(){
        Connection con = DBConnectionProvider.getDBConnection();
        String query= "select company_name from products";
        ArrayList<String> companyName = new ArrayList<>();
        //companyName.add("11Start point");
        try{
            Statement stmt = con.createStatement();
            ResultSet rs= stmt.executeQuery(query);
            while(rs.next())
                companyName.add(rs.getString("company_name"));
        }catch(Exception ex){
            System.out.println("No database connection"+ex);
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);
        }
        return companyName;
    }
    
    public static  ArrayList<String> model(String companyName){
        Connection con = DBConnectionProvider.getDBConnection();
        String query= "select model from products where company_name = ?";
        ArrayList<String> model = new ArrayList<>();
        //model.add("11Start point");
        try{
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1,companyName);
            ResultSet rs= pstmt.executeQuery();
            while(rs.next())
                model.add(rs.getString("model"));
        }catch(Exception ex){
            System.out.println("No database connection"+ex);
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);
            
        }
        return model;
    }
    
    public static  ArrayList<String> dimension(String companyName, String model){
        Connection con = DBConnectionProvider.getDBConnection();
        String query= "select dimension from products where company_name = ? and model = ?";
        ArrayList<String> dimension = new ArrayList<>();
        //dimension.add("11Start point");
        try{
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1,companyName);
            pstmt.setString(2,model);
            ResultSet rs= pstmt.executeQuery();
            while(rs.next())
                dimension.add(rs.getString("dimension"));
        }catch(Exception ex){
            System.out.println("No database connection"+ex);
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);
            
        }
        return dimension;
    }
    
    
    public static void setupAutoComplete(final JTextField txtInput, final ArrayList<String> items) {
        final DefaultComboBoxModel model = new DefaultComboBoxModel();
        final JComboBox cbInput = new JComboBox(model) {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(super.getPreferredSize().width, 0);
            }
        };
        setAdjusting(cbInput, false);
        for (String item : items) {
            model.addElement(item);
        }
        cbInput.setSelectedItem(null);
        cbInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isAdjusting(cbInput)) {
                    if (cbInput.getSelectedItem() != null) {
                        txtInput.setText(cbInput.getSelectedItem().toString());
                    }
                }
            }
        });

        txtInput.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                setAdjusting(cbInput, true);
                if(txtInput.getText().equals("")){
                    //System.out.println("Into the empty field");
                }else{
                    if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    if (cbInput.isPopupVisible()) {
                        e.setKeyCode(KeyEvent.VK_ENTER);
                    }
                    }
                    if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN) {
                        e.setSource(cbInput);
                        cbInput.dispatchEvent(e);
                        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                            txtInput.setText(cbInput.getSelectedItem().toString());
                            cbInput.setPopupVisible(false);
                        }
                    }
                    if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                        cbInput.setPopupVisible(false);
                    }
                }
                
                setAdjusting(cbInput, false);
            }
        });
        txtInput.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateList();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateList();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateList();
            }

            private void updateList() {
                setAdjusting(cbInput, true);
                model.removeAllElements();
                String input = txtInput.getText();
                if (!input.isEmpty()) {
                    for (String item : items) {
                        if (item.toLowerCase().startsWith(input.toLowerCase())) {
                            model.addElement(item);
                        }
                    }
                }
                cbInput.setPopupVisible(model.getSize() > 0);
                setAdjusting(cbInput, false);
            }
        });
        txtInput.setLayout(new BorderLayout());
        txtInput.add(cbInput, BorderLayout.SOUTH);
    }
    
    
    public static void deleteEmployee(String empID ){
           Connection con = DBConnectionProvider.getDBConnection();
           String query = "DELETE FROM employee WHERE emp_ID = ?";
           
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, empID);
            pstmt.executeUpdate();
            DataDeleted page = new DataDeleted();
            page.setMessage("Employee");
            RakibsTraders.popUp(page);
            
        } catch (SQLException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Failed to get DBConn:: "+ex.getMessage());
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);
        }
    
    }
    
    
    
    
    public static void delete(String productID){
        Connection con = DBConnectionProvider.getDBConnection();
        String query = "DELETE FROM products WHERE products_id = ?";
        try{
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1,productID);
            pstmt.executeUpdate();
        }catch(Exception ex){
            System.out.println("Failed to get DBConn:: "+ex.getMessage());
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);
        }    
    }
    
    
    //for set value at feet field
    public static void boxAndPcsToFeet(JTextField productIDField, JTextField boxField, JTextField pcsField, JTextField feetField){
        String box = boxField.getText();
        String pcs = pcsField.getText();
        if(box.equals("")) box="0";
        if(pcs.equals("")) pcs="0";
        String productId = productIDField.getText();
        String feet = Functions.boxAndPcsToFeet(Double.parseDouble(box), Double.parseDouble(pcs), productId);
        feetField.setText(feet);
        //feetToBoxAndPcs(productIDField, boxField, pcsField, feetField);
    }
    
    public static void feetToBoxAndPcs(JTextField productIDField, JTextField boxField, JTextField pcsField, JTextField feetField){
        String feet = feetField.getText();
        String productId = productIDField.getText();
        if(!feet.equals("")){
            Double ft = Double.parseDouble(feet);  
            //System.out.println("feet : "+ft);
            String boxAndPcs = Functions.feetToBox(ft,productId);
            //System.out.println(boxAndPcs);
            String box = boxAndPcs.substring(0,boxAndPcs.indexOf("."));
            String pcs = boxAndPcs.substring(boxAndPcs.indexOf(":")+1,boxAndPcs.lastIndexOf("."));
            boxField.setText(box);
            //System.out.println(box);
            pcsField.setText(pcs);
            //String box = jTextFieldItemBuyQtyBox.getText();
            //String pcs = jTextFieldItemBuyQtyPcs.getText();
            if(box.equals("")) box="0";
            if(pcs.equals("")) pcs="0";
            if(!box.equals("")){
                Double bx = Double.parseDouble(box);
                //System.out.println(boxAndPcs);
                //String productId = txtProductID.getText();
                String feet1 = Functions.boxAndPcsToFeet(Double.parseDouble(box), Double.parseDouble(pcs),productId);
                feetField.setText(feet1);
            }
        }
    
    }
    
    public static void pcsToBoxAndPcs(JTextField productIDField, JTextField boxField, JTextField pcsField){
            String productId = productIDField.getText();
            //String boxAndPcs = Functions.feetToBox(ft,productId);
            //System.out.println(boxAndPcs);
            //String box = boxField.getText();
            String pcs = pcsField.getText();
//            boxField.setText(box);
//            pcsField.setText(pcs);
            //String box = jTextFieldItemBuyQtyBox.getText();
            //String pcs = jTextFieldItemBuyQtyPcs.getText();
            Connection con = DBConnectionProvider.getDBConnection();
            String query= "select pcs_per_box from products where products_id = ?";
            //model.add("11Start point");
            Double boxD = 0.0;
            Double pcsD = 0.0;
            try{
                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setString(1,productId);
                ResultSet rs= pstmt.executeQuery();
                while(rs.next()){
                    Integer pcs_per_box = rs.getInt("pcs_per_box");
                    //System.out.println(""+width+" "+height);
                    //Double sumPcs =  (box*pcs_per_box)+pcs;
                    pcsD = Double.parseDouble(pcs)%pcs_per_box;
                    boxD = Double.parseDouble(pcs)-pcsD/pcs_per_box;
                    boxField.setText(""+boxD);
                    pcsField.setText(""+pcsD);
                }

            }catch(Exception ex){
                System.out.println("No database connection"+ex);
                NoConnection no = new NoConnection();
                RakibsTraders.popUp(no);

            }
    
    }
    
    public static void price(JTextField unitPrice, Double units, JTextField priceField ){
        Double unitPriceD = Double.parseDouble(unitPrice.getText());
        Double total = units*unitPriceD;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);            
        nf.setGroupingUsed(false);
        priceField.setText(""+nf.format(total));
        
    }
    
    public static void boxAndPcsToBoxAndPcs(JTextField productIDField, JTextField boxField, JTextField pcsField){
        Connection con = DBConnectionProvider.getDBConnection();
        String query= "select pcs_per_box from products where products_id = ?";
        //model.add("11Start point");
        Double box=0.0;
        Double pcs=0.0;
        if(!boxField.getText().equals("")) 
            box = Double.parseDouble(boxField.getText());;
            
        if(!pcsField.getText().equals("")) 
            pcs = Double.parseDouble(pcsField.getText());
        
//        System.out.println("box: "+box);
//        System.out.println("pcs: "+pcs);
        
        Double boxD = 0.0;
        Double pcsD = 0.0;
        String productID = productIDField.getText();
        try{
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1,productID);
            ResultSet rs= pstmt.executeQuery();
            while(rs.next()){
                Integer pcs_per_box = rs.getInt("pcs_per_box");
                //System.out.println("pcs per box: "+pcs_per_box);
                Double sumPcs =  (box*pcs_per_box)+pcs;
                //System.out.println("sum pcs: "+sumPcs);
                pcsD = Math.ceil(sumPcs%pcs_per_box);
                //System.out.println("extra pcs: "+pcsD);
                boxD = (sumPcs-pcsD)/pcs_per_box;
                //System.out.println("box: "+boxD);
                
            }
            boxField.setText(""+boxD);
            pcsField.setText(""+pcsD);

        }catch(Exception ex){
            System.out.println("No database connection"+ex);
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);

        }
    }  
    
    public static Double boxAndPcsToBox(Double box, Double pcs, String productID){
        Connection con = DBConnectionProvider.getDBConnection();
        String query= "select pcs_per_box from products where products_id = ?";
        //model.add("11Start point");
        Double boxD = 0.0;
        try{
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1,productID);
            ResultSet rs= pstmt.executeQuery();
            while(rs.next()){
                Integer pcs_per_box = rs.getInt("pcs_per_box");
                //System.out.println(""+width+" "+height);
                Double sumPcs =  (box*pcs_per_box)+pcs;
                boxD = sumPcs/pcs_per_box;
                
            }

        }catch(Exception ex){
            System.out.println("No database connection"+ex);
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);

        }
        return boxD;
    }
    
    public static Double boxAndPcsToPcs(Double box, Double pcs, String productID){
        Connection con = DBConnectionProvider.getDBConnection();
        String query= "select pcs_per_box from products where products_id = ?";
        //model.add("11Start point");
        Double pcsD = 0.0;
        try{
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1,productID);
            ResultSet rs= pstmt.executeQuery();
            while(rs.next()){
                Integer pcs_per_box = rs.getInt("pcs_per_box");
                //System.out.println(""+width+" "+height);
                pcsD =  (box*pcs_per_box)+pcs;
                
            }

        }catch(Exception ex){
            System.out.println("No database connection"+ex);
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);

        }
        return pcsD;
    }
}
