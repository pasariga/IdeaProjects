package Demo03;

public class TestProject {
    public static void main(String[] args) {
        Library l1=new Library();
        Student s1=new Student("hikarisq");
        Student s2=new Student("Lukas");
        l1.lendBook(l1.getBooks()[0],s2);
        l1.lendBook(l1.getBooks()[0],s1);
    }
}
