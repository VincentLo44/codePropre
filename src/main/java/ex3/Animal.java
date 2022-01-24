package ex3;

public abstract class Animal {

	private String nom;
	private ZoneZoo zoneZoo;
	private TypeAnimal typeAnimal;
	private TypeComportement comportement;

	public Animal(String nom, ZoneZoo zoneZoo, TypeAnimal typeAnimal, TypeComportement comportement) {
		super();
		this.nom = nom;
		this.zoneZoo = zoneZoo;
		this.typeAnimal = typeAnimal;
		this.comportement = comportement;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ZoneZoo getZoneZoo() {
		return zoneZoo;
	}

	public void setZoneZoo(ZoneZoo zoneZoo) {
		this.zoneZoo = zoneZoo;
	}

	public TypeAnimal getTypeAnimal() {
		return typeAnimal;
	}

	public void setTypeAnimal(TypeAnimal typeAnimal) {
		this.typeAnimal = typeAnimal;
	}

	public TypeComportement getComportement() {
		return comportement;
	}

	public void setComportement(TypeComportement comportement) {
		this.comportement = comportement;
	}

}
