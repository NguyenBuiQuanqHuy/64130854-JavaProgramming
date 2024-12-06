package th.nguyenbuiquanghuy.th1_simplemath;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class MathController {
    @FXML
    TextField txtA,txtB;
    @FXML
    RadioButton rbCong,rbTru,rbNhan,rbChia;
    @FXML
    Label labelKQ;

    @FXML
    ToggleGroup toggleGroupMath;

    public void initialize(){
        toggleGroupMath=new ToggleGroup();
        rbCong.setToggleGroup(toggleGroupMath);
        rbTru.setToggleGroup(toggleGroupMath);
        rbNhan.setToggleGroup(toggleGroupMath);
        rbChia.setToggleGroup(toggleGroupMath);
    }

    public void PhepTinh(){
        double a = Double.parseDouble(txtA.getText());
        double b = Double.parseDouble(txtB.getText());
        double result = 0;

        RadioButton selected = (RadioButton)toggleGroupMath.getSelectedToggle();

        if (selected == rbCong) {
            result = a + b;
        } else if (selected == rbTru) {
            result = a - b;
        } else if (selected == rbNhan) {
            result = a * b;
        } else if (selected == rbChia) {
            if (b == 0) {
                labelKQ.setText("Không thể chia cho 0!");
                return;
            }
            result = a / b;
        }

        labelKQ.setText("Kết quả: " + result);
    }
}
