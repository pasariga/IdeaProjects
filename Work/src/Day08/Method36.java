package Day08;

public class Method36 {
    public static void main(String01[] args) {
        int result = countOdd(14,25);
        System.out.println(result);
    }
    public static int countOdd(int a, int b) {
        int count = 0;
        for (int i = Math.min(a,b)+1; i < Math.max(a,b); i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
