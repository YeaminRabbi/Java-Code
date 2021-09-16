/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package pkgfinal;

/**
 *
 * @author Rabbi
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner; // Import the Scanner class to read text files



public class NC implements Clock {

    public static void main(String[] args){
     Clock c = new Clock{
            void showTime()
            {
                System.out.println("2.00am");
            }
            void increment()
            {
                System.out.println("10%");
            }
        }
    }
}
          
 

