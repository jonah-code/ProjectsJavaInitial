package ProjetoComClasse.ProjetoBar;

import java.util.Locale;
import java.util.Scanner;

public class Bar {
	public static void main(String[] args) {
		
		Bill bill = new Bill();
		char gender;
		int qtBeer;
		int qtBarbecue;
		int qtSoftDrink;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("sexo:");
		gender = sc.next().charAt(0);
		bill.gender = gender;
		
		
		System.out.print("quantidade de cerveja:");
		qtBeer = sc.nextInt();
		bill.beer = qtBeer;
		
		System.out.print("quantidade de refrigerantes:");
		qtSoftDrink = sc.nextInt();
		bill.softDrinks = qtSoftDrink;
		
		
		System.out.print("quantidade de churasco:");
		qtBarbecue = sc.nextInt();
		bill.barbecue =  qtBarbecue;
		
		
		System.out.println(bill);
		//System.out.printf("%s %d %d", gender, qtBeer , qtBarbecue);
		sc.close();
	}
}
