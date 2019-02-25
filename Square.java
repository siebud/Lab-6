
public class Square extends Rectangle {
	/**
	 * Class to represent a square, a type of rectangle.
	 * @author Sierra
	 * @version 2019-02-24
	 */
		/**
		 * The variables storing the lengths of the sides 
		 */
		private double sides;

		/**
	     * The square constructor. Store the side and base information and store in the sideLengths array.
	     *
	     * @param id The created shape's name id.
	     * @param Side The side of the square.
	     */
		public Square(String id,double size)
		{
			// TODO: complete this...
			super(id, size, size);
			sides = size;
			sideLengths.add(size);
			sideLengths.add(size);
			sideLengths.add(size);
			sideLengths.add(size);
		}

		/**
		 * Calculates and returns the area of the square.
		 *
		 * @return Area of the square.
		 */
		@Override
		public double getArea() {
			return Math.pow(sides, 2);
		}

		@Override
		public String getShapeType() {
			return "Square";
		}

}
