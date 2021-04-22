package ro.ase.cts.state.classes;

public class StareLibera implements StareMasa{

	@Override
	public void modificaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(!(masa.getStareMasa() instanceof StareLibera)) {
			System.out.println("Masa cu codul "+masa.getNrMasa()+" a fost eliberata");
		}else {
			System.out.println("Masa este deja libera!");
		}
	}

}
