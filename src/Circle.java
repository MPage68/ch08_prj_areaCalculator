
public class Circle extends Shape {
	
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
		
		
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getarea() {
		// TODO Auto-generated method stub
		double area = radius * radius *Math.PI;
		return area;
	}
	
	

}
