package basic_classes;
import java.util.HashSet;

// Aufgabe 1.2: Lernziel Objektreferenz.
public class Trainer {
	private String firstname;
	private String lastname;
	private Integer id;
	//diese Variable diente nur zu Zwecken der Aufgabe 1.2, wird nicht weiter verwendet
	private Pokemon pokemon;
	
	/*
	 * Aufgabe 1.3: Für welche Collection habe ich mich entschieden?
	 * Ich habe mich für einen HashSet in der Klasse Trainer entschieden (der Trainer hat Kenntnis über seine Pokemons und nicht umgekehrt).
	 * Vorteile sind: ein Pokemon kann dort nicht zweimal auftauchen. Wenn man das in der Klasse Trainer macht, braucht man keine HashMap.
	 * Vorteile ArrayList: sie ist sortiert. Nachteile: Ein Pokemon darf zweimal bei einem Trainer sein (Redundanz).
	 * Vorteile HashMap: eindeutige Zuordnung von einem Trainer zu Pokemons. Nachteil: für diese Anwendung unnötig, man bräuchte eine eindeutige Identifikation des Trainers, 
	 * wenn Trainer als Schlüssel verwendet wird. Zudem: wenn man als value eine ArrayList nimmt, hat man den gleichen Vorteil wie bei der ArrayList. Keys sind außerdem nicht sortiert.
	 * Vorteile HashSet: Ein Pokemon kann nur einmal bei einem Trainer auftauchen. Nachteil: unsortiert.
	 */
	private HashSet<Pokemon> pokemons = new HashSet<Pokemon>();
	
	public Trainer(String firstname, String lastname){
		this.setFirstname(firstname);
		this.setLastname(lastname);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public Pokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}

	public HashSet<Pokemon> getPokemons() {
		return pokemons;
	}

	public void setPokemons(HashSet<Pokemon> pokemons) {
		this.pokemons = pokemons;
	}
	
	//Neue Pokemons zu einem Trainer hinzufügen
	public void addPokemons(Pokemon pokemonToAdd){
		if(pokemonToAdd.getTrainer() == null){
			pokemonToAdd.setTrainer(this);
			this.getPokemons().add(pokemonToAdd);
		}
		else if(pokemonToAdd.getTrainer().equals(this)){
			this.getPokemons().add(pokemonToAdd);
		} else{
			System.err.println("The pokemon couldn't be added to this trainer. It already has another trainer");
		}
		
	}
	
	//Abfrage einzelner Pokemons über Trainer
	public boolean getSpecificPokemon(Pokemon pk){
		boolean bl = false;
		for(Pokemon pokemon: this.getPokemons()){
			if(pokemon.getNumber().equals(pk.getNumber())){
				bl = true;
			}
		}
		return bl;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
