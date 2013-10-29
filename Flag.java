import java.awt.*;
import java.applet.*;

public class Flag extends Applet {
	
	private AmericanFlag flag1;
	private AmericanFlag flag2;
	private AmericanFlag flag3;

	public void init() {
		flag1 = new AmericanFlag(50, 50, 1.0);
		flag2 = new AmericanFlag(30, 200, 0.5);
		flag3 = new AmericanFlag(100, 300, 2.0);
	}

	public void paint(Graphics g) {
		flag1.draw(g);
		flag2.draw(g);
		flag3.draw(g);
	}

}