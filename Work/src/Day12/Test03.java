package Day12;

public class Test03 {
    public static void main(String[] args) {
        Student s1 = new Student("Tom",18);
        Student s2 = new Student("Jack",20);
        Student s3 = new Student("Mike",16);
        Student s4 = new Student("Jerry",22);
        s1.bindRoommate(s2);
        s2.bindRoommate(s3);
        System.out.println(s1.getRoommate());
    }
}


