package basics;


import java.util.Scanner;

public class Condition1 {

	private Scanner scan1;
	private Scanner scan2;
	private Scanner scan3;

	public void conditions() {
		scan1 = new Scanner(System.in);
	System.out.println("Enter first number");
	int num1 = scan1.nextInt();
	
	scan2 = new Scanner(System.in);
	System.out.println("Enter second number");
	int num2 = scan2.nextInt();
	
	scan3 = new Scanner(System.in);
	System.out.println("Enter third number");
	int num3 = scan3.nextInt();
	
	if (num1 > num2 & num1 > num3) 
		
	System.out.println("Number one is bigger");
	
	
	else if(num2 > num1 & num2 > num3) 
	
	System.out.println("Number two is bigger");
	
	
	else if(num3 > num1 & num3 > num2)
		
		System.out.println("Number three is bigger");
		
	else
		
		System.out.println("Are equal");
			
	}
}
