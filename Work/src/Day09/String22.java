package Day09;

public class String22 {
    public static void main(String[] args) {
        String s = "hello";
        int result = lastindex(s,'l');
        System.out.println(result);
    }
    public static int lastindex(String s,char ch){
        int n=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                n=i;
            }
        }
        return n;
    }
}
