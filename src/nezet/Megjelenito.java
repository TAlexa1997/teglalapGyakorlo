package nezet;

import java.util.Scanner;
import modell.Haromszog;
import modell.Teglalap;

public class Megjelenito {
    
    private static final Scanner sc = new Scanner(System.in);
    
    private Teglalap tegla;
    private Haromszog teto;
    
    public void indito(){
        int a = bekero("\'a\' oldal: ");
        int b = bekero("\'b\' oldal: ");
        tegla = new Teglalap(a, b);
        feladat();
        int c = bekero("\'a\' oldal: ");
        int d = bekero("\'b\' oldal: ");
        int e = bekero("\'c\' oldal: ");
        teto = new Haromszog(c,d,e);
        feladat();
    }

    private int bekero(String kerdes) {
        System.out.print(kerdes);
        return sc.nextInt();
    }

    private void feladat() {
        int t = tegla.terulet();
        int k = tegla.kerulet();
        String ki = String.format("terület: %d, kerület: %d", t,k);
        System.out.println(ki);
        int l = teto.kerulet();
        String ki2 = String.format(" kerület: %d",l);
        System.out.println(ki2);
    }
    
    
    

}
