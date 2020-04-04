/**
 * /*
 *
 *    There are two main types of bugs
 *         compile time bugs or compile time errors
 *         runtime bugs or runtime errors
 *
 *     Compile time/Compile time errors - Can be fixed at compile time.
 *
 *     Runtime bugs - more problematic because don't always surface immediately and.
 *     Each may occur at different points in the that is far from the actual cause of the problem.
 *     So basically it's very important to see that runtime bugs are very very hard to detect.
 *
 *
 *     So why generics are important.What does generics has to do with all of this.
 *             Basically generics add stability to your code by making more of your bugs detectable at compile time.
 *             So with use of generics we are able to reduce runtime bugs to compile time bugs.
 *
 *
 *
 *
 *
 *    1) stronger type checks at compile time.
 *
 *         If the code violates type safety compiler will warn us
 *         --> fixing compile time errors is easier
 *
 *     2) Eliminate casting
 *         Eg:
 *             not a good solution
 *                 List nameList = new ArrayList();
 *                 String name = (String)list.get(0);
 *
 *             Good Solution
 *                 List<String> list = new ArrayList();
 *                 String name = list.get(0)
 *       3) Implement generic algorithms, and reuse them
 *             Eg:
 *                 sorting method can handle any datatype like Strings/doubles etc
 *                 No need of separate sorting method for each datatype
 *                 +easier to read generics code
 */
public class Lesson1_ProblemStatement {

    // :( Two different methods required for handling different data types


    //adds only integer data types cannot handle other data types
    public static void add(int a, int b){
        System.out.println(a+b);
    }

    public static void add(double a, double b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        add(1,2);
        add(1.4,2.4);


    }
}
