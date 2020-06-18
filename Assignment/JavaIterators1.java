//
//Write a program that prompts the user to input a positive integer. It
//should then print the multiplication table of that number.
//



import java.util.Scanner;
public class JavaIterators1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int counter = 1;

		 System.out.print("Enter a Number ");
		 int num = input.nextInt();
		 while (counter <= 12 ){
		 	 	int product = num * counter;
		 		counter++;
		 		System.out.printf("%d * %d = %d%n", num, counter, product);

		 }

	}
}
