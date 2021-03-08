package Oops;

public class Objects_Classed {

	
	  public static void main(String[] a){
	        Square s1 = new Square();
	        s1.length = 10.0f;
	        System.out.println(s1.area());

	        Square s2 = new Square();
	        s2.length = 20.0f;
	        System.out.println(s2.area());
	    }
}

class Square{
    public float length;
    public float area(){
        return length * length;
    }
}