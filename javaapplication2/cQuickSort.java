package javaapplication2;

public class cQuickSort {
    public static void main(String[] args) {
        int nilai[] = {15,76,45,98,34};
        quickSortInt(nilai);
    }

    public static void quickSortInt(int[] angka){
        System.out.println("===SEBELUM===");
        for(int bil : angka){
            System.out.print(bil + " ");
        }

        quickSortAlgorithm(angka, 0 , angka.length-1);

        System.out.println("\n\n===SESUDAH===");
        for(int bil : angka){
            System.out.print(bil + " ");
        }
    }

    public static void quickSortAlgorithm(int[] angka, int indexAwal, int indexAkhir){
        int i = indexAwal, j = indexAkhir, pivot = angka[indexAkhir];
        while(i<=j){
            while(angka[i] < pivot){
                i++;
            }

            while(angka[j] > pivot){
                j--;
            }

            if(i<=j){
                int temp = angka[i];
                angka[i] = angka[j];
                angka[j] = temp;
                i++;
                j--;
            }
        }

        if(j>indexAwal){
            quickSortAlgorithm(angka, indexAwal, j);
        }

        if(i<indexAkhir){
            quickSortAlgorithm(angka, i, indexAkhir);
        }
    }
}
