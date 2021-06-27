package problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ListOfProducts {

	private ArrayList<Product> products = new ArrayList<Product>();
	
	public void add(Product p) {
		if(p!=null) products.add(p);
	}
	public int getSize() {
		return products.size();
	}

	public String[] toArray() {
		String[] result = new String[products.size()];
		for (int i = 0; i < products.size(); i++) {
			result[i] = products.get(i).toString();
		}
		return result;
	}

	public double averagePrice() {
		double average = 0;
		if (products.size() == 0)
			return 0;
		for (Product p : products) {
			average += p.getPrice();
		}
		return average / products.size();
	}

	public String toString() {
		if(products.size()==0) return "[]";
		String result = "[";
		for (int i = 0; i < products.size()-1; i++) {
			result += products.get(i).toString() + ", \n";
		}
		return result +products.get(products.size()-1).toString()+ "]";
	}

	public void sortByPrice() {
		Collections.sort(products);
	}
}
