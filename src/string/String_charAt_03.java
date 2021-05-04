package string;

public class String_charAt_03 {
    public static void main(String[] args){
        String[] strings = {"test", "teacher"};
        System.out.println(new String_charAt_03().solve(strings));
    }

    public String solve(String[] strs){
        if(strs.length == 0){
            return "";
        }

        //1 test
        String firstStr = strs[0];

        for(int i=1; i<strs.length; i++){
            while(strs[i].indexOf(firstStr) != 0){
                firstStr = firstStr.substring(0, firstStr.length() -1);
            }
        }
        return firstStr;
    }
}
