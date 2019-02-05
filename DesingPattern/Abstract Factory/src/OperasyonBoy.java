


public class OperasyonBoy extends  AbstractOperasyon{

    @Override
    Boy boyAl(int k) {
        
        if(k==1){
            return new sırfırBes();
        }
        else if(k==2){
            return new sıfırYedi();
        }
        else
            return null;
        
    }

    @Override
    Marka markaAl(String m) {
        return null;
    }
    
    
}
