import java.awt.*;

public class DemoBorderLayout{
       public static void main(String args[]){

              Frame f = new Frame("Demostracao do BorderLayout!");
              f.setSize(300,300);
              f.setLocation(20,20);
              f.setLayout(new BorderLayout(10,10));
              f.setBackground(Color.BLACK);
              f.add(new Button("Bot�o CENTRO"),BorderLayout.CENTER);
              f.add(new Button("Bot�o BAIXO"),BorderLayout.SOUTH);
              //f.add(new Button("Bot�o ALTO"),BorderLayout.NORTH);
              // f.add(new Button("Bot�o ESQUERDA"),BorderLayout.WEST);
              // f.add(new Button("Bot�o DIREITA"),BorderLayout.EAST);
	      f.addWindowListener(new FechaJanela());
              f.setVisible(true);


       }
}