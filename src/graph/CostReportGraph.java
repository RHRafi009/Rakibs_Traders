/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;


import static com.sun.org.apache.xerces.internal.util.XMLChar.trim;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Pair;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author yr
 */

public abstract class CostReportGraph extends Application {
    
    public ArrayList<String> dates = new ArrayList<String>();
    public ArrayList<Double> values = new ArrayList<Double>();
    List< Pair <String,Double> > mPairs = new ArrayList();
    
    public void setData(ArrayList<String> datesF, ArrayList<Double> valuesF){
        dates.clear(); values.clear();
        
        this.dates = datesF;
        this.values = valuesF;
        for( int i=0; i<dates.size(); i++ ){
            dates.set(i, trim(dates.get(i)));
        }
        mPairs.clear();
        for( int i=0; i<dates.size(); i++ ){
            mPairs.add( new Pair<>(dates.get(i),values.get(i)) );
//            System.err.println(dates.get(i) + " " + values.get(i));
        }
        mPairs.sort(Comparator.comparing(Pair:: getKey));
    }
    

    private void initAndShowGUI() {
             // This method is invoked on Swing thread
             JFrame frame = new JFrame("FX");
             final JFXPanel fxPanel = new JFXPanel();
             frame.add(fxPanel);
             frame.setSize(700, 500);
             frame.setTitle("Buy Report");
             frame.setVisible(true);
             frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/Icons/Icon.png")));
             frame.setLocationRelativeTo(null); // Setting the window in the center of the screen


             Platform.runLater(new Runnable() {
                 @Override
                 public void run() {
                     initFX(fxPanel);
                 }
             });
         }

         private void initFX(JFXPanel fxPanel) {
             // This method is invoked on JavaFX thread
            CategoryAxis xAxis = new CategoryAxis();
            xAxis.setLabel("Dates of Cost + EXPENSES");

            NumberAxis yAxis = new NumberAxis();
            yAxis.setLabel("Values of COST ");
            
            LineChart lineChart = new LineChart(xAxis, yAxis);
            XYChart.Series dataSeries1 = new XYChart.Series();
            dataSeries1.setName("Cost Reports");
            
//            System.err.println( values.size() + " " + dates.size() );

            mPairs.forEach(p -> dataSeries1.getData().add(new XYChart.Data( p.getKey(), p.getValue())));
//            mPairs.forEach(p -> System.err.println(new XYChart.Data( p.getKey(), p.getValue())));
            
            
            lineChart.getData().add(dataSeries1);
            Scene scene = new Scene(lineChart,500,700);
            
            fxPanel.setScene(scene);
            
         }

         public void main() {
             SwingUtilities.invokeLater(new Runnable() {
                 @Override
                 public void run() {
                     initAndShowGUI();
                 }
             });
         }
        
    }

    
    
    

