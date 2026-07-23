package Work07;

public class Leetcode1047 {
    public String removeDuplicates(String s) {
        char[] res = toString().toCharArray();
        int j = 0;
        for (int i = 0; i < res.length; i++) {
            boolean flag = false;
            for (int k = 0; k < j; k++) {
                if (res[k]==res[i]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                res[j] = res[i];
                j++;
            }
        }
        for (int i = j; i < res.length; i++) {
            res[i] = 0;
        }
        return res.toString();
    }
}
