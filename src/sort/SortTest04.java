package sort;

import java.util.PriorityQueue;

public class SortTest04 {
    public static void main(String[] args){
        int[] sticks = { 1, 8, 2, 5 };
        System.out.println(pqSticks(sticks));
    }
    public static int pqSticks(int[] sticks){
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min
        for(int i : sticks){
            pq.offer(i);
        }
        int sum = 0;
        while(pq.size() > 1){
            int twoSum = pq.poll() + pq.poll();
            sum += twoSum;
            pq.offer(twoSum);
        }
        return sum;
    }
}
