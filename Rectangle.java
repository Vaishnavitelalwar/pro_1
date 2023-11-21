package day11;

public class Rectangle implements Geometricshape{

	int width,height;
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	public double perimeter() {
		  
		return 2*width*height;
	}

}
