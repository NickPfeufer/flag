import java.awt.*;
import java.util.*;
class Rectangle {
	private int height, width, x, y;
	private Color color;
	private Point point;

	public Rectangle(double newheight, double newwidth, Color newcolor, int nx, int ny){
		this.height = (int)Math.round(newheight);
		this.width = (int)Math.round(newwidth);
		this.color = newcolor;
		this.point = new Point(nx, ny);
	}
	public int height(){
		return this.height;
	}
	public int width(){
		return this.width;
	}
	public Color color(){
		return this.color;
	}
	public void draw(Graphics g){
		g.setColor(this.color);
		g.fillRect(this.point.x(), this.point.y(), this.width, this.height);
	}
}
