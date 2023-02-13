
package modell;

public abstract class Jarmu {
    private boolean beinditva;
    private boolean uzemanyag;
    private boolean megerkezett;

    public Jarmu(boolean beinditva, boolean uzemanyag, boolean megerkezett) {
        this.beinditva = beinditva;
        this.uzemanyag = uzemanyag;
        this.megerkezett = megerkezett;
    }
    
    public void beindit(){
        beinditva=true;
    }
    public void leallit(){
        beinditva=false;
    }
    public boolean tankol(){
        if (!beinditva) {
            uzemanyag=true;
            return true;
        }
        return false;
    }
    public boolean halad(){
        while (beinditva && uzemanyag && !(megerkezett)) {
            megerkezett = Math.random() > 0.5;
        }
        leallit();
        return false;
    }

    public boolean isBeinditva() {
        return beinditva;
    }

    public void setBeinditva(boolean beinditva) {
        this.beinditva = beinditva;
    }

    public boolean isUzemanyag() {
        return uzemanyag;
    }

    public void setUzemanyag(boolean uzemanyag) {
        this.uzemanyag = uzemanyag;
    }

    public boolean isMegerkezett() {
        return megerkezett;
    }

    public void setMegerkezett(boolean megerkezett) {
        this.megerkezett = megerkezett;
    }
    
    
}
