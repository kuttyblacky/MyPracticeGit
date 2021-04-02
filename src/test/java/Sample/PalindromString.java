package Sample;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter String for Reversal");
		
		String str=scan.next();
		String revstr="";
		String OrgStr=str;
		
		int Len=str.length();
		
		for(int i=Len-1;i>=0;i--)
		{
			
			revstr=revstr+str.charAt(i);
		}
		
		if(OrgStr.equals(revstr))
		{
			System.out.println(OrgStr+ " is Palindrom String");
		}
		else
		{
			System.out.println(OrgStr+ " is Not Palindrom String");
		}
	}

}
