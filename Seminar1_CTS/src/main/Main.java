package main;

import classes.*;
public class Main {

	public static void main(String[] args) {
		Zookeeper keeper = new Zookeeper("Dani");
		Zoo zoo = new Zoo();

		zoo.setKeeper(keeper);
		
		Giraffe giraffe = new Giraffe("Girafa",10);
		Giraffe secondGiraffe = new Giraffe("GirafaDoi",15,200);
		
		zoo.addAnimal(giraffe);
		zoo.addAnimal(secondGiraffe);
		
		zoo.feedAllAnimals();
		
		Zebra z1 = new Zebra("Zebra1",7);
		Zebra z2 = new Zebra("Zebra2",9,132);
		
		zoo.addAnimal(z1);
		zoo.addAnimal(z2);
		zoo.feedAllAnimals();
		
		
	}

}
