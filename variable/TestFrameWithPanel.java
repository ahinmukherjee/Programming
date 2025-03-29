import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TestFrameWithPanel {
    public static void main(String args[]){
        SampleFrams st= new SampleFrams();
        st.setVisible(true);
        st.setDefaultCloseOperation(3);
    }
}

class SampleFrams extends JFrame{
	public SampleFrams(){
		Toolkit kit =Toolkit.getDefaultToolkit();
		Dimension scrsize= kit.getScreenSize();
		int w= scrsize.width;
		int h= scrsize.height;
		setSize(w/2,h/2);
		setLocation(w/4,h/4);
		setTitle("Welcome in Frame");
		setResizable(false);
		MyPanelIs p = new MyPanelIs();
		add(p);
	}
}

class MyPanelIs extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		setBackground(Color.pink);
		Font f = new Font("serif",Font.BOLD+Font.ITALIC,20);
		setFont(f);
		// setForeground(f);
		g.drawString("I Love Java",100,200); 
	}
	JButton exitButton;
	public MyPanelIs(){
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
