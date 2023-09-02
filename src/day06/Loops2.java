package day06;

import java.util.Scanner;

public class Loops2 {

	public static void main(String[] args) {
		// Girilen bir cumleyi For kullanarak tersten yazdiriniz
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen tersten yazilmasini istediginiz cumleyi giriniz");
		String str = scan.nextLine();

		int karakterSayisi = str.length();

		// index ile length metodu aradinda 1 sayilik fark var. index 0 dan saymaya
		// baslar lenght 1 den dolayisiyla son karakter length-1 dir

		// Veli topla oyna.

		String bosKutu = "";

		for (int i = karakterSayisi - 1; i >= 0; i--) {
			bosKutu = bosKutu + str.charAt(i);
			System.out.println(bosKutu);
			System.out.println("=============================");
		}
		System.out.println(bosKutu);
	}

}
