package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class ZoneZoo {

	protected List<Animal> listeAnimaux = new ArrayList<Animal>();

	public ZoneZoo(List<Animal> listeAnimaux) {
		super();
		this.listeAnimaux = listeAnimaux;
	}

	public void addAnimal(Animal newAnimal) {
		this.listeAnimaux.add(newAnimal);
		newAnimal.setZoneZoo(this);
	}

	public void afficherListeAnimaux() {
		for (Animal animal : this.listeAnimaux) {
			System.out.println(animal.getNom());
		}
	}

	public abstract double calculerKgsNourritureParJour();

	public int compterAnimaux() {
		return listeAnimaux.size();
	}

}
