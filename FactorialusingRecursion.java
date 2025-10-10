public class FactorialusingRecursion {

    public static int Factorial(int num){
        if(num <= 1){
            return 1;
        }
        return num * Factorial (num-1);

    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println(Factorial(num));
    }
}
