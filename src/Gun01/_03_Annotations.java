package Gun01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _03_Annotations{
    @Test
    public void Test1(){
        System.out.println("Test1 Çalıştı");
    }
    @Test
    public void Test2(){
        System.out.println("Test2 Çalıştı");
    }
    @BeforeClass
    public void BeforeClassBolumu(){
        System.out.println("Before Class Bolumu");
    }
    @AfterClass
    public void AfterClassBolumu(){
        System.out.println("After Class Bolumu");
    }



}
