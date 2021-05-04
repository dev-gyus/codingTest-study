package string;

public class String_charAt_01 {
    public static void main(String[] args){
        String nums1 = "123";
        String nums2 = "888";
        System.out.println(
                new String_charAt_01().solve(nums1,nums2)
        );
    }
    public String solve(String nums1, String nums2){
        // 1
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int num1Length = nums1.length() - 1; // 2
        int num2Length = nums2.length() - 1; // 2

        // 2
        while(num1Length >= 0 || num2Length >= 0){
            int n1 = 0, n2 = 0;
            if(num1Length >= 0){
                n1 = nums1.charAt(num1Length) - '0'; // nums1의 num1Length값에 해당하는 값이 int형으로 묵시적형변환일어남
            }
            if(num2Length >= 0){
                n2 = nums2.charAt(num2Length) - '0'; // nums2의 num2Length값에 해당하는 값이 int형으로 묵시적형변환일어남
            }
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            sb.append(sum % 10);
            num1Length--;
            num2Length--;
        }
        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
