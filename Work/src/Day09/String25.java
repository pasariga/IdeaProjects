package Day09;

public class String25 {
    public static void main(String[] args) {
        String s= "hello";
        String result = removeDuplicate(s);
        System.out.println(result);
    }
    public static String removeDuplicate(String s){
        String duplicate = "";
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            boolean flag = true;
            for(int j=0;j<i;j++){
                char ch2 = s.charAt(j);
                if(ch1==ch2){
                    flag = false;
                    break;
                }
            }
            if(flag){
                duplicate+=ch1;
            }
        }
        return duplicate;
    }
}
