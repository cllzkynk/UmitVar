package day07;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Loops_For {
	public static void main(String[] args) {
		//Pascal ucgenini for loop yardimiyla olusturunuz.
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Ucgenin kat sayisini giriniz");
		
		int katSayisi=scan.nextInt();
		
		int [][] Pucgen =new int [katSayisi][];
	
		for (int i = 0; i < katSayisi; i++) {
			
			Pucgen[i]=new int [i+1];
			for (int j = 0; j < i; j++) {
				if (j==0 || i==1) {
					Pucgen[i][j]=1;
				}else {
					Pucgen[i][j]=Pucgen[i-1][j-1]+Pucgen[i-1][j];
				}
				System.out.print(Pucgen[i][j]+" "); // sayilari yaziyor 
			}
			
			
			System.out.println();
			
			
		}
		
		
	}
	
	

}
