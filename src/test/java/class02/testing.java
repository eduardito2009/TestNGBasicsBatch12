package class02;

import org.testng.annotations.*;

public class testing {
    @BeforeSuite
    public void beforesuite(){
        System.out.println("Im before suite");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("Im after suite");
    }
    @BeforeTest
    public void beforetest(){
        System.out.println("I am before test");
    }
    @AfterTest
    public void aftertest(){
        System.out.println("Im after test");
    }
    @BeforeClass
    public void beforeclass(){
        System.out.println("I am before class method");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("I am after class method");

    }

    @BeforeMethod
    public void before(){
        System.out.println("this is my before method");
    }
    @AfterMethod
    public void after(){
        System.out.println("this si my after method");
    }


    @Test
    public void Test(){
        System.out.println("drive me crazy, drive me mad");
    }
    @Test
    public void Test1() {
        System.out.println("drive me to sanity, drive me mad");
    }
}
