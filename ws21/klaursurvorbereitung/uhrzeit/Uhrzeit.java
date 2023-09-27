package uhrzeit;

public class Uhrzeit {
	private int stunden;
	private int minuten;
	private int sekunden;
	public Uhrzeit (int sekunden) {
		final int STUNDE = 3600;
        final int MINUTE = 60;

        this.stunden = (sekunden/STUNDE)%24;
        int rest = sekunden%STUNDE; 
        this.minuten = rest/MINUTE;
        rest = rest%MINUTE;
        this.sekunden = rest;
	}

}
