
package modell;

public class H�z {
    private Teglalap falak;
    private Haromszog teto;
    
    public H�z(Teglalap falak, Haromszog teto){
        this.falak = falak;
        this.teto = teto;
    }

    public H�z() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String getHazRajz(){
        String s = teto.getRajz();
        s += System.lineSeparator();
        s += falak.getRajz();
        return s;
    }
}
