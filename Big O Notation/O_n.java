public class O_n {

    public static void main(String[] args) {

        int n = 1000;

        int[] array = new int[n];
        Cron.start();
        for (int i = 0; i < n; i++) {

            array[i] = i + 1;

            System.out.println(
                "Element at index " + i + ": " + array[i]
            );
        }
        long tiempo = Cron.stop();
        System.out.println("Tiempo de ejecución: " + tiempo + " nanosegundos");
    }
}
// Complejidad Temporal O(n)
// La función recorre cada elemento del arreglo una vez,
// por lo que el tiempo de ejecución crece linealmente con el tamaño del arreglo.
// Cron toma tambien el tiempo de I/O por la impresion en consola, lo que puede afectar el tiempo total de ejecución.
