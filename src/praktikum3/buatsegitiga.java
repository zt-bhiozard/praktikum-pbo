package praktikum3;
import java.util.scanner;

public class buatsegitiga {
	public static int inputdata() {
		int data;
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan Angka : ");
		data = input.nextInt();
		return data;	
	}
	public static void BuatSegitiga(int ulang) {
		for(int i =1; i<=ulang; i++) {	
			for(int j = 1; j<=i; j++) {
				System.out.println("");
			}
			System.out.println("");
		}
   }
	public static void main(String args[]) {
		int ulang = inputdata();
		BuatSegitiga(ulang);
		System.out.println("tinggi segitiga = "+ulang);
	}
}