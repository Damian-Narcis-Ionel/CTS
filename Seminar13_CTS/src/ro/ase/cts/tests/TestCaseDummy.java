package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.classes.Grupa;
import ro.ase.cts.classes.IStudent;
import ro.ase.cts.tests.dubluri.StudentDummy;

public class TestCaseDummy {
	private IStudent studentDummy;
	
	@Before
	public void setUp() throws Exception {
		studentDummy = new StudentDummy();
	}

	@After
	public void tearDown() throws Exception {
	}

	public void testAdaugaStudent() {
		Grupa grupa = new Grupa(1003);
		grupa.adaugaStudent(studentDummy);
		assertEquals(1,grupa.getListaStudenti().size());
	}
	
	public void testAdaugaStudentCardinality() {
		Grupa grupa = new Grupa(1003);
		IStudent studentDummy2 = new StudentDummy();
		IStudent studentDummy3 = new StudentDummy();
		grupa.adaugaStudent(studentDummy2);
		grupa.adaugaStudent(studentDummy3);
		assertEquals(1,grupa.getListaStudenti().size());
	}

}
