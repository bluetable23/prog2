package Computer;

public class Testklasse {

	public static void main(String[] args) {
		Computer c1=new Computer("lenovo", 8, 256);
		Computer c2=new Computer("lenovo", 16, 512);
		Computer c3=new Computer("apple", 4, 256);
		Computer c4=new Computer("apple", 8, 512);
		Computer c5=new Computer("dell", 8, 256);

        System.out.printf("%n%n---------------------- Test Computer---------------------------%n%n");
        c1.print();
        c2.print();
        c3.print();
        c4.print();
        c5.print();
        
        System.out.println("c1 und c2 gleicher hersteller? : "+ c1.gleicherHersteller(c1));
        System.out.println("c1 und c3 gleicher hersteller? : "+ c1.gleicherHersteller(c3));
        
        Notebook n1=new Notebook("lenovo",8,256,13);
        Notebook n2 = new Notebook("lenovo",16,512,15);
        n1.print();
        n2.print();
        
        NotebookArray j1=new NotebookArray(10);
        j1.konfigurieren();
        j1.print();
        j1.sortRamPlatte();
        j1.print();
        j1.getHersteller("apple").print();
  
	}

}
