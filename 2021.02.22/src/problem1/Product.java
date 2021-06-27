package problem1;

import java.text.DecimalFormat;

public class Product implements Comparable<Product> {

	private String description;
	private int id;
	private double price;

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	public Product(String description, int id, double price) {
		this.description = description;
		this.id = id;
		this.price = price;
	}

	public Product() {
		description = "";
		id = 0;
		price = 0;
	}

	public Product(Product p) {
		id = p.id;
		price = p.price;
		description = "";
		for (int i = 0; i < p.description.length(); i++) {
			description += p.description.charAt(i);
		}
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("####0.00");
		return " ID: " + id + "\tPrice: " + df.format(price) + "\tDescription: " + description;
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		if (this.price > o.price)
			return 1;
		if (this.price < o.price)
			return -1;
		return 0;
	}
}
