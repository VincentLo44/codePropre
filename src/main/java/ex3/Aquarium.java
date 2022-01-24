package ex3;

import java.util.List;

public class Aquarium extends ZoneZoo {

	public Aquarium(List<Animal> listeAnimaux) {
		super(listeAnimaux);
	}

	@Override
	public double calculerKgsNourritureParJour() {
		return super.listeAnimaux.size() * 0.2;
	}

}
