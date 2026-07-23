package Day08;

public class String07 {
    public static void main(String[] args) {
        String s = "education";
        int result = countVowel(s);
        System.out.println(result);
    }
    public static int countVowel(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}
