package GUI;



import javax.swing.JFrame;

import java.awt.Dimension;

import javax.swing.JButton;



public class Window implements Factory{

	public void Create() {
	    System.out.println("Inside Window::Create() method.-ATENTIE, in aceasta metoda se creaza si interfata grafica.");
	   initGUI();
	
	}
	
	private JFrame frame; //  compunere
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;

	public Window()
	{
		super();
		frame = new JFrame("Prima aplicatie grafica");
		initGUI();
	}
	
	private void initGUI()
	{
		frame.setSize(new Dimension(400, 400));
		frame.setVisible(true);
		frame.setLayout(null);
		
		btn1 = new JButton("Apasa1");
		btn2 = new JButton("Apasa2");
		btn3 = new JButton("Apasa3");
		
		
		btn1.setBounds(10, 20, 100, 20);
		btn2.setBounds(60, 60, 100, 20);
		btn3.setBounds(110, 100, 100, 20);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);

	}
	
	

}


