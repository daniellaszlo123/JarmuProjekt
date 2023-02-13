
package modell;

public abstract class Jarmu {
    private boolean beinditva;
    private boolean uzemanyag;
    private boolean megerkezett;
    
    public void bindit(){}
    public void leallit(){}
    public boolean tankol(){return false;}
    public boolean halad(){return false;}
}
