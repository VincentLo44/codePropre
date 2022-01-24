package ex3;

import java.util.List;

public class ZoneCarnivore extends ZoneZoo {

	public ZoneCarnivore(List<Animal> listeAnimaux) {
		super(listeAnimaux);
	}

	@Override
	public double calculerKgsNourritureParJour() {
		return super.listeAnimaux.size() * 10;
	}

}
