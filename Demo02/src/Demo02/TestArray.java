package Demo02;

public class TestArray {
    public static void main(String[] args) {
        Book[] books =new Book[3];
        books[0]=new Book("Romantics",25);
        books[1]=new Book("The Lord of Ring",25);
        books[2]=new Book("Classical",25);
        for(int i = 0; i< books.length; i++) {
            System.out.println("Book Name:"+ books[i].getTitle()+","+"Book Price:"+ books[i].getPrice());
        }
    }
}
