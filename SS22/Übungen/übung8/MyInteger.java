package übung8;

public class MyInteger implements Comparable<MyInteger>
{
    private int value;

    public MyInteger(int value)
    {
        this.value = value;
    }

    public int intValue()
    {
        return this.value;
    }

    public static MyInteger valueOf(int value)
    {
        return new MyInteger(value);
    }
    
    
  

	



	@Override
	public int compareTo(MyInteger o) {
		if (o.value>this.value) {
			return 1;
		}
		if (o.value<this.value) {
			return -1;
		}
		else return 0;
	
	
	

}
	

}