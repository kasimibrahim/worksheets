package main;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Scanner;



//create a secret number
//

public class GuessGame {
    private boolean playing = true;
    private final HashSet<Integer> trials = new HashSet<>();
    private static final int maxNUmber = 50;
    private final int secretCode = (int) (Math.random() * maxNUmber);

    public void play(){
        while (this.playing){
            guess();
        }
        System.out.println("You tried "+this.trials.size()+" times");
    }

    private int getGuessNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess Number: ");
        return sc.nextInt();
    }

    private void guess(){
        int input = getGuessNumber();

        if (!hasTried(input)) {
            if (input < this.secretCode) {
                System.out.println("Guess too low");
            }else if(input > this.secretCode){
                System.out.println("Guess too high");
            }else{
                System.out.println("Correct! Secret code is "+input);
                this.playing = false;
            }
            trials.add(input);
        }
        else {
            System.out.println(input + " previously guessed, try another number");
        }
    }
    private boolean hasTried(Integer n){
        return this.trials.contains(n);
    }


}

