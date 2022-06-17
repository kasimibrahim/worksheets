package main;

public class PrimeNumbers {
    int largest;
    PrimeNumbers(int n){
        this.largest = n;
    }
    private void isPrime(int n){
        if (n == 1){
            System.out.println(n + " is not prime");
        }else{
            boolean found = false;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime");
                    found = true;
                    break;
                }
            }
            if (!found) System.out.println(n + " is prime");
        }
    }

    public void getPrimes(){
        if (this.largest < 1){
            System.out.println("Out of range");

        }else {
            for (int i = 1; i < this.largest; i++) {
                this.isPrime(i);
            }
        }
    }
}
