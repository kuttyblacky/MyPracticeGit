package Sample;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Counting Number of digits in given value");
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Integer Value for reversal");
		
		int num=scan.nextInt();
		
		int count=0;
		
		while(num!=0)
		{
			
			num=num/10;
			count++;
		}
		
		System.out.println("Digit counting of given Value "+count);
	
	}

}
