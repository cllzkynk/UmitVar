package day05;

import java.util.Iterator;

public class Loops {
	public static void main(String[] args) {

		int toplam = 0;

		for (int i = 0; i < 101; i++) {
			System.out.println("Mevcut Durum = Toplam(" + toplam + ")+ i(" + i + ")");
			toplam = toplam + i;
			System.out.println("Mevcut Durumda Toplam(" + toplam + ")   VE  i(" + i + ")");

			System.out.println("Mevcut toplam =" + toplam);

			System.out.println(i + ".adim sonu");
			System.out.println("================================================================");
		}

		System.out.println("Toplam =" + toplam);

	}
}
