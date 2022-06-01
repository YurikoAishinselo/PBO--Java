
package campusmap;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import static java.lang.Math.sqrt;
import java.util.ArrayList;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javax.swing.JOptionPane;

public class Dorm {

    private double population;
    private Rectangle sq = new Rectangle(0, 0, 10, 10);
    private double x, y;
    private int width;
    private Text label = new Text(0, 40, "Dorm");
    private Text popu = new Text(0, 40, "Population: ");

    public Dorm(int id, double pop, ArrayList<CenterPoint> cr, int r, int g, int b) {
        x = id * 50;
        setRect(pop);
        sq.setFill(Color.rgb(r, g, b, 0.2));
        sq.setStroke(Color.rgb(255, 17, 0));
        sq.setStrokeWidth(1);
        setPosition();
        interaction(cr);
        label.setText("Dorm" + id);
    }

    public final void setPoint(ArrayList<CenterPoint> cr) {
        cr.get(0).setCenter(cr.get(0).getDormitory());
        cr.get(1).setCenter(cr.get(1).getStudy());
    }

    public final void setRect(double pop) {
        population = pop * 10;
        width = (int) sqrt(population);
        sq.setHeight(width);
        sq.setWidth(width);
        popu.setText("Population: " + pop);
        setPosition();
    }

    public final void setPosition() {
        sq.setLayoutX(x - (width / 2));
        sq.setLayoutY(y - (width / 2));
        label.setLayoutY(y + (width / 2) - 25);
        label.setLayoutX(x - (width / 2));
        popu.setLayoutY(y + (width / 2) - 10);
        popu.setLayoutX(x - (width / 2));
    }

    public Rectangle getSQ() {
        return sq;
    }

    public double getPopulation() {
        return population;
    }

    public double getX() {
        return x + (width / 2);
    }

    public double getY() {
        return y + (width / 2);
    }

    public final void interaction(ArrayList<CenterPoint> cr) {

        sq.setOnMouseDragged((MouseEvent me) -> {
            x = me.getSceneX();
            y = me.getSceneY();
            setPosition();
            setPoint(cr);
        });
        popu.setOnMouseClicked((MouseEvent mi) -> {
            double pop;
            do {
                pop = Integer.parseInt(JOptionPane.showInputDialog("Input Population (50-500)"));
            } while (pop < 50 || pop > 500);
            setRect(pop);
            setPoint(cr);
            this.population = pop;
        });
    }

    public Text getLabel() {
        return label;
    }

    public Text getPopu() {
        return popu;
    }

    public int getWidth() {
        return width;
    }

    public void setPopulation(double pop) {
        pop = this.population;
    }
}
