import java.security.SecureRandom;
import java.util.Scanner;
public class JavaIterators4{
	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();
		Scanner input = new Scanner(System.in);

		int value = random.nextInt(1000);
		System.out.print("Guess the number ");
		int num = input.nextInt();
		while(num <= 1000){
			if(num > value){
				System.out.println("Too high, try again");
				num = input.nextInt();
			}
			else
				if(num < value){
					System.out.println("Too low, try again");
					num = input.nextInt();
					num++;
				}
				else
					if(num == value)
					{
					System.out.println("You are correct");
					System.out.print("The correct number is: " + value);
					break;
				}
				else
					{
				System.out.println("You quit too early");
				System.out.print("The correct number is: " + value);
				break;
				}
			}

		}
			
	}
