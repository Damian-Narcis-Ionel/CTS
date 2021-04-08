package ro.ase.cts.decorator.classes;

public class ConcretDecorator extends AbstractDecorator{

	public ConcretDecorator(ICard card) {
		super(card);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void platesteContactLess() {
		System.out.println(super.getCard().getDetinatorCard()+" plateste contactless.");
		
	}

	@Override
	public String getDetinatorCard() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
