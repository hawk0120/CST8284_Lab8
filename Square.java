package cst8284.solidObject;

public class Square extends BasicShape {
	public Square() {
		this(1.0);
	}
	
	public Square(double width) {
		this.setWidth(width);
	}
	
	public Square(Square square) {
		this(square.getWidth());
	}
	
	@Override
	public double getArea() {
		return ( getWidth() * 2 );
	}
	
	@Override
	public double getPerimeter() {
		return ( getWidth() * 4 );
	}
	
	@Override
	public String toString() {
		return ("Square Overrides " + super.toString());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Square)
		{
			return (this.getWidth() == ((Square)obj).getWidth());

		} else {
			return false;
		}	
	}


}
