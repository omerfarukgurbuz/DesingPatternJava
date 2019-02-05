
public class Test {
    public static void main(String[] args) {
        
        AbstractOperasyon op=new OperasyonBoy();
        
        Boy obj1=op.boyAl(1);
        obj1.sayi();
        
        Boy obj2=op.boyAl(2);
        obj2.sayi();
      
        Boy obj3=op.boyAl(3);
        obj3.sayi();        
        
    }
}
