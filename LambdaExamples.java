
import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface MyFunctionalInterface{
    //lambda without a parameter
    public String sayHello();
}

@FunctionalInterface
interface MyFIWithSingleParam {
    //lambda with a single parameter
    public String sayHello(String name);
}

public class App {
    public static void main(String[] args) throws Exception {
        MyFunctionalInterface f = () -> { return "hello"; };
        System.out.println(f.sayHello());

        MyFIWithSingleParam f1 = (name) ->{ return "hello "+name;};
        System.out.println(f1.sayHello("JAVA"));

        List<String> fruitList = new ArrayList<String>();
        fruitList.add("apple");
        fruitList.add("orange");
        fruitList.add("grapes");
        fruitList.add("guava");
        
        fruitList.forEach((fruit) -> System.out.println(fruit));
    }
}


