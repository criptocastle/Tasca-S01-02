package n1exercici1;

public class Product {
	private String name = "";
	private int price;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

//getters
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

//setters
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
