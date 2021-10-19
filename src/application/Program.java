package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new  ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 100.00));
		list.add(new Product("Hd CASE", 99.00));
		
//		O valor de p ser� criada no for
//		list.removeIf(p -> p.getPrice() >= 100);
		
//		list.removeIf(new ProductPredicate());
//		list.removeIf(Product :: staticProductPredicate);
		
		Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		list.removeIf(pred);
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
}
