package Praktikum4;

import java.util.Scanner;

public class Testsiswa {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String nama;
		int npm;
		
		System.out.print("Masukan nama : ");
		nama = input.next();
		System.out.print("Masukan NPM :");
		npm = input.nextInt();
		
		Siswa anak = new Siswa();
		anak.setNama("nama");
		anak.SetNrp(npm);
		
		System.out.print("nama siswa : "+anak.nama
				+"\nNPM Siswa :"+ anak.nrp);
	}
}
