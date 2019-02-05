
public class Test {
    
    public static void main(String[] args) {
        Operasyon operasyon=new Operasyon();
        
        Root obj1=operasyon.getInstance("cam");
        Root obj2=operasyon.getInstance("kavak");
        Root obj3=operasyon.getInstance("mese");
        
        obj1.treeColor();
        obj2.treeColor();
        
        
        
    }
    
}
