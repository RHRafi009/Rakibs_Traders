package UI;


import Database.DBConnectionProvider;
import Others.Functions;
import UI.BigPopUp.AttendenceHistory;
import UI.BigPopUp.CustomerList;
import UI.BigPopUp.EditUser;
import UI.BigPopUp.Employee;
import UI.BigPopUp.EmployeeList;
import UI.BigPopUp.ProductsTable;
import UI.BigPopUp.UsersLog;
import UI.BigPopUp.ViewStock;
import UI.PopUp.DeleteProducts;
import UI.PopUp.EditStockAlert;
import UI.PopUp.NoConnection;
import UI.PopUp.Save;
import UI.PopUp.Updated;
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
import UI.BigPopUp.*;
import UI.PopUp.TakeAttendance;
import java.awt.event.WindowEvent;

/**
 *
 * @author RH Rafi
 */
public class Settings extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    public Settings() {
        initComponents();
        //initComboCompanyName();
        initComboProductID();
        setIcon();
        //setTime();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHome = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnBuy = new javax.swing.JButton();
        btnSell = new javax.swing.JButton();
        btnProducts = new javax.swing.JButton();
        btnStock = new javax.swing.JButton();
        btnReturnProducts = new javax.swing.JButton();
        btnReports = new javax.swing.JButton();
        btnSettings = new javax.swing.JButton();
        lblSettings = new javax.swing.JLabel();
        btnExpenses = new javax.swing.JButton();
        jButtonVendorList = new javax.swing.JButton();
        jButtonTakeAttendance = new javax.swing.JButton();
        jButtonAddendenceHistory = new javax.swing.JButton();
        jButtonUsersLog = new javax.swing.JButton();
        jButtonEditUsers = new javax.swing.JButton();
        jButtonAddStockAlertValue = new javax.swing.JButton();
        jButtonEmployeeList = new javax.swing.JButton();
        jButtonEditEmployee = new javax.swing.JButton();
        lblTime = new javax.swing.JLabel();
        jButtonCustomerList = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        lblAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Admin + icon.png"))); // NOI18N
        lblAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdminMouseClicked(evt);
            }
        });
        getContentPane().add(lblAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, 110, -1));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/DASHBOARD.png"))); // NOI18N
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 200, 88));

        btnBuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/BUY.png"))); // NOI18N
        btnBuy.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnBuyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnBuyFocusLost(evt);
            }
        });
        btnBuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuyMouseExited(evt);
            }
        });
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 138, 23));

        btnSell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Sell.png"))); // NOI18N
        btnSell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSellMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSellMouseExited(evt);
            }
        });
        btnSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellActionPerformed(evt);
            }
        });
        getContentPane().add(btnSell, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 138, 23));

        btnProducts.setBackground(new java.awt.Color(204, 204, 204));
        btnProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Products.png"))); // NOI18N
        btnProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProductsMouseExited(evt);
            }
        });
        btnProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductsActionPerformed(evt);
            }
        });
        getContentPane().add(btnProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 138, 23));

        btnStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Stock.png"))); // NOI18N
        btnStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStockMouseExited(evt);
            }
        });
        btnStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockActionPerformed(evt);
            }
        });
        getContentPane().add(btnStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 138, 23));

        btnReturnProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Return Products.png"))); // NOI18N
        btnReturnProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReturnProductsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReturnProductsMouseExited(evt);
            }
        });
        btnReturnProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnProductsActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturnProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 138, 23));

        btnReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Reports.png"))); // NOI18N
        btnReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReportsMouseExited(evt);
            }
        });
        btnReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsActionPerformed(evt);
            }
        });
        getContentPane().add(btnReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 138, 23));

        btnSettings.setBackground(new java.awt.Color(67, 196, 114));
        btnSettings.setForeground(new java.awt.Color(67, 196, 114));
        btnSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Settings_G.png"))); // NOI18N
        btnSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSettingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSettingsMouseExited(evt);
            }
        });
        btnSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingsActionPerformed(evt);
            }
        });
        getContentPane().add(btnSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 138, 23));

        lblSettings.setFont(new java.awt.Font("Titillium", 0, 22)); // NOI18N
        lblSettings.setForeground(new java.awt.Color(67, 196, 114));
        lblSettings.setText("Settings");
        getContentPane().add(lblSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 304, 43));

        btnExpenses.setBackground(new java.awt.Color(204, 204, 204));
        btnExpenses.setForeground(new java.awt.Color(67, 196, 114));
        btnExpenses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Expenses.png"))); // NOI18N
        btnExpenses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExpensesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExpensesMouseExited(evt);
            }
        });
        btnExpenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpensesActionPerformed(evt);
            }
        });
        getContentPane().add(btnExpenses, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 138, 23));

        jButtonVendorList.setBackground(new java.awt.Color(255, 153, 51));
        jButtonVendorList.setFont(new java.awt.Font("Titillium", 1, 13)); // NOI18N
        jButtonVendorList.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVendorList.setText("VENDOR LIST");
        jButtonVendorList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVendorListActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVendorList, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 180, 30));

        jButtonTakeAttendance.setBackground(new java.awt.Color(255, 51, 0));
        jButtonTakeAttendance.setFont(new java.awt.Font("Titillium", 1, 13)); // NOI18N
        jButtonTakeAttendance.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTakeAttendance.setText("TAKE ATTENDANCE");
        jButtonTakeAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTakeAttendanceActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTakeAttendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 180, 30));

        jButtonAddendenceHistory.setBackground(new java.awt.Color(255, 51, 0));
        jButtonAddendenceHistory.setFont(new java.awt.Font("Titillium", 1, 13)); // NOI18N
        jButtonAddendenceHistory.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddendenceHistory.setText("ATTENDENCE HISTORY");
        jButtonAddendenceHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddendenceHistoryActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAddendenceHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 180, 30));

        jButtonUsersLog.setBackground(new java.awt.Color(0, 204, 102));
        jButtonUsersLog.setFont(new java.awt.Font("Titillium", 1, 13)); // NOI18N
        jButtonUsersLog.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUsersLog.setText("USERS LOG");
        jButtonUsersLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsersLogActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUsersLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 180, 30));

        jButtonEditUsers.setBackground(new java.awt.Color(0, 204, 102));
        jButtonEditUsers.setFont(new java.awt.Font("Titillium", 1, 13)); // NOI18N
        jButtonEditUsers.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditUsers.setText("EDIT USERS");
        jButtonEditUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditUsersActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 180, 30));

        jButtonAddStockAlertValue.setBackground(new java.awt.Color(0, 51, 153));
        jButtonAddStockAlertValue.setFont(new java.awt.Font("Titillium", 1, 13)); // NOI18N
        jButtonAddStockAlertValue.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddStockAlertValue.setText("EDIT STOCK ALERT");
        jButtonAddStockAlertValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddStockAlertValueActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAddStockAlertValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 180, 30));

        jButtonEmployeeList.setBackground(new java.awt.Color(0, 51, 153));
        jButtonEmployeeList.setFont(new java.awt.Font("Titillium", 1, 13)); // NOI18N
        jButtonEmployeeList.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEmployeeList.setText("EMPLOYEE LIST");
        jButtonEmployeeList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmployeeListActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEmployeeList, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 180, 30));

        jButtonEditEmployee.setBackground(new java.awt.Color(0, 51, 153));
        jButtonEditEmployee.setFont(new java.awt.Font("Titillium", 1, 13)); // NOI18N
        jButtonEditEmployee.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditEmployee.setText("EDIT EMPLOYEE");
        jButtonEditEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditEmployeeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 180, 30));

        lblTime.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setText("Time: ");
        getContentPane().add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 40, 230, 30));

        jButtonCustomerList.setBackground(new java.awt.Color(255, 153, 51));
        jButtonCustomerList.setFont(new java.awt.Font("Titillium", 1, 13)); // NOI18N
        jButtonCustomerList.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCustomerList.setText("CUSTOMER LIST");
        jButtonCustomerList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCustomerListActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCustomerList, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 180, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/background.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 669));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        // TODO add your handling code here:
        
        Sell page = Sell.getRef();
        page.setFlagTime();
        page.setTime();
        this.setFlagTime();
        RakibsTraders.changeFrame(this, page);
    }//GEN-LAST:event_lblHomeMouseClicked

    private void lblAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminMouseClicked
        // TODO add your handling code here:
        Functions.logoutLog();
        LoginPage page = LoginPage.getRef();
        page.clearField();
        RakibsTraders.changeFrame(this, page);
    }//GEN-LAST:event_lblAdminMouseClicked

    private void btnBuyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnBuyFocusGained
        // TODO add your handling code here:      
    }//GEN-LAST:event_btnBuyFocusGained

    private void btnBuyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnBuyFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuyFocusLost

    private void btnBuyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuyMouseEntered
        // will change to green picture:
        btnBuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/BUY_G.png")));
    }//GEN-LAST:event_btnBuyMouseEntered

    private void btnBuyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuyMouseExited
        // will change to white picture:
        btnBuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/BUY.png")));
    }//GEN-LAST:event_btnBuyMouseExited

    private void btnSellMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSellMouseEntered
        // gren:
        btnSell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Sell_G.png")));
    }//GEN-LAST:event_btnSellMouseEntered

    private void btnSellMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSellMouseExited
        // white:
        btnSell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Sell.png")));
    }//GEN-LAST:event_btnSellMouseExited

    private void btnStockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStockMouseEntered
        // green
        btnStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Stock_G.png")));
    }//GEN-LAST:event_btnStockMouseEntered

    private void btnStockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStockMouseExited
        // white:
        btnStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Stock.png")));
    }//GEN-LAST:event_btnStockMouseExited

    private void btnReturnProductsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnProductsMouseEntered
        // green:
        btnReturnProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Return Products_G.png")));
    }//GEN-LAST:event_btnReturnProductsMouseEntered

    private void btnReturnProductsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnProductsMouseExited
        // white:
        btnReturnProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Return Products.png")));
    }//GEN-LAST:event_btnReturnProductsMouseExited

    private void btnReportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportsMouseEntered
        // green:
        btnReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Reports_G.png")));
    }//GEN-LAST:event_btnReportsMouseEntered

    private void btnReportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportsMouseExited
        // white:
        btnReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Reports.png")));
    }//GEN-LAST:event_btnReportsMouseExited

    private void btnSettingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingsMouseEntered
        // Green:
        //btnSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Settings_G.png")));
    }//GEN-LAST:event_btnSettingsMouseEntered

    private void btnSettingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingsMouseExited
        // White:
        //btnSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Settings.png")));
    }//GEN-LAST:event_btnSettingsMouseExited

    private void btnSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSettingsActionPerformed

    private void btnReturnProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnProductsActionPerformed
        // TODO add your handling code here:
        ReturnProducts page = ReturnProducts.getRef();
        page.setFlagTime();
        page.setTime();
        this.setFlagTime();
        RakibsTraders.changeFrame(this, page);
    }//GEN-LAST:event_btnReturnProductsActionPerformed

    private void btnSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellActionPerformed
        // TODO add your handling code here:
        Sell page = Sell.getRef();
        page.setFlagTime();
        page.setTime();
        this.setFlagTime();
        RakibsTraders.changeFrame(this, page);
    }//GEN-LAST:event_btnSellActionPerformed

    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed
        // TODO add your handling code here:
        Buy page = Buy.getRef();
        page.setFlagTime();
        page.setTime();
        this.setFlagTime();
        RakibsTraders.changeFrame(this, page);
    }//GEN-LAST:event_btnBuyActionPerformed

    private void btnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockActionPerformed
        // TODO add your handling code here:
        Stock page = Stock.getRef();
        page.setFlagTime();
        page.setTime();
        this.setFlagTime();
        RakibsTraders.changeFrame(this, page);
    }//GEN-LAST:event_btnStockActionPerformed

    private void btnExpensesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExpensesMouseEntered
        // Green:
        btnExpenses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Expenses_G.png")));
    }//GEN-LAST:event_btnExpensesMouseEntered

    private void btnExpensesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExpensesMouseExited
        // White:
        btnExpenses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Expenses.png")));
    }//GEN-LAST:event_btnExpensesMouseExited

    private void btnExpensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpensesActionPerformed
        // TODO add your handling code here:
        Expenses page = Expenses.getRef();
        page.setFlagTime();
        page.setTime();
        this.setFlagTime();
        RakibsTraders.changeFrame(this, page);
    }//GEN-LAST:event_btnExpensesActionPerformed

    private void btnProductsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductsMouseEntered
        // TODO add your handling code here:
        // btnProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Products_G.png")));
         btnProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Products_G.png")));
        
    }//GEN-LAST:event_btnProductsMouseEntered

    private void btnProductsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductsMouseExited
        // TODO add your handling code here:
          btnProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Products.png")));
    }//GEN-LAST:event_btnProductsMouseExited

    private void btnProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductsActionPerformed
           // TODO add your handling code here:
           Products page = Products.getRef();
           page.setFlagTime();
           page.setTime();
           this.setFlagTime();
           RakibsTraders.changeFrame(this, page);
    }//GEN-LAST:event_btnProductsActionPerformed

    private void btnProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductsMouseClicked

    private void jButtonVendorListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVendorListActionPerformed
        // TODO add your handling code here:
        if(this.access == 1 || this.access == 2){
            VendorList page = new VendorList();
            page.setCaller(this);
            RakibsTraders.bigPopUp(page);
            this.setEnabled(false);
        }

    }//GEN-LAST:event_jButtonVendorListActionPerformed

    private void jButtonTakeAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTakeAttendanceActionPerformed
        // TODO add your handling code here:
        if(this.access == 1 || this.access == 2){
            TakeAttendance page = new TakeAttendance();
            page.setCaller(this);
            RakibsTraders.popUp(page);
            this.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonTakeAttendanceActionPerformed

    private void jButtonAddendenceHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddendenceHistoryActionPerformed
        // TODO add your handling code here:
        if(this.access == 1 || this.access == 2){
            AttendenceHistory page = new AttendenceHistory();
            page.setCaller(this);
            RakibsTraders.bigPopUp(page);
            this.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonAddendenceHistoryActionPerformed

    private void jButtonUsersLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsersLogActionPerformed
        // TODO add your handling code here:
        if(this.access == 1){
            UsersLog page = new UsersLog();
            page.setCaller(this);
            RakibsTraders.bigPopUp(page);
            this.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonUsersLogActionPerformed

    private void jButtonEditUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditUsersActionPerformed
        // TODO add your handling code here:
        if(this.access == 1 || this.access == 2){
            EditUser page = new EditUser();
            page.setCaller(this);
            RakibsTraders.bigPopUp(page);
            this.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonEditUsersActionPerformed

    private void jButtonAddStockAlertValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddStockAlertValueActionPerformed
        // TODO add your handling code here:
        if(this.access == 1 || this.access == 2){
            EditStockAlert page = new EditStockAlert();
            page.setCaller(this);
            RakibsTraders.popUp(page);
            this.setEnabled(false);
        }
        
        
    }//GEN-LAST:event_jButtonAddStockAlertValueActionPerformed

    private void jButtonEmployeeListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmployeeListActionPerformed
        // TODO add your handling code here:
        if(this.access == 1 || this.access == 2){
            EmployeeList page = new EmployeeList();
            page.setCaller(this);
            RakibsTraders.bigPopUp(page);
            this.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonEmployeeListActionPerformed

    private void jButtonEditEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditEmployeeActionPerformed
        // TODO add your handling code here:
        if(this.access == 1 || this.access == 2){
            Employee page = new Employee();
            page.setCaller(this);
            RakibsTraders.bigPopUp(page);
            this.setEnabled(false);
        }
        
    }//GEN-LAST:event_jButtonEditEmployeeActionPerformed

    private void jButtonCustomerListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCustomerListActionPerformed
        // TODO add your handling code here:
        if(this.access == 1 || this.access == 2){
            CustomerList page = new CustomerList();
            page.setCaller(this);
            RakibsTraders.bigPopUp(page);
            this.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonCustomerListActionPerformed

    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed
        // TODO add your handling code here:
        if(this.access == 1 || this.access == 2){
            Reports page = Reports.getRef();
            page.setFlagTime();
            page.setTime();
            this.setFlagTime();
            RakibsTraders.changeFrame(this, page);
        }
    }//GEN-LAST:event_btnReportsActionPerformed

    
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
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnExpenses;
    private javax.swing.JButton btnProducts;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnReturnProducts;
    private javax.swing.JButton btnSell;
    private javax.swing.JButton btnSettings;
    private javax.swing.JButton btnStock;
    private javax.swing.JButton jButtonAddStockAlertValue;
    private javax.swing.JButton jButtonAddendenceHistory;
    private javax.swing.JButton jButtonCustomerList;
    private javax.swing.JButton jButtonEditEmployee;
    private javax.swing.JButton jButtonEditUsers;
    private javax.swing.JButton jButtonEmployeeList;
    private javax.swing.JButton jButtonTakeAttendance;
    private javax.swing.JButton jButtonUsersLog;
    private javax.swing.JButton jButtonVendorList;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblSettings;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables

    //custome variables declaration
    private ArrayList<String> productID = new ArrayList<>();
    private ArrayList<String> companyName = new ArrayList<>();
    private ArrayList<String> model = new ArrayList<>();
    private ArrayList<String> dimension = new ArrayList<>();
    private static Settings ref;
    private Integer flagTime = 0;
    private Integer access = 0;
    //end custom varibles
    
    public static Settings getRef(){
        if(ref==null)
            ref = new Settings();
        return ref;
    }
    
    public void setAcsess(Integer acc){
        this.access = acc;
    }
    
    private void clearField() {
//         this.txtFieldProductID.setText("");
//         this.txtFieldCompanyName.setText("");
//         this.txtFieldDimension.setText("");
//         this.txtFieldModel.setText("");
//         this.txtFieldItemUnit.setText("");
//         this.txtFieldPcsPerBox.setText("");
//         this.txtFieldPurchasePrice.setText("");
//         this.txtFieldSellingPrice.setText("");
//         this.txtAreanotes.setText("");
//         initComboProductID();
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
                        //System.out.println(sec);
                        hour = cal.get(Calendar.HOUR);
                        if(hour==0)
                            hour=12;
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
//        Functions.setupAutoComplete(txtFieldProductID, productID); 
    }
    
    private void initComboCompanyName(){
        companyName = Functions.companyName();
//        Functions.setupAutoComplete(txtFieldCompanyName, companyName); 
    }
    
    private void initComboModel(String companyName){
        model = Functions.model(companyName);
//        Functions.setupAutoComplete(txtFieldModel, model);
    }
    
    private void initComboDimension(String companyName, String model){
        dimension = Functions.dimension(companyName, model);
//        Functions.setupAutoComplete(txtFieldDimension, dimension);
    }
    
    @Override
    public void processWindowEvent(WindowEvent e) {
        if (e.getID() == WindowEvent.WINDOW_CLOSING) {
            Functions.logoutLog();
            //dispose();
            RakibsTraders.close();
        }
    }
}
