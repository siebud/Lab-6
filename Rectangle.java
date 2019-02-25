
public class Rectangle extends Polygon {
	/**
	 * Class to represent a trapezoid, a type of Polygon.
	
	 * @author Sierra
	 * @version 2019-02-24
	 */
		/**
		 * The variables storing the lengths of the sides and base of the rectangle 
		 */
		private double height,width;

		/**
	     * The rectangle constructor. Store the side and base information and store in the sideLengths array.
	     *
	     * @param id The created shape's name id.
	     * @param Side The side of the rectangle.
	     * @param Base The base of the rectangle.
	     */
		public Rectangle(String id, double height, double width)
		{
			// TODO: complete this...
			super(id);
			this.height = height;
			this.width = width;
			sideLengths.add(height);
			sideLengths.add(height);
			sideLengths.add(width);
			sideLengths.add(width);
		}

		/**
		 * Calculates and returns the area of the rectangle.
		 *
		 * @return Area of the rectangle.
		 */
		@Override
		public double getArea() {
			return height*width;
		}

		@Override
		public String getShapeType() {
			return "Rectangle";
		}
	
}
