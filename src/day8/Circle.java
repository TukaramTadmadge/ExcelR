package day8;

public class Circle implements Shape
{

	@Override
	public void area() {
		System.out.println("Area of Circle "+Math.PI*5*5);
		
	}

	@Override
	public void perimeter() {
		System.out.println("Perimeter of Circle "+2*Math.PI*5);
		
	}

}
