package bovespa;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StockManager {
	
	public Stock[] loadStocks(String filename) throws IOException{
		
		Stream<String> lines = Files.lines(Paths.get(filename));
		
		lines.forEach(line -> {
			
			System.out.println(line.substring(2,10));	
		});
		
		
		
		
		return null;
	}
	
	

}
