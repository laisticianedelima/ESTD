package estd;

public class Even {

	
	public int countEvens(int[] nums) {
		
		int cont = 0;
				
		for (int num : nums) {
			
			if(num % 2 == 0){
			//� par
				cont ++;
			}
			
		
		}
		  
		  
		  return cont;
		  
	}

	
}
