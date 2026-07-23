package Stream;

import java.util.ArrayList;

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("张三");
        names.add("王富贵");
        names.add("李四");
        names.add("王五");
        names.add("赵六");
        names.add("王炸");
        for(String name : names){
            if(name.startsWith("王")&&name.length()==2) {
                System.out.println(name);
            }
        }
        System.out.println("--- 下面是 Stream 流的输出 ---");
        names.stream().
                filter(name->name.startsWith("王"))
                .filter(name->name.length()==2)
                .forEach(name->System.out.println(name));
    }
}
