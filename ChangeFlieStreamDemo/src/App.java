import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fWriter;
		fWriter =new FileWriter("songque.txt");
		fWriter.write("Sông quê nước chảy đôi bờ..");
		fWriter.write("Để anh chín dại mười khờ.. thương .. em");
		fWriter.flush();
		fWriter.close();
	}

}
