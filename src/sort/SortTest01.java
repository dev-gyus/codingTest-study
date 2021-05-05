package sort;

public class SortTest01 {
    public static void main(String[] args){
        String version1 = "8.5.2.4";
        String version2 = "8.5.3";

        compareToTest();
        System.out.println("solve = " + solve(version1, version2));
    }
    public static void compareToTest(){
        Integer a = 1, b = 3;
        System.out.println(a.compareTo(b));
    }
    public static int solve(String v1, String v2){
        // 1
        String[] v1StrArray = v1.split("\\.");
        String[] v2StrArray = v2.split("\\.");
        // 2
        int length = Math.max(v1StrArray.length, v2StrArray.length);
        for(int i=0; i < length; i++){
            // 3항 연산자 쓴이유 = v1과 v2의 길이가 서로 달라서 v1StrArray, v2StrArray의 배열 길이가 서로 다를경우
            // for를 도는 반복자의 최대값은 항상 제일 길이가 긴쪽이 되기 때문에 짧은쪽은 Exception발생하므로 0값으로 채워주기 위함
            Integer v1Int = i < v1StrArray.length ? Integer.parseInt(v1StrArray[i]) : 0;
            Integer v2Int = i < v2StrArray.length ? Integer.parseInt(v2StrArray[i]) : 0;

            int comp = v1Int.compareTo(v2Int);
            if(comp != 0){
                return comp;
            }
        }
        return 0;
    }
}
