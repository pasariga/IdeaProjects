package Day10;

public class String30 {
    public  static void main(String[] args) {
        String s1 = "hello";
        String s2 = "ell";
        boolean result = isContains(s1,s2);
        System.out.println(result);
    }
    public static boolean isContains(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        for(int i=0;i<=len1-len2;i++){
            boolean flag = true;
            for(int j=0;j<len2;j++){
                if(s1.charAt(i+j)!=s2.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return true;
            }
        }
        return false;
    }
}
