package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("Email", "Maria@gmail.com");
		cookies.put("iphone", "99422145");
		
		cookies.remove("Email");
		cookies.put("iphone", "12212");
		
		System.out.println("Contains iphone key : " + cookies.containsKey("iphone"));
		System.out.println("Phone number: " + cookies.get("iphone"));
		System.out.println("Email: " + cookies.get("Email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("ALL COOKIES");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}

}
