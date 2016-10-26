package basic_classes;

public class Pokemon {
	private String name;
	private Type type;
	private Trainer trainer = null;
	
	
	//Aufgabe 1.2: Lernziel statische Attribute.
	private Integer number;
	private static Integer nextNumber = 1;
	
	
	// Aufgabe 1.2: Lernziel Konstruktor
	public Pokemon(String name, Type type){
		this.setName(name);
		this.setType(type);
		nextNumber += 1;
		this.setNumber(nextNumber-1);
	}
	
	
	//Aufgabe 1.2: Lernziel Getter/Setter Operationen
	public String getName() {
		return name;
	}
	
	/*
	 * Aufgabe 1.2: Lernziel this
	 * Die this-Referenz dient dazu, auf die jeweilige Instanz der Klasse zu referenzieren.
	 * In diesem Fall dient sie dazu, den Namen der jeweiligen Instanz der Klasse zu definieren.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}
	
	//Aufgabe 1.2: Lernziel Instanzoperation
	public String toString(){
		String result = "";
		result += "The name of the pokemon is: " + this.getName() + ". " 
				+ "The id of the pokemon is: " +  this.getNumber().toString() + ". " 
				+ "The type of the pokemon is: " + this.getType().toString() + ". ";
		return result;
		
	}
	
	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		// Trainer is set initially
		if(this.trainer == null){
			this.trainer = trainer;
			trainer.addPokemons(this);
		} 
		// Trainer changes.
		else{
			this.trainer.getPokemons().remove(this);
			this.trainer = trainer;
			trainer.addPokemons(this);
			System.err.println("The trainer of pokemon " + this.getNumber() + "has been changed.");
		}
		
	}

	
	public static void main(String[] args) {
		// Aufgabe 1.2: Lernziel main, Objektdeklaration und Objekterzeugung
		Pokemon pokemon;
		Pokemon jack = new Pokemon("Jack", Type.Fire);
		
		
		System.out.println(jack.getNumber());
		Pokemon mike = new Pokemon("Mike", Type.Fire);
		System.out.println(mike.getNumber());

	}






}
