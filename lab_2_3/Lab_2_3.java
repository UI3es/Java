/*
 *
 * Through "for", output rectangular triangle in console 10x10.
 *
 */
package lab_2_3;

/**
 *
 * @author UI3es
 */
public class Lab_2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Rectangular triangle 10x10:");

        for (
            int i = 0;
            i < 10;
            ++i
        ) {
            for (
                int j = 0;
                j < 10;
                ++j
            ) {
                if(j > i) break;
                    else System.out.print("|");
            }
            System.out.println();
        }
        
    }
    
}