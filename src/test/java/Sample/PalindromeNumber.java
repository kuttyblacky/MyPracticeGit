package Sample;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Number for Palindrome check");
		
		int value=scan.nextInt();
		
		int org_value=value;
		
		int rev=0;
		
		while(value!=0)
		{
			
			rev=rev*10+value%10;
			value=value/10;
		}
		
		if(org_value==rev)
		{
			System.out.println(org_value+ " Palindrom Number");
		}
		else
		{
			System.out.println(org_value+ " Not Palindrom Number");
		}
	}

}
