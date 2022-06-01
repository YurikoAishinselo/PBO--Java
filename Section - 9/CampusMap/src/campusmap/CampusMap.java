
package campusmap;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CampusMap extends Application {

    @Override
    public void start(Stage primaryStage) {
        Image image = new Image("/Map.jpeg", true);
        ImageView mv = new ImageView(image);
        Group root = new Group();
        root.getChildren().addAll(mv);
        Scene scene = new Scene(root, 240, 140);
        ArrayList<Dorm> all = new ArrayList<>();
        ArrayList<CenterPoint> center = new ArrayList<>();
        Dorm dr1 = new Dorm(1, 400, center, 130, 231, 253);
        Dorm dr2 = new Dorm(2, 100, center, 10, 222, 20);
        Dorm dr3 = new Dorm(3, 300, center, 40, 30, 20);
        Dorm dr4 = new Dorm(4, 500, center, 255, 255, 0);
        all.add(dr1);
        all.add(dr2);
        all.add(dr3);
        all.add(dr4);
        CenterPoint cr1 = new CenterPoint(all);
        center.add(cr1);
        CenterPoint cr2 = new CenterPoint(dr1, dr3, dr4);
        center.add(cr2);
        root.getChildren().addAll(dr1.getLabel(), dr2.getLabel(), dr3.getLabel(), dr4.getLabel());
        root.getChildren().addAll(dr1.getPopu(), dr2.getPopu(), dr3.getPopu(), dr4.getPopu());
        root.getChildren().addAll(dr1.getSQ(), dr2.getSQ(), dr3.getSQ(), dr4.getSQ());
        root.getChildren().addAll(cr1.getDistance(), cr1.getCenter(), cr1.getLabel());
        root.getChildren().addAll(cr2.getDistance(), cr2.getCenter(), cr2.getLabel());
        cr1.setCenter(all);
        primaryStage.setTitle("Campus Map");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}

