
package sciencefair;
import java.util.Random;
import java.util.Scanner;

public class ScienceFair {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Team[] obj = new Team[10];
        Random rn = new Random();
        
        System.out.println("Choose total number of teams: ");
        int n=scan.nextInt();
        
        for(int i=0;i<n;i++)
        {
            int team_members;
            String detail;
            
            System.out.println("Input Total Team Members: for team "+(i+1));
            team_members = scan.nextInt();
            
            System.out.println("Input Project Details: for team "+(i+1));
            detail = scan.next();
            
            obj[i] = new Team(team_members,detail); 
            
            
        }
 
        int kk=-10;
        while(kk != 0) 
        {
            menu();
            System.out.println("Choose Option: ");
            int option = scan.nextInt();
            
            System.out.println(option);
            
            if(option == 1)
            {
                for(int i =0;i<n;i++){
                    System.out.println("For Team "+ (i+1));
                    System.out.println("\nTotal Members: "+ obj[i].team_members);
                    System.out.println("\nProject Details: "+ obj[i].project_details);

                }
            }
            else if(option == 2){
                for(int i =0;i<n;i++){
                    
                    System.out.println("--------------TEAM "+ (i+1)+"-----------------");

                    System.out.println("Judge 1 points: (1-10)");
                    int j1=scan.nextInt();
                    System.out.println("Judge 2 points: (1-10)");
                    int j2=scan.nextInt();
                    System.out.println("Judge 3 points: (1-10)");
                    int j3=scan.nextInt();
                   
                   obj[i].set_points( j1,j2,j3 );

                }
            }
            
            else if(option ==3 ){
                for(int i =0;i<n;i++){
                    System.out.println("\nTeam "+(i+1)+" Total Points: "+ obj[i].get_team_points());
                   

                }
            }
            
            else if(option == 4)
            {
                int highest = -9999;
                int team_number_index=0;
                for(int i =0;i<n;i++){
                    
                    if(highest < obj[i].get_team_points())
                    {
                        highest = obj[i].get_team_points();
                        team_number_index=i+1;
                    }
                   
                }
                
                System.out.println("The Winner is : Team "+ team_number_index + " with total "+highest+" points");
            }
            
            kk--;
        }
       
        
        
    }
    
    static void menu()
    {
        System.out.println("1. View list and project details \n"+"2. Give marks to teams\n"+"3. Calculate Marks of Each Team\n"+"4. Search the Winner\n");
        
    }
}


class Team{
    int judge1_point=0;
    int judge2_point=0;
    int judge3_point=0;
    int team_members;
    String project_details;
    
    Team(int member, String detail){
        this.team_members = member;
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