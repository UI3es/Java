/*
 *
 * Array of numbers from 1 to 99 in the forward and reverse order
 *
 */
package lab_3_2;

/**
 *
 * @author UI3es
 */
public class Lab_3_2 {

    private Lab_3_2() {
        throw new AssertionError();
    }
    
    static int[] getEvenOddCount(int start, int end) {
        int evenCount = 0;
        int oddCount = 0;

        for(int i = start; i <= end; ++i) {
            if( i % 2 == 0) ++evenCount;
            else ++oddCount;
        }
        return new int[]{evenCount, oddCount};
    }
    
    static int[] getEvenOddCount(int[] array) {
        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i < array.length; ++i) {
            if(array[i] % 2 == 0) ++evenCount;
            else ++oddCount;
        }
        return new int[]{evenCount, oddCount};
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
        
        System.out.println("Array of numbers from 1 to 99 in the forward and reverse order:");

        int start = 1, end = 99;
        int oddCount = Lab_3_2.getEvenOddCount(start, end)[1];
        int[] nums = new int[oddCount];

        for(int i = start, j = 0; i <= end; ++i)
                if( (i % 10) % 2 != 0 )
                        nums[j++] = i;

        Lab_3_2.printArray(nums, " ");
        for(int i = nums.length - 1; i >= 0; --i)
                System.out.print(Integer.toString(nums[i]) + " ");
        System.out.println();
        
    }
    
}
