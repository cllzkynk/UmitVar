package day07;

public class For_Examples3 {

	public static void main(String[] args) {
		int kat7toplam = 0;

		for (int i =-10000; i <= 0; i++) {

			if (i % 7 == 0) {
				kat7toplam = kat7toplam + i;
				System.out.print(i + ", ");

			}

		}
		System.out.println("\n1 den 100 e kadar 7  nin kati olan sayilarin toplami  " + kat7toplam);
		System.out.println("========================================================================================");
		int kat5toplam = 0;

		for (int i =-100; i <= 0; i++) {

			if (i % 5 == 0) {
				kat5toplam = kat5toplam + i;
				System.out.print(i + ", ");

			}

		}
		System.out.println("\n1 den 100 e kadar 5  nin kati olan sayilarin toplami  " + kat5toplam);
		
		System.out.println("========================================================================================");
		
		System.out.println("1 den 100 e kadar 5 in kati olan sayilarin toplami ve "
				+ "7 nin kati olan sayilarin toplaminin carpimi "+ (kat5toplam*kat7toplam)); 

	}

}
