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