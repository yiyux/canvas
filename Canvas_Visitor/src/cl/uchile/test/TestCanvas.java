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
		// Se instancia Canvas y se crea el grupo base al cual se agregaran figuras y otros grupos
		canvas = new Canvas();
		// Se crean 2 grupos
		Group grupo = new Group();
		Group grupo2 = new Group();
		// Se agrega 1 circulo al 1er. grupo
		grupo.addFigura(new Circulo());
		// Se agrega 1 circulo al 2do grupo 
		grupo2.addFigura(new Circulo());
		// Se agraga el 1do grupo al 1ero.
		grupo.addGroup(grupo2);
		// Se agragan Figuras al grupo base
		canvas.add(new Circulo());
		canvas.add(new Cuadrado());
		canvas.add(new Ellipse());
		// Se agrega el 1er. grupo al grupo base
		canvas.add(grupo);
		// Total Figuras=5, Circulos=3
		totalCirculos = canvas.totalCirculos(canvas.getFiguras());
		totalFiguras = canvas.totalFiguras(canvas.getFiguras());
	}

	@Test
	public void test() {
		assertEquals(3, totalCirculos);
		assertEquals(5, totalFiguras);
		assertNotNull(canvas.print(canvas.getFiguras()));
		System.out.println(canvas.print(canvas.getFiguras()));
	}

}
