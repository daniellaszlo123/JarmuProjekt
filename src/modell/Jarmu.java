
package modell;

public abstract class Jarmu {
    private boolean beinditva;
    private boolean uzemanyag;
    private boolean megerkezett;

    public Jarmu() {
        this.beinditva = false;
        this.uzemanyag = true;
        this.megerkezett = false;
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
        if (beinditva && uzemanyag && !(megerkezett)) {
            return true;
        }
        uzemanyag=false;
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
