package string;

public class String_charAt_02 {
    public static void main(String[] args){
//        String s = "(a(b(c)d)";
        String s = ")()(";

        System.out.println(new String_charAt_02().solve(s));
    }
    public String solve(String s){
        // 1
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int openBrace = 0;

        // 2 openBrace = 1
        for (char c : s.toCharArray()){
            if(c == '('){
                openBrace++;
            }else if(c == ')'){
                if(openBrace == 0) continue;
                openBrace--;
            }
            sb.append(c); // sb = "(a(b(c)d)"
        }

        // 3
        for(int i = sb.length() - 1; i >=0; i--){
            if(sb.charAt(i) == '(' && openBrace-- > 0) continue;
            result.append(sb.charAt(i));
        }
        return result.reverse().toString();
    }
}
