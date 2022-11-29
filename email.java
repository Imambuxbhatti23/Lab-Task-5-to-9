// below email and password are registered in this program
//1 java12@gmail.com  	password = 1234
//2 university@gmail.co password = 1234
//3 someone@gmail.com   password = 1234
//4 imambux12@gmail.com      pas = 1234
//5 hello@gmail.com     password = 1234

import java.util.*;
class email{
public static void main(String[]arg){
String email, pwd;
System.out.print("\nEnter your email:");
Scanner obj=new Scanner(System.in);
email=obj.nextLine();
System.out.print("Enter your password to Login:");
pwd=obj.nextLine();
if (email.equals("java12@gmail.com")&&(pwd.equals("1234")))
{
System.out.println("Hellow world I am imam bux");
System.out.println("I lives in jamshoro");
}

else if (email.equals("university@gmail.com")&&(pwd.equals("1234"))){

System.out.println("welcome to desktop");
System.out.println("my name is Ali");
}
else if (email.equals("someone@gmail.com")&&(pwd.equals("1234")))
{

System.out.println("My name is muhammad ali");
System.out.println("My e-mail address is farmanali@gmail.com");
}
else if (email.equals("imambux12@gmail.com")&&(pwd.equals("1234")))
{

System.out.println("Welcome to screen");
System.out.println("My name is Ramzan Ali");
}
else if (email.equals("hello@gmail.com")&&(pwd.equals("1234")))
{
System.out.println("Welcome to computer");
System.out.println("My name is Shahid Hussain");
}
else
{
System.out.print("Invalid password or email please try again");}
}}




