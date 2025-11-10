import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.*;
import java.util.Map;
 public class ChartPanelExample {
     public static JPanel createBarchart(String title,Map<String, Integer>data){
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
         for (String key : data.keySet()) {
             dataset.addValue(data.get(key))," Accidents",key);
         }
         JFreeChart chart =ChartFactory.createBarchart(
                 title ,"City","Number of Accidents",dataset
         );
         return new ChartPanel(chart);
     }
 }