package ecosys;

public class Main {
	public static void main(String[] args) {
		Ecosystem system = new Ecosystem();
		system.grid.print();
		system.fillGrid();
		system.grid.print();
		System.out.println(system.toString());
		System.out.println(system.getNb_pests());
	}
}
