package javaapplication2;
public class cSelectionSort {
    public static void main(String[] args) {
        int angkaRandom[] = {3,4,1,2,5};
        selectionSortInt(angkaRandom);

        double angkaDesimal[] = {1.1, 1.4, 1.5, 1.2, 1.3};
        selectionSortInt(angkaDesimal);

        String nama[] = {"zadi", "wadi","vadi", "xadi", "yadi"};
        selectionSortInt(nama);

        char hurufRandom[] = {'1', 'z', 'f','A','7'};
        selectionSortInt(hurufRandom);
    }

    public static void selectionSortInt(int bilangan[]){
        // Menampilkan Sebelum
                System.out.println("===SEBELUM===");
                for(int bil : bilangan){
                    System.out.print(bil + ", ");
                }

        // Logic
        // 1 2 3 4 5 
                for(int i=0; i<bilangan.length; i++){

                    int indexArray = i;
                    for(int j = 0; j < bilangan.length; j++){
                        if(bilangan[indexArray] < bilangan[j]){
                            indexArray = j;
                        }
                    }

                    // Swap
                    int temp = bilangan[i];
                    bilangan[i] = bilangan[indexArray];
                    bilangan[indexArray] = temp;
                }
        
        // Menampilkan Sebelum
                System.out.println("\n\n===SESUDAH===");
                for(int bil : bilangan){
                    System.out.print(bil + ", ");
                }
    }

    // Versi Double
    public static void selectionSortInt(double[] bilanganBulat){
        // Menampilkan Sebelum
                System.out.println("\n\n\n\n===SEBELUM===");
                for(double bil : bilanganBulat){
                    System.out.print(bil + ", ");
                }
        
        // Logic
                for(int i=0; i< bilanganBulat.length; i++){
                    int indexArray = i;
                    for(int j = i; j< bilanganBulat.length; j++){
                        if(bilanganBulat[indexArray] > bilanganBulat[j]){
                            indexArray = j;
                        }
                    }
                    
                    // Swap
                    double temp = bilanganBulat[i];
                    bilanganBulat[i] = bilanganBulat[indexArray];
                    bilanganBulat[indexArray] = temp;
                }
        
        // Menampilkan Sesudah
                System.out.println("\n\n===SESUDAH===");
                for(double bil : bilanganBulat){
                    System.out.print(bil + ", ");
                }
    }

    // Versi String
    public static void selectionSortInt(String[] kata){
        // Menampilkan Sebelum
                System.out.println("\n\n\n\n===SEBELUM====");
                for(String bil : kata){
                    System.out.print(bil + ", ");
                }

        // Logic 
                for(int i = 0; i < kata.length; i++){

                    int indexArray = i;
                    for(int j= i; j < kata.length; j++){
                        if(kata[indexArray].compareTo(kata[j]) < 0){
                            indexArray = j;
                        }
                    }
                    
                    // Swap
                    String temp = kata[i];
                    kata[i] = kata[indexArray];
                    kata[indexArray] = temp;
                }

        // Menampilkan Sesudah
                System.out.println("\n\n===SESUDAH====");
                for(String bil : kata){
                    System.out.print(bil + ", ");
                }
    }

    // Versi Char 
    public static void selectionSortInt(char[] huruf){
        // Menampilkan Sebelum
                System.out.println("\n\n\n\n===SEBELUM====");
                for(char bil : huruf){
                    System.out.print(bil + ", ");
                }

        // Logic
                for(int i=0; i < huruf.length; i++){

                    int indexArray = i;
                    for(int j = i; j < huruf.length; j++){
                        if(huruf[indexArray] > huruf[j]){
                            indexArray = j;
                        }
                    }

                    // Swap
                    char temp = huruf[i];
                    huruf[i] = huruf[indexArray];
                    huruf[indexArray] = temp;
                }

        // Menampilkan Sesudah
                System.out.println("\n\n===SESUDAH====");
                for(char bil : huruf){
                    System.out.print(bil + ", ");
                }
    }
}
