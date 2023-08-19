package day03;

public class Modules {

	public static void main(String[] args) {
		//bolme islemi ama kalani verir
		
		System.out.println(15%10); // 1.5 bu islemin sonucudur. bolumdur...biz bolumu  degil kalani ariyoruz
		
		// bir sayinin tak mi siftmi oldugunu bulalim.
		
		int x=57;
		
		if (x%2==0) {
			System.out.println("Bu sayi cifttir");
		}else {
			System.out.println("Bu sayi tektir");
		}
		// verilen iki basamakli sayinin rakamlari toplamini bulalim 
		int sayi=47;
		
		int sondakiSayi=sayi%10;
		int ilkSayi=sayi/10;
		  
		System.out.println(sondakiSayi+ilkSayi);
		
		
		
		int esadinSayisi=48/10;
		if (esadinSayisi<3) {
			System.out.println("Dogru");
		}else {
			System.out.println("Yanlis");
		}

	
		
		
		
	}

}
