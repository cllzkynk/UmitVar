package day06;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen \nToplama icin 1 \nCikarma icin 2 \nCarpma icin 3\nBolme icin 4\ngiriniz");
		byte hesapTuru=scan.nextByte();
		
		System.out.println("Lutfen birinci sayiyi giriniz ");
		double sayi1=scan.nextDouble();
		
		System.out.println("Lutfen ikinci sayiyi giriniz");
		double sayi2=scan.nextDouble();
		
		switch (hesapTuru) {
		case 1:  
			System.out.println("Girilen degerlerin toplami = "+sayi1+"+"+sayi2+"="+(sayi1+sayi2));
			 break;
		case 2:  
			System.out.println("Girilen degerlerin farki = "+sayi1+"-"+sayi2+"="+(sayi1-sayi2));
			 break;	 
		case 3:  
			System.out.println("Girilen degerlerin carpimi = "+sayi1+"x"+sayi2+"="+(sayi1*sayi2));
			 break;
		case 4:  
			if(sayi2==0) {
				System.out.println("Payda sifir olamaz lutfen farkli degerlerle daneyiniz");
			}else {
			System.out.println("Girilen degerlerin bolumu = "+sayi1+"/"+sayi2+"="+(sayi1/sayi2));
			}
			 break;	 
		 
		default:
			System.out.println("Bu hesap makinasi sadece 4 islem yapabilir");
		}
		
		

	}

}
