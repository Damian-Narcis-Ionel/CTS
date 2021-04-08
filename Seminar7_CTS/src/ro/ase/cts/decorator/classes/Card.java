package ro.ase.cts.decorator.classes;

public class Card implements ICard{
	public String detinatorCard;
	
	

	public Card(String detinatorCard) {
		super();
		this.detinatorCard = detinatorCard;
	}

	@Override
	public void platesteOnline() {
		System.out.println(detinatorCard + " a platit online");
		
	}

	@Override
	public void platesteFizic() {
		// TODO Auto-generated method stub
		System.out.println(detinatorCard+ " a platit fizic");
	}

	public String getDetinatorCard() {
		return detinatorCard;
	}
	
	
}
