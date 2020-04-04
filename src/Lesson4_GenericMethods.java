/**
 * Syntax of generic method should be
 *
 * AccessModifier <GenericType> returnGenericType(OR)void  methodName(GenericParameter v1)
 *
 * method with void return
 * public <T> void test1(T type)
 *
 *
 * method with return type
 * public <T> T test1(T type)
 */


public class Lesson4_GenericMethods {

    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();

        System.out.println("--------------------------------------------------------------------------------------");
        genericMethod.methodWithNoReturnValue("Hello ");
        genericMethod.methodWithNoReturnValue(22);
        genericMethod.methodWithNoReturnValue(45.5);
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Generic method with return type returned the value "+genericMethod.methodWithReturnValue("Welcome "));
        System.out.println("Generic method with return type returned the value "+genericMethod.methodWithReturnValue(100));
        System.out.println("Generic method with return type returned the value "+genericMethod.methodWithReturnValue(250.5));
        System.out.println("--------------------------------------------------------------------------------------");
        Integer[] intArray = new Integer[]{1,2,3,4,5,6};
        genericMethod.showArray(intArray);
        System.out.println();
        String[] stringArray = new String[]{"India","Australia","UK","US"};
        genericMethod.showArray(stringArray);
    }
}

class GenericMethod{

    public <T> void methodWithNoReturnValue(T type){
        System.out.println("Generic method type : from method 1 is "+type.toString());
    }

    public <T> T methodWithReturnValue(T type){
        return type;
    }

    public <T> void showArray(T[] array){
        for(T item:array){
            System.out.print("-->"+item.toString());
        }
    }
}
