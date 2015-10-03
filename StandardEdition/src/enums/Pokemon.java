package enums;

public enum Pokemon {
	BULBASAUR(1, "IVEYSAUR", "Tackle"), CHARMANDER(4, "CHARMELEON", "Scratch"), SQUIRTLE(7, "WARTORTLE", "Tackle");

	private int index;
	private String evolution;
	private String move;

	Pokemon(int index, String evolution, String move) {
		this.index = index;
		this.evolution = evolution;
		this.move = move;
	}

	public void info() {
		System.out.println(
				this.name() + " has index " + index + ", uses move " + move + " and evolves into " + evolution);
	}

	/**
	 * Enums verbruiken binnen een object het geheugen van een int
	 * 
	 * Bij het vergelijken van twee enumerations wordt de index binnen de enum
	 * vergeleken
	 */
}