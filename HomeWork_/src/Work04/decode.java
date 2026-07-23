package Work04;

public class decode {
    public static void main(String[] args) {
        String sourceString = "你好";
        String encodeString = encode(sourceString);
        String decodeString = decode(encodeString);
        System.out.println("源码是："+sourceString);
        System.out.println("编码是："+encodeString);
        System.out.println("解码是："+decodeString);
    }
    public static String encode(String sourceString) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sourceString.length(); i++) {
            char ch = sourceString.charAt(i);
            result.append((char)(ch+8));
        }
        return result.toString();
    }
    public static String decode(String sourceString) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sourceString.length(); i++) {
            char ch = sourceString.charAt(i);
            result.append((char)(ch-8));
        }
        return result.toString();
    }
}
