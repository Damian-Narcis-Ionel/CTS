package ro.ase.cts.state.classes;

public class StareOcupata implements StareMasa{

	@Override
	public void modificaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(!(masa.getStareMasa() instanceof StareOcupata)) {
			System.out.println("Masa cu numarul "+masa.getNrMasa()+" a fost rezervata");
		}else {
			System.out.println("Masa este deja rezervata sau ocupata!");
		}
	}

}
