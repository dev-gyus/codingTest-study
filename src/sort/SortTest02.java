package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class SortTest02 {
    public static void main(String[] args) {
        Interval in1 = new Interval(1, 3);
        Interval in3 = new Interval(8, 10);
        Interval in2 = new Interval(2, 6);
        Interval in4 = new Interval(15, 18);

        List<Interval> intervals = new ArrayList<>();
        intervals.add(in1);
        intervals.add(in2);
        intervals.add(in3);
        intervals.add(in4);

        SortTest02 a = new SortTest02();
    }

    public List<Interval> merge(List<Interval> intervals){
        if(intervals.isEmpty()){
            return intervals;
        }

        //1.sorting (값을 먼저 정렬시키고 비교를 하기위함)
        Collections.sort(intervals, (a, b) -> a.start - b.start); // 오름차순 정렬
//        Collections.sort(intervals, new Comparator<Interval>() {
//            @Override
//            public int compare(Interval o1, Interval o2) {
//                return o1.start - o2.start; // 오름차순
//            }
//        });
        List<Interval> result = new ArrayList<>();
        Interval before = intervals.get(0);
        for(int i=1; i < intervals.size(); i++){
            Interval current = intervals.get(i);
            if(before.end >= current.start){
                before.end = Math.max(current.end, before.end);
            }else{
                result.add(before);
                before = current;
            }
        }
        // 마지막 인덱스 부분이 포함되지 않을경우가 있을 수 있음
        if(!result.contains(before)){
            result.add(before);
        }
        return result;
    }
}
