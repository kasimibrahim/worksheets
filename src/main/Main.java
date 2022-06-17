package main;

public class Main {

    public static void main(String[] args){

        //Exercise 3 - Calculator
        Calculator simpleCalc = new Calculator();
        simpleCalc.perform(5,'-', 4);
        simpleCalc.perform(5, '+', 4);
        simpleCalc.perform(5, '/', 4);
        simpleCalc.perform(5,'/', 0);  // Zero Division Error
        simpleCalc.perform(5, '*', 4);

        //Exercise 4 - Prime Numbers
        PrimeNumbers crypt = new PrimeNumbers(143);
        crypt.getPrimes();

    }
}
