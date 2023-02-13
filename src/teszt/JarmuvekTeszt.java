
package teszt;

import modell.Auto;
import modell.Jarmu;

class Hajo extends Jarmu{}

public class JarmuvekTeszt {
    public static void main(String[] args) {
        new JarmuvekTeszt();
    }

    public JarmuvekTeszt() {
        //mintaSablonTeszt();
        haladBeninditassalAutoTeszt();
        haladBeinditasNlkAutoTeszt();
        
        haladBeninditassalJarmuTeszt();
        haladBeninditassalNlkJarmuTeszt();
        
        autoBeinditasTeszt();
        hajoBeinditasTeszt();
        
        autoLeallitasTeszt();
        hajoLeallitasTeszt();
        
        autoTankolasBeinditvaTeszt();
        autoTankolasLeallitvaTeszt();
        
        hajoTankolasBeinditvaTeszt();
        hajoTankolasLeallitvaTeszt();
    }
    
    public void mintaSablonTeszt(){
        int kapott = 7;
        int vart = 4;
        /*assert: projekt -> properties -> Run -> VM Options: -ea */
        assert kapott == vart : "nem egyeznek";
    }

    private void haladBeninditassalAutoTeszt() {
        Auto auto = new Auto();
        auto.beindit();
        boolean kapott = auto.halad();
        boolean vart = !auto.isDefekt(); //ha a defekt true akkor nem tudunk haladni
        
        assert kapott == vart : "Auto nem tud haladni beinditva";
    }
    
    private void haladBeninditassalJarmuTeszt() {
        Hajo hajo = new Hajo();
        hajo.beindit();
        boolean kapott = hajo.halad();
        boolean vart = true;
        
        assert kapott == vart : "Jarmu nem tud haladni beinditva";
    }
    
    private void haladBeninditassalNlkJarmuTeszt() {
        Hajo hajo = new Hajo();
        boolean kapott = hajo.halad();
        boolean vart = false;
        
        assert kapott == vart : "Jarmu tud haladni, leallitva";
    }
    
    private void haladBeinditasNlkAutoTeszt() {
        Auto auto = new Auto();
        boolean kapott = auto.halad();
        boolean vart = false;
        
        assert kapott == vart : "Auto tud haladni, lealliva";
    }
    
    private void hajoBeinditasTeszt(){
        Hajo hajo = new Hajo();
        hajo.beindit();
        boolean kapott = hajo.isBeinditva();
        boolean vart = true;
        
        assert kapott == vart : "Jarmu nem beindithato";
    }
    
    private void autoBeinditasTeszt(){
        Auto auto = new Auto();
        auto.beindit();
        boolean kapott = auto.isBeinditva();
        boolean vart = true;
        
        assert kapott == vart : "Auto nem beindithato";
    }
    
    private void hajoLeallitasTeszt(){
        Hajo hajo = new Hajo();
        hajo.beindit();
        hajo.leallit();
        
        boolean kapott = !hajo.isBeinditva();
        boolean vart = true;
        
        assert kapott == vart : "Jarmu nem leallithato";
    }
    
    private void autoLeallitasTeszt(){
        Auto auto = new Auto();
        auto.beindit();
        auto.leallit();
        
        boolean kapott = !auto.isBeinditva();
        boolean vart = true;
        
        assert kapott == vart : "Auto nem leallithato";
    }
    
    private void autoTankolasBeinditvaTeszt(){
        Auto auto = new Auto();
        auto.beindit();
        auto.tankol();
        
        boolean kapott = auto.tankol();
        boolean vart = false;
        
        assert kapott == vart : "Auto tankolhato beinditva";
    }
    
    private void autoTankolasLeallitvaTeszt(){
        Auto auto = new Auto();
        auto.beindit();
        auto.leallit();
        auto.tankol();
        
        boolean kapott = auto.tankol();
        boolean vart = true;
        
        assert kapott == vart : "Auto nem tankolhato leallitva";
    }
    
    private void hajoTankolasBeinditvaTeszt(){
        Hajo hajo = new Hajo();
        hajo.beindit();
        hajo.tankol();
        
        boolean kapott = hajo.tankol();
        boolean vart = false;
        
        assert kapott == vart : "Jarmu tankolhato beinditva";
    }
    
    private void hajoTankolasLeallitvaTeszt(){
        Hajo hajo = new Hajo();
        hajo.beindit();
        hajo.leallit();
        hajo.tankol();
        
        boolean kapott = hajo.tankol();
        boolean vart = true;
        
        assert kapott == vart : "Jarmu nem tankolhato leallitva";
    }
}
