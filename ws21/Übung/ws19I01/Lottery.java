package ws19I01;
import java.util.Random;

public class Lottery {
private int [] drawingResults;

public Lottery () {
	this.drawingResults = new int [5];
}

public int []  getX()
{
    return this.drawingResults;
}


public boolean contains(int number) {
	boolean b = false;
	
	for( int i=0; i<this.drawingResults.length; i++) {
		if(this.drawingResults[i]==number) {
			b=true;
		}
	}
	return b;}

public int [] drawing (int [] drawingResults) {
	Random r = new Random();
    for(int i=0; i<this.drawingResults.length; i++){
    	int bound = (9 - 1) + 1; 
        int ra = r.nextInt(bound) + 1;
    
	        int  c=(int)ra;
	        if (contains(c)==false&& c !=0 ){
	        this.drawingResults[i]=c;    
    }
	        else {i--;}   
    }
    return this.drawingResults;
}

public int [] sort (int [] drawingResults) {


for(int bubble=1; bubble<=this.drawingResults.length-1; bubble++)
{
    for(int index=0; index<this.drawingResults.length-bubble; index++)
    {
        if(this.drawingResults[index] > this.drawingResults[index+1])
        {
            int  tmp = this.drawingResults[index+1];
            this.drawingResults[index+1] = this.drawingResults[index];
            this.drawingResults[index] = tmp;
        }
    }
}
return drawingResults;
	}
	

@Override
public String toString () {
	
String s = "(";
int index=0;
for(int number =1;number<10;number++) {
	if ( index <5 &&this.drawingResults[index] == number ) {
		s=s+number +" ";
		index++;
	}
	else {
		s=s+ "- ";
}}
	s = s+  ")";
	
	 System.out.print(s);
	return s;
	

}





























}
