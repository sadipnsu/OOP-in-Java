
package abstraction;


public class Abstraction {

    public static void main(String[] args) {
        iPhone obj = new iPhone();
        onePlus obj1 = new onePlus();
        show(obj1);
                
    }
    
    public static void show(phone obj)
    {
        obj.showConfig();
    }
    
}


abstract class phone
{
    public abstract void showConfig();
}

class iPhone extends phone
{
    public void showConfig()
    {
        System.out.println("2gb, IOS 9.3");
    }
}

class onePlus extends phone
{
    public void showConfig()
    {
        System.out.println("2gb,android 9");
    }
}