/*
                              -SINGLETON PATTERN-
#Bir nesneyi bir kez veya sinirli sayida uretmek icin kullanilir
#Bunu yapmak icin classin constructorini private olarak tanimlariz 
#Classin kac kez tanimlanacagi bilgisini tutan private static olan ve classin kendi turunden bir ozellik tanimlariz
#Daha sonra classin kendi tipinde retun degeri olan ve static tanimladigimiz ozelligimizi kontrol edip nesne ureten bi 
metod tanimlariz
*/



public class Test {
    public static void main(String[] args) {
      
       Singleton object1=Singleton.getMax();
       Singleton object2=Singleton.getMax();
       Singleton object3=Singleton.getMax();
       Singleton object4=Singleton.getMax();
       Singleton object5=Singleton.getMax();

    }
    
}
