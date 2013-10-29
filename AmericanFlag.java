import java.awt.*;
import java.util.*;
class AmericanFlag {
	private int x, y;
	private double scale;
	private Rectangle whiteRec;
	private Rectangle[] redRec = new Rectangle[7];
	private Rectangle union;
	private Star[] stars = new Star[50];

	public AmericanFlag(int nx, int ny, double nscale){
		this.x = nx;
		this.y = ny;
		this.scale = nscale;
		this.whiteRec = new Rectangle(200.0*this.scale, 200.0*1.9*this.scale, Color.white, this.x, this.y);
		for (int i = 0, j = 0; i<this.whiteRec.height(); i = i + (int)Math.round(200.0/13.0*this.scale*2), j++) {
			this.redRec[j] = new Rectangle(200.0/13.0*this.scale, 200.0*1.9*this.scale, Color.red, this.x, this.y + i);
		}
		this.union = new Rectangle((200.0*7)/13.0*this.scale, 200.0*0.76*this.scale, Color.blue, this.x, this.y);
		
		int count = 1;
		int limit = 6;
		double sx=200.0*0.063*this.scale/2;
		double sy=200.0*0.054*this.scale/2;

		for (int i = 0; i<50; i++) {

			this.stars[i] = new Star(200.0*this.scale*0.0616,(int)Math.round(sx)+this.x,(int)Math.round(sy)+this.y,Color.white);
			sx+= 0.063*200.0*this.scale*2;
			
			if (count == limit) {
				sy += 0.054*200.0*this.scale;
				if (limit == 6) {
					limit = 5;
					sx=200.0*0.063*this.scale*2 - 200.0*0.063*this.scale/2;
					count = 0;
				}else{
					limit = 6;
					sx=200.0 * 0.063*this.scale/2;
					count=0;
				}
			}
			count++;			
		}
	}
	public void draw(Graphics g){
		this.whiteRec.draw(g);
		for (int i = 0; i < 7; i++) {
			this.redRec[i].draw(g);
		}
		this.union.draw(g);
		for (int i = 0; i<50; i++) {
			this.stars[i].draw(g);
		}
	}
}