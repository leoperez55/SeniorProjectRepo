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
import java.util.*;


public class DegreeAuditTool {


    public static String[] tracks = { "Data Sciences", "Cyber Security", "Intelligent Systems", "Interactive Computing",
                                            "Networks and Telecommunications", "Systems Track", "Traditional Computer Science"};

    public static String[] grades = {null,"A+","A","A-","B+","B","B-","C+","C","P","F","I"};
    public static String[] semester = {null,"21F","21S","21U","22F","22S","22U","23F","23S","23U","24F","24S","24U"};
    public static String[] transfer = {null,"F/T"};
    //intitalize an arrayList
    public static ArrayList<String> thirdClass = new ArrayList<String>();
    public static ArrayList<String> fourthClass = new ArrayList<String>();
    public static ArrayList<String> fifthClass = new ArrayList<String>();
    public static ArrayList<String> electiveClasses = new ArrayList<String>();    




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
		
        //Initializes all classes with blank strings
        String class_5 = "", class_1 = "", class_2 = "", class_3 = "", class_4 = ""; 
        boolean fifth  = true;
        boolean fourth = true;
        boolean third  = true;

        switch (studentTrack) {
            
            case "Data Sciences":   
                                    class_1 = "CS 6313 Statistical Methods for Data Science";
                                    class_2 = "CS 6350 Big Data Management and Analytics";
                                    class_3 = "CS 6363 Design and Analysis of Computer Algorithms";
                                    class_4 = "CS 6375 Machine Learning";

                                    third = false;  //student cannot choose their third class
                                    fourth = false; //student cannot choose their fourth class

                                    //student has option to choose their 5th class, populated arrayList "fifthClass" with optional classes
                                    fifthClass.add("CS 6320 Natural Language Processing");
                                    fifthClass.add("CS 6327 Video Analytics");
                                    fifthClass.add("CS 6347 Statistical Methods in AI and Machine Learning");
                                    fifthClass.add("CS 6360 Database Design");
                                    fifthClass.add("CS 6301 Special Topics in Computer Science [when topic is Social Network Analytics");
                                    

                                    electiveClasses.add(null);
                                    electiveClasses.add("CS 6327 Video Analytics");
                                    electiveClasses.add("CS 6347 Statistical Methods in AI and Machine Learning");
                                    electiveClasses.add("CS 6360 Database Design");
                                    electiveClasses.add("CS 6324 Information Security");
                                    electiveClasses.add("CS 6378 Advanced Operating Systems");
                                    electiveClasses.add("CS 6364 Artificial Intelligence");
                                    electiveClasses.add("CS 6326 Human Computer Interactions");
                                    electiveClasses.add("CS 6323 Computer Animation and Gaming");
                                    electiveClasses.add("CS 6328 Modeling and Simulation");
                                    electiveClasses.add("CS 6331 Multimedia Systems");
                                    electiveClasses.add("CS 6334 Virtual Reality");
                                    electiveClasses.add("CS 6366 Computer Graphics");
                                    electiveClasses.add("CS 6353 Compiler Construction");
                                    electiveClasses.add("CS 6371 Advanced Programming Languages");  
                                    
                                    break;

            case "Cyber Security":  
                                    class_1 = "CS 6324 Information Security";
                                    class_2 = "CS 6363 Design and Analysis of Computer Algorithms";
                                    class_3 = "CS 6378 Advanced Operating Systems";

                                    third = false;  //student cannot choose their third class

                                    //student has option to choose their 4th class, populated arrayList "fourthClass" with optional classes
                                    fourthClass.add("CS 6332 Systems Security and Malicious Code Analysis");
                                    fourthClass.add("CS 6348 Data and Applications Security");
                                    fourthClass.add("CS 6349 Network Security");
                                    fourthClass.add("CS 6377 Introduction to Cryptography");
                                    //student has option to choose their 5th class, populated arrayList "fifthClass" with optional classes
                                    fifthClass.add("CS 6332 Systems Security and Malicious Code Analysis");
                                    fifthClass.add("CS 6348 Data and Applications Security");
                                    fifthClass.add("CS 6349 Network Security");
                                    fifthClass.add("CS 6377 Introduction to Cryptography");

                                    electiveClasses.add(null);
                                    electiveClasses.add("CS 6313 Statistical Methods for Data Science");
                                    electiveClasses.add("CS 6301 Special Topics in Computer Science [when topic is Social Network Analytics");
                                    electiveClasses.add("CS 6350 Big Data Management and Analytics");
                                    electiveClasses.add("CS 6320 Natural Language Processing");
                                    electiveClasses.add("CS 6327 Video Analytics");
                                    electiveClasses.add("CS 6347 Statistical Methods in AI and Machine Learning");
                                    electiveClasses.add("CS 6360 Database Design");
                                    electiveClasses.add("CS 6364 Artificial Intelligence");
                                    electiveClasses.add("CS 6375 Machine Learning");
                                    electiveClasses.add("CS 6326 Human Computer Interactions");
                                    electiveClasses.add("CS 6323 Computer Animation and Gaming");
                                    electiveClasses.add("CS 6328 Modeling and Simulation");
                                    electiveClasses.add("CS 6331 Multimedia Systems");
                                    electiveClasses.add("CS 6334 Virtual Reality");
                                    electiveClasses.add("CS 6366 Computer Graphics");
                                    electiveClasses.add("CS 6353 Compiler Construction");
                                    electiveClasses.add("CS 6371 Advanced Programming Languages");  
                                    break;

            case "Intelligent Systems":  
                                    
                                    class_1 = "CS 6320 Natural Language Processing";
                                    class_2 = "CS 6363 Design and Analysis of Computer Algorithms";
                                    class_3 = "CS 6364 Artificial Intelligence";
                                    class_4 = "CS 6375 Machine Learning";
                                    
                                    third = false;  //student cannot choose their third class
                                    fourth = false; //student cannot choose their fourth class

                                    //student has option to choose their 5th class, populated arrayList "fifthClass" with optional classes
                                    fifthClass.add("CS 6360 Database Design");
                                    fifthClass.add("CS 6378 Advanced Operating Systems");
                                 
                                    electiveClasses.add(null);
                                    electiveClasses.add("CS 6301 Special Topics in Computer Science [when topic is Social Network Analytics");
                                    electiveClasses.add("CS 6313 Statistical Methods for Data Science");
                                    electiveClasses.add("CS 6350 Big Data Management and Analytics");
                                    electiveClasses.add("CS 6320 Natural Language Processing");
                                    electiveClasses.add("CS 6327 Video Analytics");
                                    electiveClasses.add("CS 6347 Statistical Methods in AI and Machine Learning");
                                    electiveClasses.add("CS 6360 Database Design");
                                    electiveClasses.add("CS 6324 Information Security");
                                    electiveClasses.add("CS 6378 Advanced Operating Systems");
                                    electiveClasses.add("CS 6326 Human Computer Interactions");
                                    electiveClasses.add("CS 6323 Computer Animation and Gaming");
                                    electiveClasses.add("CS 6328 Modeling and Simulation");
                                    electiveClasses.add("CS 6331 Multimedia Systems");
                                    electiveClasses.add("CS 6334 Virtual Reality");
                                    electiveClasses.add("CS 6366 Computer Graphics");
                                    electiveClasses.add("CS 6353 Compiler Construction");
                                    electiveClasses.add("CS 6371 Advanced Programming Languages");  
                                    break;

            case "Interactive Computing": 

                                    class_1 = "CS 6326 Human Computer Interactions";
                                    class_2 = "CS 6363 Design and Analysis of Computer Algorithms";
                                    

                                    //student has option to choose their 3rd class, populated arrayList "thirdClass" with optional classes
                                    thirdClass.add("CS 6323 Computer Animation and Gaming");
                                    thirdClass.add("CS 6328 Modeling and Simulation");
                                    thirdClass.add("CS 6331 Multimedia Systems");
                                    thirdClass.add("CS 6334 Virtual Reality");
                                    thirdClass.add("CS 6366 Computer Graphics");
                                    //student has option to choose their 4th class, populated arrayList "fourthClass" with optional classes
                                    fourthClass.add("CS 6323 Computer Animation and Gaming");
                                    fourthClass.add("CS 6328 Modeling and Simulation");
                                    fourthClass.add("CS 6331 Multimedia Systems");
                                    fourthClass.add("CS 6334 Virtual Reality");
                                    fourthClass.add("CS 6366 Computer Graphics");
                                    //student has option to choose their 5th class, populated arrayList "fifthClass" with optional classes
                                    fifthClass.add("CS 6323 Computer Animation and Gaming");
                                    fifthClass.add("CS 6328 Modeling and Simulation");
                                    fifthClass.add("CS 6331 Multimedia Systems");
                                    fifthClass.add("CS 6334 Virtual Reality");
                                    fifthClass.add("CS 6366 Computer Graphics");

                                    electiveClasses.add(null);
                                    electiveClasses.add("CS 6301 Special Topics in Computer Science [when topic is Social Network Analytics");
                                    electiveClasses.add("CS 6313 Statistical Methods for Data Science");
                                    electiveClasses.add("CS 6350 Big Data Management and Analytics");
                                    electiveClasses.add("CS 6320 Natural Language Processing");
                                    electiveClasses.add("CS 6327 Video Analytics");
                                    electiveClasses.add("CS 6347 Statistical Methods in AI and Machine Learning");
                                    electiveClasses.add("CS 6360 Database Design");
                                    electiveClasses.add("CS 6324 Information Security");
                                    electiveClasses.add("CS 6378 Advanced Operating Systems");
                                    electiveClasses.add("CS 6364 Artificial Intelligence");
                                    electiveClasses.add("CS 6375 Machine Learning");
                                    electiveClasses.add("CS 6323 Computer Animation and Gaming");
                                    electiveClasses.add("CS 6328 Modeling and Simulation");
                                    electiveClasses.add("CS 6331 Multimedia Systems");
                                    electiveClasses.add("CS 6334 Virtual Reality");
                                    electiveClasses.add("CS 6366 Computer Graphics");
                                    electiveClasses.add("CS 6353 Compiler Construction");
                                    electiveClasses.add("CS 6371 Advanced Programming Languages");  
                                    break;

            case "Networks and Telecommunications": 

                                    class_1 = "CS 6352 Performance of Computer Systems and Networks";
                                    class_2 = "CS 6363 Design and Analysis of Computer Algorithms";
                                    class_3 = "CS 6378 Advanced Operating Systems";
                                    class_4 = "CS 6385 Algorithmic Aspects of Telecommunication Networks";
                                    class_5 = "CS 6390 Advanced Computer Networks";
                                    third = false;  //student cannot choose their third class
                                    fourth = false; //student cannot choose their fourth class
                                    fifth = false; //student cannot choose their fifth class

                                    electiveClasses.add(null);
                                    electiveClasses.add("CS 6313 Statistical Methods for Data Science");
                                    electiveClasses.add("CS 6350 Big Data Management and Analytics");
                                    electiveClasses.add("CS 6320 Natural Language Processing");
                                    electiveClasses.add("CS 6327 Video Analytics");
                                    electiveClasses.add("CS 6347 Statistical Methods in AI and Machine Learning");
                                    electiveClasses.add("CS 6360 Database Design");
                                    electiveClasses.add("CS 6324 Information Security");
                                    electiveClasses.add("CS 6364 Artificial Intelligence");
                                    electiveClasses.add("CS 6375 Machine Learning");
                                    electiveClasses.add("CS 6326 Human Computer Interactions");
                                    electiveClasses.add("CS 6323 Computer Animation and Gaming");
                                    electiveClasses.add("CS 6328 Modeling and Simulation");
                                    electiveClasses.add("CS 6331 Multimedia Systems");
                                    electiveClasses.add("CS 6334 Virtual Reality");
                                    electiveClasses.add("CS 6366 Computer Graphics");
                                    electiveClasses.add("CS 6353 Compiler Construction");
                                    electiveClasses.add("CS 6371 Advanced Programming Languages");  
                                    electiveClasses.add("CS 6301 Special Topics in Computer Science [when topic is Social Network Analytics");

                                    break;

            case "Systems Track": 

                                    class_1 = "CS 6304 Computer Architecture";
                                    class_2 = "CS 6363 Design and Analysis of Computer Algorithms";
                                    class_3 = "CS 6378 Advanced Operating Systems";
                                    class_4 = "CS 6396 Real-Time Systems";
                                    third = false;  //student cannot choose their third class
                                    fourth = false; //student cannot choose their fourth class

                                    fifthClass.add("CS 6349 Network Security");
                                    fifthClass.add("CS 6376 Parallel Processing");
                                    fifthClass.add("CS 6380 Distributed Computing");
                                    fifthClass.add("CS 6397 Synthesis and Optimization of High-Performance Systems");


                                    electiveClasses.add(null);
                                    electiveClasses.add("CS 6313 Statistical Methods for Data Science");
                                    electiveClasses.add("CS 6350 Big Data Management and Analytics");
                                    electiveClasses.add("CS 6320 Natural Language Processing");
                                    electiveClasses.add("CS 6327 Video Analytics");
                                    electiveClasses.add("CS 6347 Statistical Methods in AI and Machine Learning");
                                    electiveClasses.add("CS 6360 Database Design");
                                    electiveClasses.add("CS 6324 Information Security");
                                    electiveClasses.add("CS 6364 Artificial Intelligence");
                                    electiveClasses.add("CS 6375 Machine Learning");
                                    electiveClasses.add("CS 6326 Human Computer Interactions");
                                    electiveClasses.add("CS 6323 Computer Animation and Gaming");
                                    electiveClasses.add("CS 6328 Modeling and Simulation");
                                    electiveClasses.add("CS 6331 Multimedia Systems");
                                    electiveClasses.add("CS 6334 Virtual Reality");
                                    electiveClasses.add("CS 6366 Computer Graphics");
                                    electiveClasses.add("CS 6353 Compiler Construction");
                                    electiveClasses.add("CS 6371 Advanced Programming Languages");  
                                    electiveClasses.add("CS 6301 Special Topics in Computer Science [when topic is Social Network Analytics");

                                    break;

            case "Traditional Computer Science":
                                    
                                    class_1 = "CS 6363 Design and Analysis of Computer Algorithms";
                                    class_2 = "CS 6378 Advanced Operating Systems";
                                    class_3 = "CS 6390 Advanced Computer Networks";
                                    
                                    third = false;  //student cannot choose their third class
                                    
                                    //student has option to choose their 4th class, populated arrayList "fourthClass" with optional classes
                                    fourthClass.add("CS 6353 Compiler Construction");
                                    fourthClass.add("CS 6360 Database Design");
                                    fourthClass.add("CS 6371 Advanced Programming Languages");
                                    //student has option to choose their 5th class, populated arrayList "fifthClass" with optional classes
                                    fifthClass.add("CS 6353 Compiler Construction");
                                    fifthClass.add("CS 6360 Database Design");
                                    fifthClass.add("CS 6371 Advanced Programming Languages");   
                                    

                                    electiveClasses.add(null);
                                    electiveClasses.add("CS 6313 Statistical Methods for Data Science");
                                    electiveClasses.add("CS 6350 Big Data Management and Analytics");
                                    electiveClasses.add("CS 6320 Natural Language Processing");
                                    electiveClasses.add("CS 6327 Video Analytics");
                                    electiveClasses.add("CS 6347 Statistical Methods in AI and Machine Learning");
                                    electiveClasses.add("CS 6360 Database Design");
                                    electiveClasses.add("CS 6324 Information Security");
                                    electiveClasses.add("CS 6364 Artificial Intelligence");
                                    electiveClasses.add("CS 6375 Machine Learning");
                                    electiveClasses.add("CS 6326 Human Computer Interactions");
                                    electiveClasses.add("CS 6323 Computer Animation and Gaming");
                                    electiveClasses.add("CS 6328 Modeling and Simulation");
                                    electiveClasses.add("CS 6331 Multimedia Systems");
                                    electiveClasses.add("CS 6334 Virtual Reality");
                                    electiveClasses.add("CS 6366 Computer Graphics");
                                    electiveClasses.add("CS 6353 Compiler Construction");
                                    electiveClasses.add("CS 6371 Advanced Programming Languages");  
                                    electiveClasses.add("CS 6301 Special Topics in Computer Science [when topic is Social Network Analytics");

                                    break;

            default: System.out.print("Invalid");
                     break;
        }

        //Creates comboBoxes
        JComboBox gradeBox = new JComboBox(grades);
        JComboBox gradeBox2 = new JComboBox(grades);
        JComboBox gradeBox3 = new JComboBox(grades);
        JComboBox gradeBox4 = new JComboBox(grades);
        JComboBox gradeBox5 = new JComboBox(grades);

        //"ele" is for elective classes
        JComboBox eleGradeBox = new JComboBox(grades);
        JComboBox eleGradeBox2 = new JComboBox(grades);
        JComboBox eleGradeBox3 = new JComboBox(grades);
        JComboBox eleGradeBox4 = new JComboBox(grades);
        JComboBox eleGradeBox5 = new JComboBox(grades);
        JComboBox eleGradeBox6 = new JComboBox(grades);
        JComboBox eleGradeBox7 = new JComboBox(grades);
        JComboBox eleGradeBox8 = new JComboBox(grades);
        JComboBox otherGradeBox1 = new JComboBox(grades);
        JComboBox otherGradeBox2 = new JComboBox(grades);

        JComboBox semesterBox = new JComboBox(semester);
        JComboBox semesterBox2 = new JComboBox(semester);
        JComboBox semesterBox3 = new JComboBox(semester);
        JComboBox semesterBox4 = new JComboBox(semester);
        JComboBox semesterBox5 = new JComboBox(semester);
       
        JComboBox eleSemesterBox = new JComboBox(semester);
        JComboBox eleSemesterBox2 = new JComboBox(semester);
        JComboBox eleSemesterBox3 = new JComboBox(semester);
        JComboBox eleSemesterBox4 = new JComboBox(semester);
        JComboBox eleSemesterBox5 = new JComboBox(semester);
        JComboBox eleSemesterBox6 = new JComboBox(semester);
        JComboBox eleSemesterBox7 = new JComboBox(semester);
        JComboBox eleSemesterBox8 = new JComboBox(semester);
        JComboBox otherSemesterBox1 = new JComboBox(semester);
        JComboBox otherSemesterBox2 = new JComboBox(semester);
       
        JComboBox transferBox = new JComboBox(transfer);
        JComboBox transferBox2 = new JComboBox(transfer);
        JComboBox transferBox3 = new JComboBox(transfer);
        JComboBox transferBox4 = new JComboBox(transfer);
        JComboBox transferBox5 = new JComboBox(transfer);

        JComboBox eleTransferBox = new JComboBox(transfer);
        JComboBox eleTransferBox2 = new JComboBox(transfer);
        JComboBox eleTransferBox3 = new JComboBox(transfer);
        JComboBox eleTransferBox4 = new JComboBox(transfer);
        JComboBox eleTransferBox5 = new JComboBox(transfer);
        JComboBox eleTransferBox6 = new JComboBox(transfer);
        JComboBox eleTransferBox7 = new JComboBox(transfer);
        JComboBox eleTransferBox8 = new JComboBox(transfer);
        JComboBox otherTransferBox1 = new JComboBox(transfer);
        JComboBox otherTransferBox2 = new JComboBox(transfer);

        //Combo boxes for if the student can choose thier classes
        JComboBox thirdClassBox = new JComboBox(thirdClass.toArray());
        JComboBox fourthClassBox = new JComboBox(fourthClass.toArray());
        JComboBox fifthClassBox = new JComboBox(fifthClass.toArray());
        JComboBox eleClassBox = new JComboBox(electiveClasses.toArray());
        JComboBox eleClassBox2 = new JComboBox(electiveClasses.toArray());
        JComboBox eleClassBox3 = new JComboBox(electiveClasses.toArray());
        JComboBox eleClassBox4 = new JComboBox(electiveClasses.toArray());
        JComboBox eleClassBox5 = new JComboBox(electiveClasses.toArray());
        JComboBox eleClassBox6 = new JComboBox(electiveClasses.toArray());
        JComboBox eleClassBox7 = new JComboBox(electiveClasses.toArray());
        JComboBox eleClassBox8 = new JComboBox(electiveClasses.toArray());
    

        //add text field for user input since other requirements can be anything
        JTextField otherClassBox1 = new JTextField();
        //set size of textfield
        otherClassBox1.setPreferredSize(new Dimension(340, 25));
        JTextField otherClassBox2 = new JTextField();
        otherClassBox2.setPreferredSize(new Dimension(340, 25));




        //### Creating Labels ###
        JLabel CourseNumberLabel = new JLabel("Course Number");
        JLabel CourseTitleLabel = new JLabel("Course Title");
        JLabel utdSemesterLabel = new JLabel("                  UTD Semester");  //Spaced out for formatting Purposes
        JLabel transferLabel = new JLabel("   Transfer");
        JLabel grade1Label = new JLabel("      Grade");

        
        //Pink info labels inbetween sections
        JLabel infoLabel = new JLabel();
        infoLabel.setText("CORE COURSES (15 Credit Hours)    3.19 Grade Point Average Required");
        infoLabel.setHorizontalAlignment(JLabel.CENTER);
        JLabel infoLabel2 = new JLabel();
        infoLabel2.setText("FIVE APPROVED 6000 LEVEL ELECTIVES      (15* Credit Hours)       3.0 Grade Point Average");
        infoLabel2.setHorizontalAlignment(JLabel.CENTER);
        JLabel infoLabel3 = new JLabel();
        infoLabel3.setText("Additional Electives ( 3 Credit Hours minimum)");
        infoLabel3.setHorizontalAlignment(JLabel.CENTER);
        JLabel infoLabel4 = new JLabel();
        infoLabel4.setText("Other Requirements");
        infoLabel4.setHorizontalAlignment(JLabel.CENTER);


        //Core class labels
		JLabel label_1 = new JLabel();
		label_1.setText(class_1);
        label_1.setVerticalAlignment(JLabel.TOP);
		label_1.setHorizontalAlignment(JLabel.LEFT);


        JLabel label_2 = new JLabel();
		label_2.setText(class_2);
		label_2.setVerticalAlignment(JLabel.TOP);
		label_2.setHorizontalAlignment(JLabel.LEFT);


        JLabel label_3 = new JLabel();
		//If student has a choice of choosing their 3rd class this will print 
        //else the 3rd class cannot be chosen and will be displayed
		if(third == true){
            System.out.println("third Class option");
        }else{
            label_3.setText(class_3);
            label_3.setVerticalAlignment(JLabel.TOP);
            label_3.setHorizontalAlignment(JLabel.LEFT);
        }


        JLabel label_4 = new JLabel();
        //If student has a choice of choosing their 4th class this will print 
        //else the 4th class cannot be chosen and will be displayed
		if(fourth == true){
            System.out.println("fourth Class option");
        }else{
            label_4.setText(class_4);
            label_4.setVerticalAlignment(JLabel.TOP);
            label_4.setHorizontalAlignment(JLabel.LEFT);
        }
  
   
        JLabel label_5 = new JLabel();
        //If student has a choice of choosing their 5th class this will print 
        //else the 5th class cannot be chosen and will be displayed
        if(fifth == true){
            System.out.println("Fifth Class option found");
        }else{
            label_5.setText(class_5);
            label_5.setVerticalAlignment(JLabel.TOP);
            label_5.setHorizontalAlignment(JLabel.LEFT);
        }

		
		

        //### Creating Panels ###
        JPanel labelPanel = new JPanel(new FlowLayout(FlowLayout.LEADING,50,0));
        labelPanel.setBackground(Color.YELLOW);
        labelPanel.setBounds(0,0,720,30);
        labelPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));


        JPanel infoPanel = new JPanel();
        infoPanel.setBackground(Color.PINK);
        infoPanel.setBounds(0, 30, 720, 30);
        infoPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        


        ////////////////CORE CLASSES PANELS//////////////////////////////////////////////////////////

		JPanel firstClassPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		firstClassPanel.setBounds(0, 60, 350, 35);
        firstClassPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel firstClassPanelSemester = new JPanel(new FlowLayout(FlowLayout.CENTER));
		firstClassPanelSemester.setBounds(350, 60, 130, 35);
        firstClassPanelSemester.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel firstClassPanelTransfer = new JPanel(new FlowLayout(FlowLayout.CENTER));
		firstClassPanelTransfer.setBounds(480, 60, 120, 35);
        firstClassPanelTransfer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel firstClassPanelGrade = new JPanel(new FlowLayout(FlowLayout.CENTER));
		firstClassPanelGrade.setBounds(600, 60, 120, 35);
        firstClassPanelGrade.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


		JPanel secondClassPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		secondClassPanel.setBounds(0, 95, 350, 35);
        secondClassPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel secondClassPanelSemester = new JPanel(new FlowLayout(FlowLayout.CENTER));
		secondClassPanelSemester.setBounds(350, 95, 130, 35);
        secondClassPanelSemester.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel secondClassPanelTransfer = new JPanel(new FlowLayout(FlowLayout.CENTER));
		secondClassPanelTransfer.setBounds(480, 95, 120, 35);
        secondClassPanelTransfer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel secondClassPanelGrade = new JPanel(new FlowLayout(FlowLayout.CENTER));                                                           
		secondClassPanelGrade.setBounds(600, 95, 120, 35);
        secondClassPanelGrade.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


		JPanel thirdClassPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		thirdClassPanel.setBounds(0, 130, 350, 35);
        thirdClassPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel thirdClassPanelSemester = new JPanel(new FlowLayout(FlowLayout.CENTER));
		thirdClassPanelSemester.setBounds(350, 130, 130, 35);
        thirdClassPanelSemester.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel thirdClassPanelTransfer = new JPanel(new FlowLayout(FlowLayout.CENTER));
		thirdClassPanelTransfer.setBounds(480, 130, 120, 35);
        thirdClassPanelTransfer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel thirdClassPanelGrade = new JPanel(new FlowLayout(FlowLayout.CENTER));
		thirdClassPanelGrade.setBounds(600, 130, 120, 35);
        thirdClassPanelGrade.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


        JPanel fourthClassPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		fourthClassPanel.setBounds(0, 165, 350, 35);
        fourthClassPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel fourthClassPanelSemester = new JPanel(new FlowLayout(FlowLayout.CENTER));
		fourthClassPanelSemester.setBounds(350, 165, 130, 35);
        fourthClassPanelSemester.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel fourthClassPanelTransfer = new JPanel(new FlowLayout(FlowLayout.CENTER));
		fourthClassPanelTransfer.setBounds(480, 165, 120, 35);
        fourthClassPanelTransfer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel fourthClassPanelGrade = new JPanel(new FlowLayout(FlowLayout.CENTER));
		fourthClassPanelGrade.setBounds(600, 165, 120, 35);
        fourthClassPanelGrade.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


        JPanel fifthClassPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		fifthClassPanel.setBounds(0, 200, 350, 35);
        fifthClassPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel fifthClassPanelSemester = new JPanel(new FlowLayout(FlowLayout.CENTER));
		fifthClassPanelSemester.setBounds(350, 200, 130, 35);
        fifthClassPanelSemester.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel fifthClassPanelTransfer = new JPanel(new FlowLayout(FlowLayout.CENTER));
		fifthClassPanelTransfer.setBounds(480, 200, 120, 35);
        fifthClassPanelTransfer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel fifthClassPanelGrade = new JPanel(new FlowLayout(FlowLayout.CENTER));
		fifthClassPanelGrade.setBounds(600, 200, 120, 35);
        fifthClassPanelGrade.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        /////////////////////////////END OF CORE CLASSES///////////////////////////////////////

        JPanel infoPanel2 = new JPanel();
        infoPanel2.setBackground(Color.PINK);
        infoPanel2.setBounds(0, 235, 720, 30);
        infoPanel2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
     

        /////////////////////////////START OF ELECTIVE CLASSES PANELS////////////////////////////
        JPanel ele1ClassPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		ele1ClassPanel.setBackground(Color.RED);
		ele1ClassPanel.setBounds(0, 265, 350, 35);
        ele1ClassPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel ele1ClassPanelSemester = new JPanel(new FlowLayout(FlowLayout.CENTER));
		ele1ClassPanelSemester.setBounds(350, 265, 130, 35);
        ele1ClassPanelSemester.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel ele1ClassPanelTransfer = new JPanel(new FlowLayout(FlowLayout.CENTER));
		ele1ClassPanelTransfer.setBounds(480, 265, 120, 35);
        ele1ClassPanelTransfer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel ele1ClassPanelGrade = new JPanel(new FlowLayout(FlowLayout.CENTER));
		ele1ClassPanelGrade.setBounds(600, 265, 120, 35);
        ele1ClassPanelGrade.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


        JPanel ele2ClassPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		ele2ClassPanel.setBackground(Color.RED);
		ele2ClassPanel.setBounds(0, 295, 350, 35);
        ele2ClassPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel ele2ClassPanelSemester = new JPanel(new FlowLayout(FlowLayout.CENTER));
		ele2ClassPanelSemester.setBounds(350, 295, 130, 35);
        ele2ClassPanelSemester.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel ele2ClassPanelTransfer = new JPanel(new FlowLayout(FlowLayout.CENTER));
		ele2ClassPanelTransfer.setBounds(480, 295, 120, 35);
        ele2ClassPanelTransfer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel ele2ClassPanelGrade = new JPanel(new FlowLayout(FlowLayout.CENTER));
		ele2ClassPanelGrade.setBounds(600, 295, 120, 35);
        ele2ClassPanelGrade.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


        JPanel ele3ClassPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		ele3ClassPanel.setBackground(Color.RED);
		ele3ClassPanel.setBounds(0, 330, 350, 35);
        ele3ClassPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel ele3ClassPanelSemester = new JPanel(new FlowLayout(FlowLayout.CENTER));
		ele3ClassPanelSemester.setBounds(350, 330, 130, 35);
        ele3ClassPanelSemester.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel ele3ClassPanelTransfer = new JPanel(new FlowLayout(FlowLayout.CENTER));
		ele3ClassPanelTransfer.setBounds(480, 330, 120, 35);
        ele3ClassPanelTransfer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel ele3ClassPanelGrade = new JPanel(new FlowLayout(FlowLayout.CENTER));
		ele3ClassPanelGrade.setBounds(600, 330, 120, 35);
        ele3ClassPanelGrade.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


        JPanel ele4ClassPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		ele4ClassPanel.setBackground(Color.RED);
		ele4ClassPanel.setBounds(0, 365, 350, 35);
        ele4ClassPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel ele4ClassPanelSemester = new JPanel(new FlowLayout(FlowLayout.CENTER));
		ele4ClassPanelSemester.setBounds(350, 365, 130, 35);
        ele4ClassPanelSemester.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel ele4ClassPanelTransfer = new JPanel(new FlowLayout(FlowLayout.CENTER));
		ele4ClassPanelTransfer.setBounds(480, 365, 120, 35);
        ele4ClassPanelTransfer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel ele4ClassPanelGrade = new JPanel(new FlowLayout(FlowLayout.CENTER));
		ele4ClassPanelGrade.setBounds(600, 365, 120, 35);
        ele4ClassPanelGrade.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


        JPanel ele5ClassPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		ele5ClassPanel.setBackground(Color.RED);
		ele5ClassPanel.setBounds(0, 400, 350, 35);
        ele5ClassPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel ele5ClassPanelSemester = new JPanel(new FlowLayout(FlowLayout.CENTER));
		ele5ClassPanelSemester.setBounds(350, 400, 130, 35);
        ele5ClassPanelSemester.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel ele5ClassPanelTransfer = new JPanel(new FlowLayout(FlowLayout.CENTER));
		ele5ClassPanelTransfer.setBounds(480, 400, 120, 35);
        ele5ClassPanelTransfer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel ele5ClassPanelGrade = new JPanel(new FlowLayout(FlowLayout.CENTER));
		ele5ClassPanelGrade.setBounds(600, 400, 120, 35);
        ele5ClassPanelGrade.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        /////////////////////////////END OF ELECTIVE CLASSES///////////////////////////////////

        JPanel infoPanel3 = new JPanel();
        infoPanel3.setBackground(Color.PINK);
        infoPanel3.setBounds(0, 435, 720, 30);
        infoPanel3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        /////////////////////////////START OF EXTRA ELECTIVE CLASSES PANELS///////////////////////////////////

        JPanel ele6ClassPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		ele6ClassPanel.setBackground(Color.RED);
		ele6ClassPanel.setBounds(0, 465, 350, 35);
        ele6ClassPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel ele6ClassPanelSemester = new JPanel(new FlowLayout(FlowLayout.CENTER));
		ele6ClassPanelSemester.setBounds(350, 465, 130, 35);
        ele6ClassPanelSemester.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel ele6ClassPanelTransfer = new JPanel(new FlowLayout(FlowLayout.CENTER));
		ele6ClassPanelTransfer.setBounds(480, 465, 120, 35);
        ele6ClassPanelTransfer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel ele6ClassPanelGrade = new JPanel(new FlowLayout(FlowLayout.CENTER));
		ele6ClassPanelGrade.setBounds(600, 465, 120, 35);
        ele6ClassPanelGrade.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


        JPanel ele7ClassPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
        ele7ClassPanel.setBackground(Color.RED);
        ele7ClassPanel.setBounds(0, 500, 350, 35);
        ele7ClassPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel ele7ClassPanelSemester = new JPanel(new FlowLayout(FlowLayout.CENTER));
        ele7ClassPanelSemester.setBounds(350, 500, 130, 35);
        ele7ClassPanelSemester.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel ele7ClassPanelTransfer = new JPanel(new FlowLayout(FlowLayout.CENTER));
        ele7ClassPanelTransfer.setBounds(480, 500, 120, 35);
        ele7ClassPanelTransfer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel ele7ClassPanelGrade = new JPanel(new FlowLayout(FlowLayout.CENTER));
        ele7ClassPanelGrade.setBounds(600, 500, 120, 35);
        ele7ClassPanelGrade.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        

        JPanel ele8ClassPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
        ele8ClassPanel.setBackground(Color.RED);
        ele8ClassPanel.setBounds(0, 535, 350, 35);
        ele8ClassPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel ele8ClassPanelSemester = new JPanel(new FlowLayout(FlowLayout.CENTER));
        ele8ClassPanelSemester.setBounds(350, 535, 130, 35);
        ele8ClassPanelSemester.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel ele8ClassPanelTransfer = new JPanel(new FlowLayout(FlowLayout.CENTER));
        ele8ClassPanelTransfer.setBounds(480, 535, 120, 35);
        ele8ClassPanelTransfer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel ele8ClassPanelGrade = new JPanel(new FlowLayout(FlowLayout.CENTER));
        ele8ClassPanelGrade.setBounds(600, 535, 120, 35);
        ele8ClassPanelGrade.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        /////////////////////////////END OF EXTRA ELECTIVE CLASSES///////////////////////////////////

        JPanel infoPanel4 = new JPanel();
        infoPanel4.setBackground(Color.PINK);
        infoPanel4.setBounds(0, 570, 720, 30);
        infoPanel4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


        /////////////////////////////Start of Other Requirements///////////////////////////////////
        JPanel other1ClassPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
        other1ClassPanel.setBackground(Color.RED);
        other1ClassPanel.setBounds(0, 600, 350, 35);
        other1ClassPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel other1ClassPanelSemester = new JPanel(new FlowLayout(FlowLayout.CENTER));
        other1ClassPanelSemester.setBounds(350, 600, 130, 35);
        other1ClassPanelSemester.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel other1ClassPanelTransfer = new JPanel(new FlowLayout(FlowLayout.CENTER));
        other1ClassPanelTransfer.setBounds(480, 600, 120, 35);
        other1ClassPanelTransfer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel other1ClassPanelGrade = new JPanel(new FlowLayout(FlowLayout.CENTER));
        other1ClassPanelGrade.setBounds(600, 600, 120, 35);
        other1ClassPanelGrade.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        JPanel other2ClassPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
        other2ClassPanel.setBackground(Color.RED);
        other2ClassPanel.setBounds(0, 635, 350, 35);
        other2ClassPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel other2ClassPanelSemester = new JPanel(new FlowLayout(FlowLayout.CENTER));
        other2ClassPanelSemester.setBounds(350, 635, 130, 35);
        other2ClassPanelSemester.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel other2ClassPanelTransfer = new JPanel(new FlowLayout(FlowLayout.CENTER));
        other2ClassPanelTransfer.setBounds(480, 635, 120, 35);
        other2ClassPanelTransfer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JPanel other2ClassPanelGrade = new JPanel(new FlowLayout(FlowLayout.CENTER));
        other2ClassPanelGrade.setBounds(600, 635, 120, 35);
        other2ClassPanelGrade.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        /////////////////////////////End of Other Requirements///////////////////////////////////


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

        
        //Adding Panel Components
        labelPanel.add(utdSemesterLabel);
        labelPanel.add(CourseNumberLabel);
        labelPanel.add(CourseTitleLabel);
        labelPanel.add(utdSemesterLabel);
        labelPanel.add(transferLabel);
        labelPanel.add(grade1Label);
       
        infoPanel.add(infoLabel);
        infoPanel2.add(infoLabel2);
        infoPanel3.add(infoLabel3);
        infoPanel4.add(infoLabel4);
        
        firstClassPanel.add(label_1);
        firstClassPanelGrade.add(gradeBox);
        firstClassPanelSemester.add(semesterBox);
        firstClassPanelTransfer.add(transferBox);
        
        secondClassPanel.add(label_2);
        secondClassPanelSemester.add(semesterBox2);
        secondClassPanelTransfer.add(transferBox2);
        secondClassPanelGrade.add(gradeBox2);
        
        //Determines if a combobox for option classes needs to be added
        if(third == true){
            thirdClassPanel.add(thirdClassBox);
        }else{
        thirdClassPanel.add(label_3);
        System.out.println("No optional 3rd Class");
        }
        thirdClassPanelSemester.add(semesterBox3);
        thirdClassPanelTransfer.add(transferBox3);
        thirdClassPanelGrade.add(gradeBox3);
        
        //Determines if a combobox for option classes needs to be added
        if(fourth == true){
            fourthClassPanel.add(fourthClassBox);
        }else{
        fourthClassPanel.add(label_4);
        System.out.println("No Optional 4th Class");
        }
        fourthClassPanelSemester.add(semesterBox4);
        fourthClassPanelTransfer.add(transferBox4);
        fourthClassPanelGrade.add(gradeBox4);
       
        //Determines if a combobox for option classes needs to be added
        if(fifth == true){
            fifthClassPanel.add(fifthClassBox);
        }else{
        fifthClassPanel.add(label_5);
        System.out.println("No Optional 5th Class");
        }
        fifthClassPanelSemester.add(semesterBox5);
        fifthClassPanelTransfer.add(transferBox5);
        fifthClassPanelGrade.add(gradeBox5);


      
        ele1ClassPanel.add(eleClassBox);
        ele1ClassPanelSemester.add(eleSemesterBox);
        ele1ClassPanelTransfer.add(eleTransferBox);
        ele1ClassPanelGrade.add(eleGradeBox);

        ele2ClassPanel.add(eleClassBox2);
        ele2ClassPanelSemester.add(eleSemesterBox2);
        ele2ClassPanelTransfer.add(eleTransferBox2);
        ele2ClassPanelGrade.add(eleGradeBox2);

        ele3ClassPanel.add(eleClassBox3);
        ele3ClassPanelSemester.add(eleSemesterBox3);
        ele3ClassPanelTransfer.add(eleTransferBox3);
        ele3ClassPanelGrade.add(eleGradeBox3);

        ele4ClassPanel.add(eleClassBox4);
        ele4ClassPanelSemester.add(eleSemesterBox4);
        ele4ClassPanelTransfer.add(eleTransferBox4);
        ele4ClassPanelGrade.add(eleGradeBox4);

        ele5ClassPanel.add(eleClassBox5);
        ele5ClassPanelSemester.add(eleSemesterBox5);
        ele5ClassPanelTransfer.add(eleTransferBox5);
        ele5ClassPanelGrade.add(eleGradeBox5);

        ele6ClassPanel.add(eleClassBox6);
        ele6ClassPanelSemester.add(eleSemesterBox6);
        ele6ClassPanelTransfer.add(eleTransferBox6);
        ele6ClassPanelGrade.add(eleGradeBox6);

        ele7ClassPanel.add(eleClassBox7);
        ele7ClassPanelSemester.add(eleSemesterBox7);
        ele7ClassPanelTransfer.add(eleTransferBox7);
        ele7ClassPanelGrade.add(eleGradeBox7);

        ele8ClassPanel.add(eleClassBox8);
        ele8ClassPanelSemester.add(eleSemesterBox8);
        ele8ClassPanelTransfer.add(eleTransferBox8);
        ele8ClassPanelGrade.add(eleGradeBox8);

        //FOr the "other requirements" section
        other1ClassPanel.add(otherClassBox1); 
        other1ClassPanelSemester.add(otherSemesterBox1);
        other1ClassPanelTransfer.add(otherTransferBox1);
        other1ClassPanelGrade.add(otherGradeBox1);

        other2ClassPanel.add(otherClassBox2);
        other2ClassPanelSemester.add(otherSemesterBox2);
        other2ClassPanelTransfer.add(otherTransferBox2);
        other2ClassPanelGrade.add(otherGradeBox2);





        //Adding all panels to frame
        frame.add(labelPanel);
        frame.add(infoPanel);
        frame.add(infoPanel2);
        frame.add(infoPanel3);
        frame.add(infoPanel4);
             
        frame.add(ele1ClassPanel);
        frame.add(ele1ClassPanelTransfer);
        frame.add(ele1ClassPanelSemester);
        frame.add(ele1ClassPanelGrade);

        frame.add(ele2ClassPanel);
        frame.add(ele2ClassPanelTransfer);
        frame.add(ele2ClassPanelSemester);
        frame.add(ele2ClassPanelGrade);

        frame.add(ele3ClassPanel);
        frame.add(ele3ClassPanelTransfer);
        frame.add(ele3ClassPanelSemester);
        frame.add(ele3ClassPanelGrade);

        frame.add(ele4ClassPanel);
        frame.add(ele4ClassPanelTransfer);
        frame.add(ele4ClassPanelSemester);
        frame.add(ele4ClassPanelGrade);

        frame.add(ele5ClassPanel);
        frame.add(ele5ClassPanelTransfer);
        frame.add(ele5ClassPanelSemester);
        frame.add(ele5ClassPanelGrade);

        frame.add(ele6ClassPanel);
        frame.add(ele6ClassPanelTransfer);
        frame.add(ele6ClassPanelSemester);
        frame.add(ele6ClassPanelGrade);

        frame.add(ele7ClassPanel);
        frame.add(ele7ClassPanelTransfer);
        frame.add(ele7ClassPanelSemester);
        frame.add(ele7ClassPanelGrade);

        frame.add(ele8ClassPanel);
        frame.add(ele8ClassPanelTransfer);
        frame.add(ele8ClassPanelSemester);
        frame.add(ele8ClassPanelGrade);

        frame.add(other1ClassPanel);
        frame.add(other1ClassPanelTransfer);
        frame.add(other1ClassPanelSemester);
        frame.add(other1ClassPanelGrade);

        frame.add(other2ClassPanel);
        frame.add(other2ClassPanelTransfer);
        frame.add(other2ClassPanelSemester);
        frame.add(other2ClassPanelGrade);

        
        frame.add(firstClassPanel);
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
        //pack all frames and components
        frame.pack();
        //set frame size
        frame.setSize(750,750);
        
      
        
      
	}	
}