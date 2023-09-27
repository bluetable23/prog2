package myString;

public class Testklasse {

	public static void main(String[] args) {
		int a = 300;
		int b = a++;
		int c = --b;
		System.out.print(b);
		
		MyString s = new MyString();
		MyString c22 = new MyString('d');
	    MyString n = new MyString("hallo");
	    s.print();
	    c22.print();
	    n.print();
	    n.getCharAt(1);
	    n.print();
	    
	    System.out.print(n.contains('a'));
	 
	   System.out.print(n.contains('b')); 
System.out.println("=====================");
MyString g = new MyString("hallo");
MyString g1 = new MyString("halLo");
System.out.println(g.equals(n));
System.out.println(n.equals(g1));
	}
	
	

}
