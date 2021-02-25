package classes;

public class Zebra extends Animal{
	private int noStripses;

	

	public Zebra(String name, float greutate, int noStripses) {
		super(name, greutate);
		this.noStripses = noStripses;
	}

	public Zebra( String name,int greutate) {
		super(name, greutate);
	}

	public int getNoStripses() {
		return noStripses;
	}

	public void setNoStripses(int noStripses) {
		this.noStripses = noStripses;
	}
	
	
	
	

}
