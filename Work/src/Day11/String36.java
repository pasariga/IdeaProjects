package Day11;

public class String36 {
    public static void main(String[] args) {
        String s = "hello";
        String result = countDown(s);
        System.out.println(result);
    }
    public static String countDown(String s) {
        String result = "";
        for(int i=s.length()-1;i>=0;i--){
        char c = s.charAt(i);
        result += c;
        }
        return result;
    }
}
