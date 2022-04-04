package exercises;
import java.lang.Math.*;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle(double rad)
	{
		this.radius = rad;
	}
	
	@Override
	public double computeArea()
	{
		return (this.radius)*this.radius*Math.PI;
	}

}
