
package modell;


public class Auto extends Jarmu{
    private boolean defekt;

    public Auto(boolean defekt) {
        super(false, true, false);
        this.defekt = defekt;
    }
    
    public void kereketCserel(){}
    @Override
    public boolean halad(){return false;}
}
