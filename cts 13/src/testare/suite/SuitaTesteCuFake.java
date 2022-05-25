package testare.suite;

import clase.AgentieTurism;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testare.categorii.ITesteCuFake;
import testare.test.PachetTuristicTest;
import testare.test.TestAgentieTurism;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestAgentieTurism.class, PachetTuristicTest.class})
@Categories.IncludeCategory(ITesteCuFake.class)

public class SuitaTesteCuFake {

}
