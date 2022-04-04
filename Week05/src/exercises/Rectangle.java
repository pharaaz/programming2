package exercises;

public class Rectangle extends Shape{
	
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.height=height;
		this.width=width;
	}
	
	@Override
	public double computeArea()
	{
		return this.width*this.height;
	}

}
