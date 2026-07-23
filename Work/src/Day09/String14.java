package Day09;

public class String14 {
    public static void main(String[] args) {
        String s= "a1b2c3";
        int result = NumSum(s);
        System.out.println(result);
    }
    public static int NumSum(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c>='0'&&c<='9'){
            sum+=c-'0';
            }
        }
        return sum;
    }
}
