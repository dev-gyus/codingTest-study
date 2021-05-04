package array_2d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Convert_List_to_2DArray {
    public static void main(String[] args){
        Convert_List_to_2DArray a = new Convert_List_to_2DArray();

        int[][] array = new int[3][];
        array[0] = new int[2];
        array[1] = new int[3];
        array[2] = new int[4];
        for(int i=0; i < array.length; i++){
            for (int j=0; j < array[i].length; j++){
                array[i][j] = j;
            }
        }
        List<List<Integer>> lists = a.converList(array);
        System.out.println(a.converList(array));
        System.out.println(a.printArray(a.convertArray(lists)));

    }

    public List<List<Integer>> converList(int[][] a){
        List<List<Integer>> result = new ArrayList<>();

        for(int iter=0; iter < a.length; iter++){
            List<Integer> tempList = new ArrayList<>();
            for (int j=0; j < a[iter].length; j++){
                tempList.add(a[iter][j]);
            }
            result.add(tempList);
        }
        return result;
    }

    public int[][] convertArray(List<List<Integer>> list){
        // Array의 length는 불변(immutable)이기때문에 Array의 Length를 정하는 과정이 필요함
        // List는 size가 유동적으로 변함(mutable)
        int size = list.size();
        int[][] result = new int[size][];

        for (int a=0; a < list.size(); a++) {
            int[] tempArray = new int[list.get(a).size()];
            List<Integer> integers = list.get(a);
            for(int b=0; b < integers.size(); b++){
                tempArray[b] = integers.get(b);
            }
            result[a] = tempArray;
        }
        return result;
    }

    public String printArray(int[][] a){
        String result = "";
        for(int i=0; i < a.length; i++){
            result += "[";
            for (int j=0; j < a[i].length; j++){
                if(j < a[i].length-1) {
                    result += j + ",";
                }else {
                    result += j ;
                }
            }
            result += "]";
        }
        return result;
    }
}
