package th.nguyenbuiquanghuy.th2_bmi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class BMIController {
    @FXML
    TextField txtchieucao,txtcannang;
    @FXML
    RadioButton rbYes,rbNo;
    @FXML
    Label labelBMI,labelKQ;
    @FXML
    ToggleGroup toggleGroupAsian;

    public void initialize(){
        toggleGroupAsian=new ToggleGroup();
        rbYes.setToggleGroup(toggleGroupAsian);
        rbNo.setToggleGroup(toggleGroupAsian);
    }

    public void TinhBMI(){
        double chieucao = Double.parseDouble(txtchieucao.getText());
        double cannang = Double.parseDouble(txtcannang.getText());
        double bmi = cannang / (chieucao * chieucao);
        labelBMI.setText(String.format("%.2f", bmi));

        RadioButton selected = (RadioButton) toggleGroupAsian.getSelectedToggle();

        if (selected == rbYes) {
            if (bmi < 17.5) {
                labelKQ.setText("Thiếu cân");
            } else if (bmi>=17.5 && bmi<=22.99) {
                labelKQ.setText("Bình thường");
            } else if (bmi>=23 && bmi <=27.99) {
                labelKQ.setText("Thừa cân");
            } else {
                labelKQ.setText("Béo phì");
            }
        } else if (selected == rbNo) {
            if (bmi < 18.5) {
                labelKQ.setText("Thiếu cân");
            } else if (bmi>=18.5 && bmi<=24.99) {
                labelKQ.setText("Bình thường");
            } else if (bmi>=25 && bmi<=29.99) {
                labelKQ.setText("Thừa cân");
            } else {
                labelKQ.setText("Béo phì");
            }
        }
    }
}
