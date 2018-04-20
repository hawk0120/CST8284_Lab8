package cst8284.solidObject;

public class Circle extends BasicShape {

	public Circle() {
		this(1.0);
	}
	
	public  Circle(double width) {
		this.setWidth(width);
	}

	public Circle(Circle circle) {
		this (circle.getWidth() );	
	}

	@Override
	public double getArea() {
		double radius = (getWidth()/2);
		return (Math.PI *(radius * radius));
	}

	@Override
	public double getPerimeter() {
		double radius = (getWidth()/2);
		return ((Math.PI * 2) * radius);
	}

	@Override
	public String toString() {
		return ("Circle Overrides " + super.toString());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Circle)
		{
			return (this.getWidth() == ((Circle)obj).getWidth());
		} else {
			return false;
		}	
	}

}
