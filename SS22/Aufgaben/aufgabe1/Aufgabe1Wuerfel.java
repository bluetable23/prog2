package aufgabe1;
import javax.swing.JOptionPane;


public class Aufgabe1Wuerfel {
	
	public static void main(String[] args) {
	   int punktestand=0;
	   int zahl;
	   boolean nochkeingewinner=true;
	   
		int willkommen = JOptionPane.showConfirmDialog(
		        null, "Herzlich Wilkommen zum W�rfelspiel", "Annas W�rfelspa�", JOptionPane.OK_CANCEL_OPTION );
		
		String eingabe = JOptionPane.showInputDialog("Wieviele Spieler m�chten teilnehmen? ");
		int spieleranzahl = Integer.parseInt(eingabe);
		int [] spieler = new int [spieleranzahl];
		
		
           while(nochkeingewinner==true) {
	    	for(int i=0;i<spieler.length;i++) {
	    		
			int auswahl = JOptionPane.YES_OPTION ;
			punktestand=0;
			zahl=0;
			
	    	int a=97+i ;    
	        String spielername = Character.toString((char)a).toUpperCase();  
	        JOptionPane.showMessageDialog(null, "Spieler " +spielername+" ist dran");  
	       

	        
	        while(zahl!=6 && auswahl == JOptionPane.YES_OPTION ) {
	        zahl = (int)(Math.random() * 6 + 1);
	    	
	        
	        if(zahl==6) {
	         punktestand=0;
	          JOptionPane.showMessageDialog(null, "Spieler " +spielername+" hat eine 6 gew�rfelt, es werden 0 Punkte gutgeschrieben");}
	        
	    	
            
	        else {
	         punktestand+=zahl;
	         
	         if(spieler[i]+punktestand >=20) {
	        	 JOptionPane.showMessageDialog(null, "Spieler " +spielername+"hat gewonnen, Gl�ckwunsch"); System.out.println(spieler[i]+punktestand);} 
	       
	         if(spieler[i]+punktestand <20) {
	        	 System.out.printf("%s hat eine %d gw�rfelt %n",this.name,wurf); weiter W�rfeln?", "Weiter W�rfeln?", JOptionPane.YES_NO_OPTION);}}}
		     spieler[i]+=punktestand;
					
				
	        
	        
	        
	        JOptionPane.showMessageDialog(null, "Ihr Gesamtpunktestand betr�gt: " +spieler[i]+" Punkte");
        
	        
	    
          
	    	}
	    
	    		
           }
	    		
	    	}
	
	}


		
	
		
		
	
			
			
		
		
	



