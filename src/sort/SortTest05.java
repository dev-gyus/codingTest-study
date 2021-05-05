package sort;

import java.util.*;

public class SortTest05 {
    public static void main(String[] args){
        int k = 2;
        String[] words = {"a", "b", "c", "a", "b", "c", "a"};
        System.out.println(solve(words, k));
    }
    public static List<String> solve(String[] words, int k){
        // 1
        List<String> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        //1.map
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        //2.pq
        Queue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a,b) ->
                a.getValue() == b.getValue() ? a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue());

        //3.for
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.offer(entry);
        }
        while(k>0){
            result.add(pq.poll().getKey());
            k--;
        }

        return result;
    }
}
