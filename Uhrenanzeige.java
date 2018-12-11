public class Uhrenanzeige {

    private Nummernanzeige stunden;
    private Nummernanzeige minuten;
    
    public Uhrenanzeige() {
        stunden = new Nummernanzeige(24);
        minuten = new Nummernanzeige(60);
    }
    
    public void setzeZeit(int dieStunden, int dieMinuten) {
        stunden.setzeWert(dieStunden);
        minuten.setzeWert(dieMinuten);
    }
    
    public void ausgabe() {
        System.out.println(stunden.gibAnzeigeWert() + ":" + minuten.gibAnzeigeWert());
    }
    
    public void erhoehen() {
        minuten.erhoehen();
        if (minuten.gibWert() == 0) {
            stunden.erhoehen();
        }
    }
    
    public int gibUhrzeit() {
        return stunden.gibWert()*100+minuten.gibWert();
    }
    
    
}
