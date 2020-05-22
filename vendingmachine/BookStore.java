package lab5;

import java.util.Scanner;

public class BookStore {
	public static void main(String [] args) {
		Book bookJava = new Book("Java",100, 5);
		Book bookSystem = new Book("System",100,6);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the new price of bookJava:");
		double price1 = scan.nextDouble();
		bookJava.setPrice(price1);
		System.out.println("Enter the new price of bookSystem:");
		double price2 = scan.nextDouble();
		bookSystem.setPrice(price2);
		System.out.println(bookJava);
		System.out.println("The number of characters are " + bookSystem.titleCharCount());
		System.out.println("Amout of differents books are " + Book.getCount());
		
	}

}