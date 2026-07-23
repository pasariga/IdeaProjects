package Work09;

public class Leetcode1309 {
    public String freqAlphabets(String s) {
        StringBuilder  sb=new StringBuilder();
        char[] arr=s.toCharArray();
        int len=arr.length;
        for (int i = 0; i < len; i++) {
            if(arr[i]=='#') {
                int x = (int) arr[i - 1] - '0';
                int y = (int) arr[i - 2] - '0';
                int res = x + y * 10;
                char c = (char) (res + 'a' - 1);
                sb.append(c);
                i -= 2;
            }
            else {
                int res= (int) arr[i] - '0';
                char c = (char) (res + 'a'-1);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
