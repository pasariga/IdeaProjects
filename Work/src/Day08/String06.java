package Day08;

public class String06 {
    public static void main(String[] args) {
        String s="hello";
        int result = countL(s);
        System.out.println(result);
    }
    public static int countL(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='l'){
                count++;
            }
        }
        return count;
    }
}
