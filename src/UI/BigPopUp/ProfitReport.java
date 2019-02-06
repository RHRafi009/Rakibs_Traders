package UI.BigPopUp;

import Database.DBConnectionProvider;
import UI.PopUp.NoConnection;
import com.placeholder.PlaceHolder;
import graph.ProfitReportGraph;
import java.awt.List;
import java.awt.event.WindowEvent;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.Stage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import rakibs.traders.RakibsTraders;

public class ProfitReport extends javax.swing.JFrame {
    /**
     * Creates new form ProductsTable
     *
     * select profit from invoice_products where invoice_ID in ( SELECT invoice_ID from invoice_list where date BETWEEN " 17/09/2018" and " 25/09/2018")
     * select profit from invoice_products where invoice_products.product_ID="#AT-001-4" and invoice_ID in ( SELECT invoice_ID from invoice_list where date BETWEEN " 17/09/2018" and " 25/09/2018")
     * 
     * 
     * */
    PlaceHolder place;
    
    public ProfitReport() {
        initComponents();
        initTable();
        setIcon();
        place = new PlaceHolder(jTextFieldSearchProduct,"Search Product");
        if(!(jCheckBox1.isSelected())){
            jTextFieldSearchProduct.setEnabled(false);
            jButtonGO1.setEnabled(false);
        }
        
        if( !(jCheckBox2.isSelected()) ){
            jDateChooser2.setEnabled(false);
        }
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrPaneTable = new javax.swing.JScrollPane();
        lblExpenseHistory = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButtonGO = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextFieldSearchProduct = new javax.swing.JTextField();
        jButtonGO1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonRefresh = new javax.swing.JButton();
        jButtonViewStock2 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(scrPaneTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 1030, 290));

        lblExpenseHistory.setFont(new java.awt.Font("Titillium", 0, 22)); // NOI18N
        lblExpenseHistory.setForeground(new java.awt.Color(67, 196, 114));
        lblExpenseHistory.setText("Profit Report");
        getContentPane().add(lblExpenseHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 130, 43));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Reports by:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 150, 40));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 200, 30));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("FROM:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 50, 30));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 220, 30));

        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText(" TO");
        jCheckBox2.setContentAreaFilled(false);
        jCheckBox2.setFocusable(false);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 80, 30));

        jButtonGO.setBackground(new java.awt.Color(0, 0, 153));
        jButtonGO.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonGO.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGO.setText("GO");
        jButtonGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGOActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 60, 30));

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Active Product");
        jCheckBox1.setContentAreaFilled(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 160, -1));

        jTextFieldSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchProductActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSearchProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 180, 30));

        jButtonGO1.setBackground(new java.awt.Color(0, 0, 153));
        jButtonGO1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonGO1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGO1.setText("GO");
        jButtonGO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGO1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 110, 60, 30));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Time Selected: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 120, 40));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("#Days");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 100, 40));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Total Profit Gained:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 130, 40));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText(" = ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 30, 40));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Item found :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 90, 40));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("#Item");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 120, 40));

        jButton1.setBackground(new java.awt.Color(220, 70, 9));
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setText("GRAPH ON SELLS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 470, 150, 30));

        jButtonRefresh.setBackground(new java.awt.Color(0, 0, 153));
        jButtonRefresh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonRefresh.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRefresh.setText("REFRESH");
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 30, 110, 30));

        jButtonViewStock2.setBackground(new java.awt.Color(0, 51, 153));
        jButtonViewStock2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonViewStock2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonViewStock2.setText("STOCK");
        jButtonViewStock2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewStock2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonViewStock2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 120, 30));

        jButton2.setBackground(new java.awt.Color(220, 70, 9));
        jButton2.setForeground(new java.awt.Color(254, 254, 254));
        jButton2.setText("PROFIT GRAPH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 470, 150, 30));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("#Total");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 170, 40));

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("#Profit Gained");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 160, 40));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("+");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 30, 40));

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("#Returned Product Cash");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 180, 40));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/background.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -360, 2540, 1380));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public ArrayList<String> dates = new ArrayList<String>();
    public ArrayList<Double> values = new ArrayList<Double>();
    public ArrayList<String> datesByDay = new ArrayList<String>();
    public ArrayList<Double> valuesByDay = new ArrayList<Double>();
    
    
    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        if( !(jCheckBox2.isSelected()) ){
            jDateChooser2.setEnabled(false);
        }
        else{
            jDateChooser2.setEnabled(true);
        }

    }//GEN-LAST:event_jCheckBox2ActionPerformed
 
    DefaultTableModel data = new DefaultTableModel(new String[]{"Date", "ProductID", "Profit Gained" }, 0);
    private void jButtonGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGOActionPerformed
        // TODO add your handling code here:
        data.getDataVector().removeAllElements();
        table.setModel(data);
        scrPaneTable.getViewport().add(table);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String startingDate = dateFormat.format(jDateChooser1.getDate());

        if( !startingDate.equals("") && !( jCheckBox2.isSelected()) ){ // just working with starting date;

            Connection con = DBConnectionProvider.getDBConnection();
            String query = "SELECT invoice_products.profit,invoice_list.date,invoice_products.product_ID FROM invoice_products INNER JOIN invoice_list ON invoice_products.invoice_ID = invoice_list.invoice_ID  and  date = ? order by invoice_list.invoice_ID asc";
            String query2 = "SELECT date,sum( invoice_products.profit ) as sum FROM invoice_products INNER JOIN invoice_list ON invoice_products.invoice_ID = invoice_list.invoice_ID  and  date = ? order by invoice_list.invoice_ID asc";
            String query3 = "select sum(returned_list.original_total-returned_list.total_cashBack) as sum from returned_list  where date = ? GROUP by returned_list.date";
            
            int rownum = 0;

            try{
                PreparedStatement pstmt1 = con.prepareStatement(query);
                pstmt1.setString(1, startingDate); // It stored in database with a fucking extra space. fakfakfkakfkakfkakfkafkakfk
                ResultSet rs= pstmt1.executeQuery();
                BigDecimal totalValueOfSearch = BigDecimal.ZERO;
                dates.clear(); values.clear();
                datesByDay.clear(); valuesByDay.clear();

                if(rs.next()){
                    do{
                        rownum++;
                        String col1 = rs.getString("date");
                        String col2 = rs.getString("product_ID");
                        Double col3 = rs.getDouble("profit");
                        dates.add(col1);
                        values.add(col3);
                        totalValueOfSearch = totalValueOfSearch.add(new BigDecimal(col3));
                        data.addRow(new Object[]{col1, col2, String.format("%.4f",col3)});

                    }while(rs.next());
                    table.setModel(data);
                    rs.close();
                    
                    PreparedStatement pstmt2 = con.prepareStatement(query2);
                    pstmt2.setString(1, startingDate); // It stored in database with a fucking extra space. fakfakfkakfkakfkakfkafkakfk
                    ResultSet rs2 = pstmt2.executeQuery();
                    while( rs2.next() ){
                        datesByDay.add(rs2.getString("date"));
                        valuesByDay.add(rs2.getDouble("sum"));
                    }
                    rs2.close();
                    Double returnedProfit = 0.0;
                    PreparedStatement pstmt3 = con.prepareStatement(query3);
                    pstmt3.setString(1, startingDate); // It stored in database with a fucking extra space. fakfakfkakfkakfkakfkafkakfk
                    ResultSet rs3 = pstmt3.executeQuery();
                    while( rs3.next() ){
                        returnedProfit = rs3.getDouble("sum");
//                        System.err.println(rs3.getString("sum"));
                    }
                    rs3.close();
                    
                    jLabel9.setText(rownum + "");
                    jLabel12.setText(String.format("%.4f",totalValueOfSearch));
                    jLabel15.setText(String.format("%.4f",returnedProfit));
                    jLabel11.setText(String.format("%.4f",(totalValueOfSearch) = totalValueOfSearch.add(new BigDecimal(returnedProfit)) ));
                    
                    
                }

            }catch(Exception ex){
                System.out.println("No database connection"+ex);
                NoConnection no = new NoConnection();
                RakibsTraders.popUp(no);
            }
        }
        else{
            //            select * from invoice_list where date between " 05/09/2018" and " 08/09/2018"
            String endingDate = dateFormat.format(jDateChooser2.getDate());
            Connection con = DBConnectionProvider.getDBConnection();
            String query = "SELECT invoice_products.profit,invoice_list.date,invoice_products.product_ID FROM invoice_products INNER JOIN invoice_list ON invoice_products.invoice_ID = invoice_list.invoice_ID  and  date between ? and ? order by invoice_list.invoice_ID asc";
            String query2 = "SELECT date ,sum( invoice_products.profit ) as sum FROM invoice_products INNER JOIN invoice_list ON invoice_products.invoice_ID = invoice_list.invoice_ID where date between ? and ? GROUP by invoice_list.date order by date asc";
            String query3 = "select sum(returned_list.original_total-returned_list.total_cashBack) as total from returned_list GROUP by date having date BETWEEN ? and ? ";
            int rownum = 0;

            try{
                PreparedStatement pstmt1 = con.prepareStatement(query);
                pstmt1.setString(1, startingDate); // It is stored in database with a fucking extra space. fakfakfkakfkakfkakfkafkakfk
                pstmt1.setString(2, endingDate); // It is stored in database with a fucking extra space. fakfakfkakfkakfkakfkafkakfk
                ResultSet rs= pstmt1.executeQuery();
                BigDecimal totalValueOfSearch = BigDecimal.ZERO;
                dates.clear(); values.clear();
                datesByDay.clear(); valuesByDay.clear();
                
                if(rs.next()){
                    do{
                        rownum++;
                        String col1 = rs.getString("date");
                        String col2 = rs.getString("product_ID");
                        Double col3 = rs.getDouble("profit");
//                        String custName = getData(col);
                        dates.add(col1);
                        values.add(col3);
                        totalValueOfSearch = totalValueOfSearch.add(new BigDecimal(col3));
                        
                        data.addRow(new Object[]{col1, col2, String.format("%.4f",col3)});

                    }while(rs.next());
                    table.setModel(data);
                    
                    PreparedStatement pstmt2 = con.prepareStatement(query2);
                    pstmt2.setString( 1, startingDate);
                    pstmt2.setString( 2, endingDate);
                    
                    ResultSet rs2 = pstmt2.executeQuery();
                    while( rs2.next() ){
                        datesByDay.add(rs2.getString("date"));
                        valuesByDay.add(rs2.getDouble("sum"));
//                        System.err.println( rs2.getString("date") + " " + rs2.getDouble("sum"));

                    }
                    rs.close();
                    
                    Double returnedProfit = 0.0;
                    PreparedStatement pstmt3 = con.prepareStatement(query3);
                    pstmt3.setString(1, startingDate); 
                    pstmt3.setString(2, endingDate); 
                    ResultSet rs3 = pstmt3.executeQuery();
                    while( rs3.next() ){
                        returnedProfit += rs3.getDouble("total");
//                        System.err.println( returnedProfit );
                    }
                    rs3.close();
                    
                    Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse(startingDate);
                    Date d2 = new SimpleDateFormat("yyyy-MM-dd").parse(endingDate);
                    long diff = d2.getTime() - d1.getTime();
                    jLabel7.setText(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS) + " Days");
                    jLabel9.setText(rownum + "");
                    jLabel12.setText(String.format("%.4f",totalValueOfSearch));
                    jLabel15.setText(String.format("%.4f",returnedProfit));
                    jLabel11.setText(String.format("%.4f",(totalValueOfSearch) = totalValueOfSearch.add(new BigDecimal(returnedProfit)) ));
                }

            }catch(Exception ex){
                System.out.println("No database connection"+ex);
                NoConnection no = new NoConnection();
                RakibsTraders.popUp(no);
            }

        }

    }//GEN-LAST:event_jButtonGOActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if((jCheckBox1.isSelected()) ){
            jTextFieldSearchProduct.setEnabled(true);
            jButtonGO1.setEnabled(true);
        }
        else{
            jTextFieldSearchProduct.setEnabled(false);
            jButtonGO1.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextFieldSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchProductActionPerformed

    private void jButtonGO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGO1ActionPerformed
        // TODO add your handling code here:
        JTable table2 = new JTable();
        DefaultTableModel data2 = new DefaultTableModel(new String[]{"Date", "Product ID", "Profit Gained" }, 0);

        data.getDataVector().removeAllElements();
        table2.setModel(data2);
        scrPaneTable.getViewport().add(table2);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        if( !jCheckBox2.isSelected() && jTextFieldSearchProduct.getText().startsWith("#") ){
            // Working with only date
            String productID = jTextFieldSearchProduct.getText();
            String startingDate = dateFormat.format(jDateChooser1.getDate());
            Connection con = DBConnectionProvider.getDBConnection();

            String query = "SELECT invoice_products.profit,invoice_list.date,invoice_products.product_ID FROM invoice_products INNER JOIN invoice_list ON invoice_products.invoice_ID = invoice_list.invoice_ID  and  date = ? and invoice_products.product_ID = ? order by invoice_list.invoice_ID asc";
            String query2 = "SELECT date, sum( invoice_products.profit ) as sum FROM invoice_products INNER JOIN invoice_list ON invoice_products.invoice_ID = invoice_list.invoice_ID  and  date = ? order by invoice_list.invoice_ID asc";
            
            
            dates.clear(); values.clear();
            datesByDay.clear(); valuesByDay.clear();

            try {
                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setString( 1, startingDate );
                pstmt.setString( 2, productID );
                ResultSet rs = pstmt.executeQuery();
                //                System.err.println("Working2");
                Integer rowcount= 0;
                BigDecimal totalForSearch = BigDecimal.ZERO; // Ne sala , kha eibar koto error khaite paros

                while( rs.next() ){
                    rowcount++;
                    String col1 = rs.getString("date");
                    String col2 = productID;
                    Double col3 = rs.getDouble("profit");
                    dates.add(col1);
                    values.add(col3);
                    
                    totalForSearch = totalForSearch.add(new BigDecimal(col3));
                    data2.addRow(new Object[]{col1,col2,String.format("%.4f",col3)});
                }
                PreparedStatement pstmt2 = con.prepareStatement(query2);
                pstmt2.setString(1, startingDate); // It stored in database with a fucking extra space. fakfakfkakfkakfkakfkafkakfk
                ResultSet rs2 = pstmt2.executeQuery();
                while( rs2.next() ){
                    datesByDay.add(rs2.getString("date"));
                    valuesByDay.add(rs2.getDouble("sum"));
                }
                rs2.close();
                rs.close(); jLabel9.setText(rowcount + "");
                jLabel12.setText(String.format("%.4f",totalForSearch));

            } catch (SQLException ex) {
                Logger.getLogger(SellsReports.class.getName()).log(Level.SEVERE, null, ex);
                NoConnection page = new NoConnection();
                RakibsTraders.popUp(page);
            }
        }
        else{

            String productID = jTextFieldSearchProduct.getText();
            String startingDate = dateFormat.format(jDateChooser1.getDate());
            String endingDate = dateFormat.format(jDateChooser2.getDate());
            Connection con = DBConnectionProvider.getDBConnection();

            String query = "SELECT invoice_products.profit,invoice_list.date,invoice_products.product_ID FROM invoice_products INNER JOIN invoice_list ON invoice_products.invoice_ID = invoice_list.invoice_ID  and  invoice_products.product_ID = ? and date between ? and  ? order by invoice_list.invoice_ID asc";
            String query3 = "SELECT date ,product_ID ,sum( invoice_products.profit ) as sum FROM invoice_products INNER JOIN invoice_list ON invoice_products.invoice_ID = invoice_list.invoice_ID where date between ? and ? and product_ID = ? GROUP by invoice_list.date order by date asc";
            
            try {
                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setString( 1, productID );
                pstmt.setString( 2,startingDate );
                pstmt.setString( 3,endingDate );
                ResultSet rs = pstmt.executeQuery();
                //                System.err.println("Working2");
                Integer rowcount= 0;
                BigDecimal totalForSearch = BigDecimal.ZERO; // Ne sala , kha eibar koto error khaite paros
                dates.clear(); values.clear();
                datesByDay.clear(); valuesByDay.clear();

                while( rs.next() ){
                    rowcount++;
                   String col1 = rs.getString("date");
                    String col2 = productID;
                    Double col3 = rs.getDouble("profit");
                    dates.add(col1);
                    values.add(col3);
                    totalForSearch = totalForSearch.add(new BigDecimal(col3));
                    data2.addRow(new Object[]{col1,col2,String.format("%.4f",col3)});

                }
                    rs.close();
                
                PreparedStatement pstmt3 = con.prepareStatement(query3);
                pstmt3.setString( 1, startingDate );
                pstmt3.setString( 2, endingDate );
                pstmt3.setString( 3, productID );
                ResultSet rs3 = pstmt3.executeQuery();
                
                while( rs3.next() ){
                    datesByDay.add(rs3.getString("date"));
                    valuesByDay.add(rs3.getDouble("sum"));
                }
                
                
                Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse(startingDate);
                Date d2 = new SimpleDateFormat("yyyy-MM-dd").parse(endingDate);
                long diff = d2.getTime() - d1.getTime();
                jLabel7.setText(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS) + " Days");
                jLabel9.setText(rowcount + "");
                jLabel12.setText(String.format("%.4f",totalForSearch));

            } catch (SQLException ex) {
                Logger.getLogger(SellsReports.class.getName()).log(Level.SEVERE, null, ex);
                NoConnection page = new NoConnection();
                RakibsTraders.popUp(page);
            } catch (ParseException ex) {
                Logger.getLogger(SellsReports.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonGO1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ProfitReportGraph page = new ProfitReportGraph() {
            @Override
            public void start(Stage primaryStage) throws Exception {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        page.setData(dates,values);
        page.main();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        // TODO add your handling code here:
        data.getDataVector().removeAllElements();
        table.setModel(data);
        scrPaneTable.getViewport().add(table);
        setData();
        jLabel7.setText("#Days");
        jLabel9.setText("#Item");
        jLabel5.setText("=");
        jLabel15.setText("#Returned Product Cash");
        jLabel11.setText("#Total");
        dates.clear();
        values.clear();
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void jButtonViewStock2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewStock2ActionPerformed
        // TODO add your handling code here:
        ViewStock page = new ViewStock();
        page.setCaller(this);
        RakibsTraders.bigPopUp(page);
        this.setEnabled(false);
    }//GEN-LAST:event_jButtonViewStock2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ProfitReportGraph page = new ProfitReportGraph() {
            @Override
            public void start(Stage primaryStage) throws Exception {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        page.setData(datesByDay,valuesByDay);
        page.main();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfitReport().setVisible(true);
            }
        });
    }

    private void initTable(){
        setData();
        scrPaneTable.getViewport().add(table);
    }
    
    private void setData(){
        //DefaultTableModel data = new DefaultTableModel(new String[]{"Products ID", "Company Name", "Model", "Dimension", "Pcs per Box", "Item Unit", "Purchase Price", "Selling price"}, 0);
        Connection con = DBConnectionProvider.getDBConnection();
        String query= "SELECT invoice_products.profit,invoice_list.date,invoice_products.product_ID FROM invoice_products INNER JOIN invoice_list ON invoice_products.invoice_ID = invoice_list.invoice_ID order by invoice_products.profit desc";
        try{
            Statement stmt = con.createStatement();
            ResultSet rs= stmt.executeQuery(query);
            if(rs.next()){
                do{
                    String col1 = rs.getString("date");
                    String col2 = rs.getString("product_ID");
                    Double col3 = rs.getDouble("profit");
                    data.addRow(new Object[]{col1, col2, String.format("%.4f",col3) });
                }while(rs.next());
                table.setModel(data);
                rs.close();
            }

        }catch(Exception ex){
            System.out.println("No database connection"+ex);
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);
        }
    }

    //custom variable
    private JTable table = new JTable();
    private JFrame caller;
    //end of custom variable
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonGO;
    private javax.swing.JButton jButtonGO1;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonViewStock2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldSearchProduct;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblExpenseHistory;
    private javax.swing.JScrollPane scrPaneTable;
    // End of variables declaration//GEN-END:variables
   
    private void setIcon(){
        this.setIconImage(new ImageIcon(getClass().getResource("/Resources/Icons/Icon.png")).getImage());
    }

    public void setCaller(JFrame frame){
        this.caller = frame;
    }
    
    @Override
    public void processWindowEvent(WindowEvent e) {
        if (e.getID() == WindowEvent.WINDOW_CLOSING) {
                caller.setEnabled(true);
                dispose();
        }
    }
    
}
