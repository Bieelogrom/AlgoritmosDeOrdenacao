package View;

import Controller.MergeSortController;

public class MergeSortView3 {
    public static void main(String[] args) {
        MergeSortController ms = new MergeSortController();
        int[] array = {101, 102, 103, 125, 124, 123, 104, 105, 106, 122};

        int[] arrayOrdenado = ms.mergeSortOrdenar(array, 0, array.length - 1);

        for(int i : arrayOrdenado){
            System.out.print(" "+i);
        }
    }
}
