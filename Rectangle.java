
public class Rectangle extends Polygon {
	/**
	 * Class to represent a trapezoid, a type of Polygon.
	
	 * @author Sierra
	 * @version 2019-02-24
	 */
	public class Trapezoid extends Polygon
	{
		/**
		 * The variables storing the lengths of the sides and base of the rectangle 
		 */
		private double Side,Base;

		/**
	     * The rectangle constructor. Store the side and base information and store in the sideLengths array.
	     *
	     * @param id The created shape's name id.
	     * @param Side The side of the rectangle.
	     * @param Base The base of the rectangle.
	     */
		public Trapezoid(String id, double Side, double Base)
		{
			// TODO: complete this...
			super(id);
			this.Side = Side;
			this.Base = Base;
			sideLengths.add(Side);
			sideLengths.add(Side);
			sideLengths.add(Base);
			sideLengths.add(Base);
		}

		/**
		 * Calculates and returns the area of the rectangle.
		 *
		 * @return Area of the rectangle.
		 */
		@Override
		public double getArea() {
			return Side*Base;
		}

		@Override
		public String getShapeType() {
			return "Rectangle";
		}
	}
}
