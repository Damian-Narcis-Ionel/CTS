package ro.ase.cts.observer.classes;

public interface Subiect {
	void aboneazaClinet(Observer observer);
	void trimiteMesaj(String mesaj);
	void dezaboneazaClient(Observer observer);
}
