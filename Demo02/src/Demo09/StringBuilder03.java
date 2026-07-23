package Demo09;

public class StringBuilder03 {
    public static void main(String[] args) {
        String str="abc";
        boolean result=isSame(str);
        System.out.println(result);

    }
    public static boolean isSame(String str){
        StringBuilder sb=new StringBuilder(str);
        String reverse = sb.reverse().toString();
        return str.equals(reverse);
    }
}
