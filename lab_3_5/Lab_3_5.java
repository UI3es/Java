/*
 * 
 * Two-dimensional array 7x4 from random integer segments [-5; 5]
 * 
 */
package lab_3_5;

/**
 *
 * @author UI3es
 */
public class Lab_3_5 {

    private Lab_3_5() {
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
        
        System.out.println("Two-dimensional array 7x4 from random integer segments [-5; 5]:");
        int row = 7, col = 5;
        int[][] nums = new int[row][col];
        Lab_3_5.randomFillArray(nums, -5, 5);
        Lab_3_5.printArray(nums); 
        int[] mulRows = new int[]{1, 1, 1, 1, 1, 1, 1};
        for(int i = 0; i < nums.length; ++i){
            for(int j = 0; j < nums[i].length; ++j)
                mulRows[i] *= nums[i][j];
            mulRows[i] = Math.abs(mulRows[i]);
        }
        
        int indexOfBiggest = 0;
        for(int i = 1; i < mulRows.length; ++i)
            if(mulRows[i] > mulRows[indexOfBiggest])
                indexOfBiggest = i;
        System.out.println("The greatest product of elements of a line modulo: "
            + Integer.toString(mulRows[indexOfBiggest]) + "\n"
            + "The string below the index: "
            + Integer.toString(indexOfBiggest)
        );
        
    }
    
}
