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
          SingletonObject object=SingletonObject.getInstance();
          SingletonObject object2=SingletonObject.getInstance();// bu senaryoda obje 2 ve obje 3 obje 1 in gosterdigi  yeri gostermektedir
          SingletonObject object3=SingletonObject.getInstance();

         
    }
    
}
