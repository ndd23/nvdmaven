package nivd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class clas_demo2ng1 {
	@Test
          public void testa() {
        	System.out.println("a");
        	Assert.assertTrue(false);
        }
      
	@Test(enabled =false)
    public void testb() {
  	System.out.println("b");
  }
	@Test(invocationCount=2)
    public void testc() {
  	System.out.println("c");
  }
	@Test(dependsOnMethods="testa")
   public void testd() {
  	System.out.println("d");
 }
}    