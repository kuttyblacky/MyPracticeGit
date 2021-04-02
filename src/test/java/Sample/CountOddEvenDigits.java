package Sample;

import java.util.Scanner;

public class CountOddEvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("Counting Number of digits in given value");
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Integer Value for reversal");
		
		int num=scan.nextInt();
		
		int Oddcount=0,Evencount=0;
		

		while(num!=0)
		{
			
			int rem=num%10;
			num=num/10;
			
			if(rem%2==0)
			{
				Oddcount++;
			}
			else
			{
				Evencount++;
			}
		}
		
		System.out.println("Odd Digit Counts "+Oddcount+
				" Even Digit Counts "+Evencount);
		
	}

}
