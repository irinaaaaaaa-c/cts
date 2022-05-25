package testare.suite;


import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testare.categorii.ITesteCuFake;
import testare.categorii.TesteCuStub;
import testare.categorii.TesteDeRight;
import testare.test.PachetTuristicTest;
import testare.test.TestAgentieTurism;

//Suite ruleaza toate testele, daca avem Categories ruleaza pe categorii
@RunWith(Categories.class)
@Suite.SuiteClasses({TestAgentieTurism.class, PachetTuristicTest.class})
@Categories.IncludeCategory({ITesteCuFake.class,TesteCuStub.class})
@Categories.ExcludeCategory(TesteDeRight.class)
public class SuitaPentruTesteleCareSuntFakeFaraRight {


}
