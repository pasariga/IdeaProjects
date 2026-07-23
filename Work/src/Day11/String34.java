package Day11;

public class String34 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = NoRepeat(s);
        System.out.println(result);
    }
    public static int NoRepeat(String s) {
        int max = 0;
        int left = 0;
        int len = s.length();
        for(int i=0;i<len;i++){
            for(int j=left;j<i;j++){
                if(s.charAt(i)==s.charAt(j)){
                    left=j+1;
                    break;
                }
            }
            int lenth = i-left+1;
            if(lenth>max){
                max=lenth;
            }
        }
        return max;
    }
}
