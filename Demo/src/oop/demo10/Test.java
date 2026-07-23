package oop.demo10;

public class Test {
    public static void main(String[] args) {
        //没有名字去初始化类,不用将实例保存到变量中
        new Apple().eat();
        new UserService() {

            @Override
            public void hell0() {

            }
        };
    }
}
class Apple{
    public void eat(){
        System.out.println("1");
    }
}
interface UserService{
    void hell0();
}
