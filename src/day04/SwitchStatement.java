package day04;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {

		/*
		 * universitede not hesaplanacak 0-40 arasi FF 40-50 FD 50-60 DD 60-70 DC 70-75
		 * CB 75-80 BB 80-90 BA 90-100 AA
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("Lutfen notunuzu giriniz : ");

		String harfNotu = scan.next();
		switch (harfNotu) {

		case "FF":
			System.out.println("Notunuz 00 40 arasinda");
			break;
		case "FD":
			System.out.println("Notunuz 40-50    arasinda");
			break;
		case "DD":
			System.out.println("Notunuz 50-60    arasinda");
			break;
		case "DC":
			System.out.println("Notunuz 60-70     arasinda");
			break;
		case "CC":
			System.out.println("Notunuz 70-75   arasinda");
			break;
		case "CB":
			System.out.println("Notunuz 75-80     arasinda");
			break;
		case "BB":
			System.out.println("Notunuz 80-90   arasinda");
			break;
		case "AA":
			System.out.println("Notunuz 90-100    arasinda");
			break;
		default:

			throw new IllegalArgumentException("Yanlis giris yaptiniz tekrar deneyiniz");

		// throw new IllegalArgumentException bizim syso ile hata bildirimi yaptigimiz
		// gibi hata bilfirimine yara artisi kirmizi renkli hata mesaji olusturu
		}

	}
}
