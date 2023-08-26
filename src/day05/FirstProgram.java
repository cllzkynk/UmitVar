package day05;

import day04.Deneme;

import java.util.*;

public class FirstProgram {

	public static void main(String[] args) {
		// boy kilo endeksi
		// boy kilo arasindaki fark 35 yas alti icin 15
		// 35 yas ustu icin 10 olmalidir. Bu aralik saglikli demektir aralik disi
		// sagliksi demektir.

		
		
		/*
		Scanner mehmet=new Scanner(System.in);
		
		
		System.out.println("Lutfen gulunecek ismi giriniz");
		String UZUMUZUMEBAKABAKAKARARIR=mehmet.nextLine();
		
	 	Deneme.ismeGul(UZUMUZUMEBAKABAKAKARARIR);
		
		*/
		
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen isminizi giriniz");
		String name = scan.next();

		System.out.println("Lutfen boyunuzu giriniz");
		int boy = scan.nextInt(); //170

		System.out.println("Lutfen kilonuzu giriniz");
		int kilo = scan.nextInt();  //75
		
		int guvenliAralik=boy-100-kilo;  // -5  veya +5
		
		System.out.println("Lutfen yasinizi giriniz");
		int yas = scan.nextInt();  
		
		if (yas<35) {
			if (guvenliAralik<15 && guvenliAralik>-15  ) {
				System.out.println(name+" bey gayet saglikli gorunuyorsun");
				
			}else if(guvenliAralik>15) {
				System.out.println("Biraz yemek yiyip kilo alman lazim");
			}else {
				System.out.println("Cok yeme biraz kilo ver");
			}
		}else {
			
			if (guvenliAralik<10 && guvenliAralik>-10  ) {
				System.out.println(name+" bey gayet saglikli gorunuyorsun");
				
			}else if(guvenliAralik>10) {
				System.out.println("Biraz yemek yiyip kilo alman lazim");
			}else {
				System.out.println("Cok yeme biraz kilo ver");
			}
			
		}
		
		
		
	}

}
