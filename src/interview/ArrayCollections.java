package interview;

public class ArrayCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer x[] = {4,3,2,12,54,34,88}; 
		System.out.println(getLargest(x,7)); 
	}
		
		public static int getLargest(Integer[] x, int total){   
			int temp;    
			for (int i = 0; i < total; i++) {       
				for (int j = i + 1; j < total; j++) {           
					if (x[i] > x[j]) {              
						temp = x[i];             
						x[i] = x[j];              
						x[j] = temp;  
						}
					}
				}  
			return x[total-1]; 
			} 
		 
		 
	}


