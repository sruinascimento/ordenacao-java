public class SelectionSortR {

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int menorNumero = array[i];
            int indiceMenorNumero = i;
            for (int j = i + 1; j < array.length; j++) {
                if (menorNumero > array[j]) {
                    menorNumero = array[j];
                    indiceMenorNumero = j;
                }
            }
            
            int valorAuxiliar = array[i];
            array[i] = menorNumero;
            array[indiceMenorNumero] = valorAuxiliar;
        }

        return array;
    }
    
    public static void main(String[] args) {
        int[] array = {10, 7, 2, 12, 5, 9};
        
        for (int number : selectionSort(array)) {
            System.out.print(number + " ");
        }
    }
    
}
