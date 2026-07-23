package Day10;

public class String32 {
    public static void main(String[] args) {
        String s = "aaabbbcccccd";
        int result = sameLength(s);
        System.out.println(result);
    }
    public static int sameLength(String s) {
        int max = 0;
        int count = 0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                count=1;
            }
            if(count>max){
                max=count;
            }
        }
        return max;
    }
}
