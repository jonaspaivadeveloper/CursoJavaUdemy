package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new  ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 100.00));
		list.add(new Product("Hd CASE", 99.00));
		
//		O valor de p será criada no for
//		list.removeIf(p -> p.getPrice() >= 100);
		
//		list.removeIf(new ProductPredicate());
//		list.removeIf(Product :: staticProductPredicate);
		list.removeIf(Product :: nonStaticProductPredicate);
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
}
