package Sample;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Integer Value for Fib Series");
		
		int a=scan.nextInt();
		
		int count=0,n1=0,n2=1;
		
		System.out.print(n1+" "+n2);
		
		for(int i=2;i<a;i++)
		{
			count=n1+n2;
			
			System.out.print(" "+count);
			
			n1=n2;
			
			n2=count;
		}
	}

}
