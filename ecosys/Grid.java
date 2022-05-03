package ecosys;

public class Grid {

	private int x;
	private int y;
	private int size;
	public int[][] map;

	public Grid(int x, int y) {
		this.x = x;
		this.y = y;
		this.size = x * y;
		this.map = new int[x][y];
	}

	public boolean cellIsFree(int x, int y) {
		return (map[x][y] == 0);
	}

	private void printSepLineEdge() {
		System.out.println("+" + "-".repeat((x * 8) - 1) + "+");
	}

	private void printSepLineMid() {
		System.out.println("|" + "---|".repeat(x * 2));
	}

	public void print() {
		printSepLineEdge();
		for (int i = 0; i < x; i++) {
			if (i != 0)
				printSepLineMid();
			System.out.print("|");
			for (int j = 0; j < y; j++)
				System.out.print(" " + map[i][j] + " |");
			System.out.println();
		}
		printSepLineEdge();
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setMap(int[][] map) {
		this.map = map;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int[][] getMap() {
		return map;
	}

	public int getSize() {
		return this.size;
	}
}
