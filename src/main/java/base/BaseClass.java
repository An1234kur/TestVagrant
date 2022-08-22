package base;

import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

/**
 * @author : Kamal
 * @project : TestVagrant
 * @created : 22/08/2022 - 11:49 AM
 */

//  A base class which contain methods which execute as prerequisite to all class and methods
public class BaseClass {
    //Execute before the suite
    @BeforeSuite
    public void beforeSuite(ITestContext context) {
        System.out.println("==================== START OF SUITE: " + context.getCurrentXmlTest().getSuite().getName() + " ====================\n");
    }

    //Execute before the @Test annotation
    @BeforeMethod
    public void beforeMethod(Method m) {
        System.out.println("==================== STARTING TEST: " + m.getName().toUpperCase() + " ====================");
        System.out.println("THREAD ID: " + Thread.currentThread().getId());
    }

    //Execute after the @Test annotation
    @AfterMethod
    public void afterMethod(Method m) {
        System.out.println("==================== END OF TEST: " + m.getName().toUpperCase() + " ====================\n");
    }

    //Execute After the suite
    @AfterSuite
    public void afterSuite(ITestContext context) {
        System.out.println("==================== End OF SUITE: " + context.getCurrentXmlTest().getSuite().getName() + " ====================");
    }
}
