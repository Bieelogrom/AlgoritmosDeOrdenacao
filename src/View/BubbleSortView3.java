package View;

import Controller.BubbleSortController;

public class BubbleSortView3 {
    public static void main(String[] args) {
        int[] array = {101, 102, 103, 125, 124, 123, 104, 105, 106, 122};
        BubbleSortController bs = new BubbleSortController();

        int[] arrayOrdenado = bs.bubbleSortOrdenar(array);

        for(int i : arrayOrdenado){
            System.out.print(" "+i);
        }

    }
}
