package Praktikum4;
import java.util.Scanner;

public class Testtabungan {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int saldo, tariktunai;
		
		System.out.print("Masukan jumlah saldo : ");
		saldo = input.nextInt();
		Tabungan tabungan = new Tabungan(saldo);
		System.out.println("Saldo awal : "+tabungan.saldo);
		
		System.out.print("Masukan saldo penarikan : ");
		tariktunai =input.nextInt();
		tabungan.ambiluang(tariktunai);
		System.out.println("jumlah uang yang diambil :"+tariktunai);
	    System .out.println("saldo sekarang :"+tabungan.saldo);
	}
	
	

}
