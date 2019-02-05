public class SingletonObject
{
    // Nesnemizin daha önceden oluşturulmadığını anlayabilmemiz için statik instance özelliği tanımlıyoruz.
    private static SingletonObject instance = null;
 
    //Sınıfımızın construct (kurucu) metodunu private yada protected tanımlıyoruz.
    private SingletonObject()
    {
        // oluşturulma sırasında kullanacağımız kodlar
    } 
 
    // Dışarıdan sınıfımızı çağıracağımız metodumuz.
    public static SingletonObject getInstance()
    {
        // eğer daha önce örnek oluşturulmamış ise sınıfın tek örneğini oluştur
        if(instance == null)
        {
            instance  = new SingletonObject();
            System.out.println("Tek sefere mahsus olacak sekilde nesne olusturdu");
        }
        else 
        {
            System.out.println("Birden fazla nesne olusturulmasina izin verilmemektedir");
        }
        return instance;
    } 
 
}