package pj.pankaj;

public class Main {

    public static void main(String[] args) {

        Teacher t = new Teacher("Pankaj");

        Person p = t;
        Singer s = new Singer("Kanwal preet");

        t.teach();
        s.sing();
        p.extra();

        System.out.println(p instanceof Person);
        System.out.println(t instanceof Teacher);
        System.out.println(t instanceof Person);
        System.out.println(p instanceof Teacher);
        



    }
}
