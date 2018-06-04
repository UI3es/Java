/*
 * 
 * The name of the horse
 * 
 */
package lab_6_1;
import java.util.Scanner;

class Hoss {
    protected String name;

    public Hoss() {
        name = Lab_6_1.getIn(
            "The name of the horse: ",
            "\\w{3,}", 
            "Invalid name! Try again..."
        );
    }
}
class Pegas extends Hoss {

    public void fly() {
        System.out.println("I believe this  " + name + " the horse can fly...");
    }
}

/**
 *
 * @author UI3es
 */
public class Lab_6_1 {

    private Lab_6_1() {
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
        
        Pegas p = new Pegas();
        p.fly();
        
    }
    
}
