package Sample;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter String for Reversal");
		
		String value=scan.next();
		String rev="";

		System.out.println("Before Reversal :"+value);
		//Type - 1 concat operator
		/*
		int Len=value.length();
		
		for(int i=Len-1;i>=0;i--)
		{
			
			rev=rev+value.charAt(i);
		}
		
		System.out.println(rev);*/
		
		//Type - 2 Using Character Array
		/*char revarray[]=value.toCharArray();
		
		int Len=value.length();
		
		for(int i=Len-1;i>=0;i--)
		{
			
			rev=rev+revarray[i];
		}
		
		System.out.println(rev);*/
		
		//Type - 3 String Buffer
		
		StringBuffer SB=new StringBuffer(value);
		//SB.append(value);
		StringBuffer reverse = SB.reverse();
		
		System.out.println(reverse);
	}
	

}
