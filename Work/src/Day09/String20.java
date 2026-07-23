package Day09;

public class String20 {
    public static void main(String[] args) {
        String s = "abcba";
        boolean result = countdownReverse(s);
        System.out.println(result);
    }
    public static boolean countdownReverse(String s){
        String reverse = "";
        for(int i=s.length()-1;i>=0;i--){
            reverse+=s.charAt(i);
        }
       return reverse.equals(s);
    }
}
