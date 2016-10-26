package basic_classes;
import java.util.Date;

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
	
	
	public void execute(Pokemon pokemon1, Pokemon pokemon2){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
