package ro.ase.cts.tests.suite;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.tests.GrupaTest;
import ro.ase.cts.tests.GrupaTestWithFake;
import ro.ase.cts.tests.TestCasePromovabilitate;
import ro.ase.cts.tests.dubluri.StudentDummy;
import ro.ase.cts.tests.dubluri.StudentFake;
@RunWith(Suite.class)
@SuiteClasses({GrupaTest.class, GrupaTestWithFake.class, TestCasePromovabilitate.class})
public class SuitaCompleta {

	
	
	
	
}
