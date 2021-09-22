package book_application;

import java.util.Scanner;

public class Book_Application {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book obj[] = new Book[10];
        
        System.out.println("Enter the Number of Inputs: ");
        int N = scan.nextInt();
        int kk=0;
        for(int i = 0 ; i < N; i++)
        {
            System.out.println("Entry for "+(i+1)+" person \n");
            System.out.println("Enter ID:");
            String person_id = scan.next();

            System.out.println("Enter Name: ");
            String person_name = scan.next();

            System.out.println("Enter address: ");
            String person_address = scan.next();

            obj[kk] = new Book(person_name, person_address);
                      
            obj[kk].set_ID(person_id);
            
            kk++;

        }
        
        
        
        
        
         
         while(true)
         {
                
                System.out.println("\n Make Choice\n1. Show all Record\n2. Update Record\n3. Delete Record\n4. Add new Record");
                int ch=scan.nextInt();

                if(ch == 1)
                {
                    for(int i=0;i<N;i++)
                   {
                       System.out.println( obj[i].book_information());
                   }
                }
                else if(ch == 2)
                {
                    System.out.println("Enter Id to Update: ");
                    String person_id=scan.next();

                   System.out.println("Enter Name: ");
                   String person_name = scan.next();

                   System.out.println("Enter address: ");
                   String person_address = scan.next();

                    for(int i=0;i<N;i++)
                    {
                        
                        
                        if(obj[i].get_id().equals(person_id))
                        {
                            obj[i].set_name_address(person_name,person_address);

                            break;
                        }

                    }

                }

                else if(ch == 3){
                    System.out.println("Enter Id to Delete: ");
                    String person_id=scan.next();

                    for(int i=0;i<N;i++)
                    {
                        if(obj[i].get_id().equals(person_id))
                        {
                            obj[i] = obj[i - 1];
                            N--;
                            break;
                        }

                    }


                }
                else if(ch == 4)
                {
                    int pp=N;
                    
                    
                    System.out.println("Enter ID:");
                    String person_id = scan.next();

                    System.out.println("Enter Name: ");
                    String person_name = scan.next();

                    System.out.println("Enter address: ");
                    String person_address = scan.next();

                    obj[pp] = new Book(person_name, person_address);

                    obj[pp].set_ID(person_id);

                    N=N+1;
                    
                }
                
                
                
         }
         
        
                
    }
    
}


class Book{
    private String name;
    private String address;
    private String id;
    
    Book(String n, String a)
    {
        this.name = n;
        this.address = a;
        
    }
    
    void set_ID(String id)
    {
        this.id = id;
    }
    
    void set_name_address(String n, String a)
    {
        this.name = n;
        this.address = a;
    }
    
    String book_information()
    {
        String all_info = "-------------------\nName: "+name+" \nAddress: "+ address+"\nID: "+this.id+"\n----------------------";
        return all_info;
    }
    
    String get_id()
    {
       return this.id; 
    }
    
    
}