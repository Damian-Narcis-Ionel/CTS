package classes;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private List<Animal> animals;
	private Zookeeper keeper;
	
	
	public Zoo(List<Animal> animals, Zookeeper keeper) {
		super();
		this.animals = animals;
		this.keeper = keeper;
	}
	
	public Zoo() {
		super();
		animals=new ArrayList<>();
		keeper = new Zookeeper("Gigi");
	}

	public void feedAllAnimals() {
		for(Animal a : animals) {
			keeper.feed(a);
		}
	}


	public List<Animal> getAnimals() {
		return animals;
	}


	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}


	public Zookeeper getKeeper() {
		return keeper;
	}


	public void setKeeper(Zookeeper keeper) {
		this.keeper = keeper;
	}
	

	public void addAnimal(Animal a) {
		animals.add(a);
	}
	
}
