package UI.BigPopUp;

import Database.DBConnectionProvider;
import UI.PopUp.AddPayment;
import UI.PopUp.DeletePayment;
import UI.PopUp.NoConnection;
import UI.PopUp.Save;
import UI.PopUp.Updated;
import UI.Sell;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import rakibs.traders.RakibsTraders;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yeasin
 * 
 * 
 */


public class HistoryReciept extends javax.swing.JFrame {

    /**
     * Creates new form Invoice
     */
    public HistoryReciept() {
        initComponents();
        setIcon();
    }
     //Rafis legendary of reference
    
//    private static Invoice ref;
//    public static Invoice getRef(){
//        if(ref==null)
//            ref = new Invoice();
//        return ref;
//    }
/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogo = new javax.swing.JLabel();
        jScrollPaneCashBackHistory = new javax.swing.JScrollPane();
        jLabeltotaltAmount = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        lblInvoiceIDValue = new javax.swing.JLabel();
        lblInvoiceID = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        lblCustomerNameValue = new javax.swing.JLabel();
        lbCustomerID = new javax.swing.JLabel();
        lblCustomerIDvalue = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblPhoneValue = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblEmailValue = new javax.swing.JLabel();
        jScrollPaneProductDetails = new javax.swing.JScrollPane();
        lblInvoiceID1 = new javax.swing.JLabel();
        lblInvoiceID2 = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Logo.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, 60));
        getContentPane().add(jScrollPaneCashBackHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 530, 220));

        jLabeltotaltAmount.setFont(new java.awt.Font("Titillium", 0, 18)); // NOI18N
        jLabeltotaltAmount.setForeground(new java.awt.Color(204, 204, 204));
        jLabeltotaltAmount.setText("0.0000");
        getContentPane().add(jLabeltotaltAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 120, 30));

        jLabelTotal.setFont(new java.awt.Font("Titillium", 0, 18)); // NOI18N
        jLabelTotal.setForeground(new java.awt.Color(204, 204, 204));
        jLabelTotal.setText("Total CashBack:");
        getContentPane().add(jLabelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 140, 30));

        lblInvoiceIDValue.setFont(new java.awt.Font("Titillium Web", 0, 24)); // NOI18N
        lblInvoiceIDValue.setForeground(new java.awt.Color(204, 204, 204));
        lblInvoiceIDValue.setText("#id");
        getContentPane().add(lblInvoiceIDValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 190, -1));

        lblInvoiceID.setFont(new java.awt.Font("Titillium Web", 0, 18)); // NOI18N
        lblInvoiceID.setForeground(new java.awt.Color(67, 196, 114));
        lblInvoiceID.setText("Returend Product Details");
        getContentPane().add(lblInvoiceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 270, -1));

        lblCustomerName.setFont(new java.awt.Font("Titillium Web", 0, 15)); // NOI18N
        lblCustomerName.setForeground(new java.awt.Color(204, 204, 204));
        lblCustomerName.setText("Customer Name: ");
        getContentPane().add(lblCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 130, -1));

        lblCustomerNameValue.setFont(new java.awt.Font("Titillium Web", 0, 15)); // NOI18N
        lblCustomerNameValue.setForeground(new java.awt.Color(204, 204, 204));
        lblCustomerNameValue.setText("#Customer Name ");
        getContentPane().add(lblCustomerNameValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 140, -1));

        lbCustomerID.setFont(new java.awt.Font("Titillium Web", 0, 15)); // NOI18N
        lbCustomerID.setForeground(new java.awt.Color(204, 204, 204));
        lbCustomerID.setText("Customer ID:");
        getContentPane().add(lbCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 100, 30));

        lblCustomerIDvalue.setFont(new java.awt.Font("Titillium Web", 0, 15)); // NOI18N
        lblCustomerIDvalue.setForeground(new java.awt.Color(204, 204, 204));
        lblCustomerIDvalue.setText("#Customer ID");
        getContentPane().add(lblCustomerIDvalue, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 230, 30));

        lblPhone.setFont(new java.awt.Font("Titillium Web", 0, 15)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(204, 204, 204));
        lblPhone.setText("Phone");
        getContentPane().add(lblPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 100, 30));

        lblPhoneValue.setFont(new java.awt.Font("Titillium Web", 0, 15)); // NOI18N
        lblPhoneValue.setForeground(new java.awt.Color(204, 204, 204));
        lblPhoneValue.setText("Phone Numbers");
        getContentPane().add(lblPhoneValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 280, 30));

        lblEmail.setFont(new java.awt.Font("Titillium Web", 0, 15)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(204, 204, 204));
        lblEmail.setText("Email");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 100, 30));

        lblEmailValue.setFont(new java.awt.Font("Titillium Web", 0, 15)); // NOI18N
        lblEmailValue.setForeground(new java.awt.Color(204, 204, 204));
        lblEmailValue.setText("Email@email.com");
        getContentPane().add(lblEmailValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, 210, 30));
        getContentPane().add(jScrollPaneProductDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 470, 220));

        lblInvoiceID1.setFont(new java.awt.Font("Titillium Web", 0, 24)); // NOI18N
        lblInvoiceID1.setForeground(new java.awt.Color(204, 204, 204));
        lblInvoiceID1.setText("Invoice ID:");
        getContentPane().add(lblInvoiceID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 170, -1));

        lblInvoiceID2.setFont(new java.awt.Font("Titillium Web", 0, 18)); // NOI18N
        lblInvoiceID2.setForeground(new java.awt.Color(67, 196, 114));
        lblInvoiceID2.setText("CashBack History");
        getContentPane().add(lblInvoiceID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 180, -1));

        jLabelBackground.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/background.png"))); // NOI18N
        getContentPane().add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
        
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
            java.util.logging.Logger.getLogger(HistoryReciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoryReciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoryReciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoryReciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistoryReciept().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabeltotaltAmount;
    private javax.swing.JScrollPane jScrollPaneCashBackHistory;
    private javax.swing.JScrollPane jScrollPaneProductDetails;
    private javax.swing.JLabel lbCustomerID;
    private javax.swing.JLabel lblCustomerIDvalue;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblCustomerNameValue;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmailValue;
    private javax.swing.JLabel lblInvoiceID;
    private javax.swing.JLabel lblInvoiceID1;
    private javax.swing.JLabel lblInvoiceID2;
    private javax.swing.JLabel lblInvoiceIDValue;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPhoneValue;
    // End of variables declaration//GEN-END:variables

    //custome variables
    private JTable productTable = new JTable();
    private JTable cashBackTable = new JTable();
    DefaultTableModel cashBackData = new DefaultTableModel(new String[]{"Date", "Time" ,"Original Cash", "Deduction", "Returned Cash"}, 0);
    DefaultTableModel productTableData = new DefaultTableModel(new String[]{"Product ID", "BOX", "PCS" ,"Feet", "ITEM UNIT", "Total Price"}, 0);
    private String timeAndDate;
    private static HistoryReciept ref;
    private JFrame caller;
    //end of custom variables
    
    
    private void setIcon(){
        this.setIconImage(new ImageIcon(getClass().getResource("/Resources/Icons/Icon.png")).getImage());
    }
    
    public void setData(String invoiceID, String customerID, String Total,  DefaultTableModel data){
        System.err.println(customerID);
        this.lblInvoiceIDValue.setText(invoiceID);
        this.lblCustomerIDvalue.setText(customerID);
        this.productTable.setModel(data);
        this.jLabeltotaltAmount.setText(Total);
        setCustomerField();
        setTables(invoiceID);
    }
    
  
    
    public void setTables(String invoiceID){
       
        //clear the default invoice_payment to null
        if (cashBackData.getRowCount() > 0) {
            for (int i = cashBackData.getRowCount() - 1; i > -1; i--) {
                cashBackData.removeRow(i);
            }
        }
        
        Connection con = DBConnectionProvider.getDBConnection();
        String query = "SELECT * from returned_list where invoice_ID = ?";
        String query2 = "select * from returned_products where date = ? and time = ?" ;
        
        try{
            PreparedStatement pstmt2 = con.prepareStatement(query);
            pstmt2.setString( 1,lblInvoiceIDValue.getText() );
            ResultSet rs = pstmt2.executeQuery();
            Double totalCashBackForINVO = 0.0; 
            
            if(rs.next()){
                do{
                    String col2 = rs.getString("Date");
                    String col3 = rs.getString("Time");
                    String col4 = Double.toString(rs.getDouble("original_total"));
                    String col5 = Double.toString(rs.getDouble("Deduction"));
                    String col6 = Double.toString(rs.getDouble("total_cashBack"));
                    
                    PreparedStatement pstmt3 = con.prepareStatement(query2);
                    pstmt3.setString(1, col2);
                    pstmt3.setString(2, col3);
                    
//                    System.err.println( col2  +  " " + col3 );
                    totalCashBackForINVO += Double.parseDouble(col6);
                    ResultSet rs2 = pstmt3.executeQuery();
                    productTableData.addRow(new Object[]{ col2, col3, "","", "","" });
                    if(rs2.next()){
                        do{

                            String col21 = rs2.getString("product_ID");
                            String col31 = rs2.getString("box");
                            String col41 = rs2.getString("pcs");
                            String col51 = Double.toString(rs2.getDouble("feet"));
                            String col61 = rs2.getString("ItemUnit");
                            String col71 = Double.toString(rs2.getDouble("total_price"));

                            productTableData.addRow(new Object[]{ col21, col31, col41, col51, col61, col71 });
                        }while(rs2.next());
                        productTable.setModel(productTableData);
                        jScrollPaneProductDetails.getViewport().add(productTable);
                        rs2.close();
                    }
                    
                    cashBackData.addRow(new Object[]{col2, col3, col4, col5, col6});
                }while(rs.next());
                cashBackTable.setModel(cashBackData);
                jScrollPaneCashBackHistory.getViewport().add(cashBackTable);
                jLabeltotaltAmount.setText(String.format("%.4f",totalCashBackForINVO));
                rs.close();
            }
        }catch(Exception ex){
            System.out.println("Failed to get DBConn:: "+ex.getMessage());
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);
        }
        
        
        
//        
//        
//        try {
//            
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(HistoryReciept.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        
        
        
        
    }
    
    private void setCustomerField(){
//        System.err.println("Dhukse" );
        Connection con = DBConnectionProvider.getDBConnection();
        String query = "SELECT * FROM customer WHERE customer_ID = ?";
        try{
            PreparedStatement pstmt = con.prepareStatement(query);
            String customerID = this.lblCustomerIDvalue.getText();
            pstmt.setString(1,customerID);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
              this.lblCustomerNameValue.setText(rs.getString("customer_name"));
              this.lblPhoneValue.setText(rs.getString("phone_number1") + ", " + rs.getString("phone_number2"));
              this.lblEmailValue.setText(rs.getString("mail"));
            }
        }catch(Exception ex){
            System.out.println("Failed to get DBConn:: "+ex.getMessage());
            NoConnection no = new NoConnection();
            RakibsTraders.popUp(no);
        }
    }
    
    public static HistoryReciept getRef(){
        if(ref==null)
            ref = new HistoryReciept();
        return ref;
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
