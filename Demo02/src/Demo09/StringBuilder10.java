package Demo09;

public class StringBuilder10 {
    public static void main(String[] args) {
        double[] prices={94.4,34.34,2.3,23.3};
        String s = joinPrices(prices);
        System.out.println(s);
    }
    public static String joinPrices(double[] prices){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<prices.length;i++){
            if(i!=prices.length-1){
                sb.append(prices[i]).append("元,");
            }
            else{
                sb.append(prices[i]).append("元");
            }
        }
        return sb.toString();

    }
}
