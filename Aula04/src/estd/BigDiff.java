package estd;

public class BigDiff {
	
	public int metodo(int[] nums) {
		  
		 int max = 0;
		 int min = 0;
		 
		 for (int i = 0; i < nums.length; i++) {
			

			 if (i == 0){
				min = nums[i];
				max = nums[i];
			 }
			 
			 if (nums[i] < min){
				 min = nums[i];
			 }
			 
			 if (nums[i] > max){
				 max = nums[i];
			 }
			 
		}
		 
		return max - min;
	}


}
