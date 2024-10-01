import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		FileOutputStream fout = null;
		// TODO Auto-generated method stub
		try {
		fout =new FileOutputStream("num.clc");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File khong ton tai!");
		}
		//Ghi dữ liệu vào file
		try {
			for(int i=1;i<=127;i++) 
				fout.write(i);
				fout.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("Done");
	}

}
