package pj.pankaj;

public class Main {

    public static void main(String[] args) {
        Dog d = new Dog();
        Pet p = new Pet();
        Animal a = d;

        d.walk();
        p.walk();
    }
}
