import java.util.ArrayList;
import java.util.Scanner;

public class ManageNews {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		ArrayList<News> listnews= new ArrayList<News>();
		int choice;
		do {
			System.out.println("1.Insert News");
			System.out.println("2.View List News");
			System.out.println("3.Average Rate");
			System.out.println("4.Exit");
			System.out.print("Choose An Option: ");
			choice=scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 1:
				News news= new News();
				System.out.print("Enter Title: ");
				news.setTitle(scanner.nextLine());
				System.out.print("Enter Publish Date: ");
				news.setPublishDate(scanner.nextLine());
				System.out.print("Enter Author: ");
				news.setAuthor(scanner.nextLine());
				System.out.print("Enter Content: ");
				news.setContent(scanner.nextLine());
				
				int[] rate = new int[3];
				System.out.println("Enter 3 Rates: ");
				for(int i=0;i<rate.length;i++) {
					System.out.print("Rate "+(i+1)+": ");
					rate[i]=scanner.nextInt();
				}
				 
				news.setRateList(rate);
				listnews.add(news);
				break;
			
			case 2:
				for(News n: listnews) {
					n.Display();
					System.out.println();
				}
				break;
			
			case 3:
				for(News n: listnews) {
					n.Calculate();
					n.Display();
					System.out.println();
				}
				break;
				
			case 4: 
				System.out.print("Exiting....");
				break;
			default:
				System.out.println("Invalid option! Please choose again.");
                break;
			}
		}while(choice!=4);
	}

}
