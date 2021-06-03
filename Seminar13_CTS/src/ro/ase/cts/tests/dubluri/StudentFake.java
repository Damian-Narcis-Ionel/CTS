package ro.ase.cts.tests.dubluri;

import java.util.List;

import ro.ase.cts.classes.IStudent;

public class StudentFake implements IStudent{
	private String nume;
	private float medie;
	private boolean areRestanta;
	
	
	public StudentFake() {}
	
	public StudentFake(String nume, float medie, boolean areRestanta) {
		super();
		this.nume = nume;
		this.medie = medie;
		this.areRestanta = areRestanta;
	}

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		this.nume=nume;
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		// TODO Auto-generated method stub
		return medie;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return areRestanta;
	}
	
	public void setAreRestanta(boolean areRestanta) {
		this.areRestanta=areRestanta;
	}

}
