//
//	Write a code that outputs this:
//		1
//	       212
//	      32123
//	      4321234
//	     543212345
//



public class JavaIterators3{
	public static void main(String[] args) {
		
		for(int i =1; i <= 5; i++){
			for(int space = 5; space >=i; --space){
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++){
				System.out.print(i-j+1);
			}
			for(int j = 2; j <=i; j++){
				System.out.print(j);
			}
			System.out.println();
		}

	}
}
