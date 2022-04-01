package pest;

import java.util.Random;

public class Move {

	static Boolean Up(Grid grid, Pest pest) {
		int x = pest.getX();
		int y = pest.getY();
		if (x < 0 || !grid.cellIsFree(x - 1, y))
			return false;
		pest.setX(x - 1);
		return true;
	}

	static Boolean Down(Grid grid, Pest pest) {
		int x = pest.getX();
		int y = pest.getY();
		if (x > grid.getX() || !grid.cellIsFree(x + 1, y))
			return false;
		pest.setX(x + 1);
		return true;
	}

	static Boolean Left(Grid grid, Pest pest) {
		int x = pest.getX();
		int y = pest.getY();
		if (y < 0 || !grid.cellIsFree(x, y - 1))
			return false;
		pest.setY(y - 1);
		return true;
	}

	static Boolean Right(Grid grid, Pest pest) {
		int x = pest.getX();
		int y = pest.getY();
		if (y > grid.getY() || !grid.cellIsFree(x, y + 1))
			return false;
		pest.setY(y + 1);
		return true;
	}

	static Boolean CheckUp(Grid grid, Pest pest) {
		int x = pest.getX();
		int y = pest.getY();
		if (x < 0 || !grid.cellIsFree(x - 1, y))
			return false;
		return true;
	}

	static Boolean CheckDown(Grid grid, Pest pest) {
		int x = pest.getX();
		int y = pest.getY();
		if (x > grid.getX() || !grid.cellIsFree(x + 1, y))
			return false;
		return true;
	}

	static Boolean CheckLeft(Grid grid, Pest pest) {
		int x = pest.getX();
		int y = pest.getY();
		if (y < 0 || !grid.cellIsFree(x, y - 1))
			return false;
		return true;
	}

	static Boolean CheckRight(Grid grid, Pest pest) {
		int x = pest.getX();
		int y = pest.getY();
		if (y > grid.getY() || !grid.cellIsFree(x, y + 1))
			return false;
		return true;
	}

	static private int[] GetPossibilities(Grid grid, Pest pest) {
		int n_moves = 4;
		int posibilities[] = new int[n_moves];
		if (CheckUp(grid, pest))
			posibilities[0] = 1;
		if (CheckDown(grid, pest))
			posibilities[1] = 1;
		if (CheckLeft(grid, pest))
			posibilities[2] = 1;
		if (CheckRight(grid, pest))
			posibilities[3] = 1;
		return posibilities;
	}

	static void randMove(Grid grid, Pest pest) {
		int[] posibilities;
		int i;

		posibilities = GetPossibilities(grid, pest);
		i = posibilities[(int) Math.random() * (posibilities.length - 1)];
		if (i == 0)
			Up(grid, pest);
		if (i == 1)
			Down(grid, pest);
		if (i == 2)
			Left(grid, pest);
		if (i == 3)
			Right(grid, pest);
	}
}
