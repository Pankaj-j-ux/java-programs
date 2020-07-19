package pj.pankaj;

public class Teacher extends Person {

    public Teacher(String name) {
        super(name);
    }

    public void teach() {
        System.out.println(name + " is Teaching");
    }
}
