package annaLabchirKlasur;

public class Testklasse {

	public static void main(String[] args) {
		Buch b = new Buch("Titel A",55,1999);
		Buch b1 = new Buch("Titel B",66,2000);
		Buch b2 = new Buch("Titel C",77,2001);
		b.print();
		b1.print();
		b2.print();
	
		Buch [] g = new Buch [10];
		int l=0;
		for(int i=0;i<g.length;i++) {
			g[i]=new Buch();
		 	
		  l=  2022- g[i].getJahr(); 
		 String mm =  g[i].toString()+ String.valueOf(l) +" --> Jahre alt";
	System.out.println(mm);}
	
	
	System.out.println("==========================");
	
	Bibliothek cc= new Bibliothek(10);



	System.out.println("Das duennste Buch ist"+cc.duennstesBuch());
		
	System.out.println("Das aelteste Buch ist"+cc.aeltestesBuch());
	System.out.println("Das Durchsncnittalter beträgt "+cc.durchschnittsalter());
	
	System.out.print(cc.durchschnittsalter());
	
	}
	

}
