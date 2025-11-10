import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Accidents  Analysis");
        SetSize(900,600);
        SetDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel title = new JLabel("Accidents Analysis Dashboard ",SwingConstants.CENTER);
        add(title,BorderLayout.NORTH);
        title.setFont(new Font("Times New Roman",Font.BOLD,22));

        JButton button = new JButton("Start Analysis by city");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(button);
        add(buttonPanel,BorderLayout.CENTER);

        statsButton.addActionListener(e ->{
            Map<String,Integer> data = dataanalyzer.getaccidentsbycity();
            JPanel chartPanel = ChartPanelExample.createBarChart("Accidents by city",data);
           getContentPane().add(chartPanel,BorderLayout.SOUTH);
           revalidate();
        })
    }

}