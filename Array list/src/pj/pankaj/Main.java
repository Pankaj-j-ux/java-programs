package pj.pankaj;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> fruit= new ArrayList();
        LinkedList<String> vegetable= new  LinkedList();

        fruit.add("Apple");
        fruit.add("Manago");
        fruit.add("Banana");

        vegetable.add("loki");
        vegetable.add("karela");
        vegetable.add("torii");

        fruit.addAll(vegetable);
        System.out.println(fruit);

    }
}
