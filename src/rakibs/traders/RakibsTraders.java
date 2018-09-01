package rakibs.traders;

/**
 *The main class.
 * @author RH Rafi
 */
import UI.Sell;
import UI.*;
import javax.swing.JFrame;
public class RakibsTraders {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        //LoginPage page = LoginPage.getRef();
        Sell page = Sell.getRef();
        page.setFlagTime();
        page.setTime();
        page.setVisible(true);
        page.setSize(1266, 668);
        page.setLocationRelativeTo(null);
        createFrame();
        
    }
    // for change frame
    public static void changeFrame(JFrame source, JFrame dest){
        dest.setSize(1266, 668);
        dest.setLocationRelativeTo(null);
        dest.setVisible(true);
        source.setVisible(false); 
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
        //Sell Sref = Sell.getRef();
        //Sref.setVisible(false);
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
    
}
