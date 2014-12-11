import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConverter extends JFrame implements ActionListener{
    private Container pane;
    private JButton b;
    private JLabel l;
    private JTextField text;
    private Container buttons;
    private Container textyStuff;
    private JCheckBox box;
    
    public TempConverter() {
	this.setTitle("Only converts from Celsius to Farenheit");
	this.setSize(600,100);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	pane = this.getContentPane();
	pane.setLayout(new GridLayout(2,1));

	l = new JLabel("Temp:",null,JLabel.CENTER);
	b = new JButton("Convert");
	text = new JTextField(10);
	box = new JCheckBox("to Celsius");

	b.setActionCommand("convert");
	b.addActionListener(this);
	
	buttons = new Container();
	buttons.setLayout(new FlowLayout());
	buttons.add(b);
	buttons.add(box);
	
	textyStuff = new Container();
	textyStuff.setLayout(new FlowLayout());
	textyStuff.add(l);
	textyStuff.add(text);

	pane.add(textyStuff);
	pane.add(buttons);

    }
    
    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
	if (action.equals("convert")){
	    String s = text.getText();
	    double temp = Double.parseDouble(s);
	    if (box.isSelected()){
		temp = (double) Math.round((5.0/9.0)*(temp-32.0));
	    } else {
		temp = temp*1.8+32.0;
	    }
	    s = String.valueOf(temp);
	    text.setText(s);
	}
    }

    public static void main(String[]args){
	TempConverter a = new TempConverter();
	a.setVisible(true);
    }
}
