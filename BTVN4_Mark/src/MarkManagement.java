import java.util.ArrayList;
import java.util.Scanner;

public class MarkManagement {
	private static ArrayList<StudentMark> studentMarks=new ArrayList<StudentMark>();
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		do {
			System.out.println("1.Insert new student: ");
			System.out.println("2.View list of Student: ");
			System.out.println("3.Average Mark: ");
			System.out.println("4.Exit: ");
			System.out.print("Choose your choice: ");
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
				default: System.out.print("Invalid choosen!");
			}
		}while(choice!=4);
	}
	
	private static void Insert() {
		System.out.print("Enter full name: ");
		String name = scanner.nextLine();
		System.out.print("Enter ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter class: ");
		String Class = scanner.nextLine();
		System.out.print("Enter semester: ");
		int semester = scanner.nextInt();
		scanner.nextLine();
		StudentMark studentMark = new StudentMark(name, id, Class, semester);
		 int[] listmark = new int[5];
		 for(int i=0;i<5;i++) {
			 System.out.print("Enter "+(i+1)+": ");
			 listmark[i]=scanner.nextInt();
		 }
		studentMark.setListmark(listmark);
		studentMarks.add(studentMark);
	}
	
	private static void View() {
		for(StudentMark mark:studentMarks) {
			mark.display();
		}
	}
	
	private static void Calculate() {
		for(StudentMark mark:studentMarks) {
			mark.Calculate();
			mark.display();
		}
	}
}
