/**
 * Used to restrict the types that can be used as type arguments.
 * Eg: a method that operates on nubmers might only want to accept instances of Number or its subclasses.
 *
 * This is what the bounded type parameters are for.
 *
 *
 * bounded type parameters allow you to invoke methods defined in the bounds.
 * Eg:
 *      any class that extens Comparable interface as a type --> we can use compareTo()method to compare items
 *
 * Type parameters can have multiple bounds:
 *
 *  <T extends B1 & B2 & B3>
 */
public class Lesson5_BoundedParameters {

    public static void main(String[] args) {
        GenericClass object = new GenericClass();
        System.out.println(object.compareValues(2,3));
        System.out.println(object.compareValues("Anand","Sathish"));
        System.out.println(object.compareValues("z","a"));
    }

}

class GenericClass{

    /**
     * Any data type that implements Comparable interface
     * String, Integer, Float and most of the data types implement comparable interface so should work
     *
     * This method only accepts only bounded parameters - Any class that implements the Comparable interface
     */
    public <T extends Comparable> T compareValues(T v1, T v2){
        if(v1.compareTo(v2) <0)
            return v1;
        return v2;

    }
}
