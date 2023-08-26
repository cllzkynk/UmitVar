package day04;

import java.util.Scanner;

public class ScannerClass {
public static void main(String[] args) {
 
	
	
	
	Scanner esat=new Scanner (System.in);

	System.out.println("Lutfen isminizi giriniz");
	
	String name =esat.nextLine();
	
	
	System.out.println(name+"   Girilen isim budur");

	
	System.out.println("Lutfen sayiyi giriniz");
	int x=esat.nextInt();
	
	if (x%2==0) {
		System.out.println("Bu sayi cifttir");
	}else {
		System.out.println("Bu sayi tektir");
	}
	
	double deneme=esat.nextDouble();
 
	
	
	
	
	
}
}
