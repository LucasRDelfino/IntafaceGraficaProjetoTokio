package teste;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.sound.sampled.*;
import java.io.*;



public class PaginaInicial extends JFrame{
	private JPanel pn1;
	private JLabel lb1,lb2,lb3,lb4;
	private JButton adicionar;
	private ImageIcon logo,logo2,fundo,teste;
	

	public PaginaInicial() {
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
		Color verde = new Color(78, 127, 83);
	
		
		Color dourado = new Color(208, 138, 28);
		
		//LOGO TOKIO
		logo = new ImageIcon("imgs/logo2.png");			
		lb1 = new JLabel (logo);
		lb1.setBounds(50, 30 ,224,58);
		lb1.setVisible(true);
		add(lb1);		
		
		//TITULO
		lb2 = new JLabel ("Painel do Cliente");
		lb2.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 41) );
		lb2.setForeground(verde);
		lb2.setBounds(420,10,400,100);
		add(lb2);
		
		pn1 = new JPanel();
		pn1.setBounds(1, 10, 1080 , 100);
		pn1.setBackground(Color.WHITE);
		add(pn1);
		
				
		lb4 = new JLabel ("Clique no serviço desejado : ");
		lb4.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 31) );
		lb4.setBounds(15, 40 ,550 , 250);
		lb4.setForeground(Color.white);
		add(lb4);	
		
		
				
		//Imagem de fundo
		fundo = new ImageIcon("imgs/fundo.jpg");			
		lb3 = new JLabel (fundo);
		lb3.setBounds(1, 1 ,1080,720);
		lb3.setVisible(true);
		add(lb3);	

	public void Eventos() {
		
		
	}


	public static void main(String[] args) {
		new TelaPrincipal();	
		
		
	}


}