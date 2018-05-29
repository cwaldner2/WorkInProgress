import java.awt.Graphics;

public abstract class GameObject {
	
	protected int x, y;
	protected ID id;
	protected int velX, velY;
	
	public GameObject(int myX, int myY, ID myID) {
		x=myX;
		y=myY;
		id=myID;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	
	public void setX(int myX) {
		x=myX;
	}
	public void setY(int myY) {
		y=myY;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setID(ID myID) {
		id=myID;
	}
	public ID getID() { 
		return id;
	}
	public void setVelX(int myVelX) {
		velX=myVelX;
	}
	public void setVelY(int myVelY) {
		velY=myVelY;
	}
	public int getVelX() {
		return velX;
	}
	public int getVelY() {
		return velY;
	}
	
}
