public class DemoForm6
{
public static void main(String[] args)
{
Form6 f = new Form6("Event Listener",300,100,50,50);
f.addWindowListener(new FechaJanela());
f.setVisible(true);
}
}