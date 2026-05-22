
public class O_n2 {

    public static void main(String[] args) {
      
        int[] list = new int[]{6,4,8,14,66,77,55,22,34,11,9,3,2,1,0};
        Cron.start();
        for (int i = list.length-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
               
                if (list[j] > list[i]) {

                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                }
        // Tiempo de ejecución: O(n^2)
        // La función tiene dos bucles anidados que recorren la lista,
        // lo que resulta en una complejidad cuadrática. 
        // El tiempo de ejecución aumenta significativamente a medida que el tamaño de la entrada crece, especialmente para listas grandes.
            }
        }
        Long time =Cron.stop();
        System.out.println("Tiempo de ejecución: " + time + " nanosegundos");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        
    }
}
