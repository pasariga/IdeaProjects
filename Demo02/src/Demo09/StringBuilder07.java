package Demo09;

public class StringBuilder07 {
    public static void main(String[] args) {
    int[] scores={45,88,59,100,76,30};
        String s = appendFailScore(scores);
        System.out.println(s);
    }
    public static String appendFailScore(int[] scores){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<scores.length;i++){
            if(scores[i]<60){
                sb.append(scores[i]).append(" ");
            }
        }
        if(sb.length()>0){
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }

}
