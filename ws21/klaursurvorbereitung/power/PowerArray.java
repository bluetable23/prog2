package power;
import java.util.Random;
public class PowerArray {
private Power [] p; 

public PowerArray(int length) {
	this.p = new Power[length];
}

public void fillArray() {
Random r = new Random();



for(int index=0; index<this.p.length; index++)
{ int bound = (5-1) + 1;  
int randomNumber = r.nextInt(bound)+1;
 int exp=randomNumber;
  int base =randomNumber;
  

  if(base<=exp) {
	this.p[index] = new Power(base,exp);}
  
  else {this.p[index] = new Power(exp,base);}
}




}


public double [] createArrayOfValues() {
	double [] array= new double [this.p.length];
	for(int index=0; index<p.length; index++)
	{array[index] = this.p[index].getValue();}
return array;
}

public int getIndexExponent(int exponent) {
	for(int index=0; index<p.length; index++){
	if(p[index].getexp()==exponent) {
		return index;}
	}
	
	return -1;}
	
	@Override
    public String toString()
    {
        String s = "[ ";
        for(int i=0; i<this.p.length; i++)
        {
            if(i<this.p.length-1)
            {
                s += this.p[i].toString()+", ";
            }
            else
            {
                s += this.p[i].toString();
            }
        }
        s += " ]";
        return s;
    }

    public void print()
    {
        System.out.println(this.toString());
    }
public Power [] sort(){
	for(int bubble=1; bubble<=p.length-1; bubble++)
	{
	    for(int index=0; index<p.length-bubble; index++)
	    {
	        if(this.p[index].getValue() > p[index+1].getValue())
	        {
	            Power tmp = p[index+1];
	           p[index+1] = p[index];
	            p[index] = tmp;
	        }
	        if(this.p[index].getValue() == p[index+1].getValue()) {
	            if(this.p[index].getexp() > p[index+1].getexp()) {
	            	Power tmp = p[index+1];
	 	           p[index+1] = p[index];
	 	            p[index] = tmp;
	            }
	        }
	    }
	}
	return p;
}




}