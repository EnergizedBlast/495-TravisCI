public class Factorial {
    public static int factorial(int numInput){
        int result = numInput;

        for(int numFactorial = numInput - 1; numFactorial > 0; numFactorial--){
            result = result * numFactorial;
        }
        return result;
    }
}
