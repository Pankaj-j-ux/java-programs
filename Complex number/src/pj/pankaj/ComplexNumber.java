package pj.pankaj;

public class ComplexNumber{
    double real;
    double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

    public void display(){
        System.out.println(this.real+" + "+this.imaginary+"i");
    }

    public void addComplexNumTo(ComplexNumber c){
        double upgradedReal, upgradedImaginary;
        upgradedReal = this.real + c.real;
        upgradedImaginary= this.imaginary + c.imaginary;

        System.out.println("result of addition is : "+ upgradedReal + " + " + upgradedImaginary + "i" );
    }

    public void addComplexNumTo(double real, double imaginary){
        double upgradedReal, upgradedImaginary;
        upgradedReal = this.real + real;
        upgradedImaginary= this.imaginary + imaginary;

        System.out.println("result of addition is : "+ upgradedReal + " + " + upgradedImaginary + "i" );
    }


}
