package classes;

public class Zookeeper {
	private String name;

	public void feed(Animal a) {
		System.out.println("Animalul "+ a.getName()+" a fost hranit");
	}

	public Zookeeper(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
