package ecosys;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ecosystem {
	Grid grid;
	private int nb_rats = 0;
	private int nb_pigeons = 0;
	private int nb_zombies = 0;
	private int nb_pests = 0;

	public Ecosystem() {
		this.grid = new Grid(5, 10);
		this.nb_rats = randNumPest();
		this.nb_pigeons = randNumPest();
		this.nb_zombies = randNumPest();
	}

	private Integer[] generate_rand_table() {

		int gridSize = grid.getSize();
		Integer[] tab = new Integer[gridSize];
		for (int i = 0; i < gridSize; i++)
			tab[i] = i;
		List<Integer> intList = Arrays.asList(tab);
		Collections.shuffle(intList);
		intList.toArray(tab);
		return (tab);
	}

	private int get_y_pos(int n) {
		int y;

		y = n % (grid.getY() - 0);
		return y;
	}

	private int get_x_pos(int n) {
		int x;

		x = n / grid.getY();
		return x;
	}

	public void fillGrid() {
		Integer[] tab = generate_rand_table();
		for (int i = 0; i < grid.getSize(); i++)
			System.out.print(tab[i] + " | ");
		System.out.println();

		int i = -1;
		int n = -1;

		// System.out.println(tab);
		while (++n < nb_pigeons)
			this.grid.map[get_x_pos(tab[++i])][get_y_pos(tab[i])] = 1;
		n = -1;
		while (++n < nb_rats)
			this.grid.map[get_x_pos(tab[++i])][get_y_pos(tab[i])] = 2;
		n = -1;
		while (++n < nb_zombies)
			this.grid.map[get_x_pos(tab[++i])][get_y_pos(tab[i])] = 3;
	}

	private int randNumPest() {
		int nb;

		nb = (int) (Math.random() * (((grid.getX() * grid.getY()) / 3) - nb_pests - 1));
		this.nb_pests += nb;
		return (nb);
	}

	@Override
	public String toString() {
		return "Ecosystem [nb_pests=" + nb_pests + ", nb_pigeons=" + nb_pigeons + ", nb_rats=" + nb_rats
				+ ", nb_zombies=" + nb_zombies + "]";
	}

	public Grid getGrid() {
		return grid;
	}

	public int getNb_pests() {
		return nb_pests;
	}

	public int getNb_rats() {
		return nb_rats;
	}

	public int getNb_pigeons() {
		return nb_pigeons;
	}

	public int getNb_zombies() {
		return nb_zombies;
	}

	public void setGrid(Grid grid) {
		this.grid = grid;
	}

	public void setNb_pests(int nb_pests) {
		this.nb_pests = nb_pests;
	}

	public void setNb_rats(int nb_rats) {
		this.nb_rats = nb_rats;
	}

	public void setNb_pigeons(int nb_pigeons) {
		this.nb_pigeons = nb_pigeons;
	}

	public void setNb_zombies(int nb_zombies) {
		this.nb_zombies = nb_zombies;
	}

}
