package aufgabe1;
import javax.swing.JOptionPane;
public class W�rfelTutorium {

	private Spieler [] spieler ;
	public static int  siegpunkte;
	
	public W�rfelTutorium(int siegpunkte, int anzahl) {
		W�rfelTutorium.siegpunkte= siegpunkte;
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
			gewonnen=spieler[index].w�rfel();
			
			if(index<spieler.length-1) {
				index++;
			}
			else {
				index=0;
			}
		}
	 }
	
	 public static void main (String [] args) {
	W�rfelTutorium l =  new W�rfelTutorium (20,2);
	l.spielen();
	 }
	
}
