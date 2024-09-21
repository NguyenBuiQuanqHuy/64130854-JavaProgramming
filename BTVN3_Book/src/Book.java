
public class Book implements IBook{
	int id;
	String name;
	String publishdate;
	String author;
	String language;
	float averageprice;
	int[] pricelist= new int[5];
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Publish Date: "+name);
		System.out.println("Author: "+author);
		System.out.println("Language: "+language);
		System.out.println("Average Price: "+averageprice);
	}
	public Book(int id, String name, String publishdate, String author, String language) {
		super();
		this.id = id;
		this.name = name;
		this.publishdate = publishdate;
		this.author = author;
		this.language = language;
	}
	
	public void calcutale() {
		int sum=0;
		for(int price : pricelist) {
			sum+= price;
		}
		averageprice=(float)sum/5;
	}
	public void setPricelist(int[] pricelist) {
		this.pricelist = pricelist;
	}
	
	
	
	
}
