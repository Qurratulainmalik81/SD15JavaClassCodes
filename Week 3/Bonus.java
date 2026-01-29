import java.util.Scanner;
//A program calculates and displays bonus amounts to pay various types of employees. 
// There are 3 separate departments, numbered 1, 2, and 3. 
// Department 1 employees are paid a bonus based on their sales: If their sales amount is over 
// $5000 they get 5% of those sales, otherwise they get nothing. 
// Department 2 employees are paid a bonus based on the number of units they sell: 
// They get $20 per unit sold, and an extra $10 per unit if they sell 25 units or more; if they sell no units, they get nothing.
// Department 3 employees assemble parts in the plant and are paid a bonus of 10 cents per part if they reach a certain level:
// Part-time employees must assemble more than 250 parts to get the 10-cent-per-part bonus, and full-time employees must 
// assemble more than 700.
//Write a set of 3 overloaded methods called getBonus() that works with the program below, according to the specifications described above.


public class Bonus{

public final static int UNITS_PT = 250;
public final static int UNITS_FT = 700;
public final static double SALES_BONUS = 5000.0;
public final static double SALES_BONUS_RATE = 0.05;
public final static double SALES_UNIT_REG = 20.0;
public final static double SALES_UNIT_EXTRA = 10.0;
public final static int SALES_UNIT_BONUS = 25;
public final static double PARTS_BONUS = 0.1;
 
    public static void main(String[] args) {
 
    Scanner keysIn = new Scanner(System.in);
    System.out.println("Enter department: ");
    int dept = keysIn.nextInt();
    double bonus = 0;
 
    switch (dept)   {
        case 1:
            System.out.print("Enter sales: ");
            double sales = keysIn.nextDouble();
            bonus = getBonus(sales);
            break;
        case 2:
            System.out.print("Enter number of units sold: ");
            int numUnits = keysIn.nextInt();
            bonus = getBonus(numUnits);
            break;
        case 3:
            System.out.print("Enter # of pieces completed: ");
            int pieces = keysIn.nextInt();
            System.out.print("Full-time (1) or Part-Time (2)? ");
            int empType = keysIn.nextInt();
            int bonusLimit = (empType == 1) ? UNITS_FT : UNITS_PT;
            bonus = getBonus(pieces, bonusLimit);
            break;
        default:
            System.out.print("Error!  ");
     }
     System.out.printf("Bonus Amount: $%.2f%n", bonus);
}
//Add 3 bonus methods
public static double getBonus(double sales)
{
    if(sales>5000)
        return(5.0/100*sales);
    else
        return 0.0;
}
public static double getBonus(int numUnits)
{
    if(numUnits>25)
        return(30*numUnits);
    else
        return (20*numUnits);

}
public static double getBonus(int pieces, int bonusLimit)
{
    if(pieces>bonusLimit)
        return(pieces * PARTS_BONUS);
    else
        return 0.0;

}

}