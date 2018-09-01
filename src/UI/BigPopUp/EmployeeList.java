package UI.BigPopUp;

import Database.DBConnectionProvider;
import UI.PopUp.NoConnection;
import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import rakibs.traders.RakibsTraders;

/**
 *
 * @author RH Rafi
 */
public class EmployeeList extends javax.swing.JFrame {
    /**
     * Creates new form ProductsTable
     */
    public EmployeeList() {
        initComponents();
        initTable();
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

        scrPaneTable = new javax.swing.JScrollPane();
        lblExpenseHistory = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(scrPaneTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 1017, 493));

        lblExpenseHistory.setFont(new java.awt.Font("Titillium", 0, 22)); // NOI18N
        lblExpenseHistory.setForeground(new java.awt.Color(67, 196, 114));
        lblExpenseHistory.setText("Employee List");
        getContentPane().add(lblExpenseHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 304, 43));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/background.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -360, 2540, 1380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(EmployeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeList().setVisible(true);
            }
        });
    }

    private void initTable(){
        setData();
        scrPaneTable.getViewport().add(table);
    }
    
    private void setData(){
        DefaultTableModel data = new DefaultTableModel(new String[]{"Products ID", "Company Name", "Model", "Dimension", "Pcs per Box", "Item Unit", "Purchase Price", "Selling price"}, 0);
        Connection con = DBConnectionProvider.getDBConnection();
        String query= "select * from products";
        try{
            Statement stmt = con.createStatement();
            ResultSet rs= stmt.executeQuery(query);
            if(rs.next()){
                do{
                    String col1 = rs.getString("products_id");
                    String col2 = rs.getString("company_name");
                    String col3 = rs.getString("model");
                    String col4 = rs.getString("dimension");
                    String col5 = Integer.toString(rs.getInt("pcs_per_box"));
                    String col6 = rs.getString("item_unit");
                    String col7 = Double.toString(rs.getInt("purchase_price"));
                    String col8 = Double.toString(rs.getInt("selling_price"));
                    data.addRow(new Object[]{col1, col2, col3, col4, col5, col6, col7, col8});
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
    JTable table = new JTable();
    //end of custom variable
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblExpenseHistory;
    private javax.swing.JScrollPane scrPaneTable;
    // End of variables declaration//GEN-END:variables
   
    private void setIcon(){
        this.setIconImage(new ImageIcon(getClass().getResource("/Resources/Icons/Icon.png")).getImage());
    }

}
