package yaip4_6;

public class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal : [name=" + name + "]";
	}
	
    public static void main (String args[]) {
    	Animal a1 = new Animal("AnimalSenior");
    	System.out.println(a1);
    }
}
