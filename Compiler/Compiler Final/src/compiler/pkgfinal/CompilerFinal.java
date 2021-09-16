/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.pkgfinal;

import static compiler.pkgfinal.global.ar;
import static compiler.pkgfinal.global.ii;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tushar
 */


class global
{
    public static int ii=0;
    public static int []ar;
    
    
}


public class CompilerFinal {

   static void add(int n)
   {
       ar[ii]=n;
       ii++;
   }
    
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            Scanner scan = new Scanner(System.in);
            String fileName="F:\\CODE\\JAVA\\Compiler\\Compiler Final\\e.txt";
            
            fileReader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fileReader);
            
            //3+3
            String line="";
            
            int ii=0;
            
            try {
                
                int final_ar[] = null;
                while ((line = br.readLine()) != null)
                {
                     int result=0;
                    
                    if(line.charAt(line.length()-1)=='+' || line.charAt(line.length()-1)=='-' || line.charAt(line.length()-1)=='*' || line.charAt(line.length()-1)=='/')
                    {
                       result=-1;
                        
                    }
                    
                    
                    else 
                    {
                         int f=0;
                         
                         
                         if(line.charAt(1)=='+')
                             f=1;
                         else if(line.charAt(1)=='-')
                             f=2;
                         else if(line.charAt(1)=='*')
                             f=3;
                         else if(line.charAt(1)=='/')
                             f=4;
                         
                         else f=0;
                         
                         /*
                        for(int i=0;i<line.length();i++)
                         {
                             if(line.charAt(i)=='+')
                             {
                                 f=1;
                                 break;
                             }
                             else if(line.charAt(i)=='-')
                             {
                                 f=2;
                                 break;

                             }
                             else if(line.charAt(i)=='*')
                             {
                                 f=3;
                                 break;

                             }
                             else if(line.charAt(i)=='/')
                             {
                                 f=4;
                                 break;
                             }

                         }
                         */
                         
                        
                         if(f==0)
                         {
                             result=-1;
                             
                         }
                         else if(f==1)
                         {
                             result= Integer.parseInt(String.valueOf(line.charAt(0))) + Integer.parseInt(String.valueOf(line.charAt(2)));
                             add(result);

                         }

                         else if(f==2)
                         {
                             result= Integer.parseInt(String.valueOf(line.charAt(0))) - Integer.parseInt(String.valueOf(line.charAt(2)));
                            add(result);
                         }

                         else if(f==3)
                         {
                             result= Integer.parseInt(String.valueOf(line.charAt(0))) * Integer.parseInt(String.valueOf(line.charAt(2)));
                            add(result);
                         }
                         else if(f==4)
                         {
                             
                             result= Integer.parseInt(String.valueOf(line.charAt(0))) / Integer.parseInt(String.valueOf(line.charAt(2)));
                            add(result);

                         }

                    }
                    //System.out.println(line);
                    
                    
                    System.out.println("--------");
                   
                }
            } catch (IOException ex) {
                Logger.getLogger(CompilerFinal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            
            
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CompilerFinal.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileReader.close();
            } catch (IOException ex) {
                Logger.getLogger(CompilerFinal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
        
        for(int i=0;i<global.ii;i++)
        {
            System.out.println(global.ar[ii]);
        }
        
    }
    
}
