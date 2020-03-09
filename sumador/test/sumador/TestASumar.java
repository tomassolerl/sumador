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

}
