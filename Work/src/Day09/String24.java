package Day09;

public class String24 {
    public static void main(String[] args) {
        String s = "hello";
        int result = diffcount(s);
        System.out.println(result);
    }
    public static int diffcount(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean flag = true;
            char n1 = s.charAt(i);
            for (int j = 0; j < i; j++) {
                char n2 = s.charAt(j);
                if(n1 == n2) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                count++;
            }
        }
        return count;
    }
}
