package praktikum5;
import java.util.Scanner;
public class test {
	public static void main(String[]args) {
		String namakucing, warnakucing;
		int beratkucing;
		Scanner input = new Scanner(System.in);
		
		System.out.print("masukan nama kucing : ");
		namakucing =input.next();
		
		System.out.print("masukan warna kucing : ");
		warnakucing = input.nextInt();
		
		System.out.print("masukan berat kucing : ");
		beratkucing = input.nextInt();
		
		Cat kucingSaya = new Cat();
		kucingSaya.identitas(namakucing, warnakucing, beratkucing );
		System.out.print("kucing " + kucingSaya.name
				+ " berat "+kucingSaya.ambilberat();
				+ " warnanya "+kucingSaya.ambilWarna());
		kucingSaya.eat();
	}

}
