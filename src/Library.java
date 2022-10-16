import java.util.ArrayList;

class Book {
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book {" +
                "name = '" + name + '\'' +
                " ,author = ' " + author + '\''+
                '}' ;
    }
}
class MyLibrary{
    public ArrayList <Book> books;
    public MyLibrary(ArrayList<Book> books){
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("The book has been added to the library");
        this.books.add(book);
    }
    public void issueBook(Book book,String issued_to){
        System.out.println("The book has been issued from the library to " + issued_to);
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("The book has been returned");
        this.books.add(b);
    }
}
public class Library {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Malegalalli madhumagalu","Kuvempu");
        bk.add(b1);
        Book b2 = new Book("Wings of Fire","APJ Abdul Kalam");
        bk.add(b2);
        Book b3 = new Book("Parva","S L Bhairappa");
        bk.add(b3);
        MyLibrary myl = new MyLibrary(bk);
        myl.addBook(new Book("Chidambara Rahasya","K Poornachandra Thejasvi"));
        System.out.println(myl.books);
        myl.issueBook(b3,"Prajwal");
        System.out.println(myl.books);
    }
}
