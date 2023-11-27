public class Fibonacci02 {

    int calcfiba(int n) {
        return (n <= 1) ? n : calcfiba(n - 1) + calcfiba(n - 2);
    }
}