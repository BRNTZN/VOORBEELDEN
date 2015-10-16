package org.betavzw.libs;

import org.betavzw.main.Beta;

@Beta
public class MijnKlasse {
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
