
public class AreaCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the area calculator");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			double h = 0.0;
			double w = 0.0;
			double r = 0.0;
			Shape s = null;
			String shapeType = Console.getString("Calculate area of a circle, square, or rectangle? (c/s/r):  ");
			switch (shapeType) {
			case "c":
				r = Console.getDouble("Enter radius: ");
				s = new Circle(r);
				break;
			case "s":
				w = Console.getDouble("Enter width: ");
				s = new Square(w);
				break;
			case "r":
				w = Console.getDouble("Enter width: ");
				h = Console.getDouble("Enter height: ");
				s = new Rectangle(w, h);
				break;

			}
			
			System.out.println("The area of the " + s.getClass().getName() + " you entered is " + s.getarea());

			choice = Console.getString("Continue? (y/n)");

			System.out.println("Bye");
			

		}

	}
}
