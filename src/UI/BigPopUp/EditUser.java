package UI.BigPopUp;


import Database.DBConnectionProvider;
import Others.Functions;
import UI.BigPopUp.ProductsTable;
import UI.BigPopUp.ViewStock;
import UI.Buy;
import UI.Dashboard;
import UI.Expenses;
import UI.LoginPage;
import UI.PopUp.Delete;
import UI.PopUp.NoConnection;
import UI.PopUp.Save;
import UI.PopUp.Updated;
import UI.ReturnProducts;
import UI.Sell;
import UI.Settings;
import UI.Stock;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.*;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.annotation.Resources.*;
import javax.swing.ImageIcon;
import rakibs.traders.RakibsTraders;

/**
 *
 * @author RH Rafi
 */
public class EditUser extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    public EditUser() {
        initComponents();
        //initComboCompanyName();
        initComboProductID();
        setIcon();
        //setTime();
    }
    
    //Rafis legendary of reference
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHome = new javax.swing.JLabel();
        lblPageTitle = new javax.swing.JLabel();
        lbUSERNAME = new javax.swing.JLabel();
        jButtonDelete = new javax.swing.JButton();
        lblStartingDate = new javax.swing.JLabel();
        txtUserNameValue = new javax.swing.JTextField();
        lblTime = new javax.swing.JLabel();
        userPassF = new javax.swing.JPasswordField();
        btnRefrash1 = new javax.swing.JButton();
        jButtonSubmit1 = new javax.swing.JButton();
        lblPageTitle1 = new javax.swing.JLabel();
        lbUSERNAME1 = new javax.swing.JLabel();
        txtUserNameValue1 = new javax.swing.JTextField();
        userPassF1 = new javax.swing.JPasswordField();
        lblStartingDate1 = new javax.swing.JLabel();
        lblStartingDate2 = new javax.swing.JLabel();
        userPassF2 = new javax.swing.JPasswordField();
        jButtonSave = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Logo.png"))); // NOI18N
        lblHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
        });
        getContentPane().add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 40));

        lblPageTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPageTitle.setForeground(new java.awt.Color(67, 196, 114));
        lblPageTitle.setText("ADD NEW USER");
        getContentPane().add(lblPageTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 230, 43));

        lbUSERNAME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbUSERNAME.setForeground(new java.awt.Color(255, 255, 255));
        lbUSERNAME.setText("USER NAME");
        getContentPane().add(lbUSERNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 130, 23));

        jButtonDelete.setBackground(new java.awt.Color(204, 0, 0));
        jButtonDelete.setFont(new java.awt.Font("Titillium", 1, 13)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 130, 30));

        lblStartingDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblStartingDate.setForeground(new java.awt.Color(255, 255, 255));
        lblStartingDate.setText("Password :");
        getContentPane().add(lblStartingDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 103, 23));

        txtUserNameValue.setForeground(new java.awt.Color(204, 204, 204));
        txtUserNameValue.setText("User Name");
        txtUserNameValue.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserNameValueFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserNameValueFocusLost(evt);
            }
        });
        txtUserNameValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameValueActionPerformed(evt);
            }
        });
        getContentPane().add(txtUserNameValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 380, 23));

        lblTime.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setText("Time: ");
        getContentPane().add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 230, 30));

        userPassF.setFont(new java.awt.Font("Titillium", 0, 14)); // NOI18N
        userPassF.setToolTipText("Password");
        userPassF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userPassFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userPassFFocusLost(evt);
            }
        });
        userPassF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPassFActionPerformed(evt);
            }
        });
        userPassF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userPassFKeyPressed(evt);
            }
        });
        getContentPane().add(userPassF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 380, 30));

        btnRefrash1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Refresh.png"))); // NOI18N
        btnRefrash1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrash1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRefrash1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, 219, 33));

        jButtonSubmit1.setBackground(new java.awt.Color(67, 196, 114));
        jButtonSubmit1.setFont(new java.awt.Font("Titillium", 1, 13)); // NOI18N
        jButtonSubmit1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSubmit1.setText("VIEW USER LIST");
        jButtonSubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmit1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSubmit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 220, 30));

        lblPageTitle1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPageTitle1.setForeground(new java.awt.Color(67, 196, 114));
        lblPageTitle1.setText("UPDATE / DELETE USER");
        getContentPane().add(lblPageTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 230, 43));

        lbUSERNAME1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbUSERNAME1.setForeground(new java.awt.Color(255, 255, 255));
        lbUSERNAME1.setText("USER NAME");
        getContentPane().add(lbUSERNAME1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 130, 23));

        txtUserNameValue1.setForeground(new java.awt.Color(204, 204, 204));
        txtUserNameValue1.setText("User Name");
        txtUserNameValue1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserNameValue1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserNameValue1FocusLost(evt);
            }
        });
        txtUserNameValue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameValue1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtUserNameValue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 380, 23));

        userPassF1.setFont(new java.awt.Font("Titillium", 0, 14)); // NOI18N
        userPassF1.setToolTipText("Password");
        userPassF1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userPassF1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userPassF1FocusLost(evt);
            }
        });
        userPassF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPassF1ActionPerformed(evt);
            }
        });
        userPassF1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userPassF1KeyPressed(evt);
            }
        });
        getContentPane().add(userPassF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 380, 30));

        lblStartingDate1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblStartingDate1.setForeground(new java.awt.Color(255, 255, 255));
        lblStartingDate1.setText("NEW Password :");
        getContentPane().add(lblStartingDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 103, 23));

        lblStartingDate2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblStartingDate2.setForeground(new java.awt.Color(255, 255, 255));
        lblStartingDate2.setText("OLD Password :");
        getContentPane().add(lblStartingDate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 103, 23));

        userPassF2.setFont(new java.awt.Font("Titillium", 0, 14)); // NOI18N
        userPassF2.setToolTipText("Password");
        userPassF2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userPassF2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userPassF2FocusLost(evt);
            }
        });
        userPassF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPassF2ActionPerformed(evt);
            }
        });
        userPassF2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userPassF2KeyPressed(evt);
            }
        });
        getContentPane().add(userPassF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 380, 30));

        jButtonSave.setBackground(new java.awt.Color(67, 196, 114));
        jButtonSave.setFont(new java.awt.Font("Titillium", 1, 13)); // NOI18N
        jButtonSave.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSave.setText("SAVE");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 130, 30));

        jButtonUpdate.setBackground(new java.awt.Color(0, 0, 153));
        jButtonUpdate.setFont(new java.awt.Font("Titillium", 1, 13)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 130, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/background.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 669));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        // TODO add your handling code here:
        
        Dashboard page = new Dashboard();
        RakibsTraders.changeFrame(this, page);
    }//GEN-LAST:event_lblHomeMouseClicked

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void txtUserNameValueFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameValueFocusGained
        // TODO add your handling code here:
        if( txtUserNameValue.getText().equals("Product ID")){
            this.txtUserNameValue.setText("");
        }
        this.txtUserNameValue.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtUserNameValueFocusGained

    private void txtUserNameValueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameValueFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameValueFocusLost

    private void txtUserNameValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameValueActionPerformed
    
    private void userPassFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userPassFFocusGained
        userPassF.setText("");
        userPassF.setForeground(Color.black);
//        lblPassInvalid.setVisible(false);
    }//GEN-LAST:event_userPassFFocusGained

    private void userPassFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userPassFFocusLost
        userPassF.setForeground(Color.GRAY);
    }//GEN-LAST:event_userPassFFocusLost

    private void userPassFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPassFActionPerformed
        // TODO add your handling code here:
//        btnGoActionPerformed(evt);
    }//GEN-LAST:event_userPassFActionPerformed

    private void userPassFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userPassFKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPassFKeyPressed

    private void btnRefrash1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrash1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefrash1ActionPerformed

    private void jButtonSubmit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmit1ActionPerformed
        // TODO add your handling code here:
        UserList page = new UserList();
        RakibsTraders.bigPopUp(page);
    }//GEN-LAST:event_jButtonSubmit1ActionPerformed

    private void txtUserNameValue1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameValue1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameValue1FocusGained

    private void txtUserNameValue1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameValue1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameValue1FocusLost

    private void txtUserNameValue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameValue1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameValue1ActionPerformed

    private void userPassF1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userPassF1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_userPassF1FocusGained

    private void userPassF1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userPassF1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_userPassF1FocusLost

    private void userPassF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPassF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPassF1ActionPerformed

    private void userPassF1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userPassF1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPassF1KeyPressed

    private void userPassF2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userPassF2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_userPassF2FocusGained

    private void userPassF2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userPassF2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_userPassF2FocusLost

    private void userPassF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPassF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPassF2ActionPerformed

    private void userPassF2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userPassF2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPassF2KeyPressed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    
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
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton btnRefrash1;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSubmit1;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel lbUSERNAME;
    private javax.swing.JLabel lbUSERNAME1;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblPageTitle;
    private javax.swing.JLabel lblPageTitle1;
    private javax.swing.JLabel lblStartingDate;
    private javax.swing.JLabel lblStartingDate1;
    private javax.swing.JLabel lblStartingDate2;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTextField txtUserNameValue;
    private javax.swing.JTextField txtUserNameValue1;
    private javax.swing.JPasswordField userPassF;
    private javax.swing.JPasswordField userPassF1;
    private javax.swing.JPasswordField userPassF2;
    // End of variables declaration//GEN-END:variables

    //custome variables declaration
    private ArrayList<String> productID = new ArrayList<>();
    private ArrayList<String> companyName = new ArrayList<>();
    private ArrayList<String> model = new ArrayList<>();
    private ArrayList<String> dimension = new ArrayList<>();
    private static EditUser ref;
    private Integer flagTime = 0;
    //end custom varibles
    
//    public static EditUser getRef(){
//        if(ref==null)
//            ref = new EditUser();
//        return ref;
//    }
    
    private void clearField() {
//         this.txtFieldEmployeeIDValue.setText("");
//         this.txtFieldCompanyName.setText("");
//         this.txtFieldDimension.setText("");
//         this.txtFieldStartingDateValue.setText("");
//         this.txtFieldItemUnit.setText("");
//         this.txtFieldPcsPerBox.setText("");
//         this.txtFieldPurchasePrice.setText("");
//         this.txtFieldSellingPrice.setText("");
//         this.txtAreanotes.setText("");
         initComboProductID();
    }
    
    private void setIcon(){
        this.setIconImage(new ImageIcon(getClass().getResource("/Resources/Icons/Icon.png")).getImage());
    }
    
    public void setFlagTime(){
        if(flagTime==0)
            flagTime=1;
        else
            flagTime=0;
    }
     
     public void setTime(){
        new Thread(){
            public void run(){
                if(flagTime==1){
                    SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date d = new Date();
                    String date = dFormat.format(d);
                    int sec;
                    int hour;
                    int min;
                    int am_pm;
                    while(flagTime==1/* && new GregorianCalendar().get(Calendar.SECOND)!=fsec*/){
                        Calendar cal = new GregorianCalendar();
                        sec = cal.get(Calendar.SECOND);
                        System.out.println(sec);
                        hour = cal.get(Calendar.HOUR);
                        min = cal.get(Calendar.MINUTE);
                        am_pm = cal.get(Calendar.AM_PM);
                        if(am_pm == 0){
                            String time = "Time: " + hour + " : " + min + " : " + sec + " " + "AM" + " Date: " + date;
                            lblTime.setText(time);
                        }else {
                            String time = "Time: " + hour + " : " + min + " : " + sec + " " + "PM" + " Date: " + date;
                            lblTime.setText(time);
                               }
                        try {
                            sleep(1000);
                        } catch (InterruptedException ex) {
                                Logger.getLogger(Sell.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            
                    }    
                }
            }
        }.start();
    }
    
    private void initComboProductID(){
        productID = Functions.productID();
//        Functions.setupAutoComplete(txtFieldEmployeeIDValue, productID); 
    }
    
    private void initComboCompanyName(){
        companyName = Functions.companyName();
//        Functions.setupAutoComplete(txtFieldCompanyName, companyName); 
    }
    
    private void initComboModel(String companyName){
        model = Functions.model(companyName);
//        Functions.setupAutoComplete(txtFieldStartingDateValue, model);
    }
    
    private void initComboDimension(String companyName, String model){
        dimension = Functions.dimension(companyName, model);
//        Functions.setupAutoComplete(txtFieldDimension, dimension);
    }
}