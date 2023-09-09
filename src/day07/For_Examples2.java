package day07;

public class For_Examples2 {

	public static void main(String[] args) {
		// 1 den 100 e kadar olan cift sayilarin toplamini  yazdiralim
	
		int ciftToplam=0;
		
    for (int i = 0; i <= 1000000; i++) {
	
	if (i%2==0) {
		ciftToplam=ciftToplam+i;
	}
	

}
	System.out.println("1 den 100 e kadar cift sayilarin  toplami  "+ciftToplam);	
	
	System.out.println("==============================");
	
		
	int tekToplam=0;
	
    for (int i = 0; i <= 100; i++) {
	
	if (i%2==1) {
		tekToplam=tekToplam+i;
	}
	
	
}
	System.out.println("1 den 100 e kadar tek sayilarin toplami  "+tekToplam);	
	
	
	System.out.println("==============================");
	
	
	int toplam=0;
	
    for (int i = 0; i <= 100; i++) {
	

	toplam=toplam+i;

	
	
}
	System.out.println("1 den 100 e kadar  sayilarin toplami  "+toplam);	
	
	System.out.println("==============================");
	
	
	
int kat7toplam=0;
	
    for (int i = 0; i <= 100; i++) {
	

    	if (i%7==0) {
    		kat7toplam=kat7toplam+i;
    		System.out.print(i+", ");
    		
    	}
    	

	
	
}
	System.out.println("\n1 den 100 e kadar 7nin kati olan sayilarin toplami  "+kat7toplam);	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
