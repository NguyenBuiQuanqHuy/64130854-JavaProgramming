import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fReader= new FileReader("songque.txt");
		BufferedReader bufferedReader = new BufferedReader(fReader);
		String dong1= bufferedReader.readLine();
		System.out.print(dong1);
	}

}
