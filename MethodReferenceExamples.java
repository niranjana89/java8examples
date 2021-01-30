import java.sql.Array;
import java.util.Arrays;

/**
 * 1. Method reference to an instance method of an object – object::instanceMethod
 * 2. Method reference to a static method of a class – Class::staticMethod
 * 3. Method reference to an instance method of an arbitrary object of a particular type – Class::instanceMethod
 * 4. Method reference to a constructor – Class::new
 * 
 */

@FunctionalInterface
interface MyInterface{
    public String display();
  
}

@FunctionalInterface
interface MyInterfaceBiFunction{
    public  void display(int a, int b);
}


@FunctionalInterface
interface MyInterfaceBiFunction1{
    Hello display();
}


class Hello{
    public Hello(){
        System.out.println("Hellooooo");
    }
}

public class App {

    public String myMethod(){
        return "this is an example for method reference";
    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) throws Exception {
        //1. Method reference to an instance method of an object
        App myApp = new App();
        MyInterface inf = myApp :: myMethod;
        System.out.println(inf.display());

        //static method call
        MyInterfaceBiFunction bi = App::sum;
        bi.display(5,3);      
        
        //class instance method.
        String[] fruits = {"Apple", "orange", "grapes","strawberry"};
        Arrays.sort(fruits, String::compareToIgnoreCase);
        for(String str: fruits){
            System.out.println(str);
        }

        //method reference to constructor
        MyInterfaceBiFunction1 ref  = Hello::new;
        ref.display();       
    }
   
}


