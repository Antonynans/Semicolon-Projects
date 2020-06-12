//
Write a program to take an order for a new computer. The basic system costs
375.99. The user then has to choose from a 38 cm screen (costing 75.99) or a
43 cm screen (costing 99.99). The following extras are optional.

Item                       |         Price
Antivirus software         |         65.99
Printer                    |         125.00

The program should allow the user to select from these extras and then display
the final cost of the order
//


import java.util.Scanner;

public class headFirst{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Enter your amount: ");
      double offer = input.nextInt();
      double costOfSystem = 375.99;
      double screen38 = 75.99;
      double screen43 = 99.99;
      double antivirus = 65.99;
      double printer = 125.00;
      double totalCost = 0;

      if(offer >= costOfSystem){
          System.out.println("prees 1 for screen38 or 2 for screen43 or 3 for both");
          int selectScreen = input.nextInt();
          if(selectScreen == 1){
              totalCost += screen38;
              System.out.println("press 1 for printer, 2 for antivirus, 3 for both and 0 for non");
              int selectItem = input.nextInt();
              if(selectItem == 1){
                  totalCost += printer;
              }
              else if(selectItem == 2){
                  totalCost += antivirus;
              }
              else if (selectItem == 3){
                  totalCost += antivirus + printer;
              }
              else
              {totalCost += 0;}
          }
          else if(selectScreen == 2){
              totalCost += screen43;
              System.out.println("press 1 for printer, 2 for antivirus, 3 for both and 0 for non");
              int selectItem = input.nextInt();
              if(selectItem == 1){
                  totalCost += printer;
              }
              else if(selectItem == 2){
                  totalCost += antivirus;
              }
              else if (selectItem == 3){
                  totalCost += antivirus + printer;
              }
              else
              {totalCost += 0;}
            }
            else if(selectScreen == 3){
                totalCost += screen38 + screen43;
                System.out.println("press 1 for printer, 2 for antivirus, 3 for both and 0 for non");
                int selectItem = input.nextInt();
                if(selectItem == 1){
                    totalCost += printer;
                }
                else if(selectItem == 2){
                    totalCost += antivirus;
                }
                else if (selectItem == 3){
                    totalCost += antivirus + printer;
                }
                else
                {totalCost += 0;} 
            }
         System.out.println("total cost is: " + totalCost);

      }
      else if(offer < costOfSystem){
        System.out.println("prees 1 for screen38 or 2 for screen43 or 3 for both");
        int selectScreen = input.nextInt();
            if(selectScreen == 1){
                //if(offer > selectScreen)
                totalCost += screen38;
                System.out.println("press 1 for printer, 2 for antivirus, 3 for both and 0 for non");
              int selectItem = input.nextInt();
              if(selectItem == 1){
                  totalCost += printer;
              }
              else if(selectItem == 2){
                  totalCost += antivirus;
              }
              else if (selectItem == 3){
                  totalCost += antivirus + printer;
              }
              else
              {totalCost += 0;}
            }
            else if(selectScreen == 2){
                totalCost += screen43;
                System.out.println("press 1 for printer, 2 for antivirus, 3 for both and 0 for non");
                int selectItem = input.nextInt();
                if(selectItem == 1){
                    totalCost += printer;
                }
                else if(selectItem == 2){
                    totalCost += antivirus;
                }
                else if (selectItem == 3){
                    totalCost += antivirus + printer;
                }
                else
                {
                    totalCost += 0;
                }  
            }
            else if(selectScreen == 3){
                totalCost += screen38 + screen43;
                System.out.println("press 1 for printer, 2 for antivirus, 3 for both and 0 for non");
                int selectItem = input.nextInt();
                if(selectItem == 1){
                    totalCost += printer;
                }
                else if(selectItem == 2){
                    totalCost += antivirus;
                }
                else if (selectItem == 3){
                    totalCost += antivirus + printer;
                }
                else
                {totalCost += 0;} 
            }
                System.out.println("total cost is: "+ totalCost);

        }
            if (totalCost > offer){
                    totalCost = totalCost - offer;
                    System.out.printf("insufficient amount. Balance is %.2f", totalCost);
                }
            else if(offer > totalCost){
                totalCost = offer - totalCost;
                System.out.printf("Sale complete. Balance is %.2f", totalCost);
            }
            
            
        }                  
    }
