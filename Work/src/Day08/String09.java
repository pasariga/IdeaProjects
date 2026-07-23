package Day08;

public class String09 {
    public static void main(String[] args) {
        String s = "AbCdeF";
        int result = countUpper(s);
        System.out.println(result);
    }
    public static int countUpper(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c>='A' && c<='Z'){
                count++;
            }
        }
        return count;
    }
}
