
public class Square extends Shape {

	protected double width;

	public Square(double width) {
		super();
		this.width = width;

	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getarea() {
		// TODO Auto-generated method stub
		
		return width * width;
	}

}
