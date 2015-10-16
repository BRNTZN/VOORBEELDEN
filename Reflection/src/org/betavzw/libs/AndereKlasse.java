package org.betavzw.libs;

/*
 * Aangezien deze klasse geen annotatie heeft, zal ze niet worden opgepikt
 */
public class AndereKlasse {
	private String naam;

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}
	@Override
	public String toString() {
		return naam;
	}
}
