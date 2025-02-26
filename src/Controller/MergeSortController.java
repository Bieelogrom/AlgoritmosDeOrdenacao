package Controller;

public class MergeSortController {
    public MergeSortController() {
    }

    public int[] mergeSortOrdenar(int[] array, int inicio, int fim){
        if(inicio < fim){
            int meio = (inicio + fim) / 2;
            mergeSortOrdenar(array, inicio, meio); // Esquerda
            mergeSortOrdenar(array, meio + 1, fim); // Direita
            intercala(array, inicio, meio, fim);
        }

        return array;
    }

    private void intercala(int[] array, int inicio, int meio, int fim) {
        int novoArray[] = new int[array.length];
        for(int i = inicio; i <= fim; i++){
            novoArray[i] = array[i];
        }

        int esq = inicio;
        int dir = meio + 1;

        for(int cont = inicio; cont <= fim; cont++){
            if (esq > meio){
                array[cont] = novoArray[dir];
                dir++;
            }else if(dir > fim){
                array[cont] = novoArray[esq];
                esq++;
            }else if(novoArray[esq] < novoArray[dir]){
                array[cont] = novoArray[cont];
                esq++;
            }else{
                array[cont] = novoArray[dir];
                dir++;
            }
        }
    }
}
