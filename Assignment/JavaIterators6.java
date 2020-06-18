//
//	Write a program that prompts the user to input a positive integer. It
//	should then output a message indicating whether the number is a prime
//	number
//



import java.util.Scanner;
public class JavaIterators6{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int counter = 2;
		System.out.print("Enter a number ");
		int value = input.nextInt();
		boolean num = true;
		//for(int counter = 2; counter < value; counter++)
		while(counter < value){
			if(value % counter == 0){
				num = false;
				break;
				}
				counter++;

				 }
			if(num && value > 1){
				System.out.println("This is a prime number");
			}
			else
			{
				System.out.println("The number is not a prime number");
			
		}
	}
		}
	
