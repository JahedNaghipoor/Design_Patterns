package Factories;

public class Point {
	private double x, y;

	private Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	// Grouping factories
	public static class PointFavtry {
         // Factory Method
		public static Point newCartesianPoint(double x, double y) {
			return new Point(x, y);
		}

		// Factory Method
		public static Point newPolarPoint(double rho, double theta) {
			return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
		}
	}
}
