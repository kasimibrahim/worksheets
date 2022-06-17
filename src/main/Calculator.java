package main;

import javax.swing.*;

/**
 * @author Kasim.ibrahim@turntabl.io
 *
 * A simple Java calculator
 * that performs the following commads [* / + -]
 *
 * HOW TO USE:
 * Create an object from the Class 'Calculator' and call the 'perform' method togther with
 * the values and symbol, and wait for the magic!
 */

public class Calculator {

    public Calculator(){}

    private void add(double a, double b){
        System.out.println(a + b);
    }

    private void multiply(double a, double b){
        System.out.println(a*b);
    }

    private void subtract(double a, double b){
        System.out.println(a-b);  // We assume that a is the minuend and b is the subtrahend
    }

    private void divide(double a, double b){
        if (b == 0){
            System.out.println("Zero division Error!");
        }
        else {
            System.out.println(a / b);
        }

    }

    public void perform(double a, char symbol, double b){
        switch (symbol){
            case '+':
                this.add(a, b);
                break;

            case '-':
                this.subtract(a, b);
                break;

            case '/':
                this.divide(a, b);
                break;

            case '*':
                this.multiply(a, b);
                break;

            default:
                System.out.println("Symbol out of scope or invalid");
            // I am thinking?? do I need break after return? I included it anyway
        }

    }

}
