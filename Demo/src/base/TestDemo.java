package base;

public class TestDemo {
        public static void main(String[] args) {
            for (int i = 1; i <=7; i++) {
                for(int j=7;j>=i;j--){
                    System.out.print(" ");
                }
                for(int j=3;j<i;j++){
                    System.out.print("*");
                }
                for(int j=3;j<i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
