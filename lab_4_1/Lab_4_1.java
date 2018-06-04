/*
 * 
 * An array of 20 random integer segments ["+ a +"; "+ b +"]
 * 
 */
package lab_4_1;

/**
 *
 * @author UI3es
 */
public class Lab_4_1 {

    private Lab_4_1() {
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
        System.out.println("An array of 20 random integer segments [\"+ a +\"; \"+ b +\"]:");

        int[] randNums = new int[20];
        for(int i = 0; i < randNums.length; ++i)
            randNums[i] = Lab_4_1.getRandom(a, b);

        Lab_4_1.printArray(randNums);
        
    }
    
}
