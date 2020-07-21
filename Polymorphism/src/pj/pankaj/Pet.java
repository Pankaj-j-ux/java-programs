package pj.pankaj;

public class Pet extends Animal{
    public Pet() {}
    public Pet(String name) {
        super(name);
    }


    public void walk() {
        System.out.println("Pet is walking");
    }
}
