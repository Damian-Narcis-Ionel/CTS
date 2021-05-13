package ro.ase.cts.observer.classes;

import java.util.ArrayList;
import java.util.List;

public class Sala implements Subiect{
	
	private String numeSala;
	private List<Observer> observeri;
	
	
	public Sala(String numeSala) {
		super();
		this.numeSala = numeSala;
		this.observeri = new ArrayList<>();
	}
	@Override
	public void aboneazaClinet(Observer observer) {
		// TODO Auto-generated method stub
		observeri.add(observer);
	}
	@Override
	public void trimiteMesaj(String mesaj) {
		// TODO Auto-generated method stub
		for(Observer obs : observeri) {
			obs.receptionareMesaj(mesaj);
		}
	}
	@Override
	public void dezaboneazaClient(Observer observer) {
		// TODO Auto-generated method stub
		observeri.remove(observer);
	}
	
	public void anuntaMeci() {
		trimiteMesaj("Urmeaza meci de fotbal");
	}
	public void anuntaMeciVolei() {
		trimiteMesaj("Urmeaza meci de volei");
	}
}
