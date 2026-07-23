package LibraryManagement;

import java.io.*;
import java.util.HashMap;

public class Library {
    HashMap<String,Book>bookMap=new HashMap<>();
    void addBook(Book book){
        //key for String,value for Book
        if(bookMap.containsKey(book.getId())){
            System.out.println("The book has already been added.");
        }
        else{
            bookMap.put(book.getId(),book);
        }
    }
    void borrowBook(String id){
        if(!bookMap.containsKey(id)){
            System.out.println("The book does not exist.");
        }
        else if(bookMap.get(id).isBorrowed()){
            System.out.println("The book has been borrowed.");
        }
        else{
            bookMap.get(id).setBorrowed(true);
            System.out.println("The book has been successfully borrowed.");
        }
    }
    void returnBook(String id){
        if(!bookMap.containsKey(id)){
            System.out.println("The book does not exist.");
        }
        else if(bookMap.get(id).isBorrowed()){
            bookMap.get(id).setBorrowed(false);
            System.out.println("The book has been returned.");
        }
        else{
            System.out.println("The book did not been borrowed.");
        }
    }
    void showAllBooks(){
        System.out.println("Total Books: "+bookMap.size());
        for(Book book:bookMap.values()){
            System.out.println(" Book id: "+book.getId()+" Book name:"+book.getTitle()+ "  Type: "+book.isBorrowed());
        }
    }
    void saveToFile() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("books.txt"));
            for (Book book : bookMap.values()) {
                String line= book.getId()+","+book.getTitle()+","+book.isBorrowed();
                bw.write(line);
                bw.newLine();
            }
            bw.close();
        }catch (IOException e){
            System.out.println("Error writing to file");
        }
    }
    void loadFromFile() {
        try {
            System.out.println(new java.io.File("books.txt").getAbsolutePath());
            BufferedReader br = new BufferedReader(new FileReader("books.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }

                String[] parts = line.split(",");
                String id = parts[0];
                String title = parts[1];
                boolean isBorrowed = Boolean.parseBoolean(parts[2]);
                Book book = new Book(id, title);
                book.setBorrowed(isBorrowed);
                bookMap.put(id, book);
                System.out.println("Books have been loaded.");
            }
            br.close();
        }catch (IOException e){
            System.out.println("books.txt does not exist.");
        }
    }
}
