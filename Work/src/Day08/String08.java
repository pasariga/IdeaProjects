package Day08;

public class String08 {
    public static void main(String[] args) {
        String s = "a1b2c3";
        int result = countDigit(s);
        System.out.println(result);
    }
    public static int countDigit(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                count++;
            }
        }
        return count;
    }
}
