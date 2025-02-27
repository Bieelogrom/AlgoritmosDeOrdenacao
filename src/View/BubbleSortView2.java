package View;

import Controller.BubbleSortController;

public class BubbleSortView2 {
    public static void main(String[] args) {
        int[] array = {44, 43, 42, 41, 40, 39, 38};
        BubbleSortController bs = new BubbleSortController();

        int[] arrayOrdenado = bs.bubbleSortOrdenar(array);

        for(int i : arrayOrdenado){
            System.out.print(" "+ i);
        }

    }
}
