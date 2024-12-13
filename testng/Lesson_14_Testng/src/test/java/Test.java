import org.testng.Assert;
public class Test{
   @org.testng.annotations.Test
   public void TestExample(){
    Main s = new Main();
    Assert.assertEquals(120, s.getFactorial(5));
   }

}