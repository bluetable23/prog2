package land;

public class Kontinent {

	private Land [] laender;
	private char kontinent ;
	
	public Kontinent(char kontinent, int anzahlLaender) {
		this.kontinent=kontinent;
		this.laender= new Land [anzahlLaender];
		
		for(int i=0;i<laender.length;i++) {
			laender[i]=new Land ();
		}
	}
	public int getAnzLaender()
	{return laender.length;}
	
	public Land [] getLaender()
	{return laender;}
	
	public Land getLandAtIndex(int index) {
		if(laender[index]==null) {
			return null;}
		else {
			return laender[index];
		}}
		
public int [] getSummen() {
	int [] l = new int[2];
	int gesaL=0;
	int gesaE=0;
	for  (int i =0;i<laender.length;i++) {
		gesaL=laender[i].getGroesse()+gesaL;}
	
	l[0]=gesaL;
	for  (int i =0;i<laender.length;i++) {
		gesaE=laender[i].getEinwohner()+gesaE;}
	l[1]=gesaE;
	return l;}
@Override
public String toString()
{
    String s = String.format("Kontinent %c %n -----------------------------%n", kontinent);
    for(int i=0; i<this.laender.length; i++)
    {
            s +=String.format ("%s  %n",this.laender[i].toString());}
      
    s += String.format(" %n Summen : %s : %s ",getSummen()[0],getSummen()[1]);
    return s;
}
public void print()
{System.out.println(this.toString());}

public Land [] sortiere(int nach) {

for(int bubble=1; bubble<=laender.length-1; bubble++)
{
    for(int index=0; index<laender.length-bubble; index++)
    {
        if(nach==0 && laender[index].getGroesse() > laender[index+1].getGroesse())
        {
            Land tmp = laender[index+1];
            laender[index+1] = laender[index];
            laender[index] = tmp;
        }
        if(nach==1 && laender[index].getEinwohner() > laender[index+1].getEinwohner())
        {
            Land tmp = laender[index+1];
            laender[index+1] = laender[index];
            laender[index] = tmp;
        }
        if(nach==2 && laender[index].ewDichte() > laender[index+1].ewDichte())
        {
            Land tmp = laender[index+1];
            laender[index+1] = laender[index];
            laender[index] = tmp;
        }
        if(nach>2 && laender[index].nameIstGroesser(laender[index+1]))
        {
            Land tmp = laender[index+1];
            laender[index+1] = laender[index];
            laender[index] = tmp;
        }
    }
}
return laender;
}

}
