
package campusmap;

import java.util.ArrayList;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public final class CenterPoint {

    private double x, y;
    private Circle center = new Circle(10);
    private Text distance = new Text(0, 40, "Distance:" + 0);
    private Text label = new Text(0, 40, "");
    private ArrayList<Dorm> dormitory = new ArrayList<>();
    private ArrayList<Dorm> study = new ArrayList<>();

    private void CenterImage() {
        center.setVisible(true);
        center.setCenterX(x);
        center.setCenterY(y);
        center.setStrokeWidth(2);
        center.setStroke(Color.rgb(255, 255, 255));
        distance.setLayoutX(x);
        distance.setLayoutY(y + 10);
        distance.setFill(Color.rgb(255, 255, 255));
        label.setLayoutX(x);
        label.setLayoutY(y + 5);
        label.setFill(Color.rgb(255, 255, 255));

    }

    public CenterPoint(ArrayList<Dorm> dorm) {
        CenterImage();
        for (Dorm dr : dorm) {
            dormitory.add(dr);
            System.out.println(dr.getPopulation());
        }
        label.setText("Center Point");
        setCenter(dormitory);
        interaction(dormitory);
        System.out.println(dorm.get(0).getPopulation());
    }

    public CenterPoint(Dorm dr1, Dorm dr2, Dorm dr3) {
        CenterImage();
        label.setText("Study Group");
        study.add(dr1);
        study.add(dr2);
        study.add(dr3);
        setCenter(study);
    }

    public final void setCenter(ArrayList<Dorm> dorm) {
        double totalX = 0;
        double totalY = 0;
        double totalPopulation = 0;
        int xy = 0;
        for (Dorm dr : dorm) {
            totalX += (dr.getX() - (dr.getWidth() / 2)) * dr.getPopulation();
            totalY += (dr.getY() - (dr.getWidth() / 2)) * dr.getPopulation();
            totalPopulation += dr.getPopulation();
        }
        x = totalX / totalPopulation;
        y = totalY / totalPopulation;
        for (Dorm dr : dorm) {
            int tempX = (int) x;
            int tempY = (int) y;
            tempX -= dr.getX();
            tempY -= dr.getY();
            xy = (tempX + tempY) + 22;
        }
        distance.setText("Distance:" + Math.abs(xy));
        center.setCenterX(x);
        center.setCenterY(y);
        distance.setLayoutX(x - 10);
        distance.setLayoutY(y - 5);
        label.setLayoutX(x - 10);
        label.setLayoutY(y - 20);
    }

    public final void interaction(ArrayList<Dorm> dorm) {

        center.setOnMouseDragged((MouseEvent me) -> {
            setCenter(dorm);
        });
    }

    public Circle getCenter() {
        return center;
    }

    public Text getLabel() {
        return label;
    }

    public Text getDistance() {
        return distance;
    }

    public ArrayList<Dorm> getDormitory() {
        return dormitory;
    }

    public ArrayList<Dorm> getStudy() {
        return study;
    }
    
}
