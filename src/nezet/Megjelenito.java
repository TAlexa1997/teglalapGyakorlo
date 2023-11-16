package nezet;

import java.util.Scanner;
import modell.Haromszog;
import modell.Teglalap;

public class Megjelenito {
    
    private static final Scanner sc = new Scanner(System.in);
    
    private Teglalap tegla;
    private Haromszog teto;
    
    public void indito(){
        System.out.println("T�glalap oldalai:");
        int a = bekero("\'a\' oldal: ");
        int b = bekero("\'b\' oldal: ");
        tegla = new Teglalap(a, b);
        feladat();
        System.out.println("H�romsz�g oldalai:");
        int c = bekero("\'a\' oldal: ");
        int d = bekero("\'b\' oldal: ");
        int e = bekero("\'c\' oldal: ");
        teto = new Haromszog(c,d,e);
        feladat1();
    }

    private int bekero(String kerdes) {
        System.out.print(kerdes);
        return sc.nextInt();
    }

    private void feladat() {
        System.out.println(tegla.getRajz());
        int t = tegla.terulet();
        int k = tegla.kerulet();
       
        String ki = String.format("T�glalap ter�let: %d �s ker�let: %d", t,k);
        System.out.println(ki);
        
    }
    
    private void feladat1() {
        int l = teto.kerulet();
        System.out.println(teto.getRajz());
        String ki2 = String.format("H�romsz�g ker�let: %d",l);
        System.out.println(ki2);
    }
    
    
    

}
