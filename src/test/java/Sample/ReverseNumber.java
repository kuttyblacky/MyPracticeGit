package Sample;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Integer Value for reversal");
		
		int num=scan.nextInt();
		
		//Type 1 - Using algorithm reversing value
		
		/*int rev=0;
		
		while(num!=0)
		{
			
			rev=rev*10+num%10;
			num=num/10;
		}*/
		
		// Type 2 - String Buffer class
		
		/*StringBuffer rev;
		
		StringBuffer SB=new StringBuffer(String.valueOf(num));
		
		rev=123SB.reverse();*/
		
		// Type 3 - String Builder Method
		
		StringBuilder rev;
		StringBuilder SBL=new StringBuilder();
		
		SBL.append(num);
		rev=SBL.reverse();
		
		System.out.println("Revised Number is "+rev);

	}

}
