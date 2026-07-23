package Day09;

public class String21 {
    public static void main(String[] args) {
        String s = "hello";
        int result = firstindex(s,'l');
        System.out.println(result);
    }
    public static int firstindex(String s,char ch){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                return i;
            }
        }
        return -1;
    }
}
