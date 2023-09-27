package land;

public class Testklasse {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			Land l = new Land();
			l.print();}
		
		System.out.println("____________________________________");
		
		Land b = new Land();
		Land c= new Land();
		b.print();
		int n=0;
		while(b.equals(c)!=true){
			n++;
			c=new Land();}
		
		c.print();
			System.out.println(n+" andere Laender erzeugt");
		
	Land l1=new Land();
Land 	l2=new Land();
l1.print();
l2.print();
System.out.println();
System.out.println ("l1 groeßer als l2"+ l1.istGroesse(l2));
System.out.println("l1 mehr Einwohner als l2"+ l1.hatMehrEinwohner(l2));
System.out.println("l1 lexikografisch groesser als l2"+l1.nameIstGroesser(l2));

System.out.println("_________________________________________");
Kontinent []  mm = new Kontinent [5];

for(int i=0; i<mm.length;i++) {
	int  aa =97;
	int y = 7;
	y=y+i;
	char c1 = (char)(i+aa);
	mm[i]= new Kontinent ( c1,y);
	mm[i].print();
	
System.out.println("===========================================");
mm[0].sortiere(0); mm[0].print();
mm[0].sortiere(1); mm[0].print();
mm[0].sortiere(2); mm[0].print();
mm[0].sortiere(3); mm[0].print();
}

System.out.println("======================================");


	}

}
