package cst8284.solidObject;


public class SolidObject <T extends BasicShape> {
   
	private double depth;
	private T shape;

	protected SolidObject(T shape, double depth) {
		this.setDepth(depth);
		this.setShape(shape);
	}
	
	protected SolidObject(T shape) {
		this.setShape(shape);
	}
	
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	public T getShape() {
		return shape;
	}
	public void setShape(T shape) {
		this.shape = shape;
	}
	
	public String toString(){
		String solidTypeEquivalent = "unknown   ";
		String className = getShape().getClass().toString();
		className = className.substring(className.lastIndexOf('.')+1);
		switch (className) {
			case "Circle": solidTypeEquivalent = "cylinder "; break;
			case "Square": solidTypeEquivalent = "cube     "; break;
			case "Rectangle": solidTypeEquivalent = "block    "; break;
			case "Triangle": solidTypeEquivalent = "prism    "; break;
		}	
		return solidTypeEquivalent;
	}
	
	public double getVolume() {
		// area * depth
		double volume;
		volume = (this.shape.getArea() * this.getDepth());
		return volume;
	}
	
	public double getSurfaceArea() {
		// 2 * ((l+w) + (l * w))
		double surfaceArea;
		surfaceArea = (this.getShape().getPerimeter() * this.getDepth() +
				( 2 * this.getShape().getArea()));
		return surfaceArea;
	}
	

}
