package Day09;

public class String16 {
    public static void main(String[] args) {
     String s = "a1b23c4";
     int result = num(s);
     System.out.println(result);
    }
    public static int num(String s) {
        int n = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                n=n*10+s.charAt(i)-'0';
            }
        }
        return n;
    }
}
