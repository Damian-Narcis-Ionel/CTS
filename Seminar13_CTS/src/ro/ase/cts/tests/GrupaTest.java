package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.classes.Grupa;
import ro.ase.cts.classes.Student;
import ro.ase.cts.tests.suite.TesteNormale;
import ro.ase.cts.tests.suite.TestePromovabilitate;
import ro.ase.cts.tests.suite.TesteUrgente;

public class GrupaTest {
	

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Category(TesteNormale.class)
	@Test
	public void constructorTest() {
		Grupa grupa = new Grupa(1005);
		assertEquals(1005, grupa.getNrGrupa());
	}
	
	@Category(TesteUrgente.class)
	@Test
	public void testLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Category(TesteNormale.class)
	@Test
	public void testLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}

	@Category(TesteUrgente.class)
	@Test(expected = IndexOutOfBoundsException.class)
	public void inAfaraLimitelorTest() {
		Grupa grupa = new Grupa(1300);
	}
	
	@Category(TesteUrgente.class)
	@Test(timeout = 1000)
	public void performaceTest() {
		Grupa grupa = new Grupa(1050);
		
	}
	
	@Category(TesteUrgente.class)
	@Test
	public void corectitudinePromovabilitateTest() {
		Grupa grupa = new Grupa(1005);
		for(int i=1;i<11;i++) {
			Student student = new Student();
			student.adaugaNota(i);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.6f, grupa.getPromovabilitate(),.001f);
	}
	
	@Category({TesteNormale.class, TestePromovabilitate.class})
	@Test
	public void limitaInferioaraPromovabilitateTest() {
		Grupa grupa = new Grupa(1005);
		for(int i=1;i<11;i++) {
			Student student = new Student();
			student.adaugaNota(1);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.0f, grupa.getPromovabilitate(),.001f);
	}
	
	@Category(TestePromovabilitate.class)
	@Test
	public void limitaSuperioaraPromovabilitateTest() {
		Grupa grupa = new Grupa(1005);
		for(int i=1;i<11;i++) {
			Student student = new Student();
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		assertEquals(1f, grupa.getPromovabilitate(),.001f);
	}
	
	@Category({TesteNormale.class, TestePromovabilitate.class})
	@Test
	public void bounderyPromovabilitate() {
		Grupa grupa = new Grupa(1010);
		assertEquals(0, grupa.getPromovabilitate(),0.001f);
	}
	@Category({TesteUrgente.class, TestePromovabilitate.class})
	@Test
	public void cardinalityPromovabilitateTest() {
		Grupa grupa = new Grupa(1050);
		Student student = new Student();
		student.adaugaNota(5);
		grupa.adaugaStudent(student);
		assertEquals(1f, grupa.getPromovabilitate(),0.001f);
	}
}
