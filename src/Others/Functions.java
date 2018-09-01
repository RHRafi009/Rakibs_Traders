package Others;

/**
 *
 * @author RH Rafi
 */

import Database.*;
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

public class Functions {
    
    
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
    
    
    public static String vendorIDGenerator(String name){
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
                id = "#" + name + "-" + Integer.toString(number++);
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
        String query= "select count(billing_id) as rowcount from bills where date = ?";
        String query2= "select count(billing_id) as rowcount from bills where billing_id = ?";
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
    
    public static String feetToBox(Double feet, String productId){
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
                Double width = Double.parseDouble(dimension.substring(0,dimension.indexOf("*")));
                Double height = Double.parseDouble(dimension.substring(dimension.indexOf("*")+1));
                //System.out.println(""+width+" "+height);
                Double feetPerPcs = (width*height)/144;
                Double pcs =  Math.ceil(feet/feetPerPcs);
                //System.out.println(""+width);
                //System.out.println(""+height);
                System.out.println(""+pcs);
                
                Double extra = pcs%pcs_per_box;
                System.out.println(""+extra);
                Double box =  (pcs-extra)/pcs_per_box;
                System.out.println(""+extra);
                System.out.println(""+box);
                boxAndPcs = ""+box+":"+extra;
            }

        }catch(Exception ex){
            System.out.println("No database connection"+ex);
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);

        }
        return boxAndPcs;
    }
    
    public static String boxAndPcsToFeet(Double box, Double pcs, String productId){
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
                Double width = Double.parseDouble(dimension.substring(0,dimension.indexOf("*")));
                Double height = Double.parseDouble(dimension.substring(dimension.indexOf("*")+1));
                //System.out.println(""+width+" "+height);
                Double boxPcs =  Math.ceil(box*pcs_per_box);
                Double sumPcs = pcs+boxPcs;
                Double ft =  sumPcs*((width*height)/144);
                feet = ""+ft;
            }

        }catch(Exception ex){
            System.out.println("No database connection"+ex);
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);

        }
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
    
    public static void delete(String productID, String companyName, String model, String  dimension){
        Connection con = DBConnectionProvider.getDBConnection();
        String query = "DELETE FROM products WHERE company_name = ? and model = ? and dimension = ?";
        try{
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1,companyName);
            pstmt.setString(2,model);
            pstmt.setString(3,dimension);
            pstmt.executeUpdate();
        }catch(Exception ex){
            System.out.println("Failed to get DBConn:: "+ex.getMessage());
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);
        }    
    }
}
