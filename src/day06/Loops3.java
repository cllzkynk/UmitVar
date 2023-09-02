package day06;

import java.util.Iterator;

public class Loops3 {

	public static void main(String[] args) {
		 // for kullanarak primait olusturunuz
		int satirSayisi = 5;
		for (int i = 1; i <= satirSayisi; i++) {
		    for (int j = 1; j <= satirSayisi - i; j++) {
		        System.out.print(" ");
		    }
		    for (int k = 1; k <= 2 * i - 1; k++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}

}
