public class Libro {
    
    final private String genere;
    final private String titolo;
    final private int pagine;
    final private float prezzo;
    
    public Libro(String genere, String titolo, int pagine, float prezzo){
        this.genere = genere;
        this.titolo = titolo;
        this.pagine = pagine;
        this.prezzo = prezzo;
    }
    
    public String getTitolo(){
        return this.titolo;
    }
    
    public float getPrezzo(){
        return this.prezzo;
    }
    
    
    
}
