public class O_n {

    public static void main(String[] args) {

        int n = 10;

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {

            array[i] = i + 1;

            System.out.println(
                "Element at index " + i + ": " + array[i]
            );
        }
    }
}
// Complejidad Temporal O(n)
// La función recorre cada elemento del arreglo una vez,
// por lo que el tiempo de ejecución crece linealmente con el tamaño del arreglo.
