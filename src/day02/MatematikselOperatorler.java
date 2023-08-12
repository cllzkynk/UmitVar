package day02;

public class MatematikselOperatorler {

	public static void main(String[] args) {
		
		// mantik ====> VE   VEYA 
	//	==
		// ve &&
		//veya ||
		//a+b=ab seklinde toplama olmayan birlestirmeye concet denir
		
		
		// System.out.println(    5+( 5+8+"x"+ 5*3 )      );
		
		int yas=25;
		
		
		//If conditions
		/*
		if(yas >18) {
			
			System.out.println("Ehliyet alabilirsin"); 
			
		}else {
			System.out.println("Ehliyet yok");
		}
		*/
		int mustafaAccount=90;
		boolean senderAccount=true;
		boolean reciverAccount	=false;	
		
		String z="lkdf";
		
		
		if (senderAccount==true) { //= atama yapmak icin kullanilir == karsilastirma yapmak icin kullanilir
			if (mustafaAccount>100) {
				if (reciverAccount==true) {
					System.out.println("Paraniz gonderildi. Bizi tercih ettiginiz icin tesekkur ederiz");
				}else {
					System.out.println("Alici hesap numarasi dogru degil. Tekrar deneyiniz");
				}
			}else {
				System.out.println("Hesabinizda yeterli bakiye yok");  
			}
		}else {
			System.out.println("Hesap numaranizi tekrar giriniz");
		}
		
		
		//aradigim sartlar 1 mali varsa kredi verebilirim . 2 maasi iyi ise  (25k uzeri olmasi gerekli)
		
		boolean maliVarMi=true;
		int maas=50000;
		
		
		
		if (!(maliVarMi|| maas>25000)) {
			System.out.println("Krediniz onaylandi");
		}else {
			System.out.println("Hacim ekonomi kotu kredi zaten haram. yok sana kredi");
		}
		
		
		boolean bankaCostumer=true;
		
		if (bankaCostumer && (maliVarMi|| maas>25000)) {
			System.out.println("Krediniz onaylandi");
		}else {
			System.out.println("Hacim ekonomi kotu kredi zaten haram. yok sana kredi");
			
		}
		
		

	}

}
