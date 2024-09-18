import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float w,h,bmi;
		Scanner testScanner= new Scanner(System.in);
		while(true) {
			try {
				System.out.print("Nhập cân nặng: ");
				w=testScanner.nextFloat();
				if(w>=30 && w<=100) break;
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.print("Cân nặng không hợp lệ");
			}
			
		}
		
		while(true) {
			try {
				System.out.print("Nhập chiều cao: ");
				h=testScanner.nextFloat();
				if(h>=1.0 && h<=2.2) break;
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.print("Chiều cao không hợp lệ");
			}
			
		}
		
		
		bmi=w/(h*h);
		if(bmi<18.5) {
			System.out.print(bmi + ": Thiếu cân");
		}
		else if (bmi>18.5 && bmi <24.9) {
			System.out.print(bmi + ":  Bình thường");
		}
		else if (bmi>25 && bmi <29.9) {
			System.out.print(bmi + ":  Thừa cân");
		}
		else System.out.print(bmi + ":  Béo phì");
	}

}
