//
To create a reverse string in Java
//


import java.util.Scanner;
// REVERSE STRINGS
class P1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String s1 = input.nextLine();
        char[] charArray = new char[5];

        System.out.printf("s1: %s", s1);

        System.out.printf("%nLength of s1: %d", s1.length());

        System.out.printf("%nThe string reversed is: ");

        for(int count = s1.length() - 1; count >= 0; count--){
            System.out.printf("%c ", s1.charAt(count));
        }
        s1.getChars(0, 5, charArray, 0);
        System.out.printf("%nThe character array is: ");
    
    for(char character : charArray)
        {System.out.print(character);}
        System.out.println();
    }   
}
