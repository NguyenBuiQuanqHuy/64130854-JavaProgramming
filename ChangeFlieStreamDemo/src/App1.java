import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class App1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fReader=new FileReader("songque.txt");
		char [] buff = null;
		buff=new char[10];
		fReader.read(buff);
		fReader.close();
		for(int i=0;i<10;i++) {
			System.out.print(buff[i]);
		}
		System.out.print("\n"+String.valueOf(buff));
	}

}
