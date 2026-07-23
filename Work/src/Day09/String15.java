package Day09;

public class String15 {
    public static void main(String[] args) {
        String s="a1b8c3";
        int result = maxDigit(s);
        System.out.println(result);
    }
    public static int maxDigit(String s) {
        int max = -1;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='0'&&c<='9'){
                int num = c-'0';
                if(max<num){
                    max=num;
                }
            }
        }
        return max;
    }
}
