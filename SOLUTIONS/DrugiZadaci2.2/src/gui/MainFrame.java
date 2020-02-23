package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	
	private JPanel pnl;
	private JPanel pnl2;
	private JButton btn;
	private JButton pnlBtn;
	
	
	

	
	
	public MainFrame() {
		setLayout(new BorderLayout());
		createComps();
		add(pnl,BorderLayout.CENTER);
		add(pnl2,BorderLayout.SOUTH);
		
		setVisible(true);
		setSize(600,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		 
		
		
	}
	
	private void createComps() {
		pnl=new JPanel();
		pnl2=new JPanel();
		
		
		
		
		
		ArrayList<JButton> buttons = new ArrayList<>();
		for (int i = 0; i < 16; i++){
		    btn = new JButton("Button change colors");
		    pnlBtn=new JButton("Panel change color");
		    
		    
		    buttons.add(btn);
		    buttons.add(pnlBtn);
		
		    
		    pnl2.add(btn);
		    pnl2.add(pnlBtn);


		    

		    
		    
		    ArrayList<Color> colors = new ArrayList<>();

			colors.add(Color.RED);
			colors.add(Color.BLUE);
			colors.add(Color.GREEN);
			colors.add(Color.PINK);
		    Random rnd=new Random();
    
         JButton randomJButton = buttons.get(rnd.nextInt(buttons.size()));
		   
		    
		  btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				

	         for (JButton button : buttons){
	            Color randomColor = colors.get(rnd.nextInt(colors.size())); 
	            button.setBackground(randomColor);
	            button.setOpaque(true);
	            
	         }
			}
			  
			  
		  });
		  
		  pnlBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 int red, green, blue;
	                red = (int) (Math.random() * 255);
	                green = (int) (Math.random() * 255);
	                blue = (int) (Math.random() * 255);
	                Color clr = new Color(red, green, blue);
	                Color clr2=new Color(green,red,blue);
	                pnl2.setBackground(clr);
	                pnl.setBackground(clr2);
	                
	               
	               
				
			}
			  
			  
		  });
		  


			  
			  


		  
		  
		
		  		 
}
		
		 
	}

	
	

}
