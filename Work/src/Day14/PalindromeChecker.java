package Day14;

public class PalindromeChecker {
    private String word1;
    private String word2;
    public PalindromeChecker(String word1, String word2) {
        this.word1 = word1;
        this.word2 = word2;
    }

    public String getWord1() {
        return word1;
    }

    public void setWord1(String word1) {
        this.word1 = word1;
    }

    public String getWord2() {
        return word2;
    }

    public void setWord2(String word2) {
        this.word2 = word2;
    }

    public static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker(null, null);
        p1.setWord1("sdhauhduhdu");
        System.out.println(p1.getWord1());
        System.out.println(p1.isPalindrome(p1.getWord1()));
    }
}
