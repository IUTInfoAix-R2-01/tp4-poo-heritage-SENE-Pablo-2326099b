package yaip6_5;

public class Circle implements GeometricObject{
	protected double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public double getPerimeter() {
		return Math.PI * Math.PI * radius;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
}
