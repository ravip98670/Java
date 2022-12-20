import java.awt.*;
import java.awt.event.*;
class MyCalculator extends Frame implements ActionListener
{
	TextField tf1;
	Label l1;
	MyCalculator()
	{
		tf1=new TextField();
		l1=new Label();
		l1.setBounds(100,200,200,50);
		tf1.setBounds(50,50,400,100);
		Button b1=new Button("1"); 
		b1.setBounds(50,200,100,60); 
		add(b1); 
		Button b2=new Button("2"); 
		b2.setBounds(150,200,100,60);
		add(b2);
		Button b3=new Button("3"); 
		b3.setBounds(250,200,100,60);
		add(b3);
		Button b4=new Button("="); 
		b4.setBounds(350,200,100,60);
		add(b4);
		Button b5=new Button("4"); 
		b5.setBounds(50,350,100,60); 
		add(b5);
		Button b6=new Button("5"); 
		b6.setBounds(150,350,100,60); 
		add(b6);
		Button b7=new Button("6"); 
		b7.setBounds(250,350,100,60); 
		add(b7);
		Button b8=new Button("+"); 
		b8.setBounds(350,350,100,60); 
		add(b8);
		Button b9=new Button("7"); 
		b9.setBounds(50,500,100,60); 
		add(b9); 
		Button b10=new Button("8"); 
		b10.setBounds(150,500,100,60);
		add(b10);
		Button b11=new Button("9"); 
		b11.setBounds(250,500,100,60);
		add(b11);
		Button b12=new Button("-"); 
		b12.setBounds(350,500,100,60);
		add(b12);
		Button b13=new Button("/"); 
		b13.setBounds(50,650,100,60); 
		add(b13);
		Button b14=new Button("0"); 
		b14.setBounds(150,650,100,60); 
		add(b14);
		Button b15=new Button("*"); 
		b15.setBounds(250,650,100,60); 
		add(b15);
		Button b16=new Button("Clear"); 
		b16.setBounds(350,650,100,60); 
		add(b16);
		add(l1); 
		add(tf1);    
		
		setSize(500,800);
		setLayout(null);
		setVisible(true);
		addWindowListener (new WindowAdapter(){ 
            public void windowClosing (WindowEvent e) {    
                dispose();    
            
			}}); //predefined method to close GUI Window ,it enables the Cross key ...
	}
	public void actionPerformed(ActionEvent e)
	{
			String s1=tf1.getText();
	}
	public static void main(String ...s)
	{
		new MyCalculator();
		
	}	

}
