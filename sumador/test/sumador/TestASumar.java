package sumador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestASumar {

	@Test
	public void testUnDigito() {
		ASumar suma = new ASumar("7");
		String resultado = suma.mostrar();
		assertEquals("7 = 7",resultado);
	}

	@Test
	public void testNegativo() {
		ASumar suma = new ASumar("-1");
		String resultado = suma.mostrar();
		assertEquals("-1",resultado);
	}
	
	@Test
	public void testMasDeUnNumero() {
		ASumar suma = new ASumar("15");
		String resultado = suma.mostrar();
		assertEquals("1 + 5 = 6", resultado);
	}
}
