package yaip4_6;

public class Dog extends Mammal{

	public Dog(String name) {
		super(name);
	}
	
	public void greets(){
		System.out.println("Woof");
	}
	
	public void greets(Dog another) {
		System.out.println("Wooffffff");
	}

    public static void main (String args[]) {
    	Dog d1 = new Dog("DogSenior");
    	Dog d2 = new Dog("Francis");
    	System.out.println(d1);
    	d1.greets();
    	d1.greets(d2);
    	
    }
}
