package main;

import java.util.HashSet;
import java.util.Scanner;

//create a secret number
//

public class GuessGame {

    private HashSet<Integer> trials;
    private int secretCode;

    public void play(){

    }

    private void guess(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess Number: ");
        int input = sc.nextInt();

        if (!hasTried(input)) {
            if (input < this.secretCode) {
                System.out.println("Guess too low");
        }else if(input > this.secretCode){
                System.out.println("Guess too high");
            }else{
                System.out.println("Correct!");
            }
        }
    }
    private boolean hasTried(Integer n){
        return this.trials.contains(n);
    }

}
