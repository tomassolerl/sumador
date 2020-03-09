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
