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

public class Kakulator extends Application {

    private TextField textField = new TextField();
    private float num1 = 0f;
    private String op = "";
    private boolean start = true;

    @Override
    public void start(Stage stage) {
        ScienceCalc science = new ScienceCalc(stage);
        stage.setTitle("Caculator");
        textField.setFont(Font.font(16));
        textField.setPrefSize(5, 40);
        textField.setAlignment(Pos.CENTER_RIGHT);
        textField.setEditable(false);

        StackPane stackPane = new StackPane();
        stackPane.setPadding(new Insets(10));
        stackPane.getChildren().add(textField);

        TilePane tile = new TilePane();
        tile.setHgap(10);
        tile.setVgap(10);
        tile.setAlignment(Pos.TOP_CENTER);
        tile.getChildren().addAll(
                createButtonForChange("Change", stage, science), //penambahan parameter stage dan sciencecalc
                createButtonForOperators("%"),
                createButtonForClear("AC"),
                createButtonForOperators("÷"),
                createButtonForNumber("7"),
                createButtonForNumber("8"),
                createButtonForNumber("9"),
                createButtonForOperators("x"),
                createButtonForNumber("4"),
                createButtonForNumber("5"),
                createButtonForNumber("6"),
                createButtonForOperators("-"),
                createButtonForNumber("1"),
                createButtonForNumber("2"),
                createButtonForNumber("3"),
                createButtonForOperators("+"),
                createButtonForNumber("00"),
                createButtonForNumber("0"),
                createButtonForNumber("."),
                createButtonForOperators("=")
        );

        BorderPane root = new BorderPane();
        Scene sc = new Scene(root, 230, 345);
        root.setTop(stackPane);
        root.setCenter(tile);
        stage.setScene(sc);
        stage.setResizable(false);
        stage.show();

    }

    private Button createButtonForNumber(String ch) {
        Button btn = new Button(ch);
        btn.setPrefSize(45, 45);
        btn.setFont(Font.font(16));
        btn.setOnAction(this::processNumber);
        return btn;
    }

    private Button createButtonForOperators(String ch) {
        Button btn = new Button(ch);
        btn.setPrefSize(45, 45);
        btn.setFont(Font.font(16));
        btn.setOnAction(this::processOperator);
        return btn;
    }

    private Button createButtonForClear(String ch) {
        Button btn = new Button(ch);
        btn.setPrefSize(45, 45);
        btn.setFont(Font.font(16));
        btn.setOnAction((ActionEvent e) -> {
            textField.setText("");
            op = "";
            start = true;
        });
        return btn;
    }

    private Button createButtonForChange(String ch, Stage stage, ScienceCalc sci) {//ditambah parameter stage & scienceCalc untuk bisa memanggil keduanya
        Button btn = new Button(ch);
        btn.setPrefSize(45, 45);
        btn.setFont(Font.font(9));
        btn.setOnAction((ActionEvent e) -> {
            textField.setText("");
            op = "";
            processChange(e, stage, sci); //pengubahan start menjadi fungsi change
        });
        return btn;
    }

    private void processNumber(ActionEvent e) {
        if (start) {
            textField.setText("");
            start = false;
        }
        String value = ((Button) e.getSource()).getText();
        textField.setText(textField.getText() + value);

    }

    private void processChange(ActionEvent e, Stage stage, ScienceCalc sci) {//ditambah parameter stage & scienceCalc untuk bisa memanggil keduanya
        //String value = ((Button) e.getSource()).getText();
        stage.setScene(sci.getScene()); // fungsi untuk mengatur stage dan memanggil stage sciencecalc
    }

    private void processOperator(ActionEvent e) {
        String value = ((Button) e.getSource()).getText();
        if (!value.equals("=")) {
            if (!op.isEmpty()) {
                return;
            }
            num1 = Float.parseFloat(textField.getText());
            op = value;
            start = true;
        } else {
            if (op.isEmpty()) {
                return;
            }
            float num2 = Float.parseFloat(textField.getText());
            float result = calculate(num1, num2, op);
            textField.setText(String.valueOf(result));
            start = true;
            op = "";
        }

    }

    private float calculate(float num1, float num2, String operator) {
        switch (operator) {
            case "√":
                return (float) Math.sqrt(num1);
            case "X²":
                return (float) Math.pow(num1, 2.0);
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

}
