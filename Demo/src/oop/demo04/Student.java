package oop.demo04;
//类 private:私有
public class Student {
    //属性私有
    //名字
    private String name;
    //学号
    private  int id;
    //性别
    private String gender;
    private int age;
    //提供一些可以操作这个属性的方法！

    //提供一些public的  get、set  方法

    //get获得这个数据
    public String getName(){
        return this.name;
    }

    //set给这个数据设置值
    public void setName(String name){
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<100){
            this.age = age;
        }
        else{
            this.age=3;
        }

    }
}
