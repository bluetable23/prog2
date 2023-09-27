package ws19I01;

import aufgabe11.aufgabe11;

public class Programmclass {

	public static void main(String[] args) {
		Lottery a11 = new Lottery();
		int a [] = a11.getX();
	    	a= a11.drawing(a);
            a11.sort(a);
	    	a11.printArray(a);
	}

}
