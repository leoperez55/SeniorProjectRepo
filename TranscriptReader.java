import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TranscriptReader
{
   public static void main(String[] args) throws IOException 
   {
      File f1=new File("TSRPT_Sample1.txt"); //Creation of File Descriptor for input file
      String[] words=null;  //Intialize the word Array

      FileReader fr = new FileReader(f1);  //Creation of File Reader object
      BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object

      String s;     
   
      List<String> searchTerms = new ArrayList<String>();

      try (BufferedReader br2 = new BufferedReader(new FileReader("searchTerms.txt"))) {
      String line;
      while ((line = br2.readLine()) != null) {
       searchTerms.add(line);
         }
      }

      while((s=br.readLine())!=null)   //Reading Content from the file until theres no more to read
      {
         
         words=s.split(" ");  //Split the words stored in the buffer using a space 
         for (String word : words)  //Goes through every word in the buffer and sets it equal to "word" as it parses
            {
                 //Compares every word in the transcipt to every word in our searchTerms.txt
                 //to check if a class is within the transcipt
                 int i = 0;
                 for(; i < searchTerms.size(); i++)   
                 {
                   if(word.equals(searchTerms.get(i))){
                     System.out.println(searchTerms.get(i));
                   }
                  
                 }
                 
            }
      }
      
         fr.close(); //Close the File Reader
   }


}