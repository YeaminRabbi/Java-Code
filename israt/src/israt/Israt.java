/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package israt;

/**
 *
 * @author Rabbi
 */
public class Israt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car x = Car.getInstance();
	Car y = Car.getInstance();


	System.out.println("Hashcode of x is "+ x.hashCode());
        System.out.println("Hashcode of y is "+ y.hashCode());

	if (x == y) {
            System.out.println("Two objects point shares the same memory location");
        }
 
        else {
           
            System.out.println("Two objects shares different memory location");
        }
    }
    
}


class Car{
    private static Car single_instance = null;
    public String str;
    private Car()
    {
        str = "This is a Singleton class";
    }

    public static Car getInstance()
    {
        if (single_instance == null)
            single_instance = new Car();
 
        return single_instance;
    }
}