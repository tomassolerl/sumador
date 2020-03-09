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
		if(Integer.parseInt(numero)<0) {
			return numero;
		}
		else if (numero.length() == 1) {
			return (numero + " = " + numero);
		}
		else {
			String digito="";
			for(int i = 0; i < numero.length();i++) {
				if(i>0) {
					digito=digito+" + ";
				}
				digito = numero.substring(i,1);				
			}
			return (digito + " = " + total());
		}
	}
	
	public String total() {
		int suma = 0;
		
		for(int i = 0; i < valor_inicial.length();i++) {
			String digito = valor_inicial.substring(i,1);
			suma=suma+Integer.getInteger(digito);
		}
		return Integer.toString(suma);
	}

	
}
