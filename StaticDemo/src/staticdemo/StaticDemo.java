
package staticdemo;

class employee
{
    int id;
    int salary;
    static String ceo;
     
    public void show()
    {
        System.out.println(id+": " +salary +": " +ceo);
    }
    
}

class abc
{
    static int i=5;
    public static void display()
    {
        System.out.println("hello");
        System.out.println(i);
    }
}





public class StaticDemo {

   
    public static void main(String[] args) {
        employee a = new employee();
        a.id = 8;
        a.salary = 10000;
        a.ceo = "Fardeen";
        
        employee b = new employee();
        b.id = 10;
        b.salary =20000;
        b.ceo = "Newaz";
        
        a.show();
        b.show();
        
        
        
        abc.display();
        
       
        
        
        
    }
    
}
