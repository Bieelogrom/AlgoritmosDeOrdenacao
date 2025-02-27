package View;

import Controller.BubbleSortController;

public class BubbleSortView1 {
    public static void main(String[] args) {
        BubbleSortController bs = new BubbleSortController();
        int[] array = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};

        int[] arrayOrdenado = bs.bubbleSortOrdenar(array);

        for(int i : arrayOrdenado){
            System.out.print(" "+ i);
        }
    }
}
