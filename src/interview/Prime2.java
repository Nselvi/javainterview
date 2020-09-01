package interview;

public class Prime2 {

	public static void main(String[] args) {
		
		/*int m=0,flag=0; 
		
		  int n=23;//it is the number to be checked    
		  
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");   
		   
		  }else{  
			  
		   for(int i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }//end of else  
		  
		  */
		
		
		int num=13;
		int count=0;
		
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0) 
					count++;
			}
			if(count==2)
			{
				System.out.println("Prime Number");
			}else {
				System.out.println("Not a Prime NUmber");
			}
		}
				
				else {
					System.out.println("Not a Prime Number");
				}
				
			}
		
	
		}    
		

	

