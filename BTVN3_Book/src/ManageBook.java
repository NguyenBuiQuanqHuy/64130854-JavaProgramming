import java.util.ArrayList;
import java.util.Scanner;

public class ManageBook {
	private static Scanner scanner= new Scanner(System.in);
	private static int autoid;
	private static ArrayList<Book> listbook =new ArrayList<Book>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		
		
		do {
			System.out.println("Menu: ");
			System.out.println("1.Insert new book: ");
			System.out.println("2.View list of book: ");
			System.out.println("3.Average Price: ");
			System.out.println("4.Exit: ");
			System.out.print("Choose your option: ");
			choice=scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1: 
				Insert();
				break;
			case 2:
				View();
				break;
			case 3:
				Calculate();
				break;
			case 4:
				System.out.print("Exiting...");
				break;
			default: System.out.print("Invalid choice. Please try again.");
			}
		}while(choice!=4);
		
	}
	private static void Insert() {
		System.out.print("Enter book name: ");
		String name = scanner.nextLine();
		System.out.print("Enter publish date: ");
		String publishdate =scanner.nextLine();
		System.out.print("Enter author: ");
		String author = scanner.nextLine();
		System.out.print("Enter language: ");
		String language = scanner.nextLine();
		
		Book book=new Book(autoid++, name, publishdate, author, language);
		int[] pricelist = new int[5];
		for(int i=0;i<5;i++) {
			System.out.print("Enter price "+(i+1)+": ");
			pricelist[i]=scanner.nextInt();
		}
		book.setPricelist(pricelist);
		listbook.add(book);
	}
	
	private static void View() {
		for(Book book: listbook) {
			book.display();
			System.out.println();
		}
	}
	
	private static void Calculate() {
		for(Book book: listbook) {
			book.calcutale();
			book.display();
			System.out.println();
		}
	}
}
