package Day14;

public class removeChar {
    public static String removeChar(String s,char target){
        String result="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=target){
                result+=s.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(removeChar("Taylor",'y'));
    }
}
