package Demo01;

public class The_Multiplication_Table {
    public static void main(String[] args) {
        for(int j=1;j<10;j++) {
            for (int k = 1; k <= j; k++) {
                System.out.print(k+"*"+j+"="+j*k+"  ");
            }
            System.out.println();
        }
    }
}
