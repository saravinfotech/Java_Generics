/**
 * Type Inference
 *
 * Compilers ability to look at each method invocation and corresponding
 * method declaration to determine the type argument/arguments (such as T)
 * that make the invocation applicable.
 *
 *
 * the interference algorithm determines
 *      the data type type of argument + the type of result being assigned
 *
 *
 *  the interference will try to find the most specific type that works
 *  with all of the arguments
 *
 *  public <T> T getData (T t1, Tt2){
 *      return t2;
 *  }
 *
 *      If the above method is called with 2 different arguments as shown below
 *          getData("Hello", new ArrayList<String>()));
 *
 *          in the above for the same T parameter we are passing String and ArrayList<String>
 *
 *      So the compiler tries to work out the most common data type common for both String and ArrayList<String>
 *          and in this case returns the Serializable object.
 *
 *         Serializable s = getData("Hello", new ArrayList<String>()));
 *
 *
 *     Also type inference is the concept which doesnt require us to specify the type with in Angle brackets in the below scenario
 *          List<String> list = new ArrayList<>() --> We dont need to specify the type string for the ArrayList
 *          Type inference takes care of the same.
 */
public class Lesson6_TypeInference {
}
