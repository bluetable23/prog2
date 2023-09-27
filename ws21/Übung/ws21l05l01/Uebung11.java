package ws21l05l01;

public class Uebung11 {
	
	public char[] filter(char[] carr, char filter)
	{
		int counter =0;
		for(int index =0;index<carr.length;index++) {
			if(carr[index]==filter)
			{
				counter++;
				}
			}
		int laengevomArray=carr.length-counter;
		char [] filterArray = new char [ laengevomArray];	

		
		for(int index=0; index<filterArray.length;index++)
		{
			if(carr[index]!=filter)
			{
				filterArray[index]=carr[index];
			}
		}
		return filterArray;
	}
	
	public int[] minAndMax(int[] iarr)
	{
		
		int max=iarr[0];
		int min=iarr[0];
		for(int index = 0;index< iarr.length;index++)
		{
			
			if(iarr[index]>max)
			{ 
			max=iarr[index];
			}
			
		}
		
		for(int index = 0;index< iarr.length;index++)
		{
			
			if(iarr[index]<min)
			{ 
		min=iarr[index] ;
			}
			
		}
		
	int []  minmax = {min,max};
	return minmax;
	}
	
	  public void print(int[] ca)
	    {
	        String s = "[ ";
	        if(ca.length == 0)
	        {
	            s = s + "]";
	        }
	        else
	        {
	            for (int index = 0; index < ca.length - 1; index++) 
	            {
	                s = s + ca[index] + ", ";
	            }   
	            s = s + ca[ca.length - 1] + " ]";
	        }
	        System.out.println(s);
	    }
 


	}


