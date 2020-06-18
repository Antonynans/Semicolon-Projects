//
//	Write a program that prompts the user to input an integer and then
//	outputs the number with the digits reversed. For example, if the input is
//	12345, the output should be 54321.
//
	
	

import java.util.Scanner;
public class JavaIterators7{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int reverseValue = 0;
		System.out.print("Enter a number ");
		int num = input.nextInt();
		while(num != 0){
			reverseValue *=10;
			System.out.print(reverseValue);
			reverseValue += num%10;
			num /=10; 
		}
		System.out.println("Reverse of the input is: " + reverseValue);
	}
}
