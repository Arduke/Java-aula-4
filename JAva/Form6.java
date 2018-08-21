import java.awt.*;
import java.awt.event.*;
class Form6 extends Frame implements ActionListener
{
private int k=0;
private Button b1=new Button("Clique Aqui");
private Label l1=new Label("O Botao ainda nao foi pressionado.");
Form6(String titulo, int largura, int altura, int colinic,int lininic)
{
super(titulo);
setSize(largura,altura);
setLocation(colinic,lininic);
setLayout(new FlowLayout());
b1.addActionListener(this);
add(b1);
add(l1);
}
public void actionPerformed(ActionEvent e)
{
++k;
l1.setText("Pressionado "+k+" vezes!");
}
}