package ex3;

import java.util.List;

public class FermeReptile extends ZoneZoo {

	public FermeReptile(List<Animal> listeAnimaux) {
		super(listeAnimaux);
	}

	@Override
	public double calculerKgsNourritureParJour() {
		return super.listeAnimaux.size() * 0.1;
	}

}
