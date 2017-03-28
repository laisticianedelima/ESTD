package bovespa;

import java.io.IOException;

import org.junit.Test;


public class StockManagerTest {

	@Test
	public void loadStocksTest() throws IOException {
		StockManager stockManager = new StockManager();
		Stock[] stocks = stockManager.loadStocks("Z:/programacao/3 ano/ESTD/COTAHIST_A2016.txt");
		
		
	}
	

}
