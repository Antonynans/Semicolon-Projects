//
//	Write a do-while loop that asks the user to enter two numbers. The
//	numbers should be added and the sum displayed. The loop should ask the
//	user whether he or she wishes to perform the operation again. If so, the
//	loop should repeat; otherwise, it should terminate.


import java.util.Scanner;
public class JavaIterators5{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int value = 0;
		do{
			System.out.print("Enter the first number: ");
			int num1 = input.nextInt();

			System.out.print("Enter the second number: ");
			int num2 = input.nextInt();
					
				int sum = num1 + num2;
				System.out.println("The sum of the two numbers is: " + sum );

				System.out.print("Enter a number to perform another operation or -1  to quit ");
				 value = input.nextInt();
				if(value == -1){
					System.out.print("Goodbye");
					}
				
						}		
				while(value > 0);
		}
}
