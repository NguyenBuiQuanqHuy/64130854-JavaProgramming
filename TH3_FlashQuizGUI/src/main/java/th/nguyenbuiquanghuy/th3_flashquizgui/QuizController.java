package th.nguyenbuiquanghuy.th3_flashquizgui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class QuizController {
    @FXML
    VBox vboxQuestion,vboxQuiz;

    @FXML
    public void initialize() {
        for (var node : vboxQuestion.getChildren()) {
                Button questionButton = (Button) node;
                questionButton.setOnAction(e -> {
                    for (var ques : vboxQuestion.getChildren()) {
                            Button btn = (Button) ques;
                            btn.setStyle("-fx-background-color: #727fcf;");
                    }
                    questionButton.setStyle("-fx-background-color: red;");
                });
        }

        for (var node : vboxQuiz.getChildren()) {
                Button choiceButton = (Button) node;
                choiceButton.setOnAction(e -> {
                    for (var ques : vboxQuiz.getChildren()) {
                        Button btn = (Button) ques;
                        btn.setStyle("-fx-background-color: lightgray;");
                    }
                    choiceButton.setStyle("-fx-background-color: green;");
                });
        }
    }
}
