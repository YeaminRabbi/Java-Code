
package employee_record;

import java.util.Scanner;


public class Employee_Record {

    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     Salaried_Employee s_obj[] = new Salaried_Employee[10];
     HourlySalaried_Employee h_obj[] = new HourlySalaried_Employee[10];
     Commisioned_Employee c_obj[] = new Commisioned_Employee[10];

     int kk=0;
     int mm=0;
     int pp=0;
             
     for(int i =0; i<3 ; i++)
     {
            System.out.println("Entry for "+(i+1)+" person Salaried Employee\n");
            
            System.out.println("Enter ID:");
            String person_id = scan.next();

            System.out.println("Enter Name: ");
            String person_name = scan.next();

            System.out.println("Enter Department: ");
            String person_derpartment = scan.next();
            
            System.out.println("Enter Base Salary: ");
            String person_baseSalary = scan.next();

            s_obj[kk] = new Salaried_Employee(person_name, person_id, person_derpartment,person_baseSalary);
            kk++;

     }
     
     for(int i =0; i<3 ; i++)
     {
            System.out.println("Entry for "+(i+1)+" person Hourly Salaried Employee\n");
            
            System.out.println("Enter ID:");
            String person_id = scan.next();

            System.out.println("Enter Name: ");
            String person_name = scan.next();

            System.out.println("Enter Department: ");
            String person_derpartment = scan.next();
            
             System.out.println("Enter Worinking Hour: ");
            String person_hour = scan.next();
            
            System.out.println("Enter Base Salary: ");
            String person_baseSalary = scan.next();

            h_obj[mm] = new HourlySalaried_Employee(person_name, person_id, person_derpartment,person_baseSalary,person_hour);
            mm++;

     }
     
     
     for(int i =0; i<3 ; i++)
     {
            System.out.println("Entry for "+(i+1)+" person Comission Salaried Employee\n");
            
            System.out.println("Enter ID:");
            String person_id = scan.next();

            System.out.println("Enter Name: ");
            String person_name = scan.next();

            System.out.println("Enter Department: ");
            String person_derpartment = scan.next();
            
             System.out.println("Enter Comission Rate: ");
            String person_commision = scan.next();
            
            System.out.println("Enter Base Salary: ");
            String person_baseSalary = scan.next();

            c_obj[pp] = new Commisioned_Employee(person_name, person_id, person_derpartment,person_baseSalary,person_commision);
            pp++;

     }
     
     
     while(true)
     {
          System.out.println("\n Make Choice\n1. Salaried Employee\n2. Hourly Salaried Employee\n3. Comission Employee\n");
          
          int ch=scan.nextInt();
          
          if(ch == 1)
          {
            for(int i=0; i<3 ;i++)
            {
                System.out.println(s_obj[i].get_info());
                
            }
              System.out.println("\n Press 1 to update any information \n Or Enter any key to continue");
              int second_choice = scan.nextInt();
              
              if(second_choice == 1)
              {
                  
                System.out.println("\n Choose ID to Update");
                String person_id = scan.next();
                        for(int i=0;i<3;i++)
                        {
                            if(s_obj[i].get_id_fromSUPER().equals(person_id))
                            {

                                System.out.println("Enter Name: ");
                                String person_name = scan.next();

                                System.out.println("Enter Department: ");
                                String person_derpartment = scan.next();

                                System.out.println("Enter Base Salary: ");
                                String person_baseSalary = scan.next();

                                s_obj[i].set_userinfo(person_name,s_obj[i].get_id_fromSUPER(),person_derpartment,person_baseSalary);
                                break;
                            }

                        }

              }
          }
          
          
          else if(ch == 2)
          {
              for(int i=0; i<3 ;i++)
                {
                    System.out.println(h_obj[i].get_info());

                }
              System.out.println("\n Press 1 to update any information \n Or Enter any key to continue");
              int second_choice = scan.nextInt();
              if(second_choice == 1)
              {
                  
                System.out.println("\n Choose ID to Update");
                String person_id = scan.next();
                      
                    for(int i=0;i<3;i++)
                        {
                            if(h_obj[i].get_id_fromSUPER().equals(person_id))
                            {

                                System.out.println("Enter Name: ");
                                String person_name = scan.next();

                                System.out.println("Enter Department: ");
                                String person_derpartment = scan.next();

                                System.out.println("Enter Base Salary: ");
                                String person_baseSalary = scan.next();
                                
                                System.out.println("Enter Working Hour: ");
                                String person_hour = scan.next();

                                h_obj[i].set_userinfo(person_name,h_obj[i].get_id_fromSUPER(),person_derpartment,person_baseSalary,person_hour);
                                break;
                            }

                        }

              }
              
              
          }
          
          else if(ch == 3 )
          {
             for(int i=0; i<3 ;i++)
                {
                    System.out.println(c_obj[i].get_info());

                }
              System.out.println("\n Press 1 to update any information \n Or Enter any key to continue");
              int second_choice = scan.nextInt();
              if(second_choice == 1)
              {
                  
                System.out.println("\n Choose ID to Update");
                String person_id = scan.next();
                      
                    for(int i=0;i<3;i++)
                        {
                            if(c_obj[i].get_id_fromSUPER().equals(person_id))
                            {

                                System.out.println("Enter Name: ");
                                String person_name = scan.next();

                                System.out.println("Enter Department: ");
                                String person_derpartment = scan.next();

                                System.out.println("Enter Base Salary: ");
                                String person_baseSalary = scan.next();
                                
                                System.out.println("Enter Comission Rate: ");
                                String person_comission = scan.next();

                                c_obj[i].set_userinfo(person_name,c_obj[i].get_id_fromSUPER(),person_derpartment,person_baseSalary,person_comission);
                                break;
                            }

                        }

              } 
          }
          
          

     }
     
     
     
     
     
       
    }
    
}


class Employee{
    private String name;
    private String id;
    private String department;
    
    void set_info(String n, String id, String d)
    {
        this.name = n;
        this.id=id;
        this.department =d;
    }
    
    String get_info_all()
    {
        return ("Name :"+this.name+" ID :" + this.id +" Department :"+ this.department);
    }
    
        String get_id()
        {
           return id; 
        }
}

class Salaried_Employee extends Employee{
     private String salary;
     
     Salaried_Employee(String n, String id, String d , String base_salary)
     {
         super.set_info(n,id,d);
         
         this.salary = base_salary;
     }
     
     String get_info()
     {
         String info = super.get_info_all()+" Salary: "+this.salary;
         return info;
     }
     
      String get_id_fromSUPER()
        {
           return super.get_id(); 
        }
      
      
      void set_userinfo(String n, String id, String d , String base_salary)
      {
          super.set_info(n,id,d);
          this.salary = base_salary;
      }
      
      
}




class HourlySalaried_Employee extends Employee{
    private String salary;
    private String hour;
     HourlySalaried_Employee(String n, String id, String d , String base_salary, String hour)
     {
         super.set_info(n,id,d);
         
         int total_salary = Integer.parseInt(base_salary) * Integer.parseInt(hour); 
         this.salary = Integer.toString(total_salary);
         this.hour = hour;
         
         
     }
     
     String get_info()
     {
         String info = super.get_info_all()+" Salary: "+this.salary+" Hour: "+ this.hour;
         return info;
     }
     
     
     void set_userinfo(String n, String id, String d , String base_salary, String hour)
      {
         super.set_info(n,id,d);
         
         int total_salary = Integer.parseInt(base_salary) * Integer.parseInt(hour); 
         this.salary = Integer.toString(total_salary);
      }
     
     String get_id_fromSUPER()
        {
           return super.get_id(); 
        }
     
}



class Commisioned_Employee extends Employee{
    private String salary;
    private String comission;
     Commisioned_Employee(String n, String id, String d , String base_salary, String comission)
     {
         super.set_info(n,id,d);
         
         this.comission = comission;
         
         
         this.salary = base_salary;
     }
     
     String get_info()
     {
         String info = super.get_info_all()+" Salary: "+this.salary+ " Comission: "+ this.comission;
         return info;
     }
     
      void set_userinfo(String n, String id, String d , String base_salary, String comission)
      {
         super.set_info(n,id,d);
         
         this.comission = comission;
         
         
         this.salary = base_salary;
      }
     
     String get_id_fromSUPER()
        {
           return super.get_id(); 
        }
}