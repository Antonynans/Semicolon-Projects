//
//Write a code that outputs the following
//		1
//	       222
//	      33333
//	     4444444
//	    555555555
//


import java.util.Scanner;
public class JavaIterators2{
	public static void main(String[] args) {

		int x =1;
		int counter = 1;
		while(counter <= 5){
		for(int space =5; space >= counter; space--){

			System.out.print(" ");
		}

			for(int num = 1; num <= x ; num++){
				System.out.print(counter);
			}
				x=x+2;
				System.out.println();
				counter++;
		}
			}
				
		}
	

