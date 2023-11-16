package modell;


public class Haromszog {
    private int c,d,e;


    public Haromszog(int a, int b, int c) {
        this.c = c;
        this.d = d;
        this.e = e;

    }
    
    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
    
    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public int kerulet() {
        return (c+d+e);
    }

    public String getRajz() {
        String s = "";
        s += "   ^   ";
        s += "  / \\  ";
        s += " /   \\  ";
        s += "/     \\ " ;
        s += "---------";
        return s;       
    }}
    

