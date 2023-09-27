package wohnung;

public class Wohnung {
	private int qm;
	private int anzZimmer;
	private int etage;
	private double qmMiete;
	
	public Wohnung (int qm, int anzZimmer, int etage, double qmMiete)
    {
        this.qm = qm;
        this.anzZimmer = anzZimmer;
        this.etage = etage;
        this.qmMiete = qmMiete;
    }
	
	 public int getqm()
{return qm;}
	 public int getanzZimmer()
{return anzZimmer;}
	 public int getetage()
{return etage;}
	 public double getqmMiete()
{return qmMiete;}

	 public double gesamtMiete(int qm, double qmMiete) {
		 return qm*qmMiete;}
	 public boolean billiger (Wohnung w) 
		    {return (this.qmMiete < w.qmMiete);}

	 public boolean teurer (Wohnung w) 
	    {return (this.qmMiete > w.qmMiete);}
	 
	 @Override   
	 public String toString() {
     if(etage==0) {
    	 return this.anzZimmer+"-Zimmer Wohnung mit "+this.qm+" qm im Erdgeschoss. Monatliche Miete: "+this.gesamtMiete(qm,qmMiete)+"0 Euro";}
	 return this.anzZimmer+"-Zimmer Wohnung mit "+this.qm+" qm in der "+this.etage+". Etage. Monatliche Miete: "+this.gesamtMiete(qm,qmMiete)+"0 Euro";}

	 public void print()
	  {System.out.println(this.toString());}

}
     
