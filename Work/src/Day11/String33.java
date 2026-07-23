package Day11;

public class String33 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = maxNoRepeat(s);
        System.out.println(result);
    }
    public static int maxNoRepeat(String s) {
        int len = s.length();
        int max = 0;
        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = i ; j < len; j++) {
                boolean flag = true;
                //检查在j之前的字符有没有和j重复的
                for (int k =  i; k < j; k++) {
                    if (s.charAt(j) == s.charAt(k)) {
                        flag = false;
                        break;
                    }
                }
                if (!flag) {
                    break;
                }
                count++;
                if (count > max) {
                    max = count;
                }
            }
        }
        return max;
    }
}
