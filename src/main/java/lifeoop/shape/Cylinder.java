package lifeoop.shape;

public class Cylinder implements Shape3D {
	private double radius = 0.0;
	private double height = 0.0;
	
	public Cylinder(double radius, double height) {
		super();
		this.radius = radius;
		this.height = height;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double volume() {
		return Math.PI * radius * radius * height;
	}
}
