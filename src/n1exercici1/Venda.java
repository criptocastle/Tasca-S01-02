package n1exercici1;

import java.util.ArrayList;

public class Venda {
	private ArrayList<Producte> productes = new ArrayList<Producte>(); // coleccion productos
	private static double preuTotalVenda;

	
	
	public ArrayList<Producte> getProductes() {
		return productes;
	}

	public void setProductes(ArrayList<Producte> productes) {
		this.productes = productes;
	}

	public static double getPreuTotalVenda() {
		return preuTotalVenda;
	}

	public static void setPreuTotalVenda(double preuTotalVenda) {
		Venda.preuTotalVenda = preuTotalVenda;
	}

	
	
	// metode
	public static void calcularTotal(ArrayList<Producte> productes, double preuTotalVenda) throws VendaBuidaException {
		Producte producte = new Producte("", 0);

		if (productes.size() <= 0) { // falta index mes gran que array.size
			throw new VendaBuidaException("Per fer una venda primer has d'afegir productes");

		} else {
			for (int i = 0; i <= productes.size(); i++) {
				producte = productes.get(i);
				preuTotalVenda += producte.getPreu();
			}

		}
	}

}
