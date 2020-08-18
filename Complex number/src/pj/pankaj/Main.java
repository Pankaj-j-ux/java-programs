package pj.pankaj;

public class Main {

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(10,30);
        c1.display();

        ComplexNumber c2 =new ComplexNumber(20 ,30);
        c2.display();

        c1.addComplexNumTo(c2);
        c1.addComplexNumTo(10,20);


        ComplexNumber[] complexNumArray= new ComplexNumber[4];
        complexNumArray[0]= c1;
        complexNumArray[1]= c2;
        for (int i=0; i<complexNumArray.length ; i++) {
            System.out.println(complexNumArray[i]);
        }
    }
}
