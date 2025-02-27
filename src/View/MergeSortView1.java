package View;

import Controller.MergeSortController;

public class MergeSortView1 {
    public static void main(String[] args) {
        MergeSortController ms = new MergeSortController();
        int[] array = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};

        int[] resultado = ms.mergeSortOrdenar(array, 0, array.length - 1);

        for(int i : resultado){
            System.out.print(" "+ i);
        }
    }
}
