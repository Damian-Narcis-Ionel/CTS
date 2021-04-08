package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.classes.AbstractDecorator;
import ro.ase.cts.decorator.classes.Card;
import ro.ase.cts.decorator.classes.ConcretDecorator;
import ro.ase.cts.decorator.classes.ICard;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICard card = new Card("Maria");
		card.platesteFizic();
		card.platesteOnline();
		
		AbstractDecorator decorator = new ConcretDecorator(card);
		decorator.platesteContactLess();
	}

}
