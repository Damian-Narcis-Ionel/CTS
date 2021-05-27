package ro.acs.cts.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ro.acs.cts.classes.Student;

public class StudentsTests {

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConstructorRightName() {
		String nume = "Ion";
		Student student = new Student(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testListAddNota() {
		int nota=8;
		Student student = new Student("Dorel");
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}

	@Test
	public void testListSize() {
		Student student = new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(1,student.getNote().size());
	}
	
	@Test
	public void testCalculeazaMedieOSinguraNota() {
		Student student = new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(nota,student.calculeazaMedie(),0.01);
	}
	
	@Test
	public void testCalculeazaMedieMaiMulteNote() {
		Student student = new Student();
		int nota=8;
		int nota2=9;
		int nota3=5;
		
		float medie = (nota+nota2+nota3)/3.0f;
		
		student.adaugaNota(nota);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		assertEquals(medie,student.calculeazaMedie(),0.01);
	}
	
	@Test
	public void testCalculeazaMedieFaraNote() {
		Student student = new Student();
		assertEquals(0,student.calculeazaMedie(),0.01);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testGetNota() {
		Student student = new Student();
		int nota=8;
		student.adaugaNota(nota);
		
		assertEquals(nota,student.getNota(-1));
	}
	
	@Test
	public void testGetNotaJU3() {
		Student student = new Student();
		int nota=8;
		
		try {
			int x = student.getNota(-1);
			fail("Testul a esuat pt ca nu a aruncat IndexOutOfBoundsExceptions");
		}catch(IndexOutOfBoundsException e) {
			
		}	
	}
	
	@Test
	public void testVerificaRestanta() {
		Student student = new Student();
		
		student.adaugaNota(8);
		student.adaugaNota(3);
		student.adaugaNota(8);
		

		assertTrue(student.areRestante());
	}
	
	@Test
	public void testVerificaRestantaFalse() {
		Student student = new Student();
		
		student.adaugaNota(8);
		student.adaugaNota(8);
		student.adaugaNota(8);
		

		assertFalse(student.areRestante());
	}
}
