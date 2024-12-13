package th.nguyenbuiquanghuy.th_bai4_flashquiz;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class FlashQuizController {
    @FXML
    VBox vboxQuestion, vboxQuiz;
    @FXML
    Text txtScore, txtQues;
    @FXML
    ImageView imgQues;
    @FXML
    Button btnA, btnB, btnC, btnD;
    String imgPath = "/th/nguyenbuiquanghuy/th_bai4_flashquiz/images/";
    private ArrayList<Questions> questionsList = new ArrayList<>();
    private float score = 0;

    public void initialize() {
        questionsList.add(new Questions("What is this animal?", "Cat", "Dog", "Bird", "Fish", "Cat", "cat.jpg"));
        questionsList.add(new Questions("Đây là thành phố nào?", "Cam Ranh", "Nha Trang", "Đà Lạt", "TP Hồ Chí Minh", "Nha Trang", "nhatrang.jpg"));
        questionsList.add(new Questions("2 + 3 =?", "9", "7", "5", "4", "5", ""));
        questionsList.add(new Questions("Vật nào có khối lượng lớn nhất?", "Trái đất", "Mặt trăng", "Mặt trời", "Hệ Mặt trời", "Mặt trời", ""));
        questionsList.add(new Questions("Đến năm nào, Việt Nam hoàn toàn giành được độc lập?", "1945", "1975", "1954", "1960", "1975", ""));
        questionsList.add(new Questions("Chất nào là axit?", "NaOH", "HCl", "NaCl", "KOH", "HCl", ""));
        questionsList.add(new Questions("Đại dương lớn nhất thế giới là gì?", "Thái Bình Dương", "Đại Tây Dương", "Ấn Độ Dương", "Bắc Băng Dương", "Thái Bình Dương", ""));
        questionsList.add(new Questions("Ai là họa sĩ nổi tiếng với tranh 'Mona Lisa'?", "Vincent van Gogh", "Claude Monet", "Leonardo da Vinci", "Pablo Picasso", "Leonardo da Vinci", ""));
        questionsList.add(new Questions("Hệ điều hành nào được phát triển bởi Microsoft?", "Linux", "Windows", "MacOS", "Android", "Windows", ""));
        questionsList.add(new Questions("Tác phẩm nào của Nguyễn Trãi được coi là kiệt tác của văn học cổ điển Việt Nam?", "Bình Ngô đại cáo", "Cảm hứng mùa thu", "Tỏ lòng", "Lý Thường Kiệt", "Bình Ngô đại cáo", ""));
        loadQuestions();
    }

    private void loadQuestions() {
        for (int i = 0; i < questionsList.size(); i++) {
            Button btnQuestion = (Button) vboxQuestion.getChildren().get(i);
            int finalIndex = i;

            btnQuestion.setOnMouseClicked(event -> {
                resetQuestionButtonStyles();
                for (var node : vboxQuiz.getChildren()) {
                    if (node instanceof Button) {
                        ((Button) node).setStyle("-fx-background-color: lightgray;");
                    }
                }
                btnQuestion.setStyle("-fx-background-color: pink;");
                loadQuestionContent(finalIndex);
            });
        }
    }

    private void resetQuestionButtonStyles() {
        for (var node : vboxQuestion.getChildren()) {
            if (node instanceof Button) {
                ((Button) node).setStyle("-fx-background-color: #729fcf;");
            }
        }
    }

    private void loadQuestionContent(int questionIndex) {
        Questions question = questionsList.get(questionIndex);
        txtQues.setText(question.getQuestion());
        String imagePath = imgPath + question.getImagePath();
        if (imagePath != null && !imagePath.isEmpty() && getClass().getResourceAsStream(imagePath) != null) {
            imgQues.setImage(new Image(getClass().getResourceAsStream(imagePath)));
            imgQues.setVisible(true);
        } else {
            imgQues.setVisible(false);
        }
        loadAnswerButtons(question, questionIndex);
    }

    private void loadAnswerButtons(Questions question, int questionIndex) {
        btnA = (Button) vboxQuiz.getChildren().get(0);
        btnB = (Button) vboxQuiz.getChildren().get(1);
        btnC = (Button) vboxQuiz.getChildren().get(2);
        btnD = (Button) vboxQuiz.getChildren().get(3);

        btnA.setText(question.getA());
        btnB.setText(question.getB());
        btnC.setText(question.getC());
        btnD.setText(question.getD());

            btnA.setOnMouseClicked(event -> checkAnswer(btnA, question.getAnswer(), questionIndex));
            btnB.setOnMouseClicked(event -> checkAnswer(btnB, question.getAnswer(), questionIndex));
            btnC.setOnMouseClicked(event -> checkAnswer(btnC, question.getAnswer(), questionIndex));
            btnD.setOnMouseClicked(event -> checkAnswer(btnD, question.getAnswer(), questionIndex));
    }



    private void checkAnswer(Button btnAnswer, String correctAnswer, int questionIndex) {
        for (var node : vboxQuiz.getChildren()) {
            if (node instanceof Button) {
                ((Button) node).setStyle("-fx-background-color: lightgray;");
            }
        }

        if (btnAnswer.getText().equals(correctAnswer)) {
            btnAnswer.setStyle("-fx-background-color: green; -fx-text-fill: white;");
            score++;
        } else {
            score -= 0.2;
            btnAnswer.setStyle("-fx-background-color: red; -fx-text-fill: white;");
        }
        score = (float) (Math.round(score * 100.0) / 100.0);
        txtScore.setText(String.valueOf(score));;
    }
}
