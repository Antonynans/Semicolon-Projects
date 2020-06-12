//
Consider a vending machine that offers the following options:
[1] Get gum
[2] Get chocolate
[3] Get popcorn
[4] Get juice
[5] Display total sold so far
[6] Quit
Design and implement a program that continuously allows users to select from
these options. When options 1–4 are selected an appropriate message is to be
displayed acknowledging their choice. For example, when option 3 is selected the
following message could be displayed:
Here is your popcorn
When option 5 is selected, the number of each type of item sold is displayed. For
example:
3 items of gum sold
2 items of chocolate sold
6 items of popcorn sold
9 items of juice sold
When option 6 is chosen the program terminates. If an option other than 1–6 is
entered an appropriate error message should be displayed, such as:
Error, options 1-6 only!
//


import java.util.Scanner;
class P1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of gums: ");
        int gum = input.nextInt();
        System.out.println("Enter number of chocolate: ");
        int chocolate = input.nextInt();
        System.out.println("Enter number of popcorn: ");
        int popcorn = input.nextInt();
        System.out.println("Enter number of juice: ");
        int juice = input.nextInt();
        int counter = 1;

        while (counter <= 6) {
            System.out.println("enter a number from 1-6: ");
            int option = input.nextInt();
            if (option == 1) {
                System.out.println("Gum is selected. Here is your gum.");
            }
            else if (option == 2) {
                System.out.println("Chocolate is selected. Here is your chocolate.");
            }
            else if(option == 3){
                System.out.println("Popcorn is selected. Here is your popcorn.");
            }
            else if(option == 4){
                System.out.println("Juice is selected. Here is your juice.");
            }
            else if(option == 5){
                System.out.printf("%d items of gum sold%n%d items of chocolate sold%n%d items of popcorn sold%n%d items of juice sold.%n", gum, chocolate, popcorn, juice);
            }
            else if(option == 6){
                System.out.println("Exiting.");
                break;
            }
            else{System.out.println("Error, options 1-6 only!");}
        }
       counter++;
    }
}
