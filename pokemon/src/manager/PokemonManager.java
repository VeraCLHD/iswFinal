package manager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import basic_classes.*;

public class PokemonManager {
	
	private static List<Pokemon> pokemonBase = new ArrayList<Pokemon>();
	private static List<Trainer> trainerBase = new ArrayList<Trainer>();
		
		//Abfrage aller Pokoemons mit einem bestimmten Typ.
		public static ArrayList<Pokemon> getPokemonWithType(Type type){
			ArrayList<Pokemon> pokemonsOfType = new ArrayList<Pokemon>();
			for(Trainer trainer: PokemonManager.getTrainerBase()){
				for(Pokemon pk: trainer.getPokemons()){
					if(pk.getType().equals(type)){
						pokemonsOfType.add(pk);
					}
				}
			}
			
			return pokemonsOfType;	
		}
		

	public static List<Pokemon> getPokemonBase() {
		return pokemonBase;
	}

	public static void setPokemonBase(List<Pokemon> pokemonBase) {
		PokemonManager.pokemonBase = pokemonBase;
	}

	public static List<Trainer> getTrainerBase() {
		return trainerBase;
	}

	public static void setTrainerBase(List<Trainer> trainerBase) {
		PokemonManager.trainerBase = trainerBase;
	}
	
	public static void main(String[] args) {
		/*Pokemon pokemon1 = new Pokemon("Sith", Type.Fire);
		Pokemon pokemon2 = new Pokemon("Curt", Type.Water);
		Pokemon pokemon3 = new Pokemon("John", Type.Poison);
		Pokemon pokemon4 = new Pokemon("Jimmy", Type.Fire);
		
		Trainer trainer1 = new Trainer("Jorn","L.");
		Trainer trainer2 = new Trainer("Jorn","M.");
		
		
		System.out.println("EQUALS" + trainer1.equals(trainer2));
		
		pokemon1.setTrainer(trainer1);
		pokemon2.setTrainer(trainer2);
		pokemon3.setTrainer(trainer1);
		
		PokemonManager.getPokemonBase().add(pokemon1);
		PokemonManager.getPokemonBase().add(pokemon2);
		PokemonManager.getPokemonBase().add(pokemon3);
		
		PokemonManager.getTrainerBase().add(trainer1);
		PokemonManager.getTrainerBase().add(trainer2);
		
		//All Pokemons of trainer 1
		System.out.println(trainer1.getPokemons());
		//Add a pokemon to the trainer 1
		trainer1.addPokemons(pokemon4);
		// Abfrage einzelner Pokemons über Trainer 1: Gehört Pokemon 1 zu Trainer 1?
		System.out.println(trainer1.getSpecificPokemon(pokemon1));
		//Alle Pokemons von Type Poison
		System.out.println(PokemonManager.getPokemonWithType(Type.Poison));
	*/
	}

}
