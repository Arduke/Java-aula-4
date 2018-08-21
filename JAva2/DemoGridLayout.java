import java.awt.*;

public class DemoGridLayout extends Frame
{
  public static void main(String[] args)
  {
      Frame f = new Frame("FlowLayout");
      f.setBackground(Color.MAGENTA);
      f.setSize(500,400);
      f.setLayout(new GridLayout(5,2,10,10));
      f.addWindowListener(new FechaJanela());

      for (int i =1; i<=13; i++)
        f.add(new Button("Botão "+(i+1)));

      Panel p2 = new Panel();
      p2.setBackground(Color.BLACK);
      f.add(p2);

       f.show();
  }
}
