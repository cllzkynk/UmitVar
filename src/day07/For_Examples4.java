package day07;

public class For_Examples4 {

	public static void main(String[] args) {
		int kat7fark = 0;

		for (int i =-100; i <= 0; i++) {

			if (i % 7 == 0) {
				kat7fark = kat7fark + i;
				
				
				System.out.print(i + ", ");
				System.out.println("bu adimdaku islem sonucu "+kat7fark);

			}

		}
		System.out.println("\n1 den 100 e kadar 7  nin kati olan sayilarin farki  " + kat7fark);

	}

}
