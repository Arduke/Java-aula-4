public class DemoForm7
{
public static void main(String[] args)
{
Form7 f = new Form7("Event Listener",300,100,50,50);
f.addWindowListener(new FechaJanela());
f.show();
}
}