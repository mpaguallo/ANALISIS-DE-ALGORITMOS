
public class FibonacciRecursivo {

    public static void main(String[] args) {
        int n = 10;
        System.out.println("=======================================================");
        System.out.println("       SUCESIÓN DE FIBONACCI (Modo recursivo)      ");
        System.out.println("=======================================================");
        System.out.println("-Resultado de los términos desde F(0) hasta F(" + n + "):");

        for (int i = 0; i <= n; i++) {
            System.out.printf("F(%d) = %d\n", i, fibonacci(i));
        }
        System.out.println("=======================================================");
    }

    // Método recursivo para obtener el término n de Fibonacci
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
