public class Autore {
    
    final private String id;
    final private String nome;
    private int nLibri;
    private String libri [] = new String [100];
    final public static String genere = "Romanzo";
    
    public Autore(String id, String nome){
        this.id = id;
        this.nome = nome;
        this.nLibri = 0;
    }
    
    public void addLibro(Libro libro){
        libri[nLibri] = libro.getTitolo();
        nLibri++;
    }
    
    @Override
    public String toString(){
        String ritorno;
        
        ritorno = "id : "+this.id+"\n";
        ritorno += "nome : "+this.nome+"\n";
        ritorno += "nLibri : "+this.nLibri+"\n";
        ritorno += "Elenco libri:\n";
        for(int i=0; i<nLibri; i++){
            ritorno += "\t"+this.libri[i]+"\n";
        }
        
        return ritorno;
    }
    
    public void acquista(Libro libro){
        System.out.println("Hai acquistato il libro "+libro.getTitolo()+" al prezzo di "+libro.getPrezzo());
    }
}
