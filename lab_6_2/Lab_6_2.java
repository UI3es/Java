/*
 * 
 * Pets
 * 
 */
package lab_6_2;
import java.util.Scanner;

class Pet {
    
    protected int age, weight;
    protected boolean isMale;

    public Pet() {
        age = Integer.parseInt(Lab_6_2.getIn(
            "Age of the pet: ",
            "\\d+",
            "Invalid age! Try again...")
        );

        weight = Integer.parseInt(Lab_6_2.getIn(
            "Pet weight: ",
            "\\d+",
            "Invalid wight! Try again...")
        );

        String isMaleKey = "y";
        String isMaleAns = Lab_6_2.getIn(
            "Sex of the pet (M by default)? ("+ isMaleKey +" if M): ",
            "\\w+",
            "Invalid male! Try again..."
        );
        isMale = (isMaleAns.equals(isMaleKey)) ? true : false;
    }
}
class Cat extends Pet {	
    
    private String name;	
    
    public void changeName(String name) {
            this.name = name;
    }
    
    public String getName() {
            return name;
    }

    public String getInfo() {
            String maleAns = (isMale) ? "M" : "F";
            return 
            "Cat " + name + " it's a pet."
            + "His age " + age + " and " + weight + " his weight."
            + "He also " + maleAns + ".";
    }
}

class Dog extends Pet {
		
    public String name;	

    public String getInfo()
    {
        String maleAns = (isMale) ? "М" : "F";
        return 
        "Dog " + name + " it's a pet."
        + " His age " + age + " and " + weight + " his weight."
        + " he also " + maleAns + ".";
    }
}

/**
 *
 * @author UI3es
 */
public class Lab_6_2 {

    private Lab_6_2() {
        throw new AssertionError();
    }

    public static Scanner sc = new Scanner(System.in);

    public static String getIn(String help, String ptrn, String invalid) {
        System.out.println(help);

        while (!sc.hasNext(ptrn)){
            sc.next();
            System.out.println(invalid);
        }
        return sc.next();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cat cat = new Cat();
        
        cat.changeName(Lab_6_2.getIn(
            "Cat name: ",
            "\\w{3,}", 
            "Invalid name! Try again...")
        );
        
        System.out.println(cat.getInfo());

        Dog dog = new Dog();
        
        dog.name = Lab_6_2.getIn(
            "Dog's name: ",
            "\\w{3,}", 
            "Invalid name! Try again..."
        );
        
        System.out.println(dog.getInfo());
        
    }
    
}
