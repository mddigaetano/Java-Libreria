public class Libreria {
    public static void main(String [] args){
        Autore reki = new Autore("00", "Reki Kawahara");
        Autore yuyuko = new Autore ("01", "Yuyuko Tamemya");
        
        Libro sao1 = new Libro("Romanzo", "Aincrad 1", 250, (float)19.50);
        Libro sao2 = new Libro("Romanzo", "Aincrad 2", 300, (float)19.50);
        Libro toradora1 = new Libro("Romanzo", "Toradora 1", 150, (float)14.90);
        
        reki.addLibro(sao1);
        reki.addLibro(sao2);
        yuyuko.addLibro(toradora1);
        
        yuyuko.acquista(toradora1);
        
        System.out.print(reki.toString());
        System.out.print(yuyuko.toString());
        
        System.out.println(Autore.genere);
    }
}
