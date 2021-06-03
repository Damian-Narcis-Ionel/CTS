package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.classes.Grupa;
import ro.ase.cts.tests.dubluri.StudentFake;
import ro.ase.cts.tests.suite.TesteNormale;
import ro.ase.cts.tests.suite.TestePromovabilitate;
import ro.ase.cts.tests.suite.TesteUrgente;

public class GrupaTestWithFake {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Category({TesteUrgente.class, TestePromovabilitate.class})
	@Test
	public void promovabilitateFakeTestCuRestanta() {
		StudentFake studentFake = new StudentFake();
		studentFake.setAreRestanta(true);
		Grupa grupa = new Grupa(1079);
		grupa.adaugaStudent(studentFake);
		
		assertEquals(0, grupa.getPromovabilitate(),0.01f);
	}
	
	@Category({TesteNormale.class, TestePromovabilitate.class})
	@Test
	public void promovabilitateFakeTestFaraRestanta() {
		StudentFake studentFake = new StudentFake();
		studentFake.setAreRestanta(false);
		Grupa grupa = new Grupa(1079);
		grupa.adaugaStudent(studentFake);
		
		assertEquals(1, grupa.getPromovabilitate(),0.01f);
	}

}
