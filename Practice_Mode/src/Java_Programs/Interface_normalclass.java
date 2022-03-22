package Java_Programs;

public class Interface_normalclass implements Interface_class {

	@Override
	public void hdfcbank() {
		System.out.println("fully abstraction");
	}

	@Override
	public void indianbank() {
		
		System.out.println("fully abstraction");
		
	}
	
	public static void main(String[] args) {
		
		Interface_normalclass ic = new Interface_normalclass();
		ic.hdfcbank();
		ic.indianbank();
		
	}
	
	

}
