import org.junit.jupiter.api.Assertions;
public class Test{
   @org.junit.jupiter.api.Test
   public void TestExample(){
    Main s = new Main();
     Assertions.assertEquals(120, s.getFactorial(5));
   }

}