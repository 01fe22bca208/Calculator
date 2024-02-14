package Calculator;


/**
 * The "arithmetic" class performs basic arithmetic operations such as addition, subtraction,
 * multiplication, and division on two given integers.
 */
public class Calculator {
    // The code is defining a class called "arithmetic" that performs basic arithmetic operations on
    // two given integers.
    /**
     * The main function performs arithmetic operations on two numbers and prints the results.
     */
    public static void main(String[] args) {
        int a=10;
        int b=5;
        
        int sumResult = add(a, b);
        int differenceResult = subtract(a, b);
        int productResult = multiply(a, b);
        int quotientResult = divide(a, b);
        int squresult=square(a);
        int cuberesult=cube(a);
        System.out.println("the arithmetic operations are as follows:");

        System.out.println("Sum: " + sumResult);
        System.out.println("Difference: " + differenceResult);
        System.out.println("Product: " + productResult);
        System.out.println("Quotient: " + quotientResult);
        System.out.println("square:"+squresult);
        System.out.println("cuberesult:"+cuberesult);


    
    }

    /**
     * The function "add" takes two integers as input and returns their sum.
     * 
     * @param a The parameter "a" is an integer value.
     * @param b The parameter "b" is an integer that represents the second number to be added.
     * @return The sum of the two input integers, `a` and `b`, is being returned.
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * The function subtracts the value of b from a and returns the result.
     * 
     * @param a The first parameter, "a", is an integer value.
     * @param b The parameter "b" is an integer value that is being subtracted from the value of
     * parameter "a".
     * @return The method is returning the result of subtracting b from a.
     */
    public static int subtract(int a, int b) {
        return a - b;
    }

   /**
    * The function "multiply" takes two integers as input and returns their product.
    * 
    * @param a The first parameter is "a" and it represents an integer value.
    * @param b The parameter "b" is an integer value that represents the second number to be
    * multiplied.
    * @return The product of the two input integers, a and b.
    */
    public static int multiply(int a, int b) {
        return a *b;
    }

    /**
     * The function "divide" takes two integers as input and returns the result of dividing the first
     * integer by the second integer.
     * 
     * @param a The first parameter "a" is an integer value.
     * @param b The parameter "b" is the divisor in the division operation.
     * @return The method is returning the result of dividing the integer 'a' by the integer 'b'.
     */
    public static int divide(int a, int b) {
        return a / b;
    }
    public static int square(int a){
        return a*a;
    }
    public static int cube(int a){
        return a*a*a;
    }
}