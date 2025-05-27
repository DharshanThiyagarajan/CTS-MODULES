import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int target = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int guess;

        System.out.println("Guess a number between 1 and 100:");
        do {
            guess = sc.nextInt();
            if (guess > target) System.out.println("Too high!");
            else if (guess < target) System.out.println("Too low!");
            else System.out.println("Correct!");
        } while (guess != target);

        sc.close();
    }
}
