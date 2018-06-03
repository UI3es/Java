/*
 *
 * Input two number for to find least.
 *
 */
package lab_2_4;
import java.util.Scanner;

/**
 *
 * @author UI3es
 */
public class Lab_2_4 {

    private Lab_2_4() {
        throw new AssertionError();
    }

    static Scanner sc = new Scanner(System.in);

    static public int getInt() {
        while(!sc.hasNextInt()) {
            System.out.println("Invalid data!");
            sc.next();
        }
        return sc.nextInt();
    }
    
    static public int getMin(int a, int b) {
        return (b < a) ? b : a;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Input two number for output least: ");

        int
            a = Lab_2_4.getInt(),
            b = Lab_2_4.getInt();
            
            System.out.print("Least: ");
        System.out.println(Lab_2_4.getMin(a,b));	
        
    }
    
}
