package ws21l05l01;

public class MyArrays2 {
	
	public int [] copy(int[] original)
	{
		int [] copy =new int [original.length];
		
		for(int index=0;index<copy.length;index++)
		{
			copy[index]=original[index];
		}
		return copy;
	}
	
	public int [] bubblesort (int [] a)
	{
		for(int bubble = 0;bubble< a.length-1;bubble++)
		{
			for(int index=0;index<a.length-1-bubble;index++)
			{
				if(a[index]>a[index+1])
				{
					int tmp = a[index+1];
					a[index+1]=a[index];
					a[index] = tmp;
					
				}
			}
		}
		return a ;
	}

}
