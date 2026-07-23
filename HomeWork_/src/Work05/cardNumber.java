package Work05;

public class cardNumber {
    public static void main(String[] args){
        String cardNumber = "11010119900307789X";
        String year=cardNumber.substring(6,10);
        int month=Integer.parseInt(cardNumber.substring(10,12));
        int  day=Integer.parseInt(cardNumber.substring(12,14));
        System.out.println("出生年："+year);
        System.out.println("月："+month);
        System.out.println("日："+day);
    }
}
