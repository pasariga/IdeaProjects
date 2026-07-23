package Day09;

public class String17 {
    public static void main(String[] args) {
        String s = "1234a5";
        boolean result = isAllDigit(s);
        System.out.println(result);
    }
    public static boolean isAllDigit(String s){
        boolean flag = true;
        for(int i=0;i<s.length();i++){
            if(!(s.charAt(i)>='0'&&s.charAt(i)<='9')){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
