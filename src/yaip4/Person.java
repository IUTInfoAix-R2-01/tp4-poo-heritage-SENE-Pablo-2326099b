package yaip4;

public class Person {
	private String name;
	private String address;
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
	
	public static void main (String args[]) {
		Person p1 = new Person("Pablo", "chemin de la réussite");
		Person p2 = new Person("Arsene", "chemin du skusku");
		Person p3 = new Person("Valentin", "av de la longue batte");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
