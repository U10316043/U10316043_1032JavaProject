import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class game extends JFrame {
	String username ;
	static JLabel n;
	private ImageIcon[] color = new ImageIcon[8];
	private JButton[] bcolor = new JButton[8];	
	private ImageIcon[] colorpattern = new ImageIcon[8];
	private JLabel[] lcolor = new JLabel[8];
	
	/*/pattern method
	public void pattern(){
		int[] deck = new int[80];
		for(int i = 0;i<deck.length ;i++)  
			deck[i] = i;
		for(int i = 0;i<deck.length;i++){
			int index =(int)(Math.random()*80);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		for(int i = 0;i<8;i++){
			colorpattern[i] = new ImageIcon(getClass().getResource("colorworld/"+(deck[i]+11)+".jpg")); 
		}
	}
	**/
	
	public game(String username){
		this.setLayout(null);
		/**username*/
		this.username = username;
		n = new JLabel("HERO "+username);
		this.add(n);
		this.n.setBounds(20,5,300,30);
		
		/**button*/
		for(int i = 0 ; i < 8 ; i++){
			color[i] = new ImageIcon(getClass().getResource("colorworld/color"+(i+1)+".jpg"));
			bcolor[i] = new JButton(color[i]);
			this.add(bcolor[i]);
		}
		this.bcolor[0].setBounds(300,400,150,150);
		this.bcolor[1].setBounds(450,400,150,150);
		this.bcolor[2].setBounds(600,400,150,150);
		this.bcolor[3].setBounds(750,400,150,150);
		this.bcolor[4].setBounds(300,550,150,150);
		this.bcolor[5].setBounds(450,550,150,150);
		this.bcolor[6].setBounds(600,550,150,150);
		this.bcolor[7].setBounds(750,550,150,150);
		
		/**pattern*/
		int[] deck = new int[80];
		for(int i = 0;i<deck.length ;i++)  
			deck[i] = i;
		for(int i = 0;i<deck.length;i++){
			int index =(int)(Math.random()*80);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		for(int i = 0;i<8;i++){
			colorpattern[i] = new ImageIcon(getClass().getResource("colorworld/"+(deck[i]+11)+".jpg")); 
			lcolor[i] = new JLabel(colorpattern[i]);
			add(lcolor[i]);
		}
		
		this.lcolor[0].setBounds(50,100,150,150);
		this.lcolor[1].setBounds(200,100,150,150);
		this.lcolor[2].setBounds(350,100,150,150);
		this.lcolor[3].setBounds(500,100,150,150);
		this.lcolor[4].setBounds(650,100,150,150);
		this.lcolor[5].setBounds(800,100,150,150);
		this.lcolor[6].setBounds(950,100,150,150);
		this.lcolor[7].setBounds(1100,100,150,150);
		
		
		
		
		
		

		
		
		/**background*/
		this.setTitle("ColorWorld");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setSize(1900,750);
		this.setVisible(true);
		this.setResizable(false);
	}
}
