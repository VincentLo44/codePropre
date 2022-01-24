package ex3;

public class Zoo {

	private String nom;
	private Aquarium zoneAquarium;
	private FermeReptile zoneFermeReptile;
	private SavaneAfricaine zoneSavaneAfricaine;
	private ZoneCarnivore zoneCarnivore;

	public Zoo(String nom) {
		super();
		this.nom = nom;
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	public Aquarium getZoneAquarium() {
		return zoneAquarium;
	}

	public void setZoneAquarium(Aquarium zoneAquarium) {
		this.zoneAquarium = zoneAquarium;
	}

	public FermeReptile getZoneFermeReptile() {
		return zoneFermeReptile;
	}

	public void setZoneFermeReptile(FermeReptile zoneFermeReptile) {
		this.zoneFermeReptile = zoneFermeReptile;
	}

	public SavaneAfricaine getZoneSavaneAfricaine() {
		return zoneSavaneAfricaine;
	}

	public void setZoneSavaneAfricaine(SavaneAfricaine zoneSavaneAfricaine) {
		this.zoneSavaneAfricaine = zoneSavaneAfricaine;
	}

	public ZoneCarnivore getZoneCarnivore() {
		return zoneCarnivore;
	}

	public void setZoneCarnivore(ZoneCarnivore zoneCarnivore) {
		this.zoneCarnivore = zoneCarnivore;
	}

}
