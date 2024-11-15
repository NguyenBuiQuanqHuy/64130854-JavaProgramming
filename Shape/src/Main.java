import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jFrame=new JFrame("Shape");
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
		Draw draw=new Draw();
		jFrame.add(draw);
		jFrame.setSize(400,250);
		jFrame.setVisible(true);
	}

}
