import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class DegreeAuditTool {


    public static String[] tracks = { "Data Sciences", "Cyber Security", "Intelligent Systems", "Interactive Computing",
                                            "Networks and Telecommunications", "Systems Track", "Traditional Computer Science"};

    public static String[] grades = {"A+","A","A-","B+","B","B-","C+","C","P","F","I"};


	public static void main(String[] args) {
		
        //Displays dialogue box to enter student Name
		String studentName = JOptionPane.showInputDialog(null,"Enter students name","UTD Degree Audit Tool", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "You entered "+studentName+" as the student's name","UTD Degree Audit Tool",JOptionPane.PLAIN_MESSAGE);
        
        // JOptionPane.showMessageDialog(null, "You entered "+studentName+" as the student's name","UTD Degree Audit Tool",JOptionPane.INFORMATION_MESSAGE,
        // new ImageIcon(Main.class.getResource("utd icon.png")));   EXAMPLE WITH IMAGE.
		
        //Displays dialogue box to enter student ID
		int studentID = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter student ID ","UTD Degree Audit Tool",JOptionPane.PLAIN_MESSAGE));
		JOptionPane.showMessageDialog(null, "You entered "+studentID);

        //Displays the comboBox for choosing students Track
        String studentTrack = (String) JOptionPane.showInputDialog(null, 
        "What master track is the student entering?",
        "Track",
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        tracks, 
        tracks[0]);
		
        String class_0 = "", class_1 = "", class_2 = "", class_3 = "", class_4 = ""; 

        switch (studentTrack) {
            
            case "Data Sciences":   
                                    class_0 = "CS 6313 Statistical Methods for Data Science";
                                    class_1 = "CS 6350 Big Data Management and Analytics";
                                    class_2 = "CS 6363 Design and Analysis of Computer Algorithms";
                                    class_3 = "CS 6375 Machine Learning";
                                    class_4 = "CS 6320 Natural Language Processing"; //Choosing course
                                    break;

            case "Cyber Security":  
                                    class_0 = "CS 6324 Information Security";
                                    class_1 = "CS 6363 Design and Analysis of Computer Algorithms";
                                    class_2 = "CS 6378 Advanced Operating Systems";
                                    class_3 = "CS 6332 Systems Security and Malicious Code Analysis"; //Choosing course
                                    class_4 = "CS 6348 Data and Applications Security"; //Choosing course
                                    break;

            case "Intelligent Systems":  
                                    
                                    class_0 = "CS 6320 Natural Language Processing";
                                    class_1 = "CS 6363 Design and Analysis of Computer Algorithms";
                                    class_2 = "CS 6364 Artificial Intelligence";
                                    class_3 = "CS 6375 Machine Learning";
                                    class_4 = "CS 6360 Database Design"; //Choosing course
                                    break;

            case "Interactive Computing": 

                                    class_0 = "CS 6326 Human Computer Interactions";
                                    class_1 = "CS 6363 Design and Analysis of Computer Algorithms";
                                    class_2 = "CS 6323 Computer Animation and Gaming"; //Choosing course
                                    class_3 = "CS 6328 Modeling and Simulation"; //Choosing course
                                    class_4 = "CS 6331 Multimedia Systems"; //Choosing course
                                    break;

            case "Networks and Telecommunications": 

                                    class_0 = "CS 6352 Performance of Computer Systems and Networks";
                                    class_1 = "CS 6363 Design and Analysis of Computer Algorithms";
                                    class_2 = "CS 6378 Advanced Operating Systems";
                                    class_3 = "CS 6385 Algorithmic Aspects of Telecommunication Networks";
                                    class_4 = "CS 6390 Advanced Computer Networks";
                                    break;

            case "Systems Track": 

                                    class_0 = "CS 6304 Computer Architecture";
                                    class_1 = "CS 6363 Design and Analysis of Computer Algorithms";
                                    class_2 = "CS 6378 Advanced Operating Systems";
                                    class_3 = "CS 6396 Real-Time Systems";
                                    class_4 = "CS 6349 Network Security"; //Choosing course
                                    break;

            case "Traditional Computer Science":
                                    
                                    class_0 = "CS 6363 Design and Analysis of Computer Algorithms";
                                    class_1 = "CS 6378 Advanced Operating Systems";
                                    class_2 = "CS 6390 Advanced Computer Networks";
                                    class_3 = "CS 6353 Compiler Construction"; //Choosing course
                                    class_4 = "CS 6360 Database Design"; //Choosing course
                                    break;

            default: System.out.print("Invalid");
                     break;
        }

        //Creates comboBox 
        JComboBox gradeBox = new JComboBox(grades);
        JComboBox gradeBox2 = new JComboBox(grades);
        JComboBox gradeBox3 = new JComboBox(grades);
        JComboBox gradeBox4 = new JComboBox(grades);
        JComboBox gradeBox5 = new JComboBox(grades);
      

        //### Creating Labels ###
		JLabel label_0 = new JLabel();
		label_0.setText(class_0);
		label_0.setVerticalAlignment(JLabel.TOP);
		label_0.setHorizontalAlignment(JLabel.LEFT);


        JLabel label_1 = new JLabel();
		label_1.setText(class_1);
		label_1.setVerticalAlignment(JLabel.TOP);
		label_1.setHorizontalAlignment(JLabel.LEFT);


        JLabel label_2 = new JLabel();
		label_2.setText(class_2);
		label_2.setVerticalAlignment(JLabel.TOP);
		label_2.setHorizontalAlignment(JLabel.LEFT);


        JLabel label_3 = new JLabel();
		label_3.setText(class_3);
		label_3.setVerticalAlignment(JLabel.TOP);
		label_3.setHorizontalAlignment(JLabel.LEFT);


        JLabel label_4 = new JLabel();
		label_4.setText(class_4);
		label_4.setVerticalAlignment(JLabel.TOP);
		label_4.setHorizontalAlignment(JLabel.LEFT);

        JLabel gradeLabel = new JLabel("Grade:");  //Is it possible to share same label?
        JLabel gradeLabel2 = new JLabel("Grade:");  //Is it possible to share same label?
        JLabel gradeLabel3 = new JLabel("Grade:");  //Is it possible to share same label?
        JLabel gradeLabel4 = new JLabel("Grade:");  //Is it possible to share same label?
        JLabel gradeLabel5 = new JLabel("Grade:");  //Is it possible to share same label?


		
		

        //### Creating Panels ###
		JPanel redPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 400, 35);
        JPanel redPanelGrade = new JPanel(new FlowLayout(FlowLayout.LEADING));
		redPanelGrade.setBackground(Color.blue);
		redPanelGrade.setBounds(400, 0, 120, 35);

		JPanel bluePanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(0, 100, 400, 35);
        JPanel bluePanelGrade = new JPanel(new FlowLayout(FlowLayout.LEADING));
		bluePanelGrade.setBackground(Color.red);
		bluePanelGrade.setBounds(400, 100, 120, 35);
		
		JPanel greenPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 200, 400, 35);
        JPanel greenPanelGrade = new JPanel(new FlowLayout(FlowLayout.LEADING));
		greenPanelGrade.setBackground(Color.yellow);
		greenPanelGrade.setBounds(400, 200, 120, 35);

        JPanel yellowPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		yellowPanel.setBackground(Color.yellow);
		yellowPanel.setBounds(0, 300, 400, 35);
        JPanel yellowPanelGrade = new JPanel(new FlowLayout(FlowLayout.LEADING));
		yellowPanelGrade.setBackground(Color.green);
		yellowPanelGrade.setBounds(400, 300, 120, 35);

        JPanel pinkPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		pinkPanel.setBackground(Color.pink);
		pinkPanel.setBounds(0, 400, 400, 35);
        JPanel pinkPanelGrade = new JPanel(new FlowLayout(FlowLayout.LEADING));
		pinkPanelGrade.setBackground(Color.green);
		pinkPanelGrade.setBounds(400, 400, 120, 35);





        //### Creating JFrame ###
        JFrame frame = new JFrame(); 
        frame.setTitle("Degree Plan"); //sets title of frame 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application 
        frame.setResizable(true); //prevent frame from being resized if false
        frame.setLayout(null);
        ImageIcon image = new ImageIcon("utd icon.png"); //create an ImageIcon 
        frame.setIconImage(image.getImage()); //change icon of frame
        frame.setSize(750,750); //sets the x-dimension, and y-dimension of frame 
        frame.setVisible(true); //make frame visible 
        
        redPanel.add(label_0);
        redPanelGrade.add(gradeLabel);
        redPanelGrade.add(gradeBox);
        bluePanel.add(label_1);
        bluePanelGrade.add(gradeLabel2);
        bluePanelGrade.add(gradeBox2);
        greenPanel.add(label_2);
        greenPanelGrade.add(gradeLabel3);
        greenPanelGrade.add(gradeBox3);
        yellowPanel.add(label_3);
        yellowPanelGrade.add(gradeLabel4);
        yellowPanelGrade.add(gradeBox4);
        pinkPanel.add(label_4);
        pinkPanelGrade.add(gradeLabel5);
        pinkPanelGrade.add(gradeBox5);

        frame.add(redPanel);
        frame.add(redPanelGrade);
		frame.add(bluePanel);
        frame.add(bluePanelGrade);
		frame.add(greenPanel);
        frame.add(greenPanelGrade);
        frame.add(yellowPanel);
        frame.add(yellowPanelGrade);
        frame.add(pinkPanel);
        frame.add(pinkPanelGrade);
      


	}	
}