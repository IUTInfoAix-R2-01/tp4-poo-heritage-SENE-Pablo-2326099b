package yaip4_6;

public class Cat extends Mammal{

	public Cat(String name) {
		super(name);
	}
	
	public void greets(){
		System.out.println("Meow");
	}

	@Override
	public String toString() {
		return "Cat [toString()=" + super.toString()+ "]";
	}
	
    public static void main (String args[]) {
    	Cat c1 = new Cat("CatSenior");
    	System.out.println(c1);
    	c1.greets();
    }
	
	
}
