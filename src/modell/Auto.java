
package modell;


public class Auto extends Jarmu{
    private boolean defekt;

    public Auto(boolean defekt) {
        super(false, true, false);
        this.defekt = defekt;
    }
    
    public void kereketCserel(){
        defekt=false;
    }
    @Override
    public boolean halad(){
        while (isBeinditva() && isUzemanyag() && !(isMegerkezett()) && !defekt) {
            boolean megerkezett = Math.random() > 0.5;
            setMegerkezett(megerkezett);
            defekt=Math.random()<0.25;
        }
        leallit();
        return false;
    }
}
