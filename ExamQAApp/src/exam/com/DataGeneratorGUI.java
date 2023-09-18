package exam.com;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DataGeneratorGUI
{
  static final JPanel panel = new JPanel();
  
  public DataGeneratorGUI() {}
  
  public static void main(String[] args) { JFrame frame = new JFrame("Copying Data from Source to Destination");
    frame.setSize(600, 200);
    frame.setDefaultCloseOperation(3);
    
    Container container = frame.getContentPane();
    container.setLayout(new GridLayout(0, 2));
    
    JTextField sourceFolder = new JTextField("C:\\Source");
    sourceFolder.setPreferredSize(new Dimension(100, 10));
    sourceFolder.setEditable(false);
    
    JTextField destinationFolder = new JTextField("C:\\Destination");
    destinationFolder.setPreferredSize(new Dimension(100, 10));
    destinationFolder.setEditable(false);

    JTextField count = new JTextField("");
    count.setPreferredSize(new Dimension(100, 10));
    
    JTextField startIndex = new JTextField("");
    startIndex.setPreferredSize(new Dimension(100, 10));


    JLabel L_Source = new JLabel("Source Path");
    JLabel L_Destination = new JLabel("Destination Path");
    JLabel L_Count = new JLabel("How many folder you want to create?");
    JLabel L_StartIndex = new JLabel("Start Index of your folder name");

    
    JButton okButton = new JButton("Generate");
    okButton.addActionListener(new ActionListener()
    {

      public void actionPerformed(ActionEvent e)
      {
        String sourcePath = sourceFolder.getText();
        String destinationPath = destinationFolder.getText();
        String s_index = startIndex.getText();
        String number = count.getText();
        int c = Integer.parseInt(number);

        GenerateData data = new GenerateData(sourcePath, destinationPath,s_index,c);
        try
        {
          data.DataGenerator();
        } catch (IOException e1) {
          JOptionPane.showMessageDialog(DataGeneratorGUI.panel, e1.getMessage(), "Error", 
            0);
        }
        
      }
    });
    container.add(L_Source);
    container.add(sourceFolder);
    container.add(L_Destination);
    container.add(destinationFolder);
    container.add(L_Count);
    container.add(count);
    container.add(L_StartIndex);
    container.add(startIndex);


    container.add(okButton);
    
    frame.setVisible(true);

  }
}
