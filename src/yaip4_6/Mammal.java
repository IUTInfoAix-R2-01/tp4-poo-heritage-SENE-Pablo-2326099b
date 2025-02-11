package yaip4_6;

public class Mammal extends Animal {

	public Mammal(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Mammal [toString()=" + super.toString() + "]";
	}

    public static void main (String args[]) {
    	Mammal m1 = new Mammal("MammalSenior");
    	System.out.println(m1);
    }
	
}
