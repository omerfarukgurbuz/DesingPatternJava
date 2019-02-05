/*                                              BUİLDER(KURUCU)
    #İlk olarak uretmek istedigimiz nesnenin classini  tanimlariz
    #Daha sonra uretilecek nesnenin ozelliklerine deger atamak icin bir tane uretici Abstract class tanimlariz.
    #Burda ki asil olay yeni uretilecek nesnenin ne olmasini belirleyecek olan abstract classdan exten eden ureticiler.
    #Bu uretici classlar sayesinde istedigimiz nesneyi uretiriz.
    #Daha sonra bu uretme isleminin akisini saglayacak baska bir class tanimlariz.
    #Son olarak gerekli degerleri kullanicidan almak icin main classi.


    !! Builder patern dememizin sebebi bir tane kurucu abstract classimizdan birden fazla kurucu class olusturma
                                     avantajini bize saglamasi

*/



public class PideSalonu {
    public static void main(String[] args) {
        
        //yonetici sinif
        final Asci asci=new Asci();
        
        
        
        //Kurulum nesnesi
        final LahmacunPideKurucu lahmacunkur=new LahmacunPideKurucu();
        
        
        
        //yonetici sinif icin kurulum nesnesi
        asci.pideKurucuSec(lahmacunkur);
        
        
        
        //ürünü olustur
        asci.pideyap();
        
        
        
        //pide kuruldu ve urun hazir
        final Pide pide=asci.pideAl();
        
        System.out.println("pide yapildi: "+pide);
        
    }
}
