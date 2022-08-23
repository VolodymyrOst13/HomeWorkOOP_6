package aditionalTask;

public class Calculator {

    private double a = 12;
    private double b = 8;



    private static double plus(){
        Calculator plus = new Calculator();
        return plus.a + plus.b;
    }

    private static double minus(){
        Calculator minus = new Calculator();
        return minus.a - minus.b;
    }

    private static double multiplication(){
        Calculator multiplication = new Calculator();
        return multiplication.a * multiplication.b;
    }

    private static double division(){
        Calculator division = new Calculator();
        return division.a / division.b;
    }

    void print(){
        System.out.println("A + B = " + a + " + " + b + " = " + plus());
        System.out.println("A - B = " + a + " - " + b + " = " + minus());
        System.out.println("A * B = " + a + " * " + b + " = " + multiplication());
        System.out.println("A / B = " + a + " / " + b + " = " + division());
    }
}
