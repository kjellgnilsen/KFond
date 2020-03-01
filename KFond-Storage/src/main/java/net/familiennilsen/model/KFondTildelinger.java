package net.familiennilsen.model;

import java.util.List;

public class KFondTildelinger {
	private List<KFondTildelinger> tildelinger;

	public KFondTildelinger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KFondTildelinger(List<KFondTildelinger> tildelinger) {
		super();
		this.tildelinger = tildelinger;
	}

	public List<KFondTildelinger> getTildelinger() {
		return tildelinger;
	}

	public void setTildelinger(List<KFondTildelinger> tildelinger) {
		this.tildelinger = tildelinger;
	}
	
}
