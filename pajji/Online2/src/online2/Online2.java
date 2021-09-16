package online2;

import java.util.Scanner;

public class Online2 {

    public static void main(String[] args) {
        UIUPeople obj[] = new UIUPeople[10];
        TA obj_TA[] = new TA[10];
        int kk = 0;

        for (int i = 0; i < 2; i++) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter ID:");
            int st_id = scan.nextInt();

            System.out.println("Enter Name: ");
            String st_n = scan.next();

            System.out.println("Enter cgpa: ");
            float st_cgpa = scan.nextFloat();

            if (st_cgpa > 3.80) {

                System.out.println("Enter no of courses: ");
                int st_courses = scan.nextInt();
                obj_TA[kk] = new TA(st_id, st_n, st_cgpa, st_courses);
                kk++;
            } else {
                obj[i] = new UIUPeople(st_id, st_n, st_cgpa);
            }

        }
        
        
        for (int j = 0; j< obj_TA.length; j++) {
            System.out.println("Name: "+obj_TA[j].name + " ID: "+ obj_TA[j].ID+ " cgpa: "+ obj_TA[j].cgpa+" salary: "+obj_TA[j].salary );
        }

    }

}

class UIUPeople {

    int ID;
    String name;
    float cgpa;

    UIUPeople(int id, String n, float cgpa) {
        this.ID = id;
        this.name = n;
        this.cgpa = cgpa;

    }
}

class TA extends UIUPeople {

    static boolean lenght;

    int salary;

    public TA(int id, String n, float cgpa, int c) {
        super(id, n, cgpa);
        this.salary = c * 8000;
    }

    void get_salary() {
        System.out.println(this.salary);
    }
}
