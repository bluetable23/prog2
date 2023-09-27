package pizza;

public class Pizzaverkauf {
private Pizza pizza;
private int anzVerkauefe;

public Pizzaverkauf(Pizza pizza) {
	this.pizza=pizza;
	this.anzVerkauefe=0;
}

public int verkaufen() {
	return this.anzVerkauefe=+1;
}

public Pizza getpizza()
{return this.pizza;}

public int getanzVerkauefe()
{return this.anzVerkauefe;}

public double umsatz() {
	return this.anzVerkauefe*this.pizza.getPreis();
}

@Override
public String toString()
{
    return String.format("Pizza %s wurde %d mal zum Preis von %.2f Euro verkauft.", 
            this.pizza.getName(), this.anzVerkauefe, this.pizza.getPreis());
}

public void print()
{
    System.out.println(this.toString());
}
}
