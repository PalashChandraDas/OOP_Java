public class MethodOverloading {
    public static void main(String[] args) {
        sum(10, 10);
        sum(1, 2, 3);
        sum(1.22, 8.455);
    }
    
    static void sum(int a, int b){
        int result;
        result = a + b;
        System.out.printf("The sum of a & b is = %d\n", result);
    }
    //overloaded_method
    static void sum(int a, int b, int c){
        int result;
        result = a + b + c;
        System.out.printf("The sum of a, b, c is = %d\n", result);
    }
    //overloaded_method
    static void sum(double a, double b){
        double result;
        result = a + b;
        System.out.printf("The sum of a & b is = %.3f\n", result);
    }
    
}
