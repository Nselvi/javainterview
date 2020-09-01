package interview;

public class MaxNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//first find min number and then find max number at that column.
		int abc[][]= {{2,5,4},{1,0,7},{1,2,9}};
		int min=abc[0][0];
		int mincolumn=0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]<min)
				{
					min=abc[i][j];
					mincolumn=j;	
					
				}
			}
		
	}
		int max=abc[0][mincolumn];
		int k=0;
		while(k<3)
		{
			if(abc[k][mincolumn]>max)
			{
				max=abc[k][mincolumn];
			}
			k++;
		}
		
		
		
		
System.out.println(max);

}
}
/*
		int abc[][]= {{2,5,4},{1,0,7},{1,2,9}};
		int max=abc[0][0];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]>max)
				{
					max=abc[i][j];
				}
			}
		
	}
System.out.println(max);
}
}
*/