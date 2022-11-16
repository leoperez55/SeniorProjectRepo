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

      //Reads in searchTerms were looking for from searchTerms.TXT and stores them in an ArrayList
      try (BufferedReader br2 = new BufferedReader(new FileReader("searchTerms.txt"))) {
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
      
      String s;     
      int nameCntr = 0;

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter students Track: ");

      // String input
      String track = sc.nextLine();


      while((s=br.readLine())!=null)   //Reading Content from the file until theres no more to read
      {
         //Gets the students name from transcipt
         if( s.contains("Name:") && (nameCntr != 1)){
            System.out.print(String.format("%-50s %s" , s, " "));
            //System.out.println(s+'\n');
            nameCntr = 1;
         }
         
         if( s.contains("Student ID:")){
            System.out.print(s+'\n');
            //System.out.print('\n');

            System.out.print(String.format("%-50s %s" , "Plan: Master", " "));
            System.out.println("Major: Computer Science");
            System.out.print(String.format("%-51s %s" , " ", "Track:" + track));
         }

   


      }
      
         fr.close(); //Close the File Reader
   }


}