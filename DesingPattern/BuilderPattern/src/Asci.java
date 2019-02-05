
public class Asci {

    private PideKurucu pidekurucu;
    
    
    public void pideKurucuSec(final PideKurucu pidekurucu){
        this.pidekurucu=pidekurucu;
    }
    
    
    public Pide pideAl(){
        return pidekurucu.pideAl();
    }
    
    
        
    public void pideyap(){
        pidekurucu.pideYarat();
        pidekurucu.hamurKur();
        pidekurucu.baharatKur();
        pidekurucu.malzemeKur();
    }
    
    

    
}
