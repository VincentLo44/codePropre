package ex3;

import java.util.List;

public class SavaneAfricaine extends ZoneZoo {

	public SavaneAfricaine(List<Animal> listeAnimaux) {
		super(listeAnimaux);
	}

	@Override
	public double calculerKgsNourritureParJour() {
		return super.listeAnimaux.size() * 10;
	}

}
