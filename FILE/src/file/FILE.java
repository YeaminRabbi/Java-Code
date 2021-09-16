/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files
/**
 *
 * @author Rabbi
 */
public class FILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
          String ar1[] = null;
           int k=0; 
    try {
      File myObj = new File("data.txt");
      Scanner myReader = new Scanner(myObj);
     
     
    
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        
       System.out.println(data);
        
       ar1[k]=data;
       k++;
    
        }

      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    ar1[k]=null;
    
        for(int j=0;j<ar1.length;j++)
        {
            System.out.println("The val is:"+ar1[j]);
        }
    
    }
    
}
