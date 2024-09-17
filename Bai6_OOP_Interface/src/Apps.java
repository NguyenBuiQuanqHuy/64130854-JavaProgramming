import javax.swing.text.GapContent;

public class Apps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1 = new Cat(false,"Tam Thể");
		Dog d1 = new Dog(true, "Bull");
		System.out.println(c1.toString());
		System.out.println(d1.toString());
		IAnimal c2= new Cat(false, "Mun");
		IAnimal d2= new Dog(true, "Mực");
		System.out.println(c2.toString());
		System.out.println(d2.toString());
	}

}
