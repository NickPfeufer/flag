import java.awt.*;
import java.util.*;
class Star {

	private Color color;
	private Polygon star = new Polygon();
	//(int)Math.round()
	public Star(double scale, int x, int y, Color ncolor){
		scale *= 0.25;
		this.star.addPoint((int)Math.round(0*scale)+x, (int)Math.round(1*scale)+y);
		this.star.addPoint((int)Math.round(1*scale)+x, (int)Math.round(1*scale)+y);
		this.star.addPoint((int)Math.round(1.5*scale)+x, (int)Math.round(0*scale)+y);
		this.star.addPoint((int)Math.round(2*scale)+x, (int)Math.round(1*scale)+y);
		this.star.addPoint((int)Math.round(3*scale)+x, (int)Math.round(1*scale)+y);
		this.star.addPoint((int)Math.round(2.2*scale)+x, (int)Math.round(1.7*scale)+y);
		this.star.addPoint((int)Math.round(3*scale)+x, (int)Math.round(3*scale)+y);
		this.star.addPoint((int)Math.round(1.5*scale)+x, (int)Math.round(2*scale)+y);
		this.star.addPoint((int)Math.round(0*scale)+x, (int)Math.round(3*scale)+y);
		this.star.addPoint((int)Math.round(0.7*scale)+x, (int)Math.round(1.7*scale)+y);
		this.color = ncolor;
	}
	public void draw(Graphics g){
		g.setColor(this.color);
		g.fillPolygon(this.star);
	}
}