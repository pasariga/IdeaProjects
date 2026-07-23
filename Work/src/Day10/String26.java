package Day10;

public class String26 {
    public static void main(String[] args) {
        String s = "hello";
        singleTime(s);
    }
    public static void singleTime(String s) {

        for(int i=0;i<s.length();i++){
            boolean flag = true;
            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                int count = 0;
                for(int j=0;j<s.length();j++){
                    if(s.charAt(i)==s.charAt(j)){
                        count++;
                    }
                }
                System.out.println(s.charAt(i)+":"+count);
            }
        }
    }
}
