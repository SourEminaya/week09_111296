package technicallynamedoesntmatter;

public class Mammal implements Animal{
	public Mammal() {
		
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Mammal Eats");
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("Mammal travels");
	}
	public static void main (String[] args) {
		Mammal m= new Mammal();
		m.eat();
		m.travel();
	}
}
