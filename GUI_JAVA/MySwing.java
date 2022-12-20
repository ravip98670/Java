import javax.swing.*;
public class MySwing {
    JFrame f;
    MySwing()
    {
        f=new JFrame();
        JButton b=new JButton("Click");
        b.setBounds(150,150,100,60);
        f.add(b);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String ...s){

      new MySwing();

    }
    
}
