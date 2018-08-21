import java.awt.*;
public class Demogridlayout extends Frame
{
public static void main(String[] args)
{
Frame f = new Frame("FlowLayout");
f.setSize(500,400);
f.setLayout(new GridLayout(5,2));
f.addWindowListener(new FechaJanela());
for (int i =1; i<=10; i++)
f.add(new Button("Botão "+(i+1)));
f.setVisible(true);
}
}