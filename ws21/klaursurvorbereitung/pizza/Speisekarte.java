package pizza;

public class Speisekarte {
	
private Pizza [] angebot;

public Speisekarte() {
	Pizza [] angebot = new Pizza [0];
}
public void pizzaHinzufuegen(Pizza pizza) {
	Pizza[] copy = new Pizza[this.angebot.length+1];
	int indexCopy = 0; 
	int indexS = 0;
	
	while (indexS< this.angebot.length-1) 
	{copy[indexCopy++]=this.angebot[indexS++];}
	copy[copy.length-1]= pizza;}



public boolean pizzaIstImAngebot(Pizza pizza) {
	
	for(int i =0; i<this.angebot.length;i++) {
		
		if(this.angebot[i].equals(pizza)==true) 
			{return true;}}
		
    return false;
	
}

public boolean pizzaLoeschen(Pizza pizza)
{
	
	Pizza[] copy = new Pizza[this.angebot.length-1];
	int indexCopy = 0; 
	int indexS = 0;
	
	while (indexS< this.angebot.length&& this.angebot[indexS] != pizza)
	{copy[indexCopy++]=this.angebot[indexS++];}	
	indexS++;
	while (indexS< this.angebot.length)
	{
		copy[indexCopy++] = this.angebot[indexS++];
	}
	this.angebot=copy;
	return true;
}

public Pizza getPizzaAtIndex(int index)
{
    if(index>=0 && index<this.angebot.length)
    {
        return this.angebot[index];
    }
    else
    {
        return null;
    }
}

@Override
public String toString()
{
    String s = String.format("====== Speisekarte ======%n");
    for (int index = 0; index < this.angebot.length; index++)
    {
        s = s + String.format("%-15s %.2f Euro %n", 
                this.angebot[index].getName(), this.angebot[index].getPreis());
    }
    return s;
}

public void print()
{
    System.out.println(this.toString());
}

}
