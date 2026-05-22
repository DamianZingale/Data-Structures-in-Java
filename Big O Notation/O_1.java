public class O_1 {

    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Cronometro.start();

        int result = constantTime(list);

        long tiempo = Cronometro.stop();

        System.out.println("El primer elemento es: " + result);
        System.out.println("Tiempo de ejecución: " + tiempo + " nanosegundos");
    }

    public static int constantTime(int[] list) {

        if (list.length > 0) {
            return list[0];
        } else {
            return -1;
        }
    }

    public static class Cronometro {

        private static long startTime;

        public static void start() {
            startTime = System.nanoTime();
        }

        public static long stop() {
            return System.nanoTime() - startTime;
        }
    }
    // Complejidad temporal: O(1)
    // La función siempre accede al primer elemento del arreglo,
    // sin importar el tamaño de la entrada.
}