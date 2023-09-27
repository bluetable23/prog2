package aufgabe1;
import javax.swing.JOptionPane;
import java.util.Random;

public class Spieler {
	
private int punktestand;
private String name;
private Random r;

public Spieler(String name){
	this.name=name;
	this.punktestand=0;
	r = new Random();
}


public boolean würfel() {
	System.out.printf("%n %n Spieler, %s ist an der Reihe bisher %d Punkte %n ",this.name, this.punktestand);
	int score=0;
	int wurf=0;
	boolean ende=false;
	
	while(!ende ) {
		wurf= r.nextInt(6)+1;
		System.out.printf("%s hat eine %d gw�rfelt %n",this.name,wurf);
	
	
	if(wurf==6) {
		System.out.printf("Versuch zu Ende %n akuteller Spielstand von %s : %d Punkte %n",this.name,this.punktestand);
		ende =true;
	}
	else if (this.punktestand+score+wurf>=würfelTutorium.siegpunkte){
	System.out.printf("%s %d und damit gewonnen",this.name,(this.punktestand+score+wurf));
	return true;}
	
	else  {
		score+=wurf;
		System.out.printf("bisher wurden %d Punkte erzielt --insegsamt %d Punkte%n",score,this.punktestand+score);
	    int dialogresult=   JOptionPane.showConfirmDialog(null, this.name +"weiter w�rfeln?","Weiter W�rfeln",JOptionPane.YES_NO_OPTION );
	    ende=dialogresult==JOptionPane.NO_OPTION;
	    if(ende) ///0 nein 1 ja
	    	{
	    	
	    	
	    	punktestand+=score;
	    }
	    
	    
	    
	   
	}}
	
	 return false;
	
}


}
