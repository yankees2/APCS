import java.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConverter extends JFrame implements ActionListener{
    private Container pane;
    private button convert;
    
    public void actionPerformed(ActionEvent e){
	String s = e.getActionCommand();
	if (s.equals("Convert")){
	    text.