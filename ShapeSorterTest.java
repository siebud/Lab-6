import java.util.Comparator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 6
 *
 * Test class for ShapeSorter.
 * Implicitly tests that the comparators are implemented correctly.
 *
 * @author Stephen
 * @version 2019-02-18
 */
public class ShapeSorterTest
{
	/**
	 * Test that shapes are added correctly.
	 */
	@Test
	public void AddShapeTest()
	{
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);

		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(0), a);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(1), b);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(2), c);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(3), d);
	}

	/**
	 * Tests sorting via the default ordering.
	 */
	@Test
	public void SortShapesDefaultTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();
		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		
		sorter.sortShapes();
		
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(0), b);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(1), d);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(2), a);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(3), c);
	}

	/**
	 * Tests sorting by area ordering.
	 */
	@Test
	public void SortShapesAreaTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();
		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		
		Comparator<Shape> ar = new ShapeAreaComparator();
		sorter.sortShapes(ar);
		
		Assert.assertEquals("Shapes sorted incorrectly...", b, sorter.shapes.get(0));
		Assert.assertEquals("Shapes sorted incorrectly...", d, sorter.shapes.get(1));
		Assert.assertEquals("Shapes sorted incorrectly...", a, sorter.shapes.get(2));
		Assert.assertEquals("Shapes sorted incorrectly...", c, sorter.shapes.get(3));
	}

	/**
	 * Tests sorting by perimeter ordering.
	 */
	@Test
	public void SortShapesPerimeterTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();
		Shape a = new Rectangle("test", 3, 4);
		Shape b = new EquilateralTriangle("test2", 10);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		
		Comparator<Shape> pr = new ShapePerimeterComparator();
		sorter.sortShapes(pr);

		
		Assert.assertEquals("Shapes sorted incorrectly...", d, sorter.shapes.get(0));
		Assert.assertEquals("Shapes sorted incorrectly...", c, sorter.shapes.get(1));
		Assert.assertEquals("Shapes sorted incorrectly...", a, sorter.shapes.get(2));
		Assert.assertEquals("Shapes sorted incorrectly...", b, sorter.shapes.get(3));
	}

	/**
	 * Tests the toString.
	 */
	@Test
	public void ToStringTest()
	{
		// TODO: complete this...
		Shape c = new Circle("Circ", 4);
		Assert.assertEquals("Wrong toString", "Circle\t ID = Circ\t area = 50.265\t perimeter = 25.133", c.toString());
		
		Shape d = new Circle("cric", 7);
		ShapeSorter ss = new ShapeSorter();
		ss.addShape(c);
		ss.addShape(d);
		ss.sortShapes();
		String p1 = "Circle\t ID = Circ\t area = 50.265\t perimeter = 25.133";
		String p2 = "Circle\t ID = cric\t area = 153.938\t perimeter = 43.982";
		Assert.assertEquals("Wrong toString", p1 + "\n" + p2 + "\n", ss.toString());
	}
}
