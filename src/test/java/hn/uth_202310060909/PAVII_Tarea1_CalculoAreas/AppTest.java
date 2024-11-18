package hn.uth_202310060909.PAVII_Tarea1_CalculoAreas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{
	
	private static App Areas;
	
	@BeforeClass
	public static void setUpClass() {
		System.out.println("Se acaba de ejecutar el metodo setup class");
		Areas = new App();
	}
	
	
	@Test
	public void Prueba1CalculoAreaCirculo() {
		double r = 2;
		double pi = Math.PI;
		double rcuadrado = Math.pow(r, 2);
		double area = App.Circulo(r);
		assertEquals(pi * rcuadrado, area, 12.566370614359172);
	}
	
	@Test
	public void Prueba2CalculoAreaCirculo() {
		double r = 2.55;
		double pi = Math.PI;
		double rcuadrado = Math.pow(r, 2);
		double area = App.Circulo(r);
		assertEquals(pi * rcuadrado, area, 20.42820622996763);
	}
	
	@Test
	public void Prueba3CalculoAreaCirculo() {
		double r = -2;
		double pi = Math.PI;
		double rcuadrado = Math.pow(r, 2);
		double area = App.Circulo(r);
		if(r < 0) {
			fail("El radio no puede ser menor que cero");
		}else {
			assertTrue(pi * rcuadrado == area);
		}
	}
	
	@Test
	public void Prueba1CalculoAreaCuadrado() {
		double l = 5;
		double area = App.Cuadrado(l);
		assertEquals(l * l, area, 25);
	}
	
	@Test
	public void Prueba2CalculoAreaCuadrado() {
		double l = 4.78;
		double area = App.Cuadrado(l);
		assertEquals(l * l, area, 22.8484);
	}
	
	@Test
	public void Prueba3CalculoAreaCuadrado() {
		double l = -3.2;
		double area = App.Cuadrado(l);
		if(l < 0) {
			fail("Los lados no pueden ser Negativos");
		}else {
			assertTrue(l * l == area);
		}
	}
	
	@Test
	public void Prueba1CalculoAreaTriangulo() {
		double l = 2;
		double h = 5;
		double area = l * h;
		assertEquals(l * h, area, 10);
	}
	
	@Test
	public void Prueba2CalculoAreaTriangulo() {
		double l = 2.5;
		double h = 2.5;
		double area = l * h;
		assertEquals(l * l, area, 5);
	}
	
	@Test
	public void Prueba3CalculoAreaTriangulo() {
		double l = -2;
		double h = 5;
		double area = l * h;
		if(l < 0) {
			fail("Los lados no pueden ser Negativos");
		}else {
			assertTrue(l * h == area);
		}
	}
	
	@Test
	public void Prueba1CalculoAreaRectangulo() {
		double l = 7;
		double h = 0;
		double area = l * h;
		assertTrue(l * h == area);
	}
	
	@Test
	public void Prueba2CalculoAreaRectangulo() {
		double l = 4;
		double h = 5;
		double area = l * h;
		assertNotNull(area);
	}
	
	@Test
	public void Prueba3CalculoAreaRectangulo() {
		double l = 0;
		double h = 0;
		double area = l * h;
		assertNull(area);
	}
	
	
}
