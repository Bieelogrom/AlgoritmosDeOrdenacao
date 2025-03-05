package View;

import Controller.MergeSortController;

public class MergeSortView2 {
    public static void main(String[] args) {
        MergeSortController ms = new MergeSortController();
        int[] array = {44,43,42,41,40,39,38};

        int[] arrayOrdenado = ms.mergeSortOrdenar(array, 0, array.length - 1);

        for(int i : arrayOrdenado){
            System.out.print(" "+ i);
        }
    }
}
