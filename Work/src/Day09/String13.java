package Day09;

public class String13 {
    public static void main(String[] str) {
        String s = "Abc123 Xy!";
        int result = countNull(s);
        System.out.println(result);
    }
    public static int countNull(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(c >= 'a' && c <= 'z'|| c >= 'A' && c <= 'Z'|| c >= '0' && c <= '9')) {
                count++;
            }
        }
        return count;
    }
}
