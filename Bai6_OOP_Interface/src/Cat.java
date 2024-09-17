
public class Cat implements IAnimal{
	private boolean gender;
	private String categori;
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Meo Meo");
	}
	public Cat(boolean gender, String categori) {
		super();
		this.gender = gender;
		this.categori = categori;
	}
	@Override
	public String toString() {
		return "Cat [gender=" + gender + ", categori=" + categori + "]";
	}
	
}
