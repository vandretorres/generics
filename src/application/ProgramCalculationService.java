package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import entities.Product;
import services.CalculationService;

public class ProgramCalculationService {


	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		String path = "C:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
		
			String product = br.readLine();
			
			while (product != null) {
	
				String[] fields = product.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				product = br.readLine();
			}
			
			Product maxProd = CalculationService.max(list);
			
			
			
			System.out.println("Most Expensive Product");
			System.out.println(maxProd.getName() + " - " + String.format("%.2f",maxProd.getPrice()));
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	
	}

}
