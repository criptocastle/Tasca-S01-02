package n1exercici1;

public class n1exercici1 {

	public static void main(String[] args) throws VendaBuidaException {
		/*
		 * Escriu el codi necessari per a generar i capturar una excepció de tipus
		 * ArrayIndexOutOfBoundsException.
		 */

		
	//test amb arraylist buida
		try {
			Venda.calcularTotal();

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());

		}

		Venda month = new Venda();
		
		Product p1 = new Product("taula", 100);
		Product p2 = new Product("lampada", 35);
		Product p3 = new Product("cadira", 60);
		
		month.addToArrayList(p1);
		month.addToArrayList(p2);
		month.addToArrayList(p3);
		
	//test amb arraylist amb objectes
		
		try {
			Venda.calcularTotal();

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());

		}
		
	}

}
