package reflectionAPI;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Application {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        TestCase1 testCase1 = new TestCase1();
        Class cl = testCase1.getClass();
        String methodName = cl.getSimpleName();
        Method[] methods2 = cl.getMethods();
        Method[] methods= cl.getDeclaredMethods();


//        String simpleName = testCase1.getClass().getSimpleName();
        System.out.println("methodName "+ methodName);
        System.out.println("methods2 "+methods2);
        System.out.println("methods " + methods);
//
//        System.out.println( "========================================================");
//        for(Method var:methods2){
//            String name= var.getName();
//            System.out.println( "name 1 " + name);
//        }

        System.out.println( "========================================================");

        for(Method var:methods){
            String name= var.getName();
            System.out.println( "name 2 " + name);
            var.invoke(testCase1);
//            testCase1.add();
//            testCase1.giveMeString();

            System.out.println( "========================================================");
            System.out.println( "========================================================");
            System.out.println( "========================================================");
        }


    }
}
