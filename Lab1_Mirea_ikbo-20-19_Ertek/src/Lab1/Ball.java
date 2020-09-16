package Lab1;
import java.lang.*;
public class Book {
    private String author;
    private int year;

    public Book(String a, int y){
        author = a;
        year = y;
    }

    public Book(String a){
        author = a;
        year = 1966;
    }

    public Book() {
        author = "Tolstoy";
        year = 1867;
    }

    public void setYear(int year) {this.year = year;}
    public void setAuthor(String author) {this.author = author;}
    public String getAuthor() {return author;}
    public int getYear() {return year;}
    public String toString() {return "Book`s author " + author + ", and its date of issue is — " + year;}

}
