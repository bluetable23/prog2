package wohnung;
import java.util.Random;

public class Haus {

	private Wohnung [] wohnungen ;
	
public Haus(int anzWohnungen) {
	this.wohnungen = new Wohnung [anzWohnungen];
for(int index=0; index<wohnungen.length; index++)
{
    wohnungen[index] = this.neueWohnung();
}}


	public Wohnung neueWohnung () {
	        Random r = new Random();
		    int bound = (5- 1) + 1;  
		    int randomNumber = (r.nextInt(bound) + 1);
		    
		    int etage = randomNumber;
		    int anzZimmer= randomNumber;
		    int qm = randomNumber*20;
		    double qmMiete = r.nextInt(10) * 0.5 + 8.0;
		    return new Wohnung(qm, anzZimmer, etage, qmMiete);}
	
	  public void print()
	    {
	        System.out.println("Das Haus besteht aus :");
	        for (int index = 0; index < this.wohnungen.length; index++)
	        {
	            this.wohnungen[index].print();  
	        }
	    }
}