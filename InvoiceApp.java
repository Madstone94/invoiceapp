import java.util.Scanner;
public class InvoiceApp
{
public static void main(String[] args)
{
// welcome the user to the program
System.out.println("Welcome to the Invoice Total Calculator");
System.out.println(" "); 
// print blank line
// create a scanner object named sc
Scanner sc = new Scanner(System.in);
// perform invoice calculations until choice isn't equal to "y" or "Y"
String choice = "y";
while (choice.equalsIgnoreCase("y"))
{
// get invoice subtotal from the user 
System.out.print("Enter subtotal ");
double subtotal = sc.nextDouble();
// calculate the discount amount and total
double discountpercent = 0.0;
if (subtotal >= 200)
discountpercent = .2;
else if (subtotal >= 100)
discountpercent = .1;
else
discountpercent = 0.0;
double discountamount = subtotal * discountpercent;
double total = subtotal - discountamount;
//display the discount amount and total
String message = "discount percent =" + discountpercent + "/n";
System.out.println(message) ;
//see if the user wants to continue
System.out.print("Continue?(y/n))");
choice = sc.next();
System.out.println();
}
}
}



