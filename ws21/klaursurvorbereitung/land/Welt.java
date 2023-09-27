package land;

public class Welt {
private Kontinent [] kontinente;

public Welt (Kontinent[] kontinente) {
	this.kontinente=kontinente;
}
 
public Land[] getAlleLaender() {
	Land[]xx = new Land [kontinente.length]; 
	for(int i=0;i<kontinente.length;i++) {
		xx[i]=kontinente[i].getLandAtIndex(i);
	}
	return xx;
}

public void printAlleLaender(Land[] alleLaender) {
	for(int i=0;i<alleLaender.length;i++) {
		alleLaender[i].print();
		
	}
}
public boolean enthaeltDoppel() {
	
        int indexLinks = 0;
        for(int index=0; index < this.kontinente.length-1; index++)
        {
            if(this.kontinente[index].equals(this.kontinente[indexLinks]))
            {
                return true;
            }
            indexLinks++;
        }
      
  return false;  }

public Land groesstesLand()
{Land [] array =getAlleLaender();
    int indexLinks = 0;
    for(int index=0; index < array.length-1; index++)
    {
        if(array[index].istGroesse(array[indexLinks])==false);
        {
            indexLinks = index;
        }
    }
    return array[indexLinks];
}

public Land [] alleLaenderGroesserAls(int groesse) {
	Land [] array = getAlleLaender();
int n= 0;
int i2=0;
    for(int index=0; index < array.length-1; index++)
    {
        if(array[index].getGroesse() > groesse) {
        	n++;
        }}
        Land [] gr=new Land [n];
    for(int index=0; index < array.length-1; index++)
    {
        if(array[index].getGroesse() > groesse) {
        	gr[i2]=array[index];
        	i2++;
        }}
        
return gr;
}


}

