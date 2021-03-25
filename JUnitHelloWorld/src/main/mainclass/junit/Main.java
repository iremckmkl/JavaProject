package junit;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {
    
    public static void main(String[] args){

        System.out.println("Hello World");
        Result result=JUnitCore.runClasses(JUnitHelloWorldTest.java);
        for(Failure failure: result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    
        
    }

    
}

