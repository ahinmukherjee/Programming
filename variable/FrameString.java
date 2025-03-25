import java.awt.*;
import java.swing.*;

public class FrameString {
    public static void main(String args[]){
        SampleFram st= new SampleFram();
        st.setVisible(True);
        st.setDefaultCloseOption(3);
        } 
}


class SampleFram extends JFrame{
	public SampleFram(){
	Toolkit kit =Toolkit.getDefaultToolkit();
	Dimenstion scrsize= kit.getScreenSize();
	int w= scrsize.width();
	int h= scrsize.height();
	setSize(w/2,h/2);
	setLocation(w/4,h/4);
	setTitle("Hello");
	setResizable(false);
	MyPanel p= new MyPanel(); 
	add(Panel);
	}
}

class MyPanel extends JPanel{
	public void paintComponent(Graphics g){
	supper.paintComponent(g);
	setbackground(color.yellow);
	Font f= new Font("serif", Font.BOLD+Font.ITALIC,15);
	setFont(f);
	setForeground(f);
	g.deawString("I love You",100,200);
	}
}


