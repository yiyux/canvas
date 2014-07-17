package cl.uchile.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cl.uchile.*;

public class TestCanvas {
	int totalCirculos;
	int totalFiguras;
	Canvas canvas;
	
	@Before
	public void setUp() throws Exception {
		canvas = new Canvas();
		canvas.add(new Circulo());
		canvas.add(new Cuadrado());
		canvas.add(new Elipse());
		totalCirculos = canvas.totalCirculos(canvas.getFiguras());
		totalFiguras = canvas.totalFiguras(canvas.getFiguras());
	}

	@Test
	public void test() {
		assertEquals(new Integer(1), new Integer(totalCirculos));
		assertEquals(new Integer(3), new Integer(totalFiguras));
		assertNotNull(canvas.print(canvas.getFiguras()));
	}

}
