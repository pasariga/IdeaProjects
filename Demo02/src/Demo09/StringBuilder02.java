package Demo09;

public class StringBuilder02 {
    public static void main(String[] args) {
        String str ="hello";
        String s = reverseString(str);
        System.out.println(s);


    }
    public static String reverseString(String arr){
        StringBuilder sb=new StringBuilder(arr);
        sb.reverse();
        return sb.toString();
    }
}
