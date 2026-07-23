package Demo09;

public class StringBuilder08 {
    public static void main(String[] args) {
    int[] scores={45,88,59,100,76,30};
        String s = appendHighScore(scores);
        System.out.println(s);


    }
    public static String appendHighScore(int[] scores){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<scores.length;i++){
            if(scores[i]>80){
                sb.append(scores[i]).append(" ");
            }
        }
        if(sb.length()>0){
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
}
