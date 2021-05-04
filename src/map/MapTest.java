package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    public static void main(String[] args){
        Map<Integer, String> a = new HashMap<>();
        a.put(1, "A");
        a.put(2, "B");
        a.put(3, "C");

        for (Integer integer : a.keySet()) {
            System.out.println(a.get(integer));
        }

        for (Map.Entry<Integer, String> integer : a.entrySet()) {
            System.out.println("key=" + integer.getKey() + ", value=" + integer.getValue());
        }

        Iterator<Integer> iterator = a.keySet().iterator();
        while(iterator.hasNext()){
            System.out.println(a.get(iterator.next()));
        }
    }
}
