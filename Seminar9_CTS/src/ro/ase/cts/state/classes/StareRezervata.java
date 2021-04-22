package ro.ase.cts.state.classes;

public class StareRezervata implements StareMasa{

	@Override
	public void modificaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(masa.getStareMasa() instanceof StareLibera) {
			System.out.println("Masa cu numarul "+ masa.getNrMasa()+" a fost rezervata");
			masa.setStareMasa(this);
		}else {
			System.out.println("Masa nu este disponibila");
		}
	}
	
}
