import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject {

	public Player(int myX, int myY, ID myID) {
		super(myX, myY, myID);
		
	}
	public void tick() {
		x+=velX;
		y+=velY;
	}
	public void render(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, y, 32, 32);
	}

}
