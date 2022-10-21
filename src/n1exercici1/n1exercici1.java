package n1exercici1;

public class n1exercici1 {

	public static void main(String[] args) throws VendaBuidaException {
		/*
		 * Escriu el codi necessari per a generar i capturar una excepció de tipus
		 * ArrayIndexOutOfBoundsException.
		 */

		try {
			Venda.calcularTotal(null, 0);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
			
		} finally {
			System.out.println("El preu total de venda és: " + Venda.getPreuTotalVenda());
		}

	}

}
