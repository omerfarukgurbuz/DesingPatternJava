
public class OperasyonMarka extends AbstractOperasyon{

    @Override
    Boy boyAl(int k) {
        return null;
    }

    @Override
    Marka markaAl(String marka) {
        
        if(marka.equals("faber"))
            return  new Faber();
        
        else if(marka.equals("pensan"))
            return new Pensan();
        
        else 
            return null;
       
    }
    
    
}
