package string;

public class String_charAt_04 {
    public static void main(String[] args){
        String s = "bananas";
        System.out.println(new String_charAt_04().solve(s));
    }

    public String solve(String str){
        if(str.length() == 1) return str;
        return "";
    }

}
