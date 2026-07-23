package Day10;

public class String29 {
    public static void main(String[] args) {

        String s1="abcdefg";
        String s2="gfedcbe";
        boolean result = isSameChar(s1,s2);
        System.out.println(result);
    }
    public static boolean isSameChar(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            int count1 = 0;
            int count2 = 0;
            char ch = s1.charAt(i);
            for(int j=0;j<s1.length();j++){
                if(ch==s1.charAt(j)){
                    count1++;
                }
            }
            for(int j=0;j<s2.length();j++){
                if(ch==s2.charAt(j)){
                    count2++;
                }
            }
            if(count1!=count2){
                return false;
            }

        }
        return true;
    }
}
