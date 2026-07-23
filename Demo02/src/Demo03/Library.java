package Demo03;

public class Library {
    private Book[] books;
    public Library() {
        books=new Book[3];
        books[0]=new Book("Romantics");
        books[1]=new Book("The Lord of Ring");
        books[2]=new Book("Classical");
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
    public void lendBook(String targetTitle,Student student){
        for(int i=0;i<books.length;i++){
            if(books[i].getTitle().equals(targetTitle)){
                if(!books[i].isBorrowed()){
                    books[i].setBorrowed(true);
                    System.out.println(books[i].getTitle()+" borrowed successfully.");
                    student.readBook(books[i]);
                    return;
                }
                else{
                    System.out.println(books[i].getTitle()+" has been Borrowed.");
                    return;
                }
            }
        }
        System.out.println("Oops,we don't have such book.");

    }
    public void lendBook(Book targetBook,Student student){
        if(targetBook.isBorrowed()){
            System.out.println("It has been borrowed.");
        }
        else{
            targetBook.setBorrowed(true);
            student.readBook(targetBook);
        }
    }

}
