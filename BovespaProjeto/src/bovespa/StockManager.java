package bovespa;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

public class StockManager {
	
	public int cont =0;
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyMMdd");
	
	public Stock[] loadStocks(String filename) throws IOException{
		
		Stream<String> lines = Files.lines(Paths.get(filename));
		Stock[] stocks = new Stock[20];
		
		lines.forEach(line -> {
			if(line.startsWith("01")){
			Stock stock = new Stock();
			stock.setCode(line.substring(12,24).trim());
			stock.setDate(LocalDate.parse(line.substring(2,10), formatter));
				
			stocks[cont++] = stock;
			
			System.out.println(stock.getDate	());
			}	
		});
		
		return stocks;
	}
	
	

}
