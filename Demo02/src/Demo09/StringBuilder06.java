package Demo09;

public class StringBuilder06 {
    public static void main(String[] args) {
        int[] scores={45,88,59,100,76};
        String s = appendPassScore(scores);
        System.out.println(s);

    }
    public static String appendPassScore(int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=60){
                sb.append(arr[i]).append(" ");
            }
        }
        if(sb.length()>0){
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
}
