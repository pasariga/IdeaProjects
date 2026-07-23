package Day09;

public class String23 {
    public static void main(String[] args) {
        String s = "hello";
        int result = count(s,'l');
        System.out.println(result);
    }
    public static int count(String s,char ch){
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
}
