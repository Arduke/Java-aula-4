import java.awt.*;
public class Demoborderlayout extends Frame
{
public static void main(String[] args)
{
Frame f = new Frame("BorderLayout");
f.setSize(500,400);
f.setLayout(new BorderLayout(10,10));
f.add(new Button("Narutinho é um lixo <3"),BorderLayout.CENTER);
f.add(new Button("Ericles Lixu no BAIXO"),BorderLayout.SOUTH);
f.add(new Button("Ericles Lixu no ALTO"),BorderLayout.NORTH);
f.add(new Button("Ericles Lixu no ESQUERDA"),BorderLayout.WEST);
f.add(new Button("Ericles Lixu no DIREITA"),BorderLayout.EAST);
f.addWindowListener(new FechaJanela());
f.setVisible(true);
}
}