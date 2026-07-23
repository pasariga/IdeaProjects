package Day09;

public class String12 {
    public static void main(String[] str) {
        String s = "Abc123 Xy!";
        int result = countLetter(s);
        System.out.println(result);
    }
        public static int countLetter (String s){
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                    count++;
                }
            }
            return count;
        }
    }
