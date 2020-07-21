package pj.pankaj;

public class Dog extends Pet {
    public Dog() {}
    public Dog (String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }
}
