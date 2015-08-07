
import org.junit.* ;

import static org.junit.Assert.* ;

public class CalcTest {

   @Test
   public void checkAddition(){
	   System.out.println("Test addition for correctness");
	  Calc item=new Calc();	   
	   assertTrue(item.addition(10, 6)==16.0);
   }
   @Test
   public void checkSubtraction(){
	   System.out.println("Test subtraction for correctness");
	  Calc item=new Calc();	   
	   assertTrue(item.subtraction(10, 6)==4.0);
   }
   @Test
   public void checkMultiplication(){
	   System.out.println("Test multiplication for correctness");
	   Calc item=new Calc();	   
	   assertTrue(item.multiplication(10, 6)==60.0);
   }
   @Test
   public void checkDivision(){
	   System.out.println("Test division for correctness");
	  Calc item= new Calc();	   
	   assertTrue(item.division(10, 5)==2.0);
   }
   @Test
   public void checkModulus(){
	   System.out.println("Test division for correctness");
	  Calc item= new Calc();	   
	   assertTrue(item.modulus(10, 5)==0.0);
   }
}