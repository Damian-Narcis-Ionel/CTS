package ro.ase.cts.tests.suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.tests.GrupaTest;
import ro.ase.cts.tests.GrupaTestWithFake;
import ro.ase.cts.tests.TestCasePromovabilitate;

@RunWith(Categories.class)
@SuiteClasses({GrupaTest.class, GrupaTestWithFake.class, TestCasePromovabilitate.class})
@IncludeCategory(TestePromovabilitate.class)
@ExcludeCategory(TesteNormale.class)
public class SuitaCustom{

}
