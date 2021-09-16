
package online.pkg1;



import java.util.Scanner;




public class Online1 {

    public static void main(String[] args) {
       PhoneBook obj[] = new PhoneBook[10];
    
       
        for (int i=0;i<10;i++)
        {
            
            Scanner scan = new Scanner(System.in);
            System.out.println("input:");
            String n = scan.nextLine();
            int phn = scan.nextInt();
            int area = scan.nextInt();
            
            obj[i] = new PhoneBook(n,phn,area);
            
        }

        
        
        Scanner scan = new Scanner(System.in);
        int user_area_code;
        System.out.println("Input Area code for search");
        user_area_code = scan.nextInt();
        
        for (int i=0;i<10;i++)
        {
            if(obj[i].area_code == user_area_code)
            {
                for(int j = i; j < obj.length - 1; j++){
                    obj[j] = obj[j+1];
                }
                break;
            }

        }
       
         
        for (int i=0;i<obj.length;i++)
        {
            obj[i].printInfo();

        }
        
         
        

    }
    
}

class PhoneBook{
    String name;
    int phone_no;
    int area_code;

    PhoneBook(){
        System.out.println("no valid entry");
    }
    PhoneBook(String name, int phone_no, int area_code)
    {
        this.name=name;
        this.phone_no = phone_no;
        this.area_code = area_code;

    }
    void printInfo(){
        System.out.println(name +' '+ phone_no +' '+ area_code);
    }


}