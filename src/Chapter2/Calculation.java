package Chapter2;

import java.util.Scanner;
public class Calculation{
public static void main(String [] args){
  int sum;
  int product;
  int quotient;
  double average;
 Scanner law = new Scanner(System.in); 

System.out.println("Enter your first integer: ");
int first = law.nextInt();

System.out.println("Enter your second integer: ");
int second = law.nextInt();

System.out.println("Enter your third integer: ");
int third = law.nextInt();

sum = (first + second + third);
System.out.printf ("The sum of the 3 integers is %d%n" ,sum);

product = (first * second * third);
System.out.printf ("The product of the 3 integers is %d%n" ,product);

quotient = (first / second /third);
System.out.printf ("The quotient of the 3 integers is %d%n" ,quotient);

average =(sum*1.0)/3;
System.out.printf ("The average of the 3 integers is %.2f%n " ,average);










}

}