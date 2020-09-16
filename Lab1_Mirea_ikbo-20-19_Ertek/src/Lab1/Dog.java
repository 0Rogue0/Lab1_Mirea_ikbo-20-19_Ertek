package Lab1;
import java.lang.*;
public class Dog {
    private String name;
    private int age;

    public Dog(String n, int a){
        name = n;
        age = a;
    }

    public Dog(){
        name = "Ovsyanka";
        age = 2;
    }

    public Dog(String n){
        name = n;
        age = 0;
    }
    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    public int getAge() {return age;}
    public String getName(String name){return name;}
    public String toString() {
        return name + "`s age in human years is " + age * 7 + " years";
    }
}
