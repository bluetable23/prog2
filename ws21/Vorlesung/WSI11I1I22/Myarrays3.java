package WSI11I1I22;
import java.util.Random;

public class Myarrays3 {
	public int [] createandFill(int length)
	{
	int a [] = new int [length];
	Random r = new Random ();
	
	for (int index=0;index<a.length;index++) {
		a[index] = r.nextInt(length);
	}
 return a;
}
public void bubblesort (int[] a) {
	boolean swapped =true;
	for(int bubble=0;bubble<a.length-1 &&swapped;bubble++) {
		swapped =false;
		for(int index=0;index<a.length-1-bubble;index++) {
			if(a[index]>a[index+1])
			{
				int tmp = a[index+1];
				a[index+1]=a[index];
				a[index]=tmp;
				swapped=true;
			}
		}
	}


}

public boolean contaisnUnsorted(int[] a, int element) {
	boolean found=false;
	for(int index=0;index<a.length&& !found;index++) {
		if(a[index]==element)
		{
			found =true;
		}
	}

return found ;
}


public int getIndexUnsorted(int [] a,int element)
{
	final int NOT_FOUND=-1;
	for(int index=0;index<a.length;index++) {
		if(a[index]==element) {
			return index;
		}
	}

	return NOT_FOUND;
}


}
