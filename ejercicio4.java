public class ejercicio4 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6};
        int maxLength = array1.length > array2.length ? array1.length : array2.length;
        int[] arrayMaximos = new int[maxLength];
        for (int i = 0; i < maxLength; i++) {
            if (i < array1.length && i < array2.length) {
                arrayMaximos[i] = array1[i] > array2[i] ? array1[i] : array2[i];

                } else if (i < array1.length) {
                    arrayMaximos[i] = array1[i];
                } else {
                    arrayMaximos[i] = array2[i];
                }         
         }
         for (int valor : arrayMaximos) {
            System.out.println(valor + " ");
         }

    }
}

