package Java_Programs;

public class Banks_abstractclass extends Abstract_Banks {

	@Override
	public void loan1() {
		System.out.println("28%");
	}

	@Override
	public void loan2() {
		System.out.println("33%");
		
	}
	
	public static void main(String[] args) {
		Banks_abstractclass b = new Banks_abstractclass();
		
		b.loan1();
		b.loan2();
		b.loan3();
		
	}
	
	
	

}
