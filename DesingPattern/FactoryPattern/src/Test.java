/*                                               FACTORY DESİNG PATTERN

            *Asil amac istege bagli olarak hangi classtan nesne uretilecegidir
            *Bunu yapmak icin oncelikle bir tane interface tanimliyoruz
            *Daha sonra secim yapacagimiz classlari bu interfaceden implements ediyoruz
            *Daha sonra class tipinde donen bir adet operations classi yazip burda secim icin kosullar koyuyoruz
            *Son olarak istege bagli metodumuza parametre gondererek istedigimiz classi uretiyoruz


*/





import com.phone.*;

public class Test {
    public static void main(String[] args) {
       
        OperatingSystemFactory opr=new OperatingSystemFactory();
        
        IOs obj1=opr.getInstance("Windows");//class secimi
        IOs obj2=opr.getInstance("Android");
        IOs obj3=opr.getInstance("IOS");
        
        obj1.spec();
        obj2.spec();
        obj3.spec();
        
        
    }
    
}
