import java.awt.*;

public class DemoBorderLayout{
       public static void main(String args[]){

              Frame f = new Frame("Demostracao do BorderLayout!");
              f.setSize(300,300);
              f.setLocation(20,20);
              f.setLayout(new BorderLayout(10,10));
              f.setBackground(Color.BLACK);
              f.add(new Button("Botão CENTRO"),BorderLayout.CENTER);
              f.add(new Button("Botão BAIXO"),BorderLayout.SOUTH);
              //f.add(new Button("Botão ALTO"),BorderLayout.NORTH);
              // f.add(new Button("Botão ESQUERDA"),BorderLayout.WEST);
              // f.add(new Button("Botão DIREITA"),BorderLayout.EAST);
	      f.addWindowListener(new FechaJanela());
              f.setVisible(true);


       }
}