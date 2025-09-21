import java.util.Scanner;

//Math functions implementation

public class Hypotenuse {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		double a;
		double b;
		double c;
		
		double r;
		double circumference;
		double area;
		double volume;
		
		
		System.out.print("FINDING THE HYPOTENUSE OF A RIGHT ANGLED TRIANGLE");
		System.out.print("\nEtner the length of side A: ");
		a = scanner.nextDouble();
		System.out.print("Etner the length of side b: ");
		b = scanner.nextDouble();
		
		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); //raising number to some power, eg pow(x, 2) raises x to power of 2
		
		System.out.print("\nFINDING THE PARAMETERS OF A CIRCULE");
		System.out.print("\nEnter the radius: ");
		r = scanner.nextDouble();
		
		circumference = 2 * Math.PI * r; //CALCULATING CIRCUMFERENCE
		area = Math.PI * Math.pow(r, 2); //calculating area
		volume = (4.0/3.0) * Math.PI * Math.pow(r, 3); //Volume of sphere
		
		scanner.close();
		
		
		System.out.println("\n ===================RESULTS===================");
		System.out.printf("The Hypotenuse of the triangle is %.2f cm\n", c); // Printf is a method used to format output
		System.out.printf("The circumference of the circle is %.2f cm\n", circumference);
		System.out.printf("The circumference of the circle is %.2f cm\u00B2%n", area);
		System.out.printf("The Volume of the sphere is is %.2f cm\u00B3%n", volume);
		System.out.println("===================END RESULTS===================");
		
		
		
		

	}

}
