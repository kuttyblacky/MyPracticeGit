package Sample;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5,b=3;
		
		
		System.out.println("Before Swapping");
		System.out.println("A is "+a);
		System.out.println("B is "+b);
		
		/*a=a*b;
		b=a/b;
		a=a/b;
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		a=a^b;
		b=a^b;
		a=a^b;*/
		
		b=a+b-(a=b);
		
		System.out.println("After Swapping");
		System.out.println("A is "+a);
		System.out.println("B is "+b);
		
	}

}
