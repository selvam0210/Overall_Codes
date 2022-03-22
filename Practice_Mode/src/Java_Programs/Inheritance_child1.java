package Java_Programs;

public class Inheritance_child1 extends Inheritance_part1 {
	
//	public class Inheritance_child1 extends Inheritance_part1, inheritance_child2{
	//  }	--- not possible
	
 /*	public void method2() {
		
		System.out.println("child class");

	}*/
	
	@Override
	public void method2() {
	//	System.out.println("child class");
		super.method2();
		System.out.println("child2");
		
	}
	
	
	public static void main(String[] args) {
		Inheritance_child1 ii = new Inheritance_child1();
		ii.method2();
		
		
	//----	upcasting possible
	/*	Inheritance_part1 k = new Inheritance_child1();
	//    parent                   child
		k.method2();
	}  
	-two ways to print parent class (overide and object creation */
		
		
	
	
	}
}
