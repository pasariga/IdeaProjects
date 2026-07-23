package String;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StringProcessor sp = new StringProcessor();
        //String+=及其浪费时间
        System.out.println("StringPlus:"+sp.testStringPlus(100000));
        //StringBuilder结合append极大压缩了时间
        System.out.println("StringBuilder:"+sp.testStringBuilder(100000));
        ArrayList<String> list = new ArrayList<>();
        list.add("hikarisq");
        list.add("lukas");
        list.add("pasariga");
        String result = sp.formatList(list);
        System.out.println(result);
    }
}
