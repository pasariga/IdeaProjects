package Day11;

public class String35 {
    public static void main(String[] args) {
        String s = "abcabcbbb";
        int result = NoRepeat(s);
        System.out.println(result);
    }
    public static int NoRepeat(String s) {
        int[] last = new int[128];
        for(int i = 0; i < 128; i++){
            last[i]=-1;
        }
        int max = 0;
        int left = 0;
        for(int i=0;i<s.length();i++){
            //c是字符
            char c = s.charAt(i);
            //如果出现相同的，则向后移动
            //记录上一个出现该字符的位置
            if(last[c]>=left){
                left=last[c]+1;
            }
            //当前字符在数组的位置为i
            last[c]=i;
            int len = i-left+1;
            if(len>max){
                max=len;
            }
        }
        return max;
    }
}
