package Controller;

public class BubbleSortController {
    public BubbleSortController() {
    }

    public int[] bubbleSortOrdenar(int[] array){
        int tamanho = array.length;

        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho - 1; j++){
                if(array[j] > array[j+1]){
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }

            }
        }

        return array;
    }
}
