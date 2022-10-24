package n1exercici1;

import java.util.ArrayList;

public class Venda {

	private static ArrayList<Product> products = new ArrayList<Product>(); // coleccion productos
	private static double sellTotalPrice;

//constructor buit
	public Venda() {

	}

// getters
	public static ArrayList<Product> getProducts() {
		return products;
	}

//setters

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	
	
// methods
	public void addToArrayList(Product pr) {
		products.add(pr);
	}

	public static void calcularTotal() throws VendaBuidaException {

		if (products.isEmpty()) {
			throw new VendaBuidaException("Per fer una venda primer has d'afegir productes");

		} else {
			for (int i = 0; i <= products.size(); i++) {
				sellTotalPrice += products.get(i).getPrice();
			}

		}
		System.out.println("El preu total de la venda és: " + sellTotalPrice);
	}

}
