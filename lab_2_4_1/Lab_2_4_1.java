/*
 *
 * Verification Names
 *
 */
package lab_2_4_1;
import java.util.Scanner;

/**
 *
 * @author UI3es
 */
public class Lab_2_4_1 {

    private Lab_2_4_1() {
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
    
    static public String getName() {
        boolean isValidName;
        String name;
        do {
            isValidName = true;
            name = sc.nextLine();
            if (
                name.matches("\\W")
            ) {
                System.out.println("Invalid data!");
                isValidName = false;
            }
        } while (
            !isValidName
        );
        return name;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Enter two names for verification:");

        String firstName =
            Lab_2_4_1.getName(),
            secondName = Lab_2_4_1.getName();
        
        String resultMsg;

        if (
            firstName.equals(secondName)
        )
        resultMsg = "Identical names";
        
        else if (
            firstName.length() == secondName.length()
        )
        resultMsg = "Names are equal in length";
        
        else resultMsg = "Names do not match";

        System.out.println(resultMsg);
        
    }
    
}
