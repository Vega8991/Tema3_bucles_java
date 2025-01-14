package tema3_java;
public class Arrays_duplicados {
    
    public static void main(String[] args) {
        int[] array = {4, 0, 2, 0, 6, 4, 4, 6};
        for (int i = 0; i < array.length; i++) {
            boolean duplicado = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    duplicado = true;
                    break;
                }
            }
            if (!duplicado) {
                int contador = 0;
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        contador++;
                    }
                }
                if (contador > 1) {
                    System.out.println("Ocurrencia " + array[i]);
                }
            }
        }
    }
}
