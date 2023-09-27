package annaLabchirKlasur;

public class Bibliothek {
	private Buch [] buecher;
	
	public Bibliothek(int anzahl) {
		this.buecher = new Buch[anzahl];
		
		for(int i=0;i<buecher.length;i++) {
			buecher[i]=new Buch();
		}
	}
	
	
	
	public Buch [] sort (boolean vonDuennZuDick) {
		if(vonDuennZuDick ==true) {

for(int bubble=1; bubble<=buecher.length-1; bubble++)
{
    for(int index=0; index<buecher.length-bubble; index++)
    {
        if(buecher[index].istDicker( buecher[index+1]))
        {
            Buch tmp = buecher[index+1];
            buecher[index+1] = buecher[index];
            buecher[index] = tmp;}}}}
        
    

else {

for(int bubble=1; bubble<=buecher.length-1; bubble++)
{
    for(int index=0; index<buecher.length-bubble; index++)
    {
        if(buecher[index].istDicker( buecher[index+1])==false)
        {
            Buch tmp = buecher[index];
            buecher[index] = buecher[index+1];
            buecher[index+1] = tmp;}}}}
    
	return buecher;
	

	}
	
	@Override
    public String toString()
    {
        String s = ("Bibliothek mit "+buecher.length +" Buechern"+"\n ");
        for(int i=0; i<this.buecher.length; i++)
        {
            
                s += (String.valueOf(buecher.length) +buecher[i].toString() +"\n ") ;}
          
            
        
            
          
     
        return s;
    }
	
	public void print() {
	System.out.println(toString());}
	

	public boolean enthaeltDoppelungen() {
	int index =0;
		for(int i=0;i<buecher.length;i++) {
			if(buecher[i].equals(buecher[0])){
				return false;
				}
			
			}
			
			index++;
			
	
		return true;}
		
	
	

	public Buch [] buecherVonBis(int vonJahr, int bisJahr) {
	int n=0;
		for(int i=0;i<buecher.length;i++) {
			if(buecher[i].getJahr()>=vonJahr &&buecher[i].getJahr()<=bisJahr ) {
				n++;
			}
		}
		 Buch [] g= new Buch [n];
			for(int i=0;i<buecher.length;i++) {
				if(buecher[i].getJahr()>=vonJahr &&buecher[i].getJahr()<=bisJahr ) {
					g[i]=buecher [i];
				} }
	
			return g;}
	
	
	public Buch duennstesBuch() {
		
	        int indexLinks = 0;
	        for(int index=0; index < this.buecher.length-1; index++)
	        {
	            if(this.buecher[index].istDicker(this.buecher[indexLinks])==false);
	            {
	                indexLinks = index;
	            }
	        }
	        return this.buecher[indexLinks];
	    }
	
	public Buch aeltestesBuch() {
		
        int indexLinks = 0;
        for(int index=0; index < this.buecher.length-1; index++)
        {
            if(this.buecher[index].getJahr() <this.buecher[indexLinks].getJahr());
            {
                indexLinks = index;
            }
        }
        return this.buecher[indexLinks];
    }
	
	public double durchschnittsalter() {
	double g=0;
		int n= 0;
		for(int i=0;i<buecher.length;i++) {
			n+=2022-buecher[i].getJahr();
		}
	return g=n/buecher.length;
	}
	
	
}
