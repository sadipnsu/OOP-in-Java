
package abstractclass_method;


public class Main {

    
    public static void main(String[] args) {
        phone p = new bPhone();
        p.call();
        p.cook();
        p.dance();
        p.move();
    }
    
}

abstract class phone
{
    public void call()
    {
        System.out.println("Calling.....");
    }
    
    public abstract void dance();
    public abstract void move();
    public abstract void cook();
}

abstract class aPhone extends phone
{
    public void dance()
    {
        System.out.println("Dancing.....");
    }
}
class bPhone extends aPhone
{
    public void move()
    {
        System.out.println("Moving...");
    }
    public void cook()
    {
        System.out.println("cOOKING....");
    }
}
