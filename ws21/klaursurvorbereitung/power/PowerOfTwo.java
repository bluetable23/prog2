package power;

public class PowerOfTwo extends Power
{
    public PowerOfTwo(int exp)
    {
        super(2, exp);
    }
    
    public void printBinary() {
    	int b =1;
    	int a=1;
    	if(getexp()<0) {
    		System.out.println("kleiner als 0 ");
    	}
    	if(getexp()>0) {
    	for(int i =0;i<getexp();i++) {
    	 b=b*10;} a=a*b;
    		
    	System.out.println(a);
    	
    }}
    
    
    
}