
import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;


public class Operasyon {
    
    
    public  Root getInstance(String a){
        
        if(a.equals("cam")){
            System.out.println("Cam agaci olusturuldu");
            return new Cam();
        }
        
        else if(a.equals("kavak")){
            System.out.println("Kavak agaci uretildi");
            return new Kavak();
        }
        
        else{
            System.out.println("Herhangi bir nesne uretilmedi");
            return null;
        }
        
    }
    
}
