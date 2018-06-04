/*
 * 
 * Calculating the Fibonacci number
 * 
 */
package lab_4_4;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author UI3es
 */
public class Lab_4_4 {

    private Lab_4_4() {
        throw new AssertionError();
    }
    
    public static long fib(int index) {
        if(index < 1) return 0;
        if(index == 1) return 1;
        return fib(index-2) + fib(index-1);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int fibIndex = 0;
        long startTime;
        do {
            startTime = System.nanoTime();
            System.out.println("Index: " + fibIndex + " Value: " + Lab_4_4.fib(fibIndex++));
        } while(System.nanoTime() - startTime < TimeUnit.SECONDS.toNanos(60));

        System.out.println("Start from the position " + Integer.toString(fibIndex-2) + " the calculation of the Fibonacci number takes more than a minute");
        
    }
    
}
