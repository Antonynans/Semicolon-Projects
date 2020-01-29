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