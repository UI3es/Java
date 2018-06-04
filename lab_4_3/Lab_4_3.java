/*
 * 
 * Sorting an array of 10 random integer segments ["+ a +"; "+ b +"]
 * 
 */
package lab_4_3;

/**
 *
 * @author UI3es
 */
public class Lab_4_3 {

    private Lab_4_3() {
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
    
    public static void sortArray(int[] array, boolean isAsc) {

        for(int i = 1; i < array.length; ++i)
            for(int j = i; j > 0; --j) {
                if(	!isAsc && array[j] > array[j-1]
                    || isAsc && array[j] < array[j-1] ) {
                        int tmp = array[j];
                        array[j] = array[j-1];
                        array[j-1] = tmp;
                } else break;	   
            }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 0, b = 20;
        System.out.println("Sorting an array of 10 random integer segments [\"+ a +\"; \"+ b +\"]:");

        int[] randNums = new int[10];
        for(int j = 0; j < randNums.length; ++j)
            randNums[j] = Lab_4_3.getRandom(a, b);
        Lab_4_3.printArray(randNums);

        Lab_4_3.sortArray(randNums, true);
        Lab_4_3.printArray(randNums);
        Lab_4_3.sortArray(randNums, false);
        Lab_4_3.printArray(randNums);
        
    }
    
}
