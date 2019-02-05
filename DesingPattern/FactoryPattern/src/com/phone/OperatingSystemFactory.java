
package com.phone;



public class OperatingSystemFactory {

    public IOs getInstance(String str){//secim metodu donus tipi Class tipinde
        
        switch (str) {
            
            case "Android":
                return new Android();
                
            case "Windows":
                return new Windows();
                
            case "IOS":
                return new Aos();
            
            default:
                return null;
        }
    }
    
}
