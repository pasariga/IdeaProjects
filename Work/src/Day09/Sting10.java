package Day09;

public class Sting10 {
    public static void main(String[] args) {
        String s="AbCdeF";
        int result = countLower(s);
        System.out.println(result);
    }
    public static int countLower(String s) {
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                count++;
            }
        }
        return count;
    }
}
