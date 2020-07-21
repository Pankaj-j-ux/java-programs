package pj.pankaj;

public class Machine {
    private String type;

    public Machine(String type) {
        this.type=type;
    }

    public Machine working() {
        System.out.println("vehicle runs");
        return null;
    }

    public String getType() {
        return this.type;
    }
}
