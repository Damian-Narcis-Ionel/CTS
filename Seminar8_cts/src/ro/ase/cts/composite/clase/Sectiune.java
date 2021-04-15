package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements IOptiuniMeniu{
	
	List<IOptiuniMeniu> lista;
	private String numeSectiune;
	
	public Sectiune(String numeSectiune) {
		super();
		this.lista = new ArrayList<IOptiuniMeniu>();
		this.numeSectiune = numeSectiune;
	}

	@Override
	public void adaugaNod(IOptiuniMeniu optiune) {
		// TODO Auto-generated method stub
		lista.add(optiune);
		
	}

	@Override
	public void stergeNod(IOptiuniMeniu optiune) {
		// TODO Auto-generated method stub
		lista.remove(optiune);
	}

	@Override
	public IOptiuniMeniu getNod(int index) {
		// TODO Auto-generated method stub
		return lista.get(index);
	}

	@Override
	public void descriere() {
		// TODO Auto-generated method stub
		System.out.println("Sectiunea: "+numeSectiune);
		for(IOptiuniMeniu optiune: lista) {
			System.out.println(optiune);
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sectiune [lista=");
		builder.append(lista);
		builder.append(", numeSectiune=");
		builder.append(numeSectiune);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
