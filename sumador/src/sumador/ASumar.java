package sumador;

public class ASumar {

	private String valor_inicial;

	/**
	 * Constructor de un solo dígito
	 * @param string Parámetro que pasamos como dígito
	 */
	public ASumar(String string) {
		this.valor_inicial = string;
	}
	/**
	 * Método que devuelve un String con el resultado de la operación
	 * @return String con el resultado de la operación
	 */
	public String mostrar() {
		String numero = valor_inicial;
		if (numero.length() == 1) {
			return (numero + " = " + numero);
		}
		else {
			return null;
		}
	}

	
}
