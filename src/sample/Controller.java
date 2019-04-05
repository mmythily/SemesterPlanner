package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


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
    public Button btn_add, btn_save, btn_delete, btn_reset;
    RandomAccessFile raf;

    String course, week,percent, evaluation;
    static int count = -1; //indicates file is empty

    public void showCourse(ActionEvent e) {
        txt_Course1_Mythily.setText("Java");
        txt_Course2_Mythily.setText("Linux");
        txt_Course3_Mythily.setText("Web Programming");
        txt_Course4_Mythily.setText("Software Design");
    }

    public void saveP(ActionEvent e) throws FileNotFoundException, IOException {

            raf = new RandomAccessFile("plan.dat", "rw");
            btn_add.setOnAction(event -> {
                if (combox_Course.getSelectionModel().isSelected(0)) {
                    if (combox_Week.getSelectionModel().isSelected(0)) {
                        perct_C1_W1.setText(txt_Percent.getText());
                        type_C1_W1.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 1";
                        percent = perct_C1_W1.getText();
                        evaluation = type_C1_W1.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(1)) {
                        perct_C1_W2.setText(txt_Percent.getText());
                        type_C1_W2.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 2";
                        percent = perct_C1_W2.getText();
                        evaluation = type_C1_W2.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(2)) {
                        perct_C1_W3.setText(txt_Percent.getText());
                        type_C1_W3.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 3";
                        percent = perct_C1_W3.getText();
                        evaluation = type_C1_W3.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(3)) {
                        perct_C1_W4.setText(txt_Percent.getText());
                        type_C1_W4.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 4";
                        percent = perct_C1_W4.getText();
                        evaluation = type_C1_W4.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(4)) {
                        perct_C1_W5.setText(txt_Percent.getText());
                        type_C1_W5.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 5";
                        percent = perct_C1_W5.getText();
                        evaluation = type_C1_W5.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(5)) {
                        perct_C1_W6.setText(txt_Percent.getText());
                        type_C1_W6.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 6";
                        percent = perct_C1_W6.getText();
                        evaluation = type_C1_W6.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(6)) {
                        perct_C1_W7.setText(txt_Percent.getText());
                        type_C1_W7.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 7";
                        percent = perct_C1_W7.getText();
                        evaluation = type_C1_W7.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(7)) {
                        perct_C1_W8.setText(txt_Percent.getText());
                        type_C1_W8.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 8";
                        percent = perct_C1_W8.getText();
                        evaluation = type_C1_W8.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(8)) {
                        perct_C1_W9.setText(txt_Percent.getText());
                        type_C1_W9.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 9";
                        percent = perct_C1_W9.getText();
                        evaluation = type_C1_W9.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(9)) {
                        perct_C1_W10.setText(txt_Percent.getText());
                        type_C1_W10.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 10";
                        percent = perct_C1_W10.getText();
                        evaluation = type_C1_W10.getText();
                    }
                    course = "Java";

                }
                if (combox_Course.getSelectionModel().isSelected(1)) {
                    if (combox_Week.getSelectionModel().isSelected(0)) {
                        perct_C2_W1.setText(txt_Percent.getText());
                        type_C2_W1.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 1";
                        percent = perct_C2_W1.getText();
                        evaluation = type_C2_W1.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(1)) {
                        perct_C2_W2.setText(txt_Percent.getText());
                        type_C2_W2.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 2";
                        percent = perct_C2_W2.getText();
                        evaluation = type_C2_W2.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(2)) {
                        perct_C2_W3.setText(txt_Percent.getText());
                        type_C2_W3.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 3";
                        percent = perct_C2_W3.getText();
                        evaluation = type_C2_W3.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(3)) {
                        perct_C2_W4.setText(txt_Percent.getText());
                        type_C2_W4.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 4";
                        percent = perct_C2_W4.getText();
                        evaluation = type_C2_W4.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(4)) {
                        perct_C2_W5.setText(txt_Percent.getText());
                        type_C2_W5.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 5";
                        percent = perct_C2_W5.getText();
                        evaluation = type_C2_W5.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(5)) {
                        perct_C2_W6.setText(txt_Percent.getText());
                        type_C2_W6.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 6";
                        percent = perct_C2_W6.getText();
                        evaluation = type_C2_W6.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(6)) {
                        perct_C2_W7.setText(txt_Percent.getText());
                        type_C2_W7.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 7";
                        percent = perct_C2_W7.getText();
                        evaluation = type_C2_W7.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(7)) {
                        perct_C2_W8.setText(txt_Percent.getText());
                        type_C2_W8.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 8";
                        percent = perct_C2_W8.getText();
                        evaluation = type_C2_W8.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(8)) {
                        perct_C2_W9.setText(txt_Percent.getText());
                        type_C2_W9.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 9";
                        percent = perct_C2_W9.getText();
                        evaluation = type_C2_W9.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(9)) {
                        perct_C2_W10.setText(txt_Percent.getText());
                        type_C2_W10.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 10";
                        percent = perct_C2_W10.getText();
                        evaluation = type_C2_W10.getText();
                    }
                    course = "Linux";

                }
                if (combox_Course.getSelectionModel().isSelected(2)) {
                    if (combox_Week.getSelectionModel().isSelected(0)) {
                        perct_C3_W1.setText(txt_Percent.getText());
                        type_C3_W1.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 1";
                        percent = perct_C3_W1.getText();
                        evaluation = type_C3_W1.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(1)) {
                        perct_C3_W2.setText(txt_Percent.getText());
                        type_C3_W2.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 2";
                        percent = perct_C3_W2.getText();
                        evaluation = type_C3_W2.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(2)) {
                        perct_C3_W3.setText(txt_Percent.getText());
                        type_C3_W3.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 3";
                        percent = perct_C3_W3.getText();
                        evaluation = type_C3_W3.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(3)) {
                        perct_C3_W4.setText(txt_Percent.getText());
                        type_C3_W4.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 4";
                        percent = perct_C3_W4.getText();
                        evaluation = type_C3_W4.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(4)) {
                        perct_C3_W5.setText(txt_Percent.getText());
                        type_C3_W5.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 5";
                        percent = perct_C3_W5.getText();
                        evaluation = type_C3_W5.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(5)) {
                        perct_C3_W6.setText(txt_Percent.getText());
                        type_C3_W6.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 6";
                        percent = perct_C3_W6.getText();
                        evaluation = type_C3_W6.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(6)) {
                        perct_C3_W7.setText(txt_Percent.getText());
                        type_C3_W7.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 7";
                        percent = perct_C3_W7.getText();
                        evaluation = type_C3_W7.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(7)) {
                        perct_C3_W8.setText(txt_Percent.getText());
                        type_C3_W8.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 8";
                        percent = perct_C3_W8.getText();
                        evaluation = type_C3_W8.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(8)) {
                        perct_C3_W9.setText(txt_Percent.getText());
                        type_C3_W9.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 9";
                        percent = perct_C3_W9.getText();
                        evaluation = type_C3_W9.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(9)) {
                        perct_C3_W10.setText(txt_Percent.getText());
                        type_C3_W10.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 10";
                        percent = perct_C3_W10.getText();
                        evaluation = type_C3_W10.getText();
                    }
                    course = "Web Programming";
                }
                if (combox_Course.getSelectionModel().isSelected(3)) {
                    if (combox_Week.getSelectionModel().isSelected(0)) {
                        perct_C4_W1.setText(txt_Percent.getText());
                        type_C4_W1.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 1";
                        percent = perct_C4_W1.getText();
                        evaluation = type_C4_W1.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(1)) {
                        perct_C4_W2.setText(txt_Percent.getText());
                        type_C4_W2.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 2";
                        percent = perct_C4_W2.getText();
                        evaluation = type_C4_W2.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(2)) {
                        perct_C4_W3.setText(txt_Percent.getText());
                        type_C4_W3.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 3";
                        percent = perct_C4_W3.getText();
                        evaluation = type_C4_W3.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(3)) {
                        perct_C4_W4.setText(txt_Percent.getText());
                        type_C4_W4.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 4";
                        percent = perct_C4_W4.getText();
                        evaluation = type_C4_W4.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(4)) {
                        perct_C4_W5.setText(txt_Percent.getText());
                        type_C4_W5.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 5";
                        percent = perct_C4_W5.getText();
                        evaluation = type_C4_W5.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(5)) {
                        perct_C4_W6.setText(txt_Percent.getText());
                        type_C4_W6.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 6";
                        percent = perct_C4_W6.getText();
                        evaluation = type_C4_W6.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(6)) {
                        perct_C4_W7.setText(txt_Percent.getText());
                        type_C4_W7.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 7";
                        percent = perct_C4_W7.getText();
                        evaluation = type_C4_W7.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(7)) {
                        perct_C4_W8.setText(txt_Percent.getText());
                        type_C4_W8.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 8";
                        percent = perct_C4_W8.getText();
                        evaluation = type_C4_W8.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(8)) {
                        perct_C4_W9.setText(txt_Percent.getText());
                        type_C4_W9.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 9";
                        percent = perct_C4_W9.getText();
                        evaluation = type_C4_W9.getText();
                    } else if (combox_Week.getSelectionModel().isSelected(9)) {
                        perct_C4_W10.setText(txt_Percent.getText());
                        type_C4_W10.setText(combox_EvalType.getSelectionModel().getSelectedItem().toString());
                        week = "Week 10";
                        percent = perct_C4_W10.getText();
                        evaluation = type_C4_W10.getText();
                    }
                    course = "Software Design";
                }
            });
    }


    public void load(MouseEvent e) throws FileNotFoundException {
        raf = new RandomAccessFile("plan.dat", "rw");

        btn_save.setOnAction(event -> {
            String data = course+", "+week+", "+percent+"%, "+evaluation;
            try {
                save(data);
            }catch (IOException obj){
            }
        });

    }
    public void save (String data) throws IOException {
        count++;
        raf.seek(raf.length());
        raf.writeBytes(data);
        raf.writeBytes(System.lineSeparator());
    }

    public void reset(ActionEvent e){
        btn_reset.setOnAction(event -> {
        perct_C1_W1.clear(); perct_C2_W1.clear(); perct_C3_W1.clear(); perct_C4_W1.clear();
        type_C1_W1.clear(); type_C2_W1.clear(); type_C3_W1.clear(); type_C4_W1.clear();
        perct_C1_W2.clear(); perct_C2_W2.clear(); perct_C3_W2.clear(); perct_C4_W2.clear();
        type_C1_W2.clear(); type_C2_W2.clear(); type_C3_W2.clear(); type_C4_W2.clear();
        perct_C1_W3.clear(); perct_C2_W3.clear(); perct_C3_W3.clear(); perct_C4_W3.clear();
        type_C1_W3.clear(); type_C2_W3.clear(); type_C3_W3.clear(); type_C4_W3.clear();
        perct_C1_W4.clear(); perct_C2_W4.clear(); perct_C3_W4.clear(); perct_C4_W4.clear();
        type_C1_W4.clear(); type_C2_W4.clear(); type_C3_W4.clear(); type_C4_W4.clear();
        perct_C1_W5.clear(); perct_C2_W5.clear(); perct_C3_W5.clear(); perct_C4_W5.clear();
        type_C1_W5.clear(); type_C2_W5.clear(); type_C3_W5.clear(); type_C4_W5.clear();
        perct_C1_W6.clear(); perct_C2_W6.clear(); perct_C3_W6.clear(); perct_C4_W6.clear();
        type_C1_W6.clear(); type_C2_W6.clear(); type_C3_W6.clear(); type_C4_W6.clear();
        perct_C1_W7.clear(); perct_C2_W7.clear(); perct_C3_W7.clear(); perct_C4_W7.clear();
        type_C1_W7.clear(); type_C2_W7.clear(); type_C3_W7.clear(); type_C4_W7.clear();
        perct_C1_W8.clear(); perct_C2_W8.clear(); perct_C3_W8.clear(); perct_C4_W8.clear();
        type_C1_W8.clear(); type_C2_W8.clear(); type_C3_W8.clear(); type_C4_W8.clear();
        perct_C1_W9.clear(); perct_C2_W9.clear(); perct_C3_W9.clear(); perct_C4_W9.clear();
        type_C1_W9.clear(); type_C2_W9.clear(); type_C3_W9.clear(); type_C4_W9.clear();
        perct_C1_W10.clear(); perct_C2_W10.clear(); perct_C3_W10.clear(); perct_C4_W10.clear();
        type_C1_W10.clear(); type_C2_W10.clear(); type_C3_W10.clear(); type_C4_W10.clear();
        });
    }
}
