import java.io.FileInputStream;
import java.io.IOException;

public class App1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin;
		fin=new FileInputStream("num.clc");
		int byteRead;
		while(true) {
			byteRead=fin.read();
			if(byteRead == -1) {
				break;
			}
			System.out.print(byteRead);
			System.out.print(" ");
		}
	}

}
