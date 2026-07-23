package Day09;

public class String11 {
    public static void main(String[] args) {
        String s = "I love myself";
        int result = countSpace(s);
        System.out.println(result);
    }
    public static int countSpace(String s){
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }
        return count;
    }
}
