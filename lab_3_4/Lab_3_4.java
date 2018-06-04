/*
 * 
 * Odd elements Two-dimensional array 8x5 from random integer segments [10; 99]
 * 
 */
package lab_3_4;

/**
 *
 * @author UI3es
 */
public class Lab_3_4 {

    private Lab_3_4() {
        throw new AssertionError();
    }
    
    static void randomFillArray(int[][] array, int lval, int rval) {
        for(int i = 0; i < array.length; ++i)
            for(int j = 0; j < array[i].length; ++j)
                array[i][j] = (int) Math.round(Math.random() * (rval-lval) + lval);
    }
    
    static void randomFillArray(int[] array, int lval, int rval) {
        for(int i = 0; i < array.length; ++i)
            array[i] = (int) Math.round(Math.random() * (rval-lval) + lval);
    }
    
    static void printArray(int[][] array) {
        for(int i = 0; i < array.length; ++i) {
            for(int j = 0; j < array[i].length; ++j) {
                System.out.print(Integer.toString(array[i][j]) + "\t");
            }
            System.out.println();
        }
    }
    
    static void printArray(int[] array, String spliter) {
        for(int i = 0; i < array.length; ++i)
            System.out.print(Integer.toString(array[i]) + spliter);
        System.out.println();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Odd elements Two-dimensional array 8x5 from random integer segments [10; 99]:");
        int row = 8, col = 5;
        int[][] nums = new int[row][col];
        Lab_3_4.randomFillArray(nums, 10, 99);
        Lab_3_4.printArray(nums);
        
    }
    
}
