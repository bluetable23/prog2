package Computer;
import java.util.Random;
public class NotebookArray {
	private Notebook [] notebooks;
	
	public NotebookArray (int anzahl) {
		this.notebooks = new Notebook[anzahl];
	}

	public void konfigurieren() {
		for(int index=0; index<this.notebooks.length; index++)
		{Random r = new Random();
			int bound = (4 - 1) + 1;  // +1 wegen toInclusive soll auch
			int randomNumber = r.nextInt(bound) + 1;
	       
			if(randomNumber==0) {
			notebooks[index] = new Notebook("lenovo", 8, 256,13);}
			if(randomNumber==1) {
				notebooks[index] = new Notebook("lenovo", 16, 512,15);}
			if(randomNumber==2) {
				notebooks[index] = new Notebook("apple", 4, 256,13);}
			if(randomNumber==3) {
				notebooks[index] = new Notebook("apple", 8, 512,13);}
			if(randomNumber==4 ){
				notebooks[index] = new Notebook("dell", 8, 512,15);}
		}
		
}
	  
	@Override
    public String toString()
    {
        String s = "["+notebooks.length+" :";
        for(int i=0; i<this.notebooks.length; i++)
        {
            if(i<this.notebooks.length-1)
            {
                s += this.notebooks[i].toString()+", ";
            }
            else
            {
                s += this.notebooks[i].toString();
            }
        }
        s += " ]";
        return s;
    }

	public void print()
	{System.out.println(this.toString());}
	
	
	public NotebookArray getHersteller(String hersteller) {
		
		int n=0;
		for(int index=0; index<notebooks.length; index++)
		{if(notebooks[index].gleicherHersteller(hersteller)==true) {
			n++;}}
	     NotebookArray f = new NotebookArray(n);
	     
	     
	     for(int index=0; index<notebooks.length; index++)
			{if(notebooks[index].gleicherHersteller(hersteller)==true) {
			
	     f.notebooks[index]=this.notebooks[index];}}
			return f;
	   }
	
	public Notebook [] sortRamPlatte() {
		for(int bubble=1; bubble<=notebooks.length-1; bubble++)
		{
		    for(int index=0; index<notebooks.length-bubble; index++)
		    {
		        if(notebooks[index].ram > notebooks[index+1].ram)
		        {
		           Notebook tmp = notebooks[index+1];
		            notebooks[index+1] = notebooks[index];
		            notebooks[index] = tmp;
		        }
		        if(notebooks[index].ram == notebooks[index+1].ram)
		        	if(notebooks[index].platte>notebooks[index+1].platte)
		        {
		           Notebook tmp = notebooks[index+1];
		            notebooks[index+1] = notebooks[index];
		            notebooks[index] = tmp;
		        }
		    }
		}
		return notebooks;
	}
	
	
	
}





