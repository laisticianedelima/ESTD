package estd;

import org.junit.Assert;
import org.junit.Test;

public class BigDiffTest {
	
	@Test
	public void metodoTest(){
		
		BigDiff bigDiff = new BigDiff();
		
		int num[] = {10, 3, 5, 6};
		
		int resultado = bigDiff.metodo(num);
		
		Assert.assertTrue(resultado == 7);
		
	}
	
}
