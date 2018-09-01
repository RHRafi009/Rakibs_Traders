package UI.PopUp;

import Others.Functions;
import javax.swing.ImageIcon;

/**
 *
 * @author RH Rafi
 */
public class AddPayment extends javax.swing.JFrame {

    /**
     * Creates new form Delete
     */
    public AddPayment() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInvoiceIDValue1 = new javax.swing.JLabel();
        lblInvoiceID2 = new javax.swing.JLabel();
        txtFieldTimeanddate2 = new javax.swing.JTextField();
        lblTimeanddate2 = new javax.swing.JLabel();
        lblTimeanddate3 = new javax.swing.JLabel();
        lblTimeanddate4 = new javax.swing.JLabel();
        lblTimeanddate5 = new javax.swing.JLabel();
        txtFieldTimeanddate3 = new javax.swing.JTextField();
        jButtonAddPayment = new javax.swing.JButton();
        jComboBoxPaymentMethodValue = new javax.swing.JComboBox<>();
        lblPaymentType = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(500, 300));
        setPreferredSize(new java.awt.Dimension(510, 290));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInvoiceIDValue1.setFont(new java.awt.Font("Titillium Web", 0, 24)); // NOI18N
        lblInvoiceIDValue1.setForeground(new java.awt.Color(204, 204, 204));
        lblInvoiceIDValue1.setText("#id");
        getContentPane().add(lblInvoiceIDValue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 240, -1));

        lblInvoiceID2.setFont(new java.awt.Font("Titillium Web", 0, 24)); // NOI18N
        lblInvoiceID2.setForeground(new java.awt.Color(204, 204, 204));
        lblInvoiceID2.setText("Invoice ID:");
        getContentPane().add(lblInvoiceID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 170, -1));
        getContentPane().add(txtFieldTimeanddate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 180, 23));

        lblTimeanddate2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTimeanddate2.setForeground(new java.awt.Color(255, 255, 255));
        lblTimeanddate2.setText("Total Paid:");
        getContentPane().add(lblTimeanddate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 103, 23));

        lblTimeanddate3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTimeanddate3.setForeground(new java.awt.Color(255, 255, 255));
        lblTimeanddate3.setText("#No. ");
        getContentPane().add(lblTimeanddate3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 103, 23));

        lblTimeanddate4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTimeanddate4.setForeground(new java.awt.Color(255, 255, 255));
        lblTimeanddate4.setText("Reciept NO: ");
        getContentPane().add(lblTimeanddate4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 103, 23));

        lblTimeanddate5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTimeanddate5.setForeground(new java.awt.Color(255, 255, 255));
        lblTimeanddate5.setText("Time & date:");
        getContentPane().add(lblTimeanddate5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 103, 23));
        getContentPane().add(txtFieldTimeanddate3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 180, 23));

        jButtonAddPayment.setBackground(new java.awt.Color(67, 196, 114));
        jButtonAddPayment.setFont(new java.awt.Font("Titillium Web", 1, 12)); // NOI18N
        jButtonAddPayment.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddPayment.setText("Save");
        jButtonAddPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddPaymentActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAddPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 150, 30));

        jComboBoxPaymentMethodValue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxPaymentMethodValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 180, -1));

        lblPaymentType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPaymentType.setForeground(new java.awt.Color(255, 255, 255));
        lblPaymentType.setText("Payment Method");
        getContentPane().add(lblPaymentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 130, 23));

        jLabelBackground.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/background.png"))); // NOI18N
        getContentPane().add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddPaymentActionPerformed

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
            java.util.logging.Logger.getLogger(AddPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddPayment;
    private javax.swing.JComboBox<String> jComboBoxPaymentMethodValue;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel lblInvoiceID2;
    private javax.swing.JLabel lblInvoiceIDValue1;
    private javax.swing.JLabel lblPaymentType;
    private javax.swing.JLabel lblTimeanddate2;
    private javax.swing.JLabel lblTimeanddate3;
    private javax.swing.JLabel lblTimeanddate4;
    private javax.swing.JLabel lblTimeanddate5;
    private javax.swing.JTextField txtFieldTimeanddate2;
    private javax.swing.JTextField txtFieldTimeanddate3;
    // End of variables declaration//GEN-END:variables
    
    //custom variable
    private String productID;
    private String companyName;
    private String model;
    private String dimension;
    //end of custom variable
    
    private void setIcon(){
        this.setIconImage(new ImageIcon(getClass().getResource("/Resources/Icons/Icon.png")).getImage());
    }
    
    public void setValue(String productID, String companyName, String model, String dimension){
        this.productID = companyName;
        this.companyName = companyName;
        this.model = model;
        this.dimension = dimension;
    }
}
