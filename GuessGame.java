//
You have 10 chances to guess the secret number
HINT: It is a number less than 100!
Enter guess: 49
Enter guess: 27
Number guessed correctly
//



import java.security.SecureRandom;
import java.util.Scanner;

class GuessGame{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        System.out.println("Enter a number: ");
        int guess = input.nextInt();
        int value = random.nextInt(100);

        int count = 1;

        while(count <= 10){
            if(guess > value){
                System.out.println("You missed. HINT: Enter a lower value");
                    guess = input.nextInt();    
            }
            else if(guess < value){
                System.out.println("You missed. HINT: Enter a higher value");
                    guess = input.nextInt();
            }
            else {
                System.out.printf("Wow! You are good. You guessed right. %nThe correct number is: %d%n", value);
                    break;}
            ++count;
        }
        System.out.printf("You took %d guesses", count);
    }
}
