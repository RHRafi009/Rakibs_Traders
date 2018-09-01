package UI;


import Database.DBConnectionProvider;
import Others.Functions;
import UI.BigPopUp.Invoice;
import UI.BigPopUp.ProductsTable;
import UI.PopUp.Delete;
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

/**
 *
 * @author RH Rafi
 */
public class Stock extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    public Stock() {
        initComponents();
        //setTime();
        initComboProductID();
        setIcon();
//        initComboCompanyName();
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
        lblPageTitle = new javax.swing.JLabel();
        lblProductID = new javax.swing.JLabel();
        lblProductName = new javax.swing.JLabel();
        lblProductModel = new javax.swing.JLabel();
        lblCompanyName1 = new javax.swing.JLabel();
        lblItemUnit = new javax.swing.JLabel();
        lblAvailableQTY = new javax.swing.JLabel();
        txtProductID = new javax.swing.JTextField();
        jTextFieldAvailableQTYValue = new javax.swing.JTextField();
        jLabelProductName = new javax.swing.JLabel();
        jLabelProductModel = new javax.swing.JLabel();
        jLabelCompanyNameValue = new javax.swing.JLabel();
        lblInvoiceIDValue = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jLabelItemUnitValue = new javax.swing.JLabel();
        lblItemSelectAction = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButtonRecentlyAdded = new javax.swing.JButton();
        btnExpenses = new javax.swing.JButton();
        jComboBoxSelectAction = new javax.swing.JComboBox<>();
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
        getContentPane().add(btnBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 138, 23));

        btnSell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Sell.png"))); // NOI18N
        btnSell.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnSellFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnSellFocusLost(evt);
            }
        });
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
        getContentPane().add(btnSell, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 138, 23));

        btnProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Products.png"))); // NOI18N
        btnProducts.addMouseListener(new java.awt.event.MouseAdapter() {
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
        getContentPane().add(btnProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 138, 23));

        btnStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Stock_G.png"))); // NOI18N
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
        getContentPane().add(btnStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 138, 23));

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
        getContentPane().add(btnReturnProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 138, 23));

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
        getContentPane().add(btnReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 138, 23));

        btnSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Settings.png"))); // NOI18N
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
        getContentPane().add(btnSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 138, 23));

        lblPageTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/STOCKLevel.png"))); // NOI18N
        getContentPane().add(lblPageTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 100, 43));

        lblProductID.setForeground(new java.awt.Color(255, 255, 255));
        lblProductID.setText("Product ID");
        getContentPane().add(lblProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 103, 23));

        lblProductName.setForeground(new java.awt.Color(255, 255, 255));
        lblProductName.setText("Product Name");
        getContentPane().add(lblProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 103, 23));

        lblProductModel.setForeground(new java.awt.Color(255, 255, 255));
        lblProductModel.setText("Product Model");
        getContentPane().add(lblProductModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 103, 23));

        lblCompanyName1.setForeground(new java.awt.Color(255, 255, 255));
        lblCompanyName1.setText("Company Name");
        getContentPane().add(lblCompanyName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 103, 23));

        lblItemUnit.setForeground(new java.awt.Color(255, 255, 255));
        lblItemUnit.setText("Item Unit");
        getContentPane().add(lblItemUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 103, 23));

        lblAvailableQTY.setForeground(new java.awt.Color(255, 255, 255));
        lblAvailableQTY.setText("Available QTY");
        getContentPane().add(lblAvailableQTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 103, 23));

        txtProductID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProductIDFocusGained(evt);
            }
        });
        txtProductID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 220, 23));

        jTextFieldAvailableQTYValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAvailableQTYValueActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAvailableQTYValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 220, -1));

        jLabelProductName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProductName.setText("Product Name");
        getContentPane().add(jLabelProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 90, 20));

        jLabelProductModel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProductModel.setText("Product Model");
        getContentPane().add(jLabelProductModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 90, 20));

        jLabelCompanyNameValue.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCompanyNameValue.setText("Company Name");
        getContentPane().add(jLabelCompanyNameValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 90, 20));

        lblInvoiceIDValue.setFont(new java.awt.Font("Titillium Web", 1, 16)); // NOI18N
        lblInvoiceIDValue.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblInvoiceIDValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 110, 23));

        lblTime.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setText("Time: ");
        getContentPane().add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 40, 230, 30));

        jLabelItemUnitValue.setForeground(new java.awt.Color(255, 255, 255));
        jLabelItemUnitValue.setText("Item Unit");
        getContentPane().add(jLabelItemUnitValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 90, 20));

        lblItemSelectAction.setForeground(new java.awt.Color(255, 255, 255));
        lblItemSelectAction.setText("Select Action");
        getContentPane().add(lblItemSelectAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 103, 23));
        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 890, 240));

        jButton2.setBackground(new java.awt.Color(11, 66, 159));
        jButton2.setFont(new java.awt.Font("Titillium", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, 100, 20));

        jButton3.setBackground(new java.awt.Color(11, 66, 159));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/view product listBlue.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 360, 150, 30));

        jButton4.setBackground(new java.awt.Color(67, 196, 114));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/RefreshBlue.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 400, 150, 30));

        jButton5.setBackground(new java.awt.Color(11, 66, 159));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/view stockBlue.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, 170, 30));

        jButtonRecentlyAdded.setBackground(new java.awt.Color(0, 51, 153));
        jButtonRecentlyAdded.setFont(new java.awt.Font("Titillium Web", 1, 14)); // NOI18N
        jButtonRecentlyAdded.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRecentlyAdded.setText("RECENTLY ADDED");
        jButtonRecentlyAdded.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecentlyAddedActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRecentlyAdded, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 400, 170, 30));

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
        getContentPane().add(btnExpenses, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 138, 23));

        jComboBoxSelectAction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxSelectAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 220, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/background.png"))); // NOI18N
        Background.setText(" ");
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1290, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        // TODO add your handling code here:
        
        Dashboard page = new Dashboard();
        RakibsTraders.changeFrame(this, page);
    }//GEN-LAST:event_lblHomeMouseClicked

    private void lblAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminMouseClicked
        // TODO add your handling code here:
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
        btnSell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Sell_G.png")));
    }//GEN-LAST:event_btnSellMouseEntered

    private void btnSellMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSellMouseExited
       btnSell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Sell.png")));
    }//GEN-LAST:event_btnSellMouseExited

    private void btnStockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStockMouseEntered
        // green
        btnStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Stock_G.png")));
    }//GEN-LAST:event_btnStockMouseEntered

    private void btnStockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStockMouseExited
        // white:
       // btnStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Stock.png")));
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
        btnSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Settings_G.png")));
    }//GEN-LAST:event_btnSettingsMouseEntered

    private void btnSettingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingsMouseExited
        // White:
        btnSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Settings.png")));
    }//GEN-LAST:event_btnSettingsMouseExited

    private void btnSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingsActionPerformed
        // TODO add your handling code here:
        Settings page = Settings.getRef();
        page.setFlagTime();
        page.setTime();
        this.setFlagTime();
        RakibsTraders.changeFrame(this, page);
    }//GEN-LAST:event_btnSettingsActionPerformed

    private void btnReturnProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnProductsActionPerformed
        // TODO add your handling code here:
        ReturnProducts page = ReturnProducts.getRef();
        page.setFlagTime();
        page.setTime();
        this.setFlagTime();
        RakibsTraders.changeFrame(this, page);
    }//GEN-LAST:event_btnReturnProductsActionPerformed

    private void txtProductIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductIDActionPerformed

    private void txtProductIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductIDFocusGained
       
    }//GEN-LAST:event_txtProductIDFocusGained

    private void btnProductsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductsMouseEntered
            // TODO add your handling code here:
            
              btnProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Products_G.png")));
    }//GEN-LAST:event_btnProductsMouseEntered

    private void btnProductsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductsMouseExited
        // TODO add your handling code here:
         btnProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Products.png")));
    }//GEN-LAST:event_btnProductsMouseExited

    private void jTextFieldAvailableQTYValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAvailableQTYValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAvailableQTYValueActionPerformed

    private void btnProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductsActionPerformed
        // TODO add your handling code here:
        Products page = Products.getRef();
        page.setFlagTime();
        page.setTime();
        this.setFlagTime();
        RakibsTraders.changeFrame(this, page);
    }//GEN-LAST:event_btnProductsActionPerformed

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
    }//GEN-LAST:event_btnStockActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnSellFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnSellFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSellFocusGained

    private void btnSellFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnSellFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSellFocusLost

    private void btnSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellActionPerformed
        // TODO add your handling code here:
        Sell page = Sell.getRef();
        page.setFlagTime();
        page.setTime();
        this.setFlagTime();
        RakibsTraders.changeFrame(this, page);
    }//GEN-LAST:event_btnSellActionPerformed

    private void jButtonRecentlyAddedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecentlyAddedActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButtonRecentlyAddedActionPerformed

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

    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed
        // TODO add your handling code here:
        Reports page = Reports.getRef();
        page.setFlagTime();
        page.setTime();
        this.setFlagTime();
        RakibsTraders.changeFrame(this, page);
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
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Stock().setVisible(true);
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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonRecentlyAdded;
    private javax.swing.JComboBox<String> jComboBoxSelectAction;
    private javax.swing.JLabel jLabelCompanyNameValue;
    private javax.swing.JLabel jLabelItemUnitValue;
    private javax.swing.JLabel jLabelProductModel;
    private javax.swing.JLabel jLabelProductName;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldAvailableQTYValue;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblAvailableQTY;
    private javax.swing.JLabel lblCompanyName1;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblInvoiceIDValue;
    private javax.swing.JLabel lblItemSelectAction;
    private javax.swing.JLabel lblItemUnit;
    private javax.swing.JLabel lblPageTitle;
    private javax.swing.JLabel lblProductID;
    private javax.swing.JLabel lblProductModel;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtProductID;
    // End of variables declaration//GEN-END:variables

    //custome variables declaration
     private ArrayList<String> productID = new ArrayList<>();
     private static Stock ref;
     private Integer flagTime = 0;
    //end custom varibles
    
    public static Stock getRef(){
        if(ref==null)
            ref = new Stock();
        return ref;
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
    
    private void setIcon(){
        this.setIconImage(new ImageIcon(getClass().getResource("/Resources/Icons/Icon.png")).getImage());
    }
    
    private void initComboProductID(){
        productID = Functions.productID();
        Functions.setupAutoComplete(txtProductID, productID); 
    }
    
    
//    private void clearField() {
//         this.txtFieldCompanyName.setText("");
//         this.txtFieldDimension.setText("");
//         this.txtFieldModel.setText("");
//         this.txtFieldItemUnit.setText("");
//         this.txtFieldPcsPerBox.setText("");
//         this.txtFieldPurchasePrice.setText("");
//         this.txtFieldSellingPrice.setText("");
//         this.txtAreanotes.setText("");
//         initComboCompanyName();
//    }
    
//    private void initComboCompanyName(){
//        companyName = Functions.companyName();
//        Functions.setupAutoComplete(txtFieldCompanyName, companyName); 
//    }
//    
//    private void initComboModel(String companyName){
//        model = Functions.model(companyName);
//        Functions.setupAutoComplete(txtFieldModel, model);
//    }
//    
//    private void initComboDimension(String companyName, String model){
//        dimension = Functions.dimension(companyName, model);
//        Functions.setupAutoComplete(txtFieldDimension, dimension);
//    }
}
