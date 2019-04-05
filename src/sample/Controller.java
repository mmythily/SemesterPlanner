package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Controller {
    public ComboBox combox_Course, combox_EvalType, combox_Week;
    public TextField txt_Course1_Mythily, txt_Course2_Mythily, txt_Course3_Mythily, txt_Course4_Mythily, txt_Percent,
            perct_C1_W1, perct_C2_W1, perct_C3_W1, perct_C4_W1,
            type_C1_W1, type_C2_W1, type_C3_W1, type_C4_W1,
            perct_C1_W2, perct_C2_W2, perct_C3_W2, perct_C4_W2,
            type_C1_W2, type_C2_W2, type_C3_W2, type_C4_W2,
            perct_C1_W3, perct_C2_W3, perct_C3_W3, perct_C4_W3,
            type_C1_W3, type_C2_W3, type_C3_W3, type_C4_W3,
            perct_C1_W4, perct_C2_W4, perct_C3_W4, perct_C4_W4,
            type_C1_W4, type_C2_W4, type_C3_W4, type_C4_W4,
            perct_C1_W5, perct_C2_W5, perct_C3_W5, perct_C4_W5,
            type_C1_W5, type_C2_W5, type_C3_W5, type_C4_W5,
            perct_C1_W6, perct_C2_W6, perct_C3_W6, perct_C4_W6,
            type_C1_W6, type_C2_W6, type_C3_W6, type_C4_W6,
            perct_C1_W7, perct_C2_W7, perct_C3_W7, perct_C4_W7,
            type_C1_W7, type_C2_W7, type_C3_W7, type_C4_W7,
            perct_C1_W8, perct_C2_W8, perct_C3_W8, perct_C4_W8,
            type_C1_W8, type_C2_W8, type_C3_W8, type_C4_W8,
            perct_C1_W9, perct_C2_W9, perct_C3_W9, perct_C4_W9,
            type_C1_W9, type_C2_W9, type_C3_W9, type_C4_W9,
            perct_C1_W10, perct_C2_W10, perct_C3_W10, perct_C4_W10,
            type_C1_W10, type_C2_W10, type_C3_W10, type_C4_W10;
    public Button btn_add, btn_update, btn_delete, btn_reset;
    RandomAccessFile raf;
    static String course = "";

    public void showCourse(ActionEvent e) {
        txt_Course1_Mythily.setText("Java");
        txt_Course2_Mythily.setText("Linux");
        txt_Course3_Mythily.setText("Web Programming");
        txt_Course4_Mythily.setText("Software Design");
    }



}