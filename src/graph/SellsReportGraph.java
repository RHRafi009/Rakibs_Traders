/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;


import java.awt.Toolkit;
import java.util.ArrayList;
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
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author yr
 */

public abstract class SellsReportGraph extends Application {
    
    public ArrayList<String> dates = new ArrayList<String>();
    public ArrayList<Double> values = new ArrayList<Double>();
    
    public void setData(ArrayList<String> datesF, ArrayList<Double> valuesF){
        dates.clear(); values.clear();
        
        this.dates = datesF;
        this.values = valuesF;
    }
    

    private void initAndShowGUI() {
             // This method is invoked on Swing thread
             JFrame frame = new JFrame("FX");
             final JFXPanel fxPanel = new JFXPanel();
             frame.add(fxPanel);
             frame.setSize(700, 500);
             frame.setTitle("Sells Report");
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
            xAxis.setLabel("Dates of Sell");

            NumberAxis yAxis = new NumberAxis();
            yAxis.setLabel("Values of Invoice");
            
            LineChart lineChart = new LineChart(xAxis, yAxis);
            XYChart.Series dataSeries1 = new XYChart.Series();
            dataSeries1.setName("Sells Reports");
            
//            System.err.println( values.size() + " " + dates.size() );
            for( int i=0; i<dates.size(); i++ ){ 
                dataSeries1.getData().add(new XYChart.Data( dates.get(i), values.get(i)));
            }
            
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

    
    
    

