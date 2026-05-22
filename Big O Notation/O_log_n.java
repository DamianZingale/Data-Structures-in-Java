public class O_log_n {

    public static void main (String[] args) {
        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        Cron.start();
        int result = binarySearch(list, 30);
        long time = Cron.stop();
        if (result != -1) {
            System.out.println("Elemento encontrado: " + list[result]);
        } else {
            System.out.println("Elemento no encontrado");
        }
        System.out.println("Tiempo de ejecución: " + time + " nanosegundos");
        // Complejidad temporal: O(log n)
        // La función utiliza una búsqueda binaria, que divide la lista en mitades en cada iteración. 
        // Esto resulta en una complejidad logarítmica, ya que el número de operaciones necesarias para encontrar el elemento crece de manera logarítmica con respecto al tamaño de la entrada. 
        // A medida que el tamaño de la lista aumenta, el tiempo de ejecución crece mucho más lentamente en comparación con algoritmos de complejidad lineal o cuadrática, 
        // lo que hace que la búsqueda binaria sea eficiente para listas grandes.
        // La lista debe estar ordenada para que la búsqueda binaria funcione correctamente, lo que es un requisito importante a tener en cuenta al utilizar este algoritmo.
    }

    public static int binarySearch(int[] list, int target) {
        int low = 0;
        int high = list.length - 1;
        int ciclos = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            ciclos++;
            if (list[mid] == target) {
                System.out.println("Número de ciclos: " + ciclos);
                return mid;
            } else if (list[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Número de ciclos: " + ciclos);
        return -1;
    }
}
