package basic_classes;
import java.util.Date;
// exercise 2.2
public class Swap {
	
	private Date swapDate;
	private String id;
	private Trainer trainer1;
	private Pokemon pokemon1;
	private Trainer trainer2;
	private Pokemon pokemon2;
	
	public Swap(Trainer trainer1, Trainer trainer2){
		this.setTrainer1(trainer1);
		this.setTrainer2(trainer2);
	}
	
	
	public void execute(Pokemon pokemon1, Pokemon pokemon2) throws Exception{
		if(trainer1 != trainer2){
			if(pokemon1.getTrainer() == trainer1 && pokemon2.getTrainer() == trainer2){
				if(pokemon1.isSwapAllow() && pokemon2.isSwapAllow()){
					if(pokemon1.getType() != pokemon2.getType()){
						
						// trainer.addPokemons does change the pokemon's trainer attribute to the new trainer
						
						trainer2.removePokemon(pokemon2);
						trainer1.addPokemons(pokemon2);
						
						trainer1.removePokemon(pokemon1);
						trainer2.addPokemons(pokemon1);
						swapDate = new Date(System.currentTimeMillis());
						
					} else {
						throw new Exception("Pokemon " + pokemon1.getName() + " kann nicht mit " + pokemon2.getName() + " getauscht werden, da beide vom Typ " + pokemon1.getType() + " sind.");
					}
				} else if(!pokemon1.isSwapAllow()){
					throw new Exception("Pokemon " + pokemon1.getName() + " ist nicht zum Tauschen freigegeben.");
				} else if(!pokemon2.isSwapAllow()){
					throw new Exception("Pokemon 2 is not allowed to swap.");
				} else{
					throw new Exception("Pokemon 1 and Pokemon 2 are not allowed to swap.");
				}
				
			} else if(pokemon2.getTrainer() == trainer1 && pokemon1.getTrainer() == trainer2){
				execute(pokemon2, pokemon1);
			} else {
				throw new Exception("One of the pokemons is not allowed to swap.");
				}
		} else{
			throw new Exception("A trainer can't swap with himself.");
		}
		
		
	}
		
	
	public static void main(String[] args) {
		// test the swap class
		Pokemon pokemon1 = new Pokemon("Sith", Type.Fire);
		Pokemon pokemon2 = new Pokemon("Curt", Type.Water);
		Pokemon pokemon3 = new Pokemon("John", Type.Poison);
		Pokemon pokemon4 = new Pokemon("Jimmy", Type.Fire);
		
		Trainer trainer1 = new Trainer("Jorn","L.");
		Trainer trainer2 = new Trainer("Jorn","M.");
		
		pokemon1.setTrainer(trainer1);
		pokemon2.setTrainer(trainer2);
		pokemon3.setTrainer(trainer1);
		
		Swap test = new Swap(trainer1, trainer2);
		
		// should work fine
		try{
			test.execute( pokemon1, pokemon2);
		} catch(Exception e){
			e.printStackTrace(System.out);
			//System.out.println(e);
		}
		
		// should print an error
		try{
			pokemon1.setSwapAllow(false);
			test.execute( pokemon1, pokemon2);
		} catch(Exception e){
			System.out.println(e);
		}
		
		try{
			pokemon1.setSwapAllow(true);
			pokemon2.setType(Type.Fire);
			test.execute( pokemon1, pokemon2);
		} catch(Exception e){
			System.out.println(e);
		}

	}

	public Trainer getTrainer1() {
		return trainer1;
	}

	public void setTrainer1(Trainer trainer1) {
		this.trainer1 = trainer1;
	}

	public Pokemon getPokemon1() {
		return pokemon1;
	}

	public void setPokemon1(Pokemon pokemon1) {
		this.pokemon1 = pokemon1;
	}

	public Trainer getTrainer2() {
		return trainer2;
	}

	public void setTrainer2(Trainer trainer2) {
		this.trainer2 = trainer2;
	}

	public Pokemon getPokemon2() {
		return pokemon2;
	}

	public void setPokemon2(Pokemon pokemon2) {
		this.pokemon2 = pokemon2;
	}

}
