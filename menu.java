//Create a resturant menu select any option we will show you price


import java.util.*;

class menu{
public static void main(String[]arg){
int choice;

System.out.println("1. Mutton Biryani");
System.out.println("2. Mutton Family Pack");
System.out.println("3. Supreme Chicken Biryani");
System.out.println("4. Chicken Tikka Kabab");
System.out.println("5. Tandoori Chicken");
System.out.println("6. Chana Biryani ");
System.out.println("7. Pulao Biryani");
System.out.println("8. Tomato Soup");
System.out.println("9. Chicken Karhai");
System.out.println("10. Aloo Chaat");
Scanner input=new Scanner(System.in);

System.out.print("\n\tPlease Enter Dish Number :");
choice=input.nextInt();
switch(choice)
{
case 1:
	System.out.print("Price of Mutton Biryani:500");
	break;
case 2:
	System.out.println("Price of Mutton Family Pack:700");
	break;
case 3:
	System.out.println("Price of Supreme Chicken Biryani: 700");
	break;
case 4:
	System.out.println("Price of Chicken Tikka Kabab : 900");
	break;
case 5:
	System.out.println("Price of Tandoori Chicken: 900");
	break;
case 6:
	System.out.println("Price of Chana Biryani :250");
	break;
case 7:
	System.out.println("Price of Pulao Biryani: 200");
	break;
case 8:
	System.out.println("Price of Tomato Soup: 200");
	break;
case 9:
	System.out.println("Price of Chicken Karhai is: 200");
	break;
case 10:
	System.out.println("Price of Aloo Chaat: 250");
	break;
default:


	System.out.println("choice not found");
}}}
