package utilities;

public class MathHelper {

    //Write a public static method named max() and returns the greatest number of 3 numbers
    /*
        return or void?                     ->   return
        static or non-static                -> static
        what is the name of the method      -> max()
        what it returns?                    ->  int
        Does it take arguments?             -> 3 int arguments
     */

    public static int max(int num1, int num2, int num3){
        return Math.max(Math.max(num1, num2), num3);
    }

    /*
    1. We need the task it will perform         -> take 2 numbers and return the sum
    2. We need to give it a name                -> sum()
    3. Decide the accessibility                 -> public
    4. static or non-static (accessibility)     -> static
    5. return or void                           -> return
    6. arguments or no                          -> 2 numbers
     */

    //Write a public static method named sum() and returns the sum of 2 numbers
    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return sum(a, b) + c;
    }

    public static double sum(double a, double b){
        return a + b;
    }

    public static long sum(long a, long b){
        return a + b;
    }


    //Write a public static method named product() and returns the product of 2 numbers
    public static int product(int a, int b){
        return a * b;
    }

    //Write a public static method named square() and returns the square of a number
    public static int square(int a){
        return a * a;
    }
}
