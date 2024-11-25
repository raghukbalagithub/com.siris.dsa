package recursion;

public class NthFibonacci {
    public static void main(String args[]) {

        NthFibonacci obj = new NthFibonacci();
        System.out.println("1st fibonacci number is: " +obj.fib(0));
        System.out.println("2nd fibonacci number is: " +obj.fib(1));
        System.out.println("3rd fibonacci number is: " +obj.fib(2));
        System.out.println("4th fibonacci number is: " +obj.fib(3));
        System.out.println("5th fibonacci number is: " +obj.fib(4));
        System.out.println("6th fibonacci number is: " +obj.fib(5));
        System.out.println("7th fibonacci number is: " +obj.fib(6));
    }

    public int fib(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;

        return fib(n-1) + fib(n-2);
    }
}
