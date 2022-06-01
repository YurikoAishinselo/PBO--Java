package kakulator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.lang.Math;

public class ScienceCalc {//extend app dihapus untuk menjadi kelas biasa

    public TextField textFieldS = new TextField();
    private float num1S = 0f;
    private String opS = "";
    private boolean startS = true;
    BorderPane root = new BorderPane();
    private Scene sc2 = new Scene(root, 400, 308);//root dan sc2 dipindahkan agar bisa diakses menggunakan fungsi

    public ScienceCalc(Stage stage) {
        Kakulator kalk = new Kakulator();
        // stage.setTitle("Scientic Calculator"); title dihapus karena tidak digunakan
        textFieldS.setFont(Font.font(16));
        textFieldS.setAlignment(Pos.CENTER_RIGHT);
        textFieldS.setEditable(false);

        //Kotak tampil
        StackPane stackPane = new StackPane();
        stackPane.setPadding(new Insets(10, 25, 5, 25));
        stackPane.getChildren().add(textFieldS);

        //Jarak antar kotak input
        TilePane tileS = new TilePane();
        tileS.setHgap(15);
        tileS.setVgap(15);
        tileS.setAlignment(Pos.TOP_CENTER);
        tileS.getChildren().addAll(
                createButtonForChange("Change",stage,kalk), //penambahan parameter stage dan kakulator
                createButtonForOperatorS("log"),
                createButtonForNumberS("7"),
                createButtonForNumberS("8"),
                createButtonForNumberS("9"),
                createButtonForClearS("AC"),
                createButtonForOperatorS("π"),
                createButtonForOperatorS("√"),
                createButtonForNumberS("4"),
                createButtonForNumberS("5"),
                createButtonForNumberS("6"),
                createButtonForOperatorS("x"),
                createButtonForOperatorS("^"),
                createButtonForOperatorS("%"),
                createButtonForNumberS("1"),
                createButtonForNumberS("2"),
                createButtonForNumberS("3"),
                createButtonForOperatorS("÷"),
                createButtonForOperatorS("+"),
                createButtonForOperatorS("-"),
                createButtonForNumberS("00"),
                createButtonForNumberS("0"),
                createButtonForNumberS("."),
                createButtonForOperatorS("=")
        );

        root.setTop(stackPane);
        root.setCenter(tileS);
        tileS.setPadding(new Insets(10, 10, 10, 10));
//        stage.setScene(sc2);
//        stage.setResizable(false);
//        stage.show(); stage dihapus karena tidak digunakan

    }

    private Button createButtonForNumberS(String ch) {
        Button btn = new Button(ch);
        btn.setPrefSize(45, 45);
        btn.setFont(Font.font(16));
        btn.setOnAction(this::processNumberS);
        return btn;
    }

    private Button createButtonForOperatorS(String ch) {
        Button btn = new Button(ch);
        btn.setPrefSize(45, 45);
        btn.setFont(Font.font(16));
        btn.setOnAction(this::processOperatorS);
        return btn;
    }

    private Button createButtonForClearS(String ch) {
        Button btn = new Button(ch);
        btn.setPrefSize(45, 45);
        btn.setFont(Font.font(16));
        btn.setOnAction((ActionEvent e) -> {
            textFieldS.setText("");
            opS = "";
            startS = true;
        });
        return btn;
    }

    private Button createButtonForChange(String ch, Stage stage, Kakulator kalk) {
        Button btn = new Button(ch);
        btn.setPrefSize(45, 45);
        btn.setFont(Font.font(9));
        btn.setOnAction((ActionEvent e) -> {
            textFieldS.setText("");
            opS = "";
            processChangeS(e,stage,kalk); //pengubahan start menjadi fungsi change
        });
        return btn;
    }

    private void processNumberS(ActionEvent e) {
        if (startS) {
            textFieldS.setText("");
            startS = false;
        }
        String value = ((Button) e.getSource()).getText();
        textFieldS.setText(textFieldS.getText() + value);

    }

    private void processChangeS(ActionEvent e, Stage stage, Kakulator kalk) {//ditambah parameter stage & scienceCalc untuk bisa memanggil keduanya
            kalk.start(stage); // fungsi untuk memanggil stage kakulator secara langsung
    }

    private void processOperatorS(ActionEvent e) {
        String value = ((Button) e.getSource()).getText();
        if (!value.equals("=")) {
            if (!opS.isEmpty()) {
                return;
            }
            num1S = Float.parseFloat(textFieldS.getText());
            opS = value;
            startS = true;
        } else {
            if (opS.isEmpty()) {
                return;
            }
            float num2S = Float.parseFloat(textFieldS.getText());
            float result = calculate(num1S, num2S, opS);
            textFieldS.setText(String.valueOf(result));
            startS = true;
            opS = "";
        }
    }

    private float calculate(float num1, float num2, String operator) {
        switch (operator) {
            case "log":
                return (float) Math.log10(num1);

            case "π":
                return (float) (Math.PI * (num1));
            case "√":
                return (float) Math.sqrt(num1);
            case "^":
                return (float) Math.pow(num1, num2);
            case "%":
                return (float) (num1 * 0.01);
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "x":
                return (float) num1 * num2;
            case "÷":
                if (num2 == 0) {
                    return 0;
                }
                return num1 / num2;
            default:
                return 0;
        }
    }

    public Scene getScene() {
        return sc2;
    }
}
