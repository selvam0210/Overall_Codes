package Java_Programs;

public final class variables {
	
	static int a; // -- default value 
	
	
	
	// -- lacal variable 
	public static void localmethod() {//  --final kodukalam
		int  b = 20;  // must initialize
		System.out.println("local varaiable" +b);

		//System.out.println("local varaiable" +a);// class --- anywhere access
		
	}
	public static void main(String[] args) {
		
/*		variables v = new variables();
		v.localmethod();
		System.out.println(v.a); // class ---anywhere access*/
		
		//--no object
		System.out.println(a);//  static
		
		localmethod();//  -static 
		
	}
	

}
