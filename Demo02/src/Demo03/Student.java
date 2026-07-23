package Demo03;

public class Student {
    private  String name;
    public  Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void readBook(Book book) {
        System.out.println(name+" got the book and is reading book happily.");
    }
}
