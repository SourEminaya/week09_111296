package technicallynamedoesntmatter;

public class C implements A,B{

	@Override
	public void displayB() {
		// TODO Auto-generated method stub
		System.out.println("Display B");
	}

	@Override
	public void displayA() {
		System.out.println("Display A");
		
	}
	public static void main(String[] args) {
		C c= new C();
		c.displayA();
		c.displayB();
	}

}
