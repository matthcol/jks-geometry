package geometry.test;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

import geo.data.Point;

class TestPoint {

	@Test
	void testConstructor() {
		// given
		double x = 2.5;
		double y = 42.25;
		// when
		Point p = new Point(x,y);
		// then
		assertAll(
				() -> assertEquals(x, p.getX(), "x coordinate"),
				() -> assertEquals(y, p.getY(), "y coordinate"));
	}
	
	
	@Test
	void testDistance() {
		// given
		Point p1 = new Point(2.5, 42.25);
		Point p2 = new Point(5.5, 38.25);
		// when
		double d1 = p1.distance(p2);
		double d2 = p2.distance(p1);
		// then
		assertAll(
				() -> assertEquals(5.0,d1, "distance p1-p2"),
				() -> assertEquals(5.0,d2, "distance p2-p1"));
	}

}
