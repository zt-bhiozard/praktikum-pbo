package praktikum5;
// inheritance (pewarisan)
//dan visability 
public abstract class Hewan {
	protected static String name; 
	protected abstract void eat();
}
class Cat extends Hewan {
	String warna;
	int berat;
//inheritance	
	public void identitas(String namaKucing, String warnakucing, int beratkucing) {
		Cat.name = namaKucing;
		warna = warnakucing;
		berat = beratkucing;
	}
	public void eat() {
		System.out.print(Cat.name + " makan wishkas ");
	}
	//visability 
	String ambilNama() {
		return Cat.name;
	}
	String ambilWarna() {
		return warna;
	}
	int ambilBerat()
	{
		return berat;
	}
}