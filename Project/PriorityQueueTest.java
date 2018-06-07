/*
 * 
 * Priority Queue
 * 
 */
package com.concretepage;
import java.util.Comparator;
import java.util.PriorityQueue;

class PriorityQueueComparator implements Comparator<String>{
    public int compare(String s1, String s2) {
    if (s1.length() < s2.length()) {
        return -1;
    }
    if (s1.length() > s2.length()) {
        return 1;
    }
    return 0;
    }
}

/**
 *
 * @author UI3es
 */
public class PriorityQueueTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PriorityQueueComparator pqc=new PriorityQueueComparator();
        PriorityQueue<String> pq=new PriorityQueue<String>(5,pqc);
        pq.add("ABC");
        pq.add("BD");
        pq.add("ABCD");
        for(String s:pq){ 
            System.out.println(s);
        }
    }
    
}
