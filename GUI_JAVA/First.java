import java.awt.*;
import java.awt.event.*;
class First extends Frame implements ActionListener
{
	TextField tf1,tf2;
	Label l1;
	First()
	{
		tf1=new TextField();
		tf2=new TextField();
		l1=new Label();
		l1.setBounds(100,200,200,50);
		tf1.setBounds(50,50,200,50);
		tf2.setBounds(50,125,200,50);
		Button b1=new Button("click"); 
		b1.setBounds(200,200,100,60); 
		add(b1); 
		add(l1); 
		add(tf1); 
		add(tf2); 
		b1.addActionListener(this);
		setSize(500,500);
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
			String s2=tf2.getText();
			int res=Integer.parseInt(s1)+Integer.parseInt(s2);
			l1.setText(String.valueOf(res));
	}
	public static void main(String ...s)
	{
		new First();
		
	}	

}
