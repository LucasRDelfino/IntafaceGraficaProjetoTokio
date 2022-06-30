package teste;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.sound.sampled.*;
import java.io.*;



public class TelaPrincipal extends JFrame{
	private JLabel lb1,lb2;
	private JButton adicionar;
	private ImageIcon logo,logo2;
	

	public TelaPrincipal() {
		Componentes();
		Eventos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		setBounds(0,0,1080,720);
		
		
		
		
		
		
	}	
	
	public void Componentes() {	
		//COR DE FUNDO
		setLayout(null);
		Color verde = new Color( 117, 179, 116);
		getContentPane().setBackground(verde);
		
		
		//LOGO TOKIO
		logo = new ImageIcon("imgs/logo2.png");			
		lb1 = new JLabel (logo);
		lb1.setBounds(100, 100 ,224,58);
		lb1.setVisible(true);
		add(lb1);			

		
//		lb2 = new JLabel ("TOKIO MARINE");
//		lb2.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 41) );
//	    lb2.setForeground(Color.yellow);
//	    lb2.setBounds(10,10,400,100);
//		add(lb2);
//	
	
	}


	public void Eventos() {
		
		
	}


	public static void main(String[] args) {
		new TelaPrincipal();	
		
		
	}


}