package aufgabe1;
import javax.swing.JOptionPane;
public class WürfelTutorium {

	private Spieler [] spieler ;
	public static int  siegpunkte;
	
	public WürfelTutorium(int siegpunkte, int anzahl) {
		WürfelTutorium.siegpunkte= siegpunkte;
		this.spieler= new Spieler [anzahl] ;
		namenermitteln();
	}
	
	private void namenermitteln() {
		String name="";
		for(int i=0;i<spieler.length;i++) {
			name=JOptionPane.showInputDialog("name des Spielers: ");
			spieler[i]= new Spieler (name);
			
		}
	}
	 public void spielen () {
		int index=0;
		boolean gewonnen=false;
		
		while(!gewonnen) {
			gewonnen=spieler[index].würfel();
			
			if(index<spieler.length-1) {
				index++;
			}
			else {
				index=0;
			}
		}
	 }
	
	 public static void main (String [] args) {
	WürfelTutorium l =  new WürfelTutorium (20,2);
	l.spielen();
	 }
	
}
