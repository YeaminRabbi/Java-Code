/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.pkg3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tushar
 */
public class Compiler3 {

    
    // prefix
    static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static StringBuilder infixToPreFix(String expression) {

        StringBuilder result = new StringBuilder();
        StringBuilder input = new StringBuilder(expression);
        input.reverse();
        Stack<Character> stack = new Stack<Character>();

        char[] charsExp = new String(input).toCharArray();
        for (int i = 0; i < charsExp.length; i++) {

            if (charsExp[i] == '(') {
                charsExp[i] = ')';
                i++;
            } else if (charsExp[i] == ')') {
                charsExp[i] = '(';
                i++;
            }
        }
        for (int i = 0; i < charsExp.length; i++) {
            char c = charsExp[i];

            if (precedence(c) > 0) {
                while (stack.isEmpty() == false && precedence(stack.peek()) >= precedence(c)) {
                    result.append(stack.pop());
                }
                stack.push(c);
            } else if (c == ')') {
                char x = stack.pop();
                while (x != '(') {
                    result.append(x);
                    x = stack.pop();
                }
            } else if (c == '(') {
                stack.push(c);
            } else {
                result.append(c);
            }
        }

        for (int i = 0; i <= stack.size(); i++) {
            result.append(stack.pop());
        }
        return result.reverse();
    }

    // postfix
    public static int Prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }
    
    
        
    public static String infixToPostfix(String exp) {

        String result = new String("");
        
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result += c;
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }

                if (!stack.isEmpty() && stack.peek() != '(') {
                    return "Invalid Expression";
                } else {
                    stack.pop();
                }
            } else {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) {
                    if (stack.peek() == '(') {
                        return "Invalid Expression";
                    }
                    result += stack.pop();
                }
                stack.push(c);
            }

        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "Invalid Expression";
            }
            result += stack.pop();
        }
        return result;
    }

    
    static void console_input() 
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Input an Infix Expression: ");
        String s=scan.next();
        
        System.out.println("Convert Infix to:\n1.Prefix\n2.Postfix\n");
        
        int ch=scan.nextInt();
        if(ch==1)
        {
            System.out.println(infixToPreFix(s));
        }
        else if(ch==2)
        {
            System.out.println(infixToPostfix(s));
        }
        else 
            System.out.println("Wrong Input..!!");
        
        menu();
        
    }
    
    static void file_input() 
    {
         Scanner scan = new Scanner(System.in);
        //System.out.println("Input File Path: ");
        //String fileName=scan.next();
        
        FileReader fileReader= null;
        try {
            String fileName= "F:\\CODE\\JAVA\\Compiler\\Compiler Assignment 3\\Compiler 3\\infix.txt";
            fileReader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fileReader);
            try {
                
                String input=br.readLine();
                if(!input.isEmpty())
                {
                     
                    System.out.println("Convert Infix to:\n1.Prefix\n2.Postfix\n");
                    
                     
                   StringBuilder r1 = new StringBuilder();
                   
                   String r2="";
                    int ch=scan.nextInt();
                    FileWriter w = new FileWriter(fileName, true);
                    
                    if(ch==1){
                          
                        r1 = infixToPreFix(input);
                        
                        String r11= r1.toString(); //converting StringBuilder to string 
                        w.write("\n\nThe Prefix: "+ r11);
                        w.close();
                         
                         }
                    else if(ch==2)
                    {
                        
                        r2 = infixToPostfix(input);
                         w.write("\n\nThe Postfix: "+r2);
                        w.close();
                        
                         
                    }
                    else 
                        System.out.println("Wrong Input..!!");


                    
                    
                }
                else 
                {
                    System.out.println("File Empty..!!");
                }
                
                System.out.println("Succesfully Converted..!!\n");
                
            } catch (IOException ex) {
                Logger.getLogger(Compiler3.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Compiler3.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileReader.close();
            } catch (IOException ex) {
                Logger.getLogger(Compiler3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
       
        menu();
        
    }
    
    static void menu() 
    {
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("1. Console input.");
        System.out.println("2. File input.");
        System.out.println("0. Exit.");
        
        int ch=scan.nextInt();
        
        if(ch==1)
        {
            console_input();
        }
        else if(ch==2)
        {
            file_input();
        }
        else if(ch==0)
        {
            System.exit(0);
        }
        else 
            System.out.println("Wrong input..!!");
        
        
        
        
    }
    
    public static void main(String[] args) {
    
        
        menu();
    }
    
}
