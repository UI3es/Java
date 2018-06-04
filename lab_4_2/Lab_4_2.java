/*
 * 
 * 5 arrays of 10 random integer elements of the segment ["+ a +"; "+ b +"]
 * 
 */
package lab_4_2;

/**
 *
 * @author UI3es
 */
public class Lab_4_2 {

    private Lab_4_2() {
        throw new AssertionError();
    }

    public static int getRandom(int lval, int rval) {
        return (int) Math.round((Math.random() * (rval - lval) + lval ));
    }
    
    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; ++i)
            System.out.print(Integer.toString(array[i]) + " ");
        System.out.println();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 0, b = 20;
        System.out.println("5 arrays of 10 random integer elements of the segment [\"+ a +\"; \"+ b +\"]:");

        for(int i = 0; i < 5; ++i) {
            int[] randNums = new int[10];
            for(int j = 0; j < randNums.length; ++j)
                randNums[j] = Lab_4_2.getRandom(a, b);
            Lab_4_2.printArray(randNums);
        }
        
    }
    
}
