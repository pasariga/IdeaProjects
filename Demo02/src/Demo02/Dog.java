package Demo02;

public class Dog {
     private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.out.println("警告");

        }
        else
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void bark(){
        System.out.println("汪汪，我叫"+name);
    }
    public  boolean isPuppy(){
        return age <=2 ;
    }
    public int calculateDogYears(){
        int multiplier=7;
        return age*multiplier;
    }
}
