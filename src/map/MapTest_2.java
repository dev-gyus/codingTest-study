package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest_2 {
    public static void main(String[] args){
        int[] nums = {1,1,2,2,2,3,5,5,5,5};
        int k = 2;
        System.out.println(solve(nums, k));
    }
    public static List<Integer> solve(int[] nums, int k){
        //1. 담을 그릇
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] list = new List[nums.length + 1];
        List<Integer> result = new ArrayList<>();

        //2. 맵에다가 getOrDefault()사용
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //3. List
        for(int key : map.keySet()){
            int topFrequent = map.get(key);
            if(list[topFrequent] == null){
                list[topFrequent] = new ArrayList<>();
            }
                list[topFrequent].add(key);
        }
        //4. List에서 뽑아내기 k=2
        for(int lastIndex=list.length - 1; lastIndex >= 0; lastIndex--){
            if(list[lastIndex] != null){
                for(int i=0; i < list[lastIndex].size() && result.size() < k; i++){
                    result.add(list[lastIndex].get(i));
                }
            }
        }
        return result;
    }
}
