import javax.swing.JOptionPane; 
public class Auto
{ 
   public static void main(String[] args)
   { double velocity;
      double acceleration;
      int time;
      double distance;
      String input;
      input = JOptionPane.showInputDialog("What is the velocity of the automobile in miles-per-hour?");
      velocity = Integer.parseInt(input);
      input = JOptionPane.showInputDialog("What is the acceleration of the automobile?"  + " Please enter a POSITIVE number");
      acceleration = Integer.parseInt(input);
      input = JOptionPane.showInputDialog("How many hours has the automobile travelled?");
      time = Integer.parseInt(input);
      while (time < 1)
      { input = JOptionPane.showInputDialog("How many hours has the automobile travelled? " + "Please enter a value that is no less than 1");
         time = Integer.parseInt(input);
      }
      distance = velocity*time + (1/2)*acceleration*time*time ;
      String out = "Hour Distance Travelled\n\nTotal Hours: " + time + "\nTotal Distance: " + distance + "\n\n";
      for(int i=1; i<=time; i++)
      { out+= "Hour " + i + ": " + (velocity*i) + " miles travelled\n";
      }
      JOptionPane.showMessageDialog(null, out);
   }
}