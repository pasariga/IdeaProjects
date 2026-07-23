package Day08;

public class String05 {
    public static void main(String[] args) {
        String s="hello";
        int result=getLength(s);
        System.out.println(result);
    }
    public static int getLength(String s){
        return s.length();
    }
}
