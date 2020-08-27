import java.util.Scanner;
import java.util.Random;

//1. Ask the user for his/her guess (I need Scanner class)
//2. I will the answer by selecting a random number (Random class)
//3. If the user guess is equal to the answer, I want to say "You won!"
/*      else if the user guess is lower than the answer, say "too low"
        else if the user guess is higher than the answer, say "too high"
 */

public class GuessingGame {
    public static void main(String[] args) {

        System.out.println("I am thinking about a number between 1 and 10...");

        Scanner input = new Scanner(System.in);
        int answer, guess;
        Random randomNumber = new Random();
        answer = randomNumber.nextInt(10) + 1 ; // if you type 4, it selects random number from 0-3

        // System.out.println("psst :answer is " + answer);

        System.out.println("Guess a number from 1-10 : ");
        guess =input.nextInt();

        while (guess != answer) {
            if (guess == answer) {
                System.out.println(" You win!");
            } else if (guess < answer && guess != -1) {
                System.out.println(" Too low! Try again : ");
                guess =input.nextInt();
            } else if (guess > answer) {
                System.out.println(" Too high! Try again :");
                guess =input.nextInt();
            }

            if (guess == -1){
                break;
            }
        }
        if (guess != -1){
            System.out.println("You win!");
        } else {
            System.out.println("Sorry! The answer was : " + answer );
        }

  //      I am thinking about a number between 1 and 10...
//        Can you guess it?
//        4
//        It's too low. Guess again.
//        6
//        It's too high. Guess again.
//        5
//        That's right! You are a good guesser.
    }
}
