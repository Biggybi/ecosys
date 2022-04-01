package pest;

import java.util.Random;

public class Pest {
	private int speed;
	private int zombie;
	private int x;
	private int y;

	public Pest(Grid grid) {
		zombie = 0;
		x = (int) (Math.random() * (grid.getX() - 1));
		y = (int) (Math.random() * (grid.getY() - 1));
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setZombie(int zombie) {
		this.zombie = zombie;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getSpeed() {
		return speed;
	}

	public int getZombie() {
		return zombie;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
