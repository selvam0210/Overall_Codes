package Java_Programs;

public class Constructor {
	
	public Constructor() {
		
		System.out.println("default constructor");
	}
	
    public Constructor(String name) {
		
		System.out.println("parametrized constructor" + name);
		
	}
    public void normalmethod() {
    	System.out.println("normal method");

	}
    public static void main(String[] args) {
		Constructor c = new Constructor();//  -- default constructor object
		
		Constructor c1 = new Constructor("parameterize");
		
		c.normalmethod();
		
		try {
			c1.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
			
			
		}
		
		System.out.println("exception");
	}
    
	

}
