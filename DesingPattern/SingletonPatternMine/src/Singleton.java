
public class Singleton {
    private static int max=0;//static tanimli olan kontrol yapimiz
    
    
    
    private Singleton(){//private constructor
       max++;
    } 
    
    
    public static Singleton getMax(){//public metodumuz
        
        if(max<3){
            Singleton instance1=new Singleton();
            return instance1;
        }
        
        else
        {
            System.out.println("3 nesneden fazla olusturulamaz");
            return null;
        }

       
    }
    
}
