package day02;

public class MatematikselOperatorler {

	public static void main(String[] args) {

		// mantik ====> VE VEYA
		// ==
		// ve &&
		// veya ||
		// a+b=ab seklinde toplama olmayan birlestirmeye concet denir

		// System.out.println( 5+( 5+8+"x"+ 5*3 ) );

		int yas = 25;

		// If conditions
		/*
		 * if(yas >18) {
		 * 
		 * System.out.println("Ehliyet alabilirsin");
		 * 
		 * }else { System.out.println("Ehliyet yok"); }
		 */
		int mustafaAccount = 90;
		boolean senderAccount = true;
		boolean reciverAccount = false;

		String z = "lkdf";

		if (senderAccount == true) { // = atama yapmak icin kullanilir == karsilastirma yapmak icin kullanilir
			if (mustafaAccount > 100) {
				if (reciverAccount == true) {
					System.out.println("Paraniz gonderildi. Bizi tercih ettiginiz icin tesekkur ederiz");
				} else {
					System.out.println("Alici hesap numarasi dogru degil. Tekrar deneyiniz");
				}
			} else {
				System.out.println("Hesabinizda yeterli bakiye yok");
			}
		} else {
			System.out.println("Hesap numaranizi tekrar giriniz");
		}

		// aradigim sartlar 1 mali varsa kredi verebilirim . 2 maasi iyi ise (25k uzeri
		// olmasi gerekli)

		boolean maliVarMi = true;
		int maas = 50000;

		if (!(maliVarMi || maas > 25000)) {
			System.out.println("Krediniz onaylandi");
		} else {
			System.out.println("Hacim ekonomi kotu kredi zaten haram. yok sana kredi");
		}

		double bankaCostumer = 1;

		if (bankaCostumer == 1 && (maliVarMi || maas > 25000)) {
			System.out.println("Krediniz onaylandi");
		} else {
			System.out.println("Hacim ekonomi kotu kredi zaten haram. yok sana kredi");

		}

		int yas1 = 34;
		char gender = 'm';
		int sinavPuani=70;
		int boy = 165;
		int kilo = 60;
		boolean sagliklimi = true;
		boolean ehliyet = true;
		char vatandaslik = 'T';

		// 34den genc ehliyeti olcak tr vatandasi olcak saglikli olacak boyun 100+x
		// kisminda ki x ile kilo farki en fazla 10 olacak cinsiyeti de erkek olsun puanida 70 den yuksek olsun 
		
		System.out.println("Merhaba uzayli ");
		
		if (ehliyet) {
			System.out.println("Ehliyet ifi calisti");
		}
		
		
		// == esitleme degil sorgulamadir
		
	if (ehliyet==false) {
		System.out.println("Ehliyet tamam digerlerine bakalim .................");
		if (sagliklimi==true) {
			System.out.println("Saglik tamam digerlerine bakalim ................."); 
			if (vatandaslik=='T') {
				System.out.println("Vatandaslik tamam digerlerine bakalim .................");
				if ((boy-100)-kilo<=10 && (boy-100)-kilo>=-10) {
					System.out.println("boy kilo tamam digerlerine bakalim .................");
					if (sinavPuani>=70) {
						System.out.println("Sinav puani tamam digerlerine bakalim .................");
						if (yas1<=34) {
							System.out.println("Yas sarti tamam digerlerini kontrol ediyorum .................");
							if (gender=='m' ) {
								System.out.println("Secildiniz. Hayirli ugurlu olsun ");
							} 
						}
					}
				} 
			}
		}
	}else {
		System.out.println("Polislik icin ehliyet onemlidir. ehliyet alip tekrar deneyiniz");
	}
		
		

	}

}
