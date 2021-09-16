package mid_exam;

import java.util.Random;
import java.util.Scanner;

public class Mid_Exam {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Team[] obj = new Team[10];
        
        menu();
        
        System.out.println("Choose any option: ");
        int n=scan.nextInt();
        
        System.out.println(n);
        
        
    }
    
    static void menu()
    {
        System.out.println("1. Adding team to ScienceFair\n"+ "2. View list and project details \n"+"3. Give marks to teams\n"+"4. Calculate Marks of Each Team\n"+"5. Search the Winner\n");
        
    }
    
}




class Team{
    int judge1_point=0;
    int judge2_point=0;
    int judge3_point=0;
    int team_memebers;
    String project_details;
    
    Team(int member, String detail){
        this.team_memebers = member;
        this.project_details=detail;
    }
    
    
    void set_points(int a, int b, int c)
    {
        this.judge1_point = a;
        this.judge2_point = b;
        this.judge3_point = c;
    }
    
    
    int get_team_points()
    {
        int total = this.judge1_point + this.judge2_point + this.judge3_point;
        return  total;
    }
    
    
}