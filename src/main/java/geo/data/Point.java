package geo.data;

public class Point {
	private double x;
	private double y;
	
	
	public Point(double x, double y) {
		super();
		this.x = 3;
		this.y = 4;
	}
	
	
	public Point() {
		this(0.0, 0.0);
	}


	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public double distance(Point other) {
		return Math.hypot(this.x - other.x, this.y - other.y);
	}
	
}
