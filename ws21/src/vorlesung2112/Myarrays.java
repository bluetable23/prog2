package vorlesung2112;

public class Myarrays {
	
	public String arrayToString(char[] carr)
	{
		String s="[";
		for(int index=0;index<carr.length;index++)
		{
			s=s+carr[index]+", ";
		}
		if(carr.length>0) {
			
		s=s+carr[carr.length-1]+"]";
		}
		else {
			s=s+"]";
		}
		return s;
	}
	public void printArray(char[] carr)
	{
		System.out.println(this.arrayToString(carr));
	}

}
