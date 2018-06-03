/*
 *
 * Output of even numbers across "for".
 *
 */
package lab_2_1;

/**
 *
 * @author UI3es
 */
public class Lab_2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Output of even numbers across 'for':");

        for (
            int i = 1;
            i <= 100; ++i
        )
        if  (i%2==0)
                System.out.print(Integer.toString(i)+' ');
        System.out.println();
    }
    
}
