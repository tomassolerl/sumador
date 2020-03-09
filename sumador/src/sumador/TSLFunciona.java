package sumador;

public class TSLFunciona {

	public static void main(String[] args) {
		System.out.println("Introducimos un 5:");
		ASumar suma1 = new ASumar("5");
		System.out.println(suma1.mostrar());
		
		System.out.println("Introducimos un -4:");
		ASumar suma2 = new ASumar("5");
		System.out.println(suma1.mostrar());
		
		System.out.println("Introducimos un 25:");
		ASumar suma3 = new ASumar("5");
		System.out.println(suma1.mostrar());
	}
}
