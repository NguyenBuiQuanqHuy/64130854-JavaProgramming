import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Draw extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		// Vẽ tam giác lớn (đầu)
        int[] xPoints = {100, 200, 0};
        int[] yPoints = {0, 200, 200};
        g2d.drawPolygon(xPoints, yPoints, 3);

        // Vẽ các tam giác nhỏ (tai)
        int[] xPointsLeftEar = {30, 50, 10};
        int[] yPointsLeftEar = {0, 50, 50};
        g2d.drawPolygon(xPointsLeftEar, yPointsLeftEar, 3);

        int[] xPointsRightEar = {170, 190, 150};
        int[] yPointsRightEar = {0, 50, 50};
        g2d.drawPolygon(xPointsRightEar, yPointsRightEar, 3);

        // Vẽ tam giác đỏ ở giữa đầu
        g2d.setColor(Color.RED);
        int[] xPointsRedTriangle = {90, 110, 70};
        int[] yPointsRedTriangle = {100, 140, 140};
        g2d.drawPolygon(xPointsRedTriangle, yPointsRedTriangle, 3);

        // Vẽ thân hình tròn
        g2d.setColor(Color.BLACK);
        g2d.drawOval(50, 200, 100, 100);

        // Vẽ chân
        g2d.drawOval(40, 300, 30, 30);
        g2d.drawOval(130, 300, 30, 30);

        // Vẽ các đường cong đỏ bên trong chân
        g2d.setColor(Color.RED);
        g2d.drawArc(40, 310, 30, 20, 0, -180);
        g2d.drawArc(130, 310, 30, 20, 0, -180);
	}
}


