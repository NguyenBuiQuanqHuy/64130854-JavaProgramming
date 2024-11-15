package huy.ntu.shape_java;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Draw extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        // Tạo một Pane để chứa các hình vẽ
        Pane pane = new Pane();


        // Đầu
        Polygon face = new Polygon();
        face.getPoints().addAll(
                155.0, 50.0,
                305.0, 200.0,
                5.0, 200.0
        );
        face.setFill(Color.WHITE);
        face.setStroke(Color.BLACK);
        face.setStrokeWidth(5);

        // Tai trái
        Polygon leftEar = new Polygon();
        leftEar.getPoints().addAll(
                115.0, 90.0,
                115.0, 40.0,
                145.0, 60.0
        );
        leftEar.setFill(null);
        leftEar.setStroke(Color.BLACK);
        leftEar.setStrokeWidth(5);

        // Tai phải
        Polygon rightEar = new Polygon();
        rightEar.getPoints().addAll(
                165.0, 60.0,
                195.0, 40.0,
                195.0, 90.0
        );
        rightEar.setFill(null);
        rightEar.setStroke(Color.BLACK);
        rightEar.setStrokeWidth(5);

        // Mũi
        Polygon nose = new Polygon();
        nose.getPoints().addAll(
                155.0, 175.0,
                180.0, 140.0,
                130.0, 140.0
        );
        nose.setFill(null);
        nose.setStroke(Color.RED);
        nose.setStrokeWidth(3);

        // Thân
        Circle mainBody = new Circle(155, 235, 65); // (x, y, bán kính)
        mainBody.setStroke(Color.BLACK);
        mainBody.setStrokeWidth(5);
        mainBody.setFill(null);

        // Chân trái
        Circle leftFoot = new Circle(110, 290, 20);
        leftFoot.setStroke(Color.BLACK);
        leftFoot.setStrokeWidth(5);
        leftFoot.setFill(Color.WHITE);

        // Chân phải
        Circle rightFoot = new Circle(200, 290, 20);
        rightFoot.setStroke(Color.BLACK);
        rightFoot.setStrokeWidth(5);
        rightFoot.setFill(Color.WHITE);


        // Đường cong chân trái
        Arc leftFootCurve1 = new Arc(105, 297, 10, 10, 90, 120);
        leftFootCurve1.setFill(null);
        leftFootCurve1.setStroke(Color.RED);
        leftFootCurve1.setStrokeWidth(3);
        leftFootCurve1.setType(ArcType.OPEN);

        Arc leftFootCurve2 = new Arc(107, 297, 10, 10, -80, 120);
        leftFootCurve2.setFill(null);
        leftFootCurve2.setStroke(Color.RED);
        leftFootCurve2.setStrokeWidth(3);
        leftFootCurve2.setType(ArcType.OPEN);

        // Đường cong chân phải
        Arc rightFootCurve1 = new Arc(197, 297, 10, 10, 120, 120);
        rightFootCurve1.setFill(null);
        rightFootCurve1.setStroke(Color.RED);
        rightFootCurve1.setStrokeWidth(3);
        rightFootCurve1.setType(ArcType.OPEN);

        Arc rightFootCurve2 = new Arc(199, 297, 10, 10, -45, 120);
        rightFootCurve2.setFill(null);
        rightFootCurve2.setStroke(Color.RED);
        rightFootCurve2.setStrokeWidth(3);
        rightFootCurve2.setType(ArcType.OPEN);

        // Thêm tất cả các hình vào Pane
        pane.getChildren().addAll(
                mainBody, leftFoot, rightFoot, face,
                leftEar, rightEar, nose,
                leftFootCurve1, leftFootCurve2, rightFootCurve1, rightFootCurve2
        );

        // Tạo Scene và hiển thị cửa sổ
        Scene scene = new Scene(pane, 500, 500);
        stage.setTitle("Character Drawing");
        stage.setScene(scene);
        stage.show();
    }
}
