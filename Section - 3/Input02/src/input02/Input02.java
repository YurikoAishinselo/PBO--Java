package input02;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "Nothing, only test",
                "Example",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Your question?",
                "Question form",
                3,
                null,
                null,
                "Type your question here.");
        
        
        String[] acceptableValues = {"1", "2", "3", "4", "5"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "your choice?",
                "Dialog Title",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
                
    }
}
