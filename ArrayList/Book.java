package ArrayList;
import java.util.*;

public class Book {
    int id;
    String name;
    String author;
    String publisher;
    public Book(int id, String name, String author, String publisher){
        this.id= id;
        this.name= name;
        this.author= author;
        this.publisher = publisher;
    }
    public static void main(String[] args) {
        ArrayList <Book> list= new ArrayList<Book>();
        Book b1= new Book(123, "Persuasion", "Jane  Austen", "Penguin Books");
        list.add(b1);
        for(Book b:list){
            System.out.println("ID : "+b.id+"\nName :"+b.name +"\nAuthor :" +b.author+"\nPublisher : "+b.publisher);
        }
    }
}
