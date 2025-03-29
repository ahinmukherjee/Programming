import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ExitButtonPerfrom {
    public static void main(String args[]){
        SampleFram st= new SampleFram();
        st.setVisible(true);
        st.setDefaultCloseOperation(3);
    }
}


class SampleFram extends JFrame{
	public SampleFram(){
		Toolkit kit =Toolkit.getDefaultToolkit();
		Dimension scrsize= kit.getScreenSize();
		int w= scrsize.width;
		int h= scrsize.height;
		setSize(w/2,h/2);
		setLocation(w/4,h/4);
		setTitle("Welcome in Frame");
		setResizable(false);
		MyPanel p = new MyPanel();
		add(p);
	}
}

class MyPanel extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		setBackground(Color.yellow);
		Font f = new Font("serif",Font.BOLD+Font.ITALIC,20);
		setFont(f);
		g.drawString("I Love Java",100,200); 
	}
    
	JButton exitButton;
	public MyPanel(){
		exitButton = new JButton("Exit");
		add(exitButton);
		ExitAction ec= new ExitAction();
		exitButton.addActionListener(ec);
		
	}
}

class ExitAction implements ActionListener{
	public void actionPerformed(ActionEvent ac){
		System.exit(0);
	}
}
