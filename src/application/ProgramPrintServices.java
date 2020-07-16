package application;

import java.util.Scanner;

import services.PrintService;

public class ProgramPrintServices {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("How many values: ");
		int n = sc.nextInt();
		
		for(int i = 0; i< n; i++) {
			int value = sc.nextInt();
			
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println();
		System.out.println("First: " + ps.first());
		
		sc.close();

	}

}
