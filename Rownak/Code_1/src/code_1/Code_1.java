/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_1;

import java.util.Scanner;

/**
 *
 * @author Rabbi
 */
public class Code_1 {

    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        // Laptop ab= new Laptop("x40","TOTO","45.25");
//        Laptop obj[] = new Laptop[5];
//        
//        for(int i=0;i<5;i++)
//        {
//            System.out.println("Input Model Name ("+(i+1)+"): ");
//
//            String model= sc.nextLine();
//            
//            System.out.println("Input Company Name ("+(i+1)+"): ");
//            String company= sc.nextLine();
//            
//            System.out.println("Input Weight Name ("+(i+1)+"): ");
//            String weight= sc.nextLine();
//            obj[i] = new Laptop(model,company,weight);
//        }
//        
//        
//        for(int i=0;i<5;i++){
//             System.out.print((i+1));
//             obj[i].getModel();
//             System.out.print((i+1));
//             obj[i].getCompany();
//             System.out.print((i+1));
//             obj[i].getWeight();
//             
//        }



    ///code for scanning and arr use
      
       while(true)
       {
            System.out.println("Number of inputs: ");
            int count = sc.nextInt();
            String counter_array[] = new String[count];
            System.out.println("Enter all the elements:");
            for(int i = 0; i <count; i++)
            {
                System.out.println("No. "+(i+1)+ " element:");
                counter_array[i] = sc.next();
    
            }
           
           for(int i=0;i<count;i++)
           {
               System.out.println("The value is:" + counter_array[i]);
               
           }
       }
            
        
    }
    
}



class Laptop{
    private String model;
    private String company;
    private String weight;
    
    String setModel(String x)
    {
        return x;
    }
    
    String setCompany(String x)
    {
        return x;
    }
    
    String setWeight(String x)
    {
        return x;
    }
    
    void getModel()
    {
        System.out.println("Model: "+model);
    }
    void getCompany()
    {
        System.out.println("Company: "+company);
    }
    void getWeight()
    {
        System.out.println("Weight: "+weight);
    }
    
    Laptop(String a, String b,String c)
    {
        model=setModel(a);
        company = setCompany(b);
        weight= setWeight(c);
    }
    
    void printData()
    {
        getModel();
         getCompany();
         getWeight();
        
    }
    
    
}