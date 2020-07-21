package pj.pankaj;

public class Main {

    public static void main(String[] args) {

        Machine vehicle = new Machine("vehicle").working();

        System.out.println(vehicle.getType());

    }
}
