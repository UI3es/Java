/*
 *
 * Input value A and B to for build output a rectangle.
 *
 */
package lab_2_2;
import java.util.Scanner;

/**
 *
 * @author UI3es
 */
public class Lab_2_2 {

    private Lab_2_2() {
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
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Enter A (row) and B (col) to for build a rectangle: ");

        int 
            row = Lab_2_2.getInt(),
            col = Lab_2_2.getInt();
        
        for (
            int i = 0;
            i < row;
            ++i
        ) {
        for (
            int j = 0;
            j < col;
            ++j
        )
            System.out.print("|");
        System.out.println();
        }
        
    }
    
}
