import java.applet.Applet;
import java.awt.Graphics;
import  java.awt.Color;
import java.util.Calendar;

public class Clock extends Applet{
    public void init(){
        setBackground(new Color(0,0,0));
    }
    public void paint(Graphics g){
        double angle;
        int x,y;
        g.setColor(new Color(255,255,255));
        for(int i=1; i<=12; i++){
            angle=i*Math.PI/6;
            x=(int)(200*Math.sin(angle));
            y=(int)(200*Math.cos(angle));
            g.drawString(Integer.toString(i), 300+x, 300-y);
        }
    }
}