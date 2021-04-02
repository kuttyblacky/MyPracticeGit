package Sample;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Integer Value for reversal");
		
		int num=scan.nextInt();
		
		int Oddcount=0,Evencount=0,sum=0;
		

		while(num!=0)
		{
			
			int rem=num%10;
			num=num/10;
			sum=sum+rem;
			
		}
		
		System.out.println("Sum of Digits "+sum);
		
	}

}
