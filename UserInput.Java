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
    public static String[] semester = {"21F","21S","21U","22F","22S","22U","23F","23S","23U","24F","24S","24U"};
    public static String[] transfer = {" ","F/T"};




	public static void main(String[] args) {
		
        // //Displays dialogue box to enter student Name
		// String studentName = JOptionPane.showInputDialog(null,"Enter students name","UTD Degree Audit Tool", JOptionPane.PLAIN_MESSAGE);
		// JOptionPane.showMessageDialog(null, "You entered "+studentName+" as the student's name","UTD Degree Audit Tool",JOptionPane.PLAIN_MESSAGE);
        
        // // JOptionPane.showMessageDialog(null, "You entered "+studentName+" as the student's name","UTD Degree Audit Tool",JOptionPane.INFORMATION_MESSAGE,
        // // new ImageIcon(Main.class.getResource("utd icon.png")));   EXAMPLE WITH IMAGE.
		
        // //Displays dialogue box to enter student ID
		// int studentID = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter student ID ","UTD Degree Audit Tool",JOptionPane.PLAIN_MESSAGE));
		// JOptionPane.showMessageDialog(null, "You entered "+studentID);

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

        JComboBox semesterBox = new JComboBox(semester);
        JComboBox semesterBox2 = new JComboBox(semester);
        JComboBox semesterBox3 = new JComboBox(semester);
        JComboBox semesterBox4 = new JComboBox(semester);
        JComboBox semesterBox5 = new JComboBox(semester);
       
        JComboBox transferBox = new JComboBox(transfer);
        JComboBox transferBox2 = new JComboBox(transfer);
        JComboBox transferBox3 = new JComboBox(transfer);
        JComboBox transferBox4 = new JComboBox(transfer);
        JComboBox transferBox5 = new JComboBox(transfer);
        

        //### Creating Labels ###
        JLabel CourseNumberLabel = new JLabel("Course Number");
        JLabel CourseTitleLabel = new JLabel("Course Title");
        JLabel utdSemesterLabel = new JLabel("                  UTD Semester");  //Spaced out for formatting Purposes
        JLabel transferLabel = new JLabel("   Transfer");
        JLabel grade1Label = new JLabel("      Grade");

        
        
        JLabel infoLabel = new JLabel();
        infoLabel.setText("CORE COURSES (15 Credit Hours)    3.19 Grade Point Average Required");
        infoLabel.setHorizontalAlignment(JLabel.CENTER);


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


		
		

        //### Creating Panels ###
        JPanel labelPanel = new JPanel(new FlowLayout(FlowLayout.LEADING,50,0));
        labelPanel.setBackground(Color.YELLOW);
        labelPanel.setBounds(0,0,730,30);
        labelPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));


        JPanel infoPanel = new JPanel();
        infoPanel.setBackground(Color.PINK);
        infoPanel.setBounds(0, 30, 730, 30);
        infoPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


		JPanel redPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 60, 350, 35);
        redPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel redPanelSemester = new JPanel(new FlowLayout(FlowLayout.CENTER));
		redPanelSemester.setBackground(Color.blue);
		redPanelSemester.setBounds(350, 60, 130, 35);
        redPanelSemester.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel redPanelTransfer = new JPanel(new FlowLayout(FlowLayout.CENTER));
		redPanelTransfer.setBackground(Color.red);
		redPanelTransfer.setBounds(480, 60, 120, 35);
        redPanelTransfer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel redPanelGrade = new JPanel(new FlowLayout(FlowLayout.CENTER));
		redPanelGrade.setBackground(Color.blue);
		redPanelGrade.setBounds(600, 60, 120, 35);
        redPanelGrade.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));



		JPanel orangePanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		orangePanel.setBackground(Color.ORANGE);
		orangePanel.setBounds(0, 95, 350, 35);
        orangePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel orangePanelSemester = new JPanel(new FlowLayout(FlowLayout.CENTER));
		orangePanelSemester.setBackground(Color.blue);
		orangePanelSemester.setBounds(350, 95, 130, 35);
        orangePanelSemester.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel orangePanelTransfer = new JPanel(new FlowLayout(FlowLayout.CENTER));
		orangePanelTransfer.setBackground(Color.red);
		orangePanelTransfer.setBounds(480, 95, 120, 35);
        orangePanelTransfer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel orangePanelGrade = new JPanel(new FlowLayout(FlowLayout.CENTER));                                                           
		orangePanelGrade.setBackground(Color.blue);
		orangePanelGrade.setBounds(600, 95, 120, 35);
        orangePanelGrade.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));




		
		JPanel greenPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 130, 350, 35);
        greenPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel greenPanelSemester = new JPanel(new FlowLayout(FlowLayout.CENTER));
		greenPanelSemester.setBackground(Color.blue);
		greenPanelSemester.setBounds(350, 130, 130, 35);
        greenPanelSemester.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel greenPanelTransfer = new JPanel(new FlowLayout(FlowLayout.CENTER));
		greenPanelTransfer.setBackground(Color.red);
		greenPanelTransfer.setBounds(480, 130, 120, 35);
        greenPanelTransfer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel greenPanelGrade = new JPanel(new FlowLayout(FlowLayout.CENTER));
		greenPanelGrade.setBackground(Color.blue);
		greenPanelGrade.setBounds(600, 130, 120, 35);
        greenPanelGrade.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));




        JPanel yellowPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		yellowPanel.setBackground(Color.yellow);
		yellowPanel.setBounds(0, 165, 350, 35);
        yellowPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel yellowPanelSemester = new JPanel(new FlowLayout(FlowLayout.CENTER));
		yellowPanelSemester.setBackground(Color.blue);
		yellowPanelSemester.setBounds(350, 165, 130, 35);
        yellowPanelSemester.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel yellowPanelTransfer = new JPanel(new FlowLayout(FlowLayout.CENTER));
		yellowPanelTransfer.setBackground(Color.red);
		yellowPanelTransfer.setBounds(480, 165, 120, 35);
        yellowPanelTransfer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel yellowPanelGrade = new JPanel(new FlowLayout(FlowLayout.CENTER));
		yellowPanelGrade.setBackground(Color.blue);
		yellowPanelGrade.setBounds(600, 165, 120, 35);
        yellowPanelGrade.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        JPanel pinkPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		pinkPanel.setBackground(Color.pink);
		pinkPanel.setBounds(0, 200, 350, 35);
        pinkPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel pinkPanelSemester = new JPanel(new FlowLayout(FlowLayout.CENTER));
		pinkPanelSemester.setBackground(Color.blue);
		pinkPanelSemester.setBounds(350, 200, 130, 35);
        pinkPanelSemester.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel pinkPanelTransfer = new JPanel(new FlowLayout(FlowLayout.CENTER));
		pinkPanelTransfer.setBackground(Color.red);
		pinkPanelTransfer.setBounds(480, 200, 120, 35);
        pinkPanelTransfer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel pinkPanelGrade = new JPanel(new FlowLayout(FlowLayout.CENTER));
		pinkPanelGrade.setBackground(Color.blue);
		pinkPanelGrade.setBounds(600, 200, 120, 35);
        pinkPanelGrade.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


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
        //frame.getContentPane().setBackground(new Color(122.0f, 122.0f, 122.0f, 0.1f));

        

        labelPanel.add(utdSemesterLabel);
        labelPanel.add(CourseNumberLabel);
        labelPanel.add(CourseTitleLabel);
        labelPanel.add(utdSemesterLabel);
        labelPanel.add(transferLabel);
        labelPanel.add(grade1Label);
        infoPanel.add(infoLabel);
        redPanel.add(label_0);
        redPanelGrade.add(gradeBox);
        redPanelSemester.add(semesterBox);
        redPanelTransfer.add(transferBox);
        orangePanel.add(label_1);
        orangePanelSemester.add(semesterBox2);
        orangePanelTransfer.add(transferBox2);
        orangePanelGrade.add(gradeBox2);
        greenPanel.add(label_2);
        greenPanelSemester.add(semesterBox3);
        greenPanelTransfer.add(transferBox3);
        greenPanelGrade.add(gradeBox3);
        yellowPanel.add(label_3);
        yellowPanelSemester.add(semesterBox4);
        yellowPanelTransfer.add(transferBox4);
        yellowPanelGrade.add(gradeBox4);
        pinkPanel.add(label_4);
        pinkPanelSemester.add(semesterBox5);
        pinkPanelTransfer.add(transferBox5);
        pinkPanelGrade.add(gradeBox5);

        frame.add(labelPanel);
        frame.add(infoPanel);
        frame.add(redPanel);
        frame.add(redPanelTransfer);
        frame.add(redPanelSemester);
        frame.add(redPanelTransfer);
        frame.add(redPanelSemester);
        frame.add(redPanelGrade);
		frame.add(orangePanel);
        frame.add(orangePanelTransfer);
        frame.add(orangePanelSemester);
        frame.add(orangePanelGrade);
		frame.add(greenPanel);
        frame.add(greenPanelTransfer);
        frame.add(greenPanelSemester);
        frame.add(greenPanelGrade);
        frame.add(yellowPanel);
        frame.add(yellowPanelTransfer);
        frame.add(yellowPanelSemester);
        frame.add(yellowPanelGrade);
        frame.add(pinkPanel);
        frame.add(pinkPanelTransfer);
        frame.add(pinkPanelSemester);
        frame.add(pinkPanelGrade);
      

        
	}	
}