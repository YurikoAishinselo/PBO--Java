
package soccerleague;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author yurikoaishinselo
 */
public class schedule {
    private static int temperature;

   
    private int coldcount = 0, day = 0;
    private ArrayList<Integer> temp;

    public static int getTemperature() {
        return temperature;
    }

    public schedule() {
        temp = new ArrayList();
        startMatch();
    }

    private void startMatch() {
        while (true) {
            temperature = Integer.parseInt(JOptionPane.showInputDialog("Input temperature : "));
            if (temperature < 20) {
                coldcount++;
                day++;
                System.out.println("Too cold to play");
                if (coldcount == 3) {
                    break;
                }
                temp.add(temperature);
                continue;
            }
            temp.add(temperature);
            coldcount = 0;
            day++;
            Games game1 = new Games();
            Games game2 = new Games();
            if (day > 10) {
                break;
            }
        }
      
        double averageTemp = 0;
        for (int totaltemp : temp) {
            averageTemp += totaltemp;
        }
        System.out.println("Average temp: " + (averageTemp /= temp.size()));
    }
}
