package pj.pankaj;

public class Person {
    protected String name ;

    public Person(String name) {
        this.name = name ;
    }

    public Person() {}

    public void eat() {
        System.out.println(this.name + "is Eating.");
    }

    public void walk() {
        System.out.println(this.name + "is Walking.");
    }

    public void extra() {
        System.out.println("just for checking.");
    }
}
