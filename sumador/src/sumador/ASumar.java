package sumador;

public class ASumar {

	private String valor_inicial;

	/**
	 * Constructor de un solo d�gito
	 * @param string Par�metro que pasamos como d�gito
	 */
	public ASumar(String string) {
		this.valor_inicial = string;
	}
	/**
	 * M�todo que devuelve un String con el resultado de la operaci�n
	 * @return String con el resultado de la operaci�n
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
