package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.classes.Grupa;
import ro.ase.cts.classes.IStudent;
import ro.ase.cts.tests.dubluri.StudentStub;

public class TestCasePromovabilitate {
	private IStudent studentStub;

	@Before
	public void setUp() throws Exception {
		studentStub = new StudentStub();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetPromovabilitate() {
		Grupa grupa = new Grupa(1010);
		grupa.adaugaStudent(studentStub);
		assertEquals(1,grupa.getPromovabilitate(), .01f);
	}

}
