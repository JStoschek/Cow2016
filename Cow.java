import java.awt.*;import javax.swing.JFrame; import java.util.Random;
public class Cow extends JFrame{
	private final Color DarkGrey = new Color(77,77,77);
	
	public Cow(){
		setSize(600,600);
		setBackground(Color.white);
		repaint();
	}
	
	public void paint(Graphics g){
		
		//Body
		drawOval(g, 100, 150, 400, 400, Color.white);

		//RFoot
		drawOval(g, 205, 515, 70, 70, DarkGrey);
		g.setColor(Color.white);
		g.fillRect(0, 570, 600, 50);
		g.setColor(Color.black);
		g.fillRoundRect(205, 565, 70, 5, 5, 5);
		
		//LFoot
		drawOval(g, 325, 515, 70, 70, DarkGrey);
		g.setColor(Color.white);
		g.fillRect(0, 570, 600, 50);
		g.setColor(Color.black);
		g.fillRoundRect(325, 565, 70, 5, 5, 5);
		
		//Head
		drawOval(g, 150, 110, 300, 300, Color.white);
		drawOval(g, 225, 325, 150, 105, Color.PINK);
	}
	
	public static void drawOval(Graphics g, int x,int y, int w, int h, Color c){
		g.setColor(Color.black);
		g.fillOval(x-5, y-5, w+10, h+10);
		g.setColor(c);
		g.fillOval(x, y, w, h);
	}
}
