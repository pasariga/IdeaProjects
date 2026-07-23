package Day09;

public class String18 {
    public static void main(String[] args) {
        String s ="abcba";
        boolean result = isSymmetry(s);
        System.out.println(result);
    }
    public static boolean isSymmetry(String s){
        boolean flag = true;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                flag = false;
            }
        }
        return flag;
    }
}
