package rakibs.traders;

/**
 *The main class.
 * @author RH Rafi
 */
import UI.Sell;
import UI.*;
import java.io.IOException;
import javax.swing.JFrame;
public class RakibsTraders {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Process process = Runtime.getRuntime().exec("C:\\xampp\\mysql\\bin\\mysqld.exe");
        //Process process = Runtime.getRuntime().exec("C:\\Program Files (x86)\\MySQL\\MySQL Cluster 7.6\\bin\\mysqld.exe");     
        
        LoginPage page = LoginPage.getRef();
        //Sell page = Sell.getRef();
        //page.setFlagTime();
        //page.setTime();
        page.setVisible(true);
        page.setSize(1266, 668);
        page.setLocationRelativeTo(null);
        createFrame();
        //setAccess();
        
    }
    // for change frame
    public static void changeFrame(JFrame source, JFrame dest){
        dest.setSize(1266, 668);
        dest.setLocationRelativeTo(null);
        dest.setVisible(true);
        source.setVisible(false); 
        //setAccess();
    }
    
    public static void popUp(JFrame pop){
        pop.setSize(314, 125);
        pop.setLocationRelativeTo(null);
        pop.setVisible(true);
    }
    
    public static void bigPopUp(JFrame pop){
        pop.setSize(1100, 600);
        pop.setLocationRelativeTo(null);
        pop.setVisible(true);
    }
    
    private static void createFrame() {
        Sell Sref = Sell.getRef();
        Sref.setVisible(false);
        Buy Bref = Buy.getRef();
        Bref.setVisible(false);
        Products Pref = Products.getRef();
        Pref.setVisible(false);
        Stock Stref = Stock.getRef();
        Stref.setVisible(false);
        ReturnProducts Rref = ReturnProducts.getRef();
        Rref.setVisible(false);
        Expenses Eref = Expenses.getRef();
        Eref.setVisible(false);
    }
    
    public static void setAccess(){
        if(LoginPage.getRef().userAccess()==3){
            Stock.getRef().hideField();
        }
        Sell.getRef().setAcsess(LoginPage.getRef().userAccess());
        Buy.getRef().setAcsess(LoginPage.getRef().userAccess());
        Settings.getRef().setAcsess(LoginPage.getRef().userAccess());
        Reports.getRef().setAcsess(LoginPage.getRef().userAccess());
        Expenses.getRef().setAcsess(LoginPage.getRef().userAccess());
    }
    
    public static void close(){
        Sell Sref = Sell.getRef();
        Sref.dispose();
        Buy Bref = Buy.getRef();
        Bref.dispose();
        Products Pref = Products.getRef();
        Pref.dispose();
        Stock Stref = Stock.getRef();
        Stref.dispose();
        ReturnProducts Rref = ReturnProducts.getRef();
        Rref.dispose();
        Expenses Eref = Expenses.getRef();
        Eref.dispose();
        System.exit(0);
    }
}
