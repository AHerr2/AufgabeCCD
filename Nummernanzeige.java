
public class Nummernanzeige
{
    private int limit;
    private int wert;
    private int reset = 0;

    public Nummernanzeige(int anzeigeLimit) {
        if (anzeigeLimit < 2) {
            limit = 2;
        } else {
            limit = anzeigeLimit;
        }
        wert = reset;
    }

    public int gibWert() {
        return wert;
    }

    public String gibAnzeigeWert() {
        String resultat = "";
        if (wert < 10) {
            resultat = "0";
        }
        resultat += wert;
        return resultat;
    }

    public void setzeWert(int neuerWert) {
        if (neuerWert >= reset && neuerWert < limit) {
            wert = neuerWert;
        }

    }

    public void erhoehen() {
        wert += 1;
        wert = (wert == limit) ? reset : wert;
    }
    
    public void setzeReset(int r) {
	if (r >= 0 && r < limit) {
		reset = r;
		wert = r;
	}
}
}
