package UI.PopUp;

import Database.DBConnectionProvider;
import Others.Functions;
import com.placeholder.PlaceHolder;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import rakibs.traders.RakibsTraders;

/**
 *
 * @author RH Rafi
 */
public class EditStockAlert extends javax.swing.JFrame {

    /**
     * Creates new form Delete
     */
    PlaceHolder place;
    
    public EditStockAlert() {
        initComponents();
        setIcon();
        initComboProductID();
        place = new PlaceHolder(txtFieldProductID,"Enter Product ID");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTimeanddate2 = new javax.swing.JLabel();
        lblProductModelValue = new javax.swing.JLabel();
        txtFieldProductID = new javax.swing.JTextField();
        jButtonAddPayment = new javax.swing.JButton();
        lblTimeanddate6 = new javax.swing.JLabel();
        lblTimeanddate7 = new javax.swing.JLabel();
        lblQTY = new javax.swing.JLabel();
        lblTimeanddate9 = new javax.swing.JLabel();
        txtFieldAlertValue = new javax.swing.JTextField();
        jLabelItemUnit = new javax.swing.JLabel();
        jLabelItemUnitValue = new javax.swing.JLabel();
        jButtonGo = new javax.swing.JButton();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(500, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTimeanddate2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTimeanddate2.setForeground(new java.awt.Color(255, 255, 255));
        lblTimeanddate2.setText("Set Alert Value");
        getContentPane().add(lblTimeanddate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 103, 23));

        lblProductModelValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblProductModelValue.setForeground(new java.awt.Color(255, 255, 255));
        lblProductModelValue.setText("Product Model");
        getContentPane().add(lblProductModelValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 120, 23));
        getContentPane().add(txtFieldProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 180, 23));

        jButtonAddPayment.setBackground(new java.awt.Color(67, 196, 114));
        jButtonAddPayment.setFont(new java.awt.Font("Titillium Web", 1, 12)); // NOI18N
        jButtonAddPayment.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddPayment.setText("Save");
        jButtonAddPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddPaymentActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAddPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 150, 30));

        lblTimeanddate6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTimeanddate6.setForeground(new java.awt.Color(255, 255, 255));
        lblTimeanddate6.setText("Enter Product ID");
        getContentPane().add(lblTimeanddate6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 120, 23));

        lblTimeanddate7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTimeanddate7.setForeground(new java.awt.Color(255, 255, 255));
        lblTimeanddate7.setText("Product Model");
        getContentPane().add(lblTimeanddate7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 120, 23));

        lblQTY.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblQTY.setForeground(new java.awt.Color(255, 255, 255));
        lblQTY.setText("#QTY");
        getContentPane().add(lblQTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 120, 23));

        lblTimeanddate9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTimeanddate9.setForeground(new java.awt.Color(255, 255, 255));
        lblTimeanddate9.setText("Available QTY");
        getContentPane().add(lblTimeanddate9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 120, 23));
        getContentPane().add(txtFieldAlertValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 100, 23));

        jLabelItemUnit.setForeground(new java.awt.Color(255, 255, 255));
        jLabelItemUnit.setText("Item unit");
        getContentPane().add(jLabelItemUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 80, 20));

        jLabelItemUnitValue.setForeground(new java.awt.Color(255, 255, 255));
        jLabelItemUnitValue.setText("#Item Unit");
        getContentPane().add(jLabelItemUnitValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 100, 20));

        jButtonGo.setBackground(new java.awt.Color(0, 0, 255));
        jButtonGo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGo.setText("GO");
        jButtonGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        jLabelBackground.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/background.png"))); // NOI18N
        getContentPane().add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddPaymentActionPerformed
        // TODO add your handling code here:
        if(txtFieldProductID.getText().equals("")){
            NoValue page = new NoValue();
            RakibsTraders.popUp(page);
        }else{
            Connection con = DBConnectionProvider.getDBConnection();
            String query = "UPDATE `stock` SET `alert_val` = ? WHERE `stock`.`products_id` = ?";
            try{
                PreparedStatement pstmt = con.prepareStatement(query);
                String product_ID = txtFieldProductID.getText();
                Double alert_val = Double.parseDouble(txtFieldAlertValue.getText());
                pstmt.setDouble(1,alert_val);
                pstmt.setString(2,product_ID);
                pstmt.executeUpdate();
                Save page = new Save();
                RakibsTraders.popUp(page);
                caller.setEnabled(true);
                this.dispose();
            }catch(Exception ex){
                System.out.println("Failed to get DBConn:: "+ex.getMessage());
                NoConnection no = new NoConnection();
                RakibsTraders.popUp(no);
            }
        }
        
    }//GEN-LAST:event_jButtonAddPaymentActionPerformed

    private void jButtonGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoActionPerformed
        // TODO add your handling code here:
        if(txtFieldProductID.getText().equals("")){
            NoValue page = new NoValue();
            RakibsTraders.popUp(page);
        }else {
            Connection con = DBConnectionProvider.getDBConnection();
            String query = "SELECT * FROM products WHERE products_id = ?";
            String query2 = "SELECT * FROM stock WHERE products_id = ?";
            try{
                PreparedStatement pstmt = con.prepareStatement(query);
                String productID = this.txtFieldProductID.getText();
                pstmt.setString(1,productID);
                ResultSet rs = pstmt.executeQuery();
                while(rs.next()){
                  this.lblProductModelValue.setText(rs.getString("model"));
                  this.jLabelItemUnitValue.setText(rs.getString("item_unit"));
                }
                PreparedStatement pstmt2 = con.prepareStatement(query2);
                //String productID = this.txtProductID.getText();
                pstmt2.setString(1,productID);
                //System.out.println(pstmt2.toString());
                ResultSet rs2 = pstmt2.executeQuery();
                while(rs2.next()){
                  this.lblQTY.setText(Integer.toString(rs2.getInt("left")));
                }
            }catch(Exception ex){
                System.out.println("Failed to get DBConn:: "+ex.getMessage());
                NoConnection no = new NoConnection();
                RakibsTraders.popUp(no);
            }
        }
            
    }//GEN-LAST:event_jButtonGoActionPerformed

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
            java.util.logging.Logger.getLogger(EditStockAlert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditStockAlert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditStockAlert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditStockAlert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditStockAlert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddPayment;
    private javax.swing.JButton jButtonGo;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelItemUnit;
    private javax.swing.JLabel jLabelItemUnitValue;
    private javax.swing.JLabel lblProductModelValue;
    private javax.swing.JLabel lblQTY;
    private javax.swing.JLabel lblTimeanddate2;
    private javax.swing.JLabel lblTimeanddate6;
    private javax.swing.JLabel lblTimeanddate7;
    private javax.swing.JLabel lblTimeanddate9;
    private javax.swing.JTextField txtFieldAlertValue;
    private javax.swing.JTextField txtFieldProductID;
    // End of variables declaration//GEN-END:variables
    
    //custom variable
    private ArrayList<String> productID = new ArrayList<>();
    private JFrame caller;
    //end of custom variable
    
    private void setIcon(){
        this.setIconImage(new ImageIcon(getClass().getResource("/Resources/Icons/Icon.png")).getImage());
    }
    
    private void initComboProductID(){
        productID = Functions.productID();
        Functions.setupAutoComplete(txtFieldProductID, productID); 
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
