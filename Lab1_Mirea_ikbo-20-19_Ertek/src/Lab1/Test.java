package Lab1;
import java.lang.*;
public class Test {
    public static void main(String[] args) {
        Dog d1 = new Dog("Booba", 2);
        Dog d2 = new Dog();
        Dog d3 = new Dog("Pipyao",4);
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
        Ball q1 = new Ball("Red", 10);
        Ball q2 = new Ball("Yellow", 8);
        Ball q3 = new Ball("Black");
        System.out.println(q1.toString());
        System.out.println(q2.toString());
        System.out.println(q3.toString());
        Book b1 = new Book("Pushkin", 1833);
        Book b2 = new Book("Bulgakov");
        Book b3 = new Book();
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
    }

}
