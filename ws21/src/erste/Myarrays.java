
package erste;

import java.util.Iterator;
import java.util.Random;

public class Myarrays {
	public int [] createAndfill (int length)
	{
		int [] a= new int [length];
		Random r = new Random ();
		for (int  index=0; index <a.length; index++)
		{
			a[index]=r.nextInt(length);
			
	
		
	}
		return a;}
	
	public void printArray(int[] a) {
		
	
	System.out.print("[");
	for (int index=0;index <a.length-1;index++)
	{
		System.out.print(a[index]+",");
	}
	if(a.length>0) {
		System.out.print(a[a.length-1]);
	}
	System.out.print("]");
}
	
public int getMaximum(int[] a)
{
	int aktMaximum =0;
	for(int index=0;index<a.length;index++) {
		if(a[index]>aktMaximum) {
			aktMaximum=a[index];
		}
	}
}



}
