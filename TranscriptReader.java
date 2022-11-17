import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TranscriptReader
{
   public static void main(String[] args) throws IOException 
   {

      List<String> searchTerms = new ArrayList<String>();
      List<String> classes = new ArrayList<String>();
      String s;     
      String trackFile = " ";
      int nameCntr = 0;

      //Gets the students masters track from user
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter students Track: ");

      // String input
      String track = sc.nextLine();
      
      //determines which core classes the students needs depending on their study track
      switch(track) {
         case "Data Sciences":
           trackFile = "Data Sciences.txt";
           break;
         case "Cyber Security":
            trackFile = "Cyber Security.txt";
           break;
         case "Intelligent Systems":
            trackFile = "Intelligent Systems.txt";
           break;
         case "Interactive Computing":
            trackFile = "Interactive Computing.txt";
           break;
         case "Networks and Telecommunications":
            trackFile = "Networks and Telecommunications.txt";
           break;
         case "Systems":
            trackFile = "Systems.txt";
           break;
         case "Traditional Computer Science":
            trackFile = "Traditional Computer Science.txt";
           break;
           
         default:
            System.out.println("No track was found with that name: ");

       }



      //Reads in searchTerms were looking for from searchTerms.TXT and stores them in an ArrayList
      try (BufferedReader br2 = new BufferedReader(new FileReader(trackFile))) {
         String line;
         while ((line = br2.readLine()) != null) {
          searchTerms.add(line);
            }
         }

      //Initializing file reading for the transcipt
      File f1=new File("TSRPT_Sample1.txt"); //Creation of File Descriptor for input file
      String[] words=null;  //Intialize the word Array
      FileReader fr = new FileReader(f1);  //Creation of File Reader object
      BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
      
      //Reading Content from the file until theres no more to read
      while((s=br.readLine())!=null)   
      {
         //Gets the students name from transcipt
         if( s.contains("Name:") && (nameCntr != 1)){
            System.out.print(String.format("%-50s %s" , s, " "));
            nameCntr = 1;
         }
         
         //Gets the students ID, Plan, Major, and Track their on and formats them for output
         if( s.contains("Student ID:")){
            System.out.print(s+'\n');
            System.out.print(String.format("%-50s %s" , "Plan: Master", " "));
            System.out.println("Major: Computer Science");
            System.out.println(String.format("%-51s %s" , " ", "Track:" + track));
            System.out.println();
         }

         //Finds all the strings in the transcipt that have "CS" in them (To get the students classes)
         if (s.contains("CS")){
            //Adds each string that contains the classes information the the "classes" list array 
            classes.add(s);
            System.out.println(s);
         }


      }
         System.out.println('\n');
         fr.close(); //Close the File Reader

       
         //Counts how many core classes the student is taking / has taken    
         int classCntr = 0;
         for(int i = 0; i < classes.size(); i++){
            for(int j = 0; j < searchTerms.size(); j ++){
               if(classes.get(i).contains(searchTerms.get(j))){
                     classCntr++;
               }
               
            }
         }
            
         System.out.println("Student has taken/taking these " + classCntr+"/5" + " required core classes ");
         System.out.println("----------------------------------");

         //Prints out the core classes the student has taken 
         for(int i = 0; i < classes.size(); i++){
            for(int j = 0; j < searchTerms.size(); j ++){
               if(classes.get(i).contains(searchTerms.get(j))){
                  System.out.println(searchTerms.get(j));

               }
               
            }
         }

         System.out.println();
         System.out.println("Student has taken/taking these required elective classes ");
         System.out.println("----------------------------------");

         // List<String> electives = new ArrayList<>(); 
         // electives.addAll(classes);

         // for(int i = 0; i < classes.size(); i++){
         //    for(int j = 0; j < searchTerms.size(); j ++){
         //       if(classes.get(i).contains(searchTerms.get(j))){
         //          electives.remove(i);
         //          System.out.println("hello");
         //       }
               
         //    }
         // }

         // for(int i = 0; i < electives.size(); i++){
         //    System.out.println(electives.get(i));
         // }
         //classes.get(0).contains();
   }

      
   
}   
