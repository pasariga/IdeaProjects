package LibraryManagement;

public class Book {
    private String id;
    private String title;
    private  boolean isBorrowed;
    public Book(String id,String title ){
        this.id = id;
        this.title = title;
    }
    public boolean setIsBorrowed(boolean isBorrowed){
       return  this.isBorrowed = isBorrowed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
