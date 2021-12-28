import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit {
    //1
    @BeforeClass
    public void Before(){
        System.out.println("@BeforeClass");
    }

    @Test
    public void Test(){
        System.out.println("@Test");
    }

    @After
    public void After(){
        System.out.println("After");
    }

    //2
    @Test
    public void TestEquals(){
        int x=10;
        int y=10;
        Assert.assertNotEquals(x,y);
    }

    //3
    @Test()
    public void TestA(){
        System.out.println("A");
    }
    @Test
    public void TestB(){
        System.out.println("B");
    }
    @Test
    public void TestC(){
        System.out.println("C");
    }

}
