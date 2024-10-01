import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

public class App3Net {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Tạo chuỗi định vị 
		URL url= new URL( "https://ntu.edu.vn/default.aspx");
		URLConnection connection = url.openConnection();
		InputStream inputStream = connection.getInputStream();
		InputStreamReader ir= new InputStreamReader(inputStream);
		BufferedReader bufReader = new BufferedReader(ir);
		String lineString;
		while(true) {
			lineString=bufReader.readLine();
			if(lineString==null) break;
			System.out.println(lineString);
		}
	}

}
