
public class Dog implements IAnimal{
	private boolean gender;
	private String categori;
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Gâu Gâu");
	}
	public Dog(boolean gender, String categori) {
		super();
		this.gender = gender;
		this.categori = categori;
	}
	@Override
	public String toString() {
		return "Dog [gender=" + gender + ", categori=" + categori + "]";
	}
	
}
