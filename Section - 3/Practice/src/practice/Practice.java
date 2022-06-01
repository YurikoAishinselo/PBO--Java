
package practice;
import javax.swing.JOptionPane;
public class Practice {
    public static void main(String[] args) {
         String input,food,sport = null,price,job,place,vehicle,hobbies;
   
        
        
        input = JOptionPane.showInputDialog(null,"What's your name ?");
        JOptionPane.showMessageDialog(null,"Hello " + input);
        
        food = JOptionPane.showInputDialog(null,"What is your favorite food ?");
        JOptionPane.showMessageDialog(null,"Oh " + food + ", I'm also like it");
        
        price = JOptionPane.showInputDialog(null,"how much doest it cost ? (Rupiah)");
        int priceConvert = Integer.parseInt(price);
        if(priceConvert >=50000){
            JOptionPane.showMessageDialog(null,"Wow it's so expensive");
        }
        else if(priceConvert < 50000){
            JOptionPane.showMessageDialog(null,"Wow it's so cheap");
        }
        
        place = JOptionPane.showInputDialog(null, "Where did you buy it ?");
        
        JOptionPane.showMessageDialog(null,"Have you thought about the tax ?");
        JOptionPane.showMessageDialog(null,"Let's assume the tax is 10%");
        double purePrice = Double.parseDouble(price);
        JOptionPane.showMessageDialog(null, "It's mean the pure price is "+ (purePrice/1.1));
        
        sport = JOptionPane.showInputDialog(null, "Btw, what is your favorite sport ?");
        JOptionPane.showMessageDialog(null, "Wow, i think oneday we can play it together");
        
        job = JOptionPane.showInputDialog(null,"What is your job for now ?");
        JOptionPane.showMessageDialog(null, "nice job");
        
        
        String Time = JOptionPane.showInputDialog(null, "How long have you worked there ? (years)");
  
        
        vehicle = JOptionPane.showInputDialog(null, "What do you usually ride when you work ?");
        
        hobbies = JOptionPane.showInputDialog(null,"Appart from sports, what's are your hobbies ?");
        
        String dream = JOptionPane.showInputDialog(null,"And the last of my question is What's you dream ?");
        
  
        
               
        System.out.println (input + " is one of my best friend," );
        System.out.println("and his/her favorite food is " + food + ", ");
        System.out.println("with price " + priceConvert + " rupiah. Usually he/she buy it on "+ place +".");
        System.out.println("Appart from sports, he/she also like others things like " + hobbies +".");
        System.out.println("He/she is a diligent person, now he/she works as a/an " + job +" for "+Time+" years" + ".");
        System.out.println("Everyday he/she goes work by his/her "+vehicle +"." );
        System.out.println("Hopefully his/her dream as a " + dream +" will come true soon.");
        
    }
    
}
