package test_cases;


import ironscales_Selenium_POM.JAVA.Removal;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestRemoval {
    SoftAssert soft_assert = new SoftAssert();


    @Test
    public void testCase1Positive() {

        soft_assert.assertEquals(Removal.Remove(" Hello World!"), "Hello World!", "The strings don't match: ");
        soft_assert.assertEquals(Removal.Remove("Hello World! "), "Hello World!", "The strings don't match: ");
        soft_assert.assertEquals(Removal.Remove(" Hello World! "), "Hello World!", "The strings don't match: ");
        soft_assert.assertAll();

    }

    @Test
    public void testCase2Negative() {

        soft_assert.assertEquals(Removal.Remove(""), "", "The strings don't match: ");
        soft_assert.assertEquals(Removal.Remove(" "), "", "The strings don't match: ");
        soft_assert.assertEquals(Removal.Remove("a b"), "a b", "The strings don't match: ");
        soft_assert.assertEquals(Removal.Remove("a b c"), "a b c", "The strings don't match: ");
        soft_assert.assertEquals(Removal.Remove("!@#$%^&*()_+-="), "!@#$%^&*()_+-=", "The strings don't match: ");
        soft_assert.assertEquals(Removal.Remove("      Hello World!      "), "Hello World!", "The strings don't match: ");

        soft_assert.assertAll();

    }
}
