import org.testng.Assert;
import org.testng.annotations.*;

public class Solution<x, y> {

    //1
    @BeforeClass
    public static void RunBeforeTest(){
        System.out.println("@BeforeClass");
    }
    @AfterClass
    public void RunAfterTest(){
        System.out.println("@AfterClass");
    }
    @Test
    public void Test_Num_1(){
        System.out.println("@Test");
    }

    //2
    @Test
    public void EqualsTest(){
        int x = 10;
        int y = 10;
        Assert.assertNotEquals(x,y);
    }

    //3
    @Test(priority = 1)
    public void TestA(){
        System.out.println("A");
    }

    @Test(priority = 2)
    public void TestB(){
        System.out.println("B");
    }

    @Test(priority = 3)
    public void TestC(){
        System.out.println("C");
    }
}
