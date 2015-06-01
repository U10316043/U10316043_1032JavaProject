import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class game extends JFrame {


	public game(){
	
		this.setTitle("ColorWorld");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setSize(1200,1000);
		this.setVisible(true);
		this.setResizable(false);
	}
}

