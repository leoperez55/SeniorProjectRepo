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
      List<String> coreClasses = new ArrayList<String>();
      List<String> classTokens = new ArrayList<String>();
      String s;     
      String trackFile = " ";
      int nameCntr = 0;

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter students Track: ");

      // String input
      String track = sc.nextLine();
      //determines which classes the students needs depending on their study track
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
      

      while((s=br.readLine())!=null)   //Reading Content from the file until theres no more to read
      {
         //Gets the students name from transcipt
         if( s.contains("Name:") && (nameCntr != 1)){
            System.out.print(String.format("%-50s %s" , s, " "));
            nameCntr = 1;
         }
         
         if( s.contains("Student ID:")){
            System.out.print(s+'\n');
            System.out.print(String.format("%-50s %s" , "Plan: Master", " "));
            System.out.println("Major: Computer Science");
            System.out.println(String.format("%-51s %s" , " ", "Track:" + track));
            System.out.println();
         }

         if (s.contains("CS")){
            classes.add(s);
            System.out.println(s);
         }


      }
         System.out.println('\n');
         fr.close(); //Close the File Reader

       
            
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

         for(int i = 0; i < classes.size(); i++){
            for(int j = 0; j < searchTerms.size(); j ++){
               if(classes.get(i).contains(searchTerms.get(j))){
                  System.out.println(searchTerms.get(j));
                  coreClasses.add(searchTerms.get(j).trim());
               }
               
            }
         }

         System.out.println();

         System.out.println("Student has taken/taking these required elective classes ");
         System.out.println("----------------------------------");
         
         // Tokenize Classes
         for(int i = 0; i < classes.size(); i++){
            String str = classes.get(i);
            String[] arrOfStr = str.split(" ", 0);
            classTokens.add(arrOfStr[0] + " " + arrOfStr[1]);
         }

         // Prints all classes that weren't counted as core classes
         for(int i = 0; i < classTokens.size(); i++){
            boolean flag = false;
            for(int j = 0; j < coreClasses.size(); j ++){
               //System.out.println("ASDASD|" + classTokens.get(i) + "|     |" + coreClasses.get(j) + "|");
               //System.out.println(classTokens.get(i).contains(coreClasses.get(j)));
               if(classTokens.get(i).equals(coreClasses.get(j))){
                  flag = true;
               }
            }
            if (!flag)
            {
               System.out.println(classTokens.get(i));
            }
         }
         
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
         
   }
}