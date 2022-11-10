import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TranscriptReader
{
   public static void main(String[] args) throws IOException 
   {
      File f1=new File("TSRPT_Sample1.txt"); //Creation of File Descriptor for input file
      String[] words=null;  //Intialize the word Array

      FileReader fr = new FileReader(f1);  //Creation of File Reader object
      BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object

      String s;     
      String searchTerm="6313";   // Input word to be searched
      

      while((s=br.readLine())!=null)   //Reading Content from the file
      {
         words=s.split(" ");  //Split the word using space
          for (String word : words) 
          {
                 if (word.equals(searchTerm))   //Search for the given word
                 {
                   System.out.println(searchTerm);
                 }
          }
      }
      
         fr.close(); //Close the File Reader
   }


}