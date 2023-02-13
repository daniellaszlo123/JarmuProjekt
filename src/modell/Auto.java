
package modell;


public class Auto extends Jarmu{
    private boolean defekt;

    public Auto() {
        super();
        this.defekt = false;
    }
    
    public void kereketCserel(){
        defekt=false;
    }
    @Override
    public boolean halad(){
        defekt=Math.random()<0.25;
        if (isBeinditva() && isUzemanyag() && !(isMegerkezett()) && !defekt) {
            return true;
        }
        leallit();
        return false;
    }

    public boolean isDefekt() {
        return defekt;
    }
    
    
}
