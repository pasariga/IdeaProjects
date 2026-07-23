package String;

import java.util.ArrayList;

public class StringProcessor {
    long testStringPlus(int count){
        long start=System.currentTimeMillis();
        String s="";
        for(int i=0;i<count;i++){
            s+=i;
        }
        long end=System.currentTimeMillis();
        return end-start;
    }
    long testStringBuilder(int count){
        long start=System.currentTimeMillis();
        StringBuilder s=new StringBuilder();
        for(int i=0;i<count;i++){
            s.append(i);
        }
        String str=s.toString();
        long end=System.currentTimeMillis();
        return end-start;
    }
    String formatList(ArrayList<String> words){
        StringBuilder s=new StringBuilder();
        s.append("[");
        for(int i=0;i<words.size();i++){
            s.append(words.get(i));
            //如果当前不是最后一个单词，就加“,”
            if(i!=words.size()-1){
                s.append(",");
            }
        }
        s.append("]");
        return s.toString();
    }

}
