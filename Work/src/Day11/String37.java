package Day11;

public class String37 {
    public static void main(String[] args) {
        String s ="112211";
        boolean result = reverse(s);
        System.out.println(result);
    }
    public static boolean reverse(String s) {
        for(int i=0;i<s.length()/2;i++){
            boolean flag=true;
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                flag=false;
                break;
            }
            if(flag){
                return true;
            }
        }
        return false;
    }
}
