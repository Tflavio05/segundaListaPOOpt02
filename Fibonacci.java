public class Fibonacci {

    int primeiro = 1, segundo = 1, proximo;


    void calculaFibonacci(int n) {
        while (primeiro <= n) {
            System.out.print(primeiro + ", ");

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
    }
}


