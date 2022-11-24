import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

 JComboBox comboBox;
 
 MyFrame(){
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setLayout(new FlowLayout()); 

  // ADDED CODE FOR TITLE 
  JFrame frame = new JFrame();
  JPanel mainPanel = new JPanel();
  JPanel buttonsPanel = new JPanel();
  frame.add(mainPanel);
  frame.add(buttonsPanel, BorderLayout.SOUTH);
  
  String[] tracks = {"Traditional Computer Science", "Networks and Telecommunications", "Intelligent Systems", "Cyber Security", "Interactive Computing", "Systems", "Data Science", "Software Engineering"};
  
  comboBox = new JComboBox(tracks);
  comboBox.setRenderer(new MyComboBoxRenderer("Please select your track:"));
  comboBox.addActionListener(this);
  comboBox.setSelectedIndex(-1); //By default it selects first item, we don't want any selection
  mainPanel.add(comboBox);
  

  this.add(comboBox);
  this.pack();
  this.setVisible(true);

  if(comboBox.getSelectedItem() != null && comboBox.getSelectedItem().equals( "Traditional Computer Science"))
{
   System.out.print("Traditional Computer Science Selected");
}
 }
 
 @Override
 public void actionPerformed(ActionEvent e) {
  if(e.getSource()==comboBox) {
   System.out.println(comboBox.getSelectedItem());
   
  }
 }
}

class MyComboBoxRenderer extends JLabel implements ListCellRenderer
{
    private String _title;

    public MyComboBoxRenderer(String title)
    {
        _title = title;
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value,
            int index, boolean isSelected, boolean hasFocus)
    {
        if (index == -1 && value == null) setText(_title);
        else setText(value.toString());
        return this;
    }
}