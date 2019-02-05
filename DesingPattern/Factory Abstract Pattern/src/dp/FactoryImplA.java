
package dp;


public class FactoryImplA implements AbstractFactory{

    @Override
    public AbstractPlugin getInstance() {
       return new PluginImpA();
    }
    
}
