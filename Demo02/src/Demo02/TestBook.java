package Demo02;

public class TestBook {
    public static void main(String[] args) {
        Book b1=new Book("Romantics",25);
        b1.setPrice(-10);
        System.out.println(b1.getPrice());
    }
}
