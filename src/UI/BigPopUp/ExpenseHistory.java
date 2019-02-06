package UI.BigPopUp;

import Database.DBConnectionProvider;
import UI.PopUp.NoConnection;
import com.placeholder.PlaceHolder;
import java.awt.List;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import rakibs.traders.RakibsTraders;

/**
 *
 * @author RH Rafi
 */
public class ExpenseHistory extends javax.swing.JFrame {

    /**
     * Creates new form ProductsTable
     */
    PlaceHolder place;
    public ExpenseHistory() {
        initComponents();
        initTable();
        setIcon();
        place = new PlaceHolder(jTextFieldSearchBills,"Exp ID, Date, Category, notes, Account Number");
        
    }
    
    
    /**
     * 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrPaneTable = new javax.swing.JScrollPane();
        lblExpenseHistory = new javax.swing.JLabel();
        jButtonGO = new javax.swing.JButton();
        jTextFieldSearchBills = new javax.swing.JTextField();
        jButtonRefresh = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(scrPaneTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 1017, 370));

        lblExpenseHistory.setFont(new java.awt.Font("Titillium", 0, 22)); // NOI18N
        lblExpenseHistory.setForeground(new java.awt.Color(67, 196, 114));
        lblExpenseHistory.setText("Expense History");
        getContentPane().add(lblExpenseHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 304, 43));

        jButtonGO.setBackground(new java.awt.Color(0, 0, 153));
        jButtonGO.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonGO.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGO.setText("GO");
        jButtonGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGOActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, 60, 30));

        jTextFieldSearchBills.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldSearchBills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchBillsActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSearchBills, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 340, 30));

        jButtonRefresh.setBackground(new java.awt.Color(0, 0, 153));
        jButtonRefresh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonRefresh.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRefresh.setText("REFRESH");
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 40, 110, 30));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/background.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -360, 2540, 1380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSearchBillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchBillsActionPerformed
        // TODO add your handling code here:
        getTheSearchDone();
    }//GEN-LAST:event_jTextFieldSearchBillsActionPerformed
    DefaultTableModel data = new DefaultTableModel(new String[]{"Expense ID", "Date", "Time", "Expense Category", "Addtional Category", "Payment Type", "Account", "Amount", "Notes"}, 0);
    private void jButtonGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGOActionPerformed
        // TODO add your handling code here:
        String searchData = jTextFieldSearchBills.getText();
        if(!searchData.equals("Exp ID, Date, Category, notes, Account Number")) {
            
            data.getDataVector().removeAllElements();
            table.setModel(data);
            scrPaneTable.getViewport().add(table);

            if( !searchData.equals("Exp ID, Date, Category, notes, Account Number") ){
                String query1 = "select * from expenses  where date like ? ";
                String query2 = "select * from expenses where category like ?";
                String query3 = "select * from expenses where optional_category like ?";
                String query4 = "select * from expenses where notes like ?";
                String query5 = "select * from expenses where account like ?";
                String query6 = "select * from expenses where exp_ID = ? ";


                Connection con = DBConnectionProvider.getDBConnection();
                if( searchData.startsWith("EXP#") ){ //search in vendor ID
                    try { 
                        PreparedStatement pstmt = con.prepareStatement(query6);
                        pstmt.setString(1, searchData );
                        ResultSet rs = pstmt.executeQuery();

                        if( rs.next() ){
                               do{
                                String col1 = rs.getString("exp_ID");
                                String col2 = rs.getString("date");
                                String col3 = rs.getString("time");
                                String col4 = rs.getString("category");
                                String col5 = rs.getString("optional_category");
                                String col6 = rs.getString("payment_type");
                                String col7 = rs.getString("account");
                                double val = rs.getDouble("amount");
                                String col8 = String.format("%.4f",val);
                                String col9 = rs.getString("notes");
                                data.addRow(new Object[]{col1, col2, col3, col4, col5, col6, col7, col8,col9});

                            }while(rs.next());
                        table.setModel(data);
                        rs.close();
                       } 

                    } catch (SQLException ex) {
    //                    Logger.getLogger(ExpenseHistory.class.getName()).log(Level.SEVERE, null, ex);
                           Logger.getLogger(ExpenseHistory.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                else{ 
                    try{
                            PreparedStatement pstmt = con.prepareStatement(query1);
                            pstmt.setString(1, "%" + searchData + "%" );
                            ResultSet rs = pstmt.executeQuery();

                            PreparedStatement pstmt2 = con.prepareStatement(query2);
                            pstmt2.setString(1,"%" + searchData + "%");
                            ResultSet rs2 = pstmt2.executeQuery();

                            PreparedStatement pstmt3 = con.prepareStatement(query3);
                            pstmt3.setString(1,"%" + searchData + "%");
                            ResultSet rs3 = pstmt3.executeQuery();

                            PreparedStatement pstmt4 = con.prepareStatement(query4);
                            pstmt4.setString(1,"%" + searchData + "%");
                            ResultSet rs4 = pstmt4.executeQuery();

                            PreparedStatement pstmt5 = con.prepareStatement(query5);
                            pstmt5.setString(1,"%" + searchData + "%");
                            ResultSet rs5 = pstmt5.executeQuery();

                            if( rs.next() ){ // search in date
                                do{
                                    String col1 = rs.getString("exp_ID");
                                    String col2 = rs.getString("date");
                                    String col3 = rs.getString("time");
                                    String col4 = rs.getString("category");
                                    String col5 = rs.getString("optional_category");
                                    String col6 = rs.getString("payment_type");
                                    String col7 = rs.getString("account");
                                    double val = rs.getDouble("amount");
                                    String col8 = String.format("%.4f",val);
                                    String col9 = rs.getString("notes");

                                    data.addRow(new Object[]{col1, col2, col3, col4, col5, col6, col7, col8, col9 });
                                }while(rs.next());
                                table.setModel(data);
                                rs.close();
                            }

                            if( rs2.next() ){ //search in category
                                do{ 
                                    String col1 = rs2.getString("exp_ID");
                                    String col2 = rs2.getString("date");
                                    String col3 = rs2.getString("time");
                                    String col4 = rs2.getString("category");
                                    String col5 = rs2.getString("optional_category");
                                    String col6 = rs2.getString("payment_type");
                                    String col7 = rs2.getString("account");
                                    double val = rs2.getDouble("amount");
                                    String col8 = String.format("%.4f",val);
                                    String col9 = rs2.getString("notes");
                                    data.addRow(new Object[]{col1, col2, col3, col4, col5, col6, col7, col8,col9});
                                }while(rs2.next());
                                table.setModel(data);
                                rs2.close();
                            }
                            if( rs3.next() ){ // Search in optional Category
                                do{ 
                                    String col1 = rs3.getString("exp_ID");
                                    String col2 = rs3.getString("date");
                                    String col3 = rs3.getString("time");
                                    String col4 = rs3.getString("category");
                                    String col5 = rs3.getString("optional_category");
                                    String col6 = rs3.getString("payment_type");
                                    String col7 = rs3.getString("account");
                                    double val = rs3.getDouble("amount");
                                    String col8 = String.format("%.4f",val);
                                    String col9 = rs3.getString("notes");
                                    data.addRow(new Object[]{col1, col2, col3, col4, col5, col6, col7, col8,col9});
                                }while(rs3.next());
                                table.setModel(data);
                                rs3.close();
                            }
                            if( rs4.next() ){ //Search in notes
                                do{ 
                                    String col1 = rs4.getString("exp_ID");
                                    String col2 = rs4.getString("date");
                                    String col3 = rs4.getString("time");
                                    String col4 = rs4.getString("category");
                                    String col5 = rs4.getString("optional_category");
                                    String col6 = rs4.getString("payment_type");
                                    String col7 = rs4.getString("account");
                                    double val = rs4.getDouble("amount");
                                    String col8 = String.format("%.4f",val);
                                    String col9 = rs4.getString("notes");
                                    data.addRow(new Object[]{col1, col2, col3, col4, col5, col6, col7, col8,col9});
                                }while(rs4.next());
                                table.setModel(data);
                                rs4.close();
                            }
                            if( rs5.next() ){ // Search in account
                                do{ 
                                    String col1 = rs5.getString("exp_ID");
                                    String col2 = rs5.getString("date");
                                    String col3 = rs5.getString("time");
                                    String col4 = rs5.getString("category");
                                    String col5 = rs5.getString("optional_category");
                                    String col6 = rs5.getString("payment_type");
                                    String col7 = rs5.getString("account");
                                    double val = rs5.getDouble("amount");
                                    String col8 = String.format("%.4f",val);
                                    String col9 = rs5.getString("notes");
                                    data.addRow(new Object[]{col1, col2, col3, col4, col5, col6, col7, col8,col9});
                                }while(rs5.next());
                                table.setModel(data);
                                rs5.close();
                            }

                        }catch(Exception ex){
    //                        System.out.println("No database connection with customer DB"+ex);
    //                        NoConnection no = new NoConnection();
    //                        RakibsTraders.popUp(no);
                               Logger.getLogger(ExpenseHistory.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }  
            }
        
        }
        
    }//GEN-LAST:event_jButtonGOActionPerformed
        
    private void getTheSearchDone()
    {
        String searchData = jTextFieldSearchBills.getText();
        if(!searchData.equals("Exp ID, Date, Category, notes, Account Number")) {
            
            data.getDataVector().removeAllElements();
            table.setModel(data);
            scrPaneTable.getViewport().add(table);

            if( !searchData.equals("Exp ID, Date, Category, notes, Account Number") ){
                String query1 = "select * from expenses  where date like ? ";
                String query2 = "select * from expenses where category like ?";
                String query3 = "select * from expenses where optional_category like ?";
                String query4 = "select * from expenses where notes like ?";
                String query5 = "select * from expenses where account like ?";
                String query6 = "select * from expenses where exp_ID = ? ";


                Connection con = DBConnectionProvider.getDBConnection();
                if( searchData.startsWith("EXP#") ){ //search in vendor ID
                    try { 
                        PreparedStatement pstmt = con.prepareStatement(query6);
                        pstmt.setString(1, searchData );
                        ResultSet rs = pstmt.executeQuery();

                        if( rs.next() ){
                               do{
                                String col1 = rs.getString("exp_ID");
                                String col2 = rs.getString("date");
                                String col3 = rs.getString("time");
                                String col4 = rs.getString("category");
                                String col5 = rs.getString("optional_category");
                                String col6 = rs.getString("payment_type");
                                String col7 = rs.getString("account");
                                double val = rs.getDouble("amount");
                                String col8 = String.format("%.4f",val);
                                String col9 = rs.getString("notes");
                                data.addRow(new Object[]{col1, col2, col3, col4, col5, col6, col7, col8,col9});

                            }while(rs.next());
                        table.setModel(data);
                        rs.close();
                       } 

                    } catch (SQLException ex) {
    //                    Logger.getLogger(ExpenseHistory.class.getName()).log(Level.SEVERE, null, ex);
                           Logger.getLogger(ExpenseHistory.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                else{ 
                    try{
                            PreparedStatement pstmt = con.prepareStatement(query1);
                            pstmt.setString(1, "%" + searchData + "%" );
                            ResultSet rs = pstmt.executeQuery();

                            PreparedStatement pstmt2 = con.prepareStatement(query2);
                            pstmt2.setString(1,"%" + searchData + "%");
                            ResultSet rs2 = pstmt2.executeQuery();

                            PreparedStatement pstmt3 = con.prepareStatement(query3);
                            pstmt3.setString(1,"%" + searchData + "%");
                            ResultSet rs3 = pstmt3.executeQuery();

                            PreparedStatement pstmt4 = con.prepareStatement(query4);
                            pstmt4.setString(1,"%" + searchData + "%");
                            ResultSet rs4 = pstmt4.executeQuery();

                            PreparedStatement pstmt5 = con.prepareStatement(query5);
                            pstmt5.setString(1,"%" + searchData + "%");
                            ResultSet rs5 = pstmt5.executeQuery();

                            if( rs.next() ){ // search in date
                                do{
                                    String col1 = rs.getString("exp_ID");
                                    String col2 = rs.getString("date");
                                    String col3 = rs.getString("time");
                                    String col4 = rs.getString("category");
                                    String col5 = rs.getString("optional_category");
                                    String col6 = rs.getString("payment_type");
                                    String col7 = rs.getString("account");
                                    double val = rs.getDouble("amount");
                                    String col8 = String.format("%.4f",val);
                                    String col9 = rs.getString("notes");

                                    data.addRow(new Object[]{col1, col2, col3, col4, col5, col6, col7, col8, col9 });
                                }while(rs.next());
                                table.setModel(data);
                                rs.close();
                            }

                            if( rs2.next() ){ //search in category
                                do{ 
                                    String col1 = rs2.getString("exp_ID");
                                    String col2 = rs2.getString("date");
                                    String col3 = rs2.getString("time");
                                    String col4 = rs2.getString("category");
                                    String col5 = rs2.getString("optional_category");
                                    String col6 = rs2.getString("payment_type");
                                    String col7 = rs2.getString("account");
                                    double val = rs2.getDouble("amount");
                                    String col8 = String.format("%.4f",val);
                                    String col9 = rs2.getString("notes");
                                    data.addRow(new Object[]{col1, col2, col3, col4, col5, col6, col7, col8,col9});
                                }while(rs2.next());
                                table.setModel(data);
                                rs2.close();
                            }
                            if( rs3.next() ){ // Search in optional Category
                                do{ 
                                    String col1 = rs3.getString("exp_ID");
                                    String col2 = rs3.getString("date");
                                    String col3 = rs3.getString("time");
                                    String col4 = rs3.getString("category");
                                    String col5 = rs3.getString("optional_category");
                                    String col6 = rs3.getString("payment_type");
                                    String col7 = rs3.getString("account");
                                    double val = rs3.getDouble("amount");
                                    String col8 = String.format("%.4f",val);
                                    String col9 = rs3.getString("notes");
                                    data.addRow(new Object[]{col1, col2, col3, col4, col5, col6, col7, col8,col9});
                                }while(rs3.next());
                                table.setModel(data);
                                rs3.close();
                            }
                            if( rs4.next() ){ //Search in notes
                                do{ 
                                    String col1 = rs4.getString("exp_ID");
                                    String col2 = rs4.getString("date");
                                    String col3 = rs4.getString("time");
                                    String col4 = rs4.getString("category");
                                    String col5 = rs4.getString("optional_category");
                                    String col6 = rs4.getString("payment_type");
                                    String col7 = rs4.getString("account");
                                    double val = rs4.getDouble("amount");
                                    String col8 = String.format("%.4f",val);
                                    String col9 = rs4.getString("notes");
                                    data.addRow(new Object[]{col1, col2, col3, col4, col5, col6, col7, col8,col9});
                                }while(rs4.next());
                                table.setModel(data);
                                rs4.close();
                            }
                            if( rs5.next() ){ // Search in account
                                do{ 
                                    String col1 = rs5.getString("exp_ID");
                                    String col2 = rs5.getString("date");
                                    String col3 = rs5.getString("time");
                                    String col4 = rs5.getString("category");
                                    String col5 = rs5.getString("optional_category");
                                    String col6 = rs5.getString("payment_type");
                                    String col7 = rs5.getString("account");
                                    double val = rs5.getDouble("amount");
                                    String col8 = String.format("%.4f",val);
                                    String col9 = rs5.getString("notes");
                                    data.addRow(new Object[]{col1, col2, col3, col4, col5, col6, col7, col8,col9});
                                }while(rs5.next());
                                table.setModel(data);
                                rs5.close();
                            }

                        }catch(Exception ex){
    //                        System.out.println("No database connection with customer DB"+ex);
    //                        NoConnection no = new NoConnection();
    //                        RakibsTraders.popUp(no);
                               Logger.getLogger(ExpenseHistory.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }  
            }
        
        }
    }
    
    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        // TODO add your handling code here:
        data.getDataVector().removeAllElements();
        table.setModel(data);
        scrPaneTable.getViewport().add(table);
        setData();
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    // for showing table
    /*
     Connection con = DBConnectionProvider.getDBConnection();
        String query= "select * from products";
        try{
            Statement stmt = con.createStatement();
            ResultSet rs= stmt.executeQuery(query);
            if(rs.next()){
                do{
                System.out.println(rs.getString("products_id"));
                System.out.println(rs.getString("company_name"));
                System.out.println(rs.getString("model"));
                System.out.println(rs.getString("dimension"));
                System.out.println(Integer.toString(rs.getInt("pcs_per_box")));
                System.out.println(Integer.toString(rs.getInt("item_unit")));
                System.out.println(Double.toString(rs.getInt("purchase_price")));
                System.out.println(Double.toString(rs.getInt("selling_price")));
                System.out.println(rs.getString("notes"));
                }while(rs.next());
            }

        }catch(Exception ex){
            System.out.println("No database connection"+ex);
            /*NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);*/
  //      }
   // */
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExpenseHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExpenseHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExpenseHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExpenseHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExpenseHistory().setVisible(true);
            }
        });
    }

    private void initTable(){
        setData();
        scrPaneTable.getViewport().add(table);
    }
    
    private void setData(){
        
        Connection con = DBConnectionProvider.getDBConnection();
        String query= "select * from expenses";
        try{
            Statement stmt = con.createStatement();
            ResultSet rs= stmt.executeQuery(query);
            if(rs.next()){
                do{
                    String col1 = rs.getString("exp_ID");
                    String col2 = rs.getString("date");
                    String col3 = rs.getString("time");
                    String col4 = rs.getString("category");
                    String col5 = rs.getString("optional_category");
                    String col6 = rs.getString("payment_type");
                    String col7 = rs.getString("account");
                    double val = rs.getDouble("amount");
                    String col8 = String.format("%.4f",val);
                    String col9 = rs.getString("notes");
                    data.addRow(new Object[]{col1, col2, col3, col4, col5, col6, col7, col8,col9});
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
    private javax.swing.JButton jButtonGO;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JTextField jTextFieldSearchBills;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblExpenseHistory;
    private javax.swing.JScrollPane scrPaneTable;
    // End of variables declaration//GEN-END:variables
   
    private void setIcon(){
        this.setIconImage(new ImageIcon(getClass().getResource("/Resources/Icons/Icon.png")).getImage());
    }

    @Override
    public void processWindowEvent(WindowEvent e) {
        if (e.getID() == WindowEvent.WINDOW_CLOSING) {
            caller.setEnabled(true);
            dispose();
        }
    }
    
    
    public void setCaller(JFrame frame){
        this.caller = frame;
    }
    
}
