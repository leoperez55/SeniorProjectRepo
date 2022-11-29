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


		JPanel firstClassPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		//firstClassPanel.setBackground(Color.red);
		firstClassPanel.setBounds(0, 60, 350, 35);
        firstClassPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        JPanel firstClassPanelSemester = new JPanel(new FlowLayout(FlowLayout.CENTER));
		//firstClassPanelSemester.setBackground(Color.blue);
		firstClassPanelSemester.setBounds(350, 60, 130, 35);
        firstClassPanelSemester.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel firstClassPanelTransfer = new JPanel(new FlowLayout(FlowLayout.CENTER));
		//firstClassPanelTransfer.setBackground(Color.red);
		firstClassPanelTransfer.setBounds(480, 60, 120, 35);
        firstClassPanelTransfer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel firstClassPanelGrade = new JPanel(new FlowLayout(FlowLayout.CENTER));
		//firstClassPanelGrade.setBackground(Color.blue);
		firstClassPanelGrade.setBounds(600, 60, 120, 35);
        firstClassPanelGrade.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


		JPanel secondClassPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		//secondClassPanel.setBackground(Color.ORANGE);
		secondClassPanel.setBounds(0, 95, 350, 35);
        secondClassPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        JPanel secondClassPanelSemester = new JPanel(new FlowLayout(FlowLayout.CENTER));
		//secondClassPanelSemester.setBackground(Color.blue);
		secondClassPanelSemester.setBounds(350, 95, 130, 35);
        secondClassPanelSemester.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel secondClassPanelTransfer = new JPanel(new FlowLayout(FlowLayout.CENTER));
		//secondClassPanelTransfer.setBackground(Color.red);
		secondClassPanelTransfer.setBounds(480, 95, 120, 35);
        secondClassPanelTransfer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel secondClassPanelGrade = new JPanel(new FlowLayout(FlowLayout.CENTER));                                                           
		//secondClassPanelGrade.setBackground(Color.blue);
		secondClassPanelGrade.setBounds(600, 95, 120, 35);
        secondClassPanelGrade.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


		JPanel thirdClassPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		//thirdClassPanel.setBackground(Color.green);
		thirdClassPanel.setBounds(0, 130, 350, 35);
        thirdClassPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        JPanel thirdClassPanelSemester = new JPanel(new FlowLayout(FlowLayout.CENTER));
		//thirdClassPanelSemester.setBackground(Color.blue);
		thirdClassPanelSemester.setBounds(350, 130, 130, 35);
        thirdClassPanelSemester.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel thirdClassPanelTransfer = new JPanel(new FlowLayout(FlowLayout.CENTER));
		//thirdClassPanelTransfer.setBackground(Color.red);
		thirdClassPanelTransfer.setBounds(480, 130, 120, 35);
        thirdClassPanelTransfer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel thirdClassPanelGrade = new JPanel(new FlowLayout(FlowLayout.CENTER));
		//thirdClassPanelGrade.setBackground(Color.blue);
		thirdClassPanelGrade.setBounds(600, 130, 120, 35);
        thirdClassPanelGrade.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


        JPanel fourthClassPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
	    //fourthClassPanel.setBackground(Color.yellow);
		fourthClassPanel.setBounds(0, 165, 350, 35);
        fourthClassPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        JPanel fourthClassPanelSemester = new JPanel(new FlowLayout(FlowLayout.CENTER));
	    //fourthClassPanelSemester.setBackground(Color.blue);
		fourthClassPanelSemester.setBounds(350, 165, 130, 35);
        fourthClassPanelSemester.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel fourthClassPanelTransfer = new JPanel(new FlowLayout(FlowLayout.CENTER));
	    //fourthClassPanelTransfer.setBackground(Color.red);
		fourthClassPanelTransfer.setBounds(480, 165, 120, 35);
        fourthClassPanelTransfer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel fourthClassPanelGrade = new JPanel(new FlowLayout(FlowLayout.CENTER));
		//fourthClassPanelGrade.setBackground(Color.blue);
		fourthClassPanelGrade.setBounds(600, 165, 120, 35);
        fourthClassPanelGrade.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


        JPanel fifthClassPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		//fifthClassPanel.setBackground(Color.pink);
		fifthClassPanel.setBounds(0, 200, 350, 35);
        fifthClassPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        JPanel fifthClassPanelSemester = new JPanel(new FlowLayout(FlowLayout.CENTER));
		//fifthClassPanelSemester.setBackground(Color.blue);
		fifthClassPanelSemester.setBounds(350, 200, 130, 35);
        fifthClassPanelSemester.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel fifthClassPanelTransfer = new JPanel(new FlowLayout(FlowLayout.CENTER));
		//fifthClassPanelTransfer.setBackground(Color.red);
		fifthClassPanelTransfer.setBounds(480, 200, 120, 35);
        fifthClassPanelTransfer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel fifthClassPanelGrade = new JPanel(new FlowLayout(FlowLayout.CENTER));
		//fifthClassPanelGrade.setBackground(Color.blue);
		fifthClassPanelGrade.setBounds(600, 200, 120, 35);
        fifthClassPanelGrade.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


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
        firstClassPanel.add(label_0);
        firstClassPanelGrade.add(gradeBox);
        firstClassPanelSemester.add(semesterBox);
        firstClassPanelTransfer.add(transferBox);
        secondClassPanel.add(label_1);
        secondClassPanelSemester.add(semesterBox2);
        secondClassPanelTransfer.add(transferBox2);
        secondClassPanelGrade.add(gradeBox2);
        thirdClassPanel.add(label_2);
        thirdClassPanelSemester.add(semesterBox3);
        thirdClassPanelTransfer.add(transferBox3);
        thirdClassPanelGrade.add(gradeBox3);
        fourthClassPanel.add(label_3);
        fourthClassPanelSemester.add(semesterBox4);
        fourthClassPanelTransfer.add(transferBox4);
        fourthClassPanelGrade.add(gradeBox4);
        fifthClassPanel.add(label_4);
        fifthClassPanelSemester.add(semesterBox5);
        fifthClassPanelTransfer.add(transferBox5);
        fifthClassPanelGrade.add(gradeBox5);

        frame.add(labelPanel);
        frame.add(infoPanel);
        frame.add(firstClassPanel);
        frame.add(firstClassPanelTransfer);
        frame.add(firstClassPanelSemester);
        frame.add(firstClassPanelTransfer);
        frame.add(firstClassPanelSemester);
        frame.add(firstClassPanelGrade);
		frame.add(secondClassPanel);
        frame.add(secondClassPanelTransfer);
        frame.add(secondClassPanelSemester);
        frame.add(secondClassPanelGrade);
		frame.add(thirdClassPanel);
        frame.add(thirdClassPanelTransfer);
        frame.add(thirdClassPanelSemester);
        frame.add(thirdClassPanelGrade);
        frame.add(fourthClassPanel);
        frame.add(fourthClassPanelTransfer);
        frame.add(fourthClassPanelSemester);
        frame.add(fourthClassPanelGrade);
        frame.add(fifthClassPanel);
        frame.add(fifthClassPanelTransfer);
        frame.add(fifthClassPanelSemester);
        frame.add(fifthClassPanelGrade);
      

        
	}	
}