package map;

import java.util.HashMap;
import java.util.Map;

public class MapTest_1 {
    public static void main(String[] args){
        String s = "inflearninlove";
        System.out.println("index = " + solve(s));
    }
    public static int solve(String s){
        //1. error check
        if(s.length() == 0 || s == null){
            return -1;
        }

        //2. 담을 그릇 data structure
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char character : chars) {
//            if(map.get(character) == null) {
//                map.put(character, 1);
//            }else{
//                int value = map.get(character);
//                map.put(character, ++value);
//            }

            // Map.getOrDefault() = Map에 Key값이 들어있으면 해당 값을 가져오고, 없으면 defaultValue를 가져옴
            map.put(character, map.getOrDefault(character, 0) + 1);

        }
        // Map.getKey() 안쓴이유 = Map은 순서 상관없이 저장되기때문에 첫번째 중복없는 문자를 가져오기위해선 문자열의 처음부터 탐색해야함
        for (Character character : chars) {
            if(map.get(character) == 1){
                return s.indexOf(character);
            }
        }
        return -1;
    }
}
