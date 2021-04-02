package Sample;

import java.util.Scanner;

public class Largestof3NousingTernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Integer Value for first Integer");
		
		int a=scan.nextInt();
		
		System.out.println("Enter Integer Value for second Integer");
		
		int b=scan.nextInt();
		
		System.out.println("Enter Integer Value for third Integer");
		
		int c=scan.nextInt();
		
		//Multiple Line Ternary Operator
		
		/*int largest1=a>b?a:b;
		
		int largest2=c>largest1?c:largest1;
		
		System.out.println(largest2+" is the largest number");*/
		
		// Single Line Ternary Operator
		
		int Largest=c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println(Largest+" is the largest number");
		
	}

}
