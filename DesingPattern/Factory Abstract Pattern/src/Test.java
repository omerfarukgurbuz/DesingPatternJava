

import dp.*;


public class Test {
    public static void main(String[] args) {
        
        AbstractFactory obj1=new FactoryImplB();
        AbstractPlugin obj2=obj1.getInstance();
        obj2.traitement();
        
    }
    
}
