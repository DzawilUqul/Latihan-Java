package javaapplication2;

public class cInsertionSort {
    public static void main(String[] args) {
        int[] angka = {4,3,1,5,2};
        InsertionSortInt(angka);

        double angkaDesimal[] = {1.4, 1.5, 1.2, 1.3, 1.1};
        InsertionSortInt(angkaDesimal);

        String nama[] = {"Adi","cadi","adi","eadi","badi"};
        InsertionSortInt(nama);

        char hurufRandom[]= {'1','z','H','9','M'};
        InsertionSortInt(hurufRandom);
    }

    public static void InsertionSortInt( int bilangan[]){
        // Tampilkan Sebelum
                System.out.println("===SEBELUM===");
                for(int bil : bilangan){
                    System.out.print(bil + ", ");
                }

        // Logic
                for(int i= 0; i<bilangan.length; i++){
                    for(int j= i; j > 0; j--){
                        // Swap
                        if(bilangan[j] < bilangan[j-1]){
                            int temp = bilangan[j];
                            bilangan[j] = bilangan[j-1];
                            bilangan[j-1] = temp;
                        }
                    }
                }

        // Tampilkan Sesudah
                System.out.println("\n\n===SESUDAH===");
                for(int bil : bilangan){
                    System.out.print(bil + ", ");
                }
    }

    // Versi double
    public static void InsertionSortInt(double angkaDouble[]){
        // Tampilkan Sebelum
                System.out.println("\n\n\n\n===SEBELUM===");
                for(Double bil : angkaDouble){
                    System.out.print(bil + ", ");
                }

        // Logic
                for(int i = 0; i < angkaDouble.length; i++){
                    for(int j = i; j > 0; j--){
                        if(angkaDouble[j] > angkaDouble[j-1]){
                            Double temp = angkaDouble[j];
                            angkaDouble[j] = angkaDouble[j-1];
                            angkaDouble[j-1] = temp;
                        }
                    }
                }

        // Tampilkan Sesudah
                System.out.println("\n\n===SESUDAH===");
                for(double bil : angkaDouble){
                    System.out.print(bil + ", ");
                }
    }

    // Versi String
    public static void InsertionSortInt(String kata[]){
        // Tampilkan Sebelum
                System.out.println("\n\n\n\n===Sebelum===");
                for(String bil : kata){
                    System.out.print(bil + ", ");
                }

        // Logic
                for(int i=0; i<kata.length; i++){
                    for(int j=i; j>0; j--){
                        if(kata[j].compareTo(kata[j-1]) > 0 ){  //a b -1
                            String temp = kata[j];
                            kata[j] = kata[j-1];
                            kata[j-1] = temp;
                        }
                    }
                }

        // Tampilkan Sesudah
                System.out.println("\n\n===SESUDAH===");
                for(String bil : kata){
                    System.out.print(bil + ", ");
                }
    }

    // Versi Char
    public static void InsertionSortInt(char huruf[]){
        // Tampilkan Sebelum
                System.out.println("\n\n\n\n===SEBELUM===");
                for(char bil : huruf){
                    System.out.print(bil + ", ");
                }
            
            // Logic
                for(int i=0; i < huruf.length; i++){
                    for(int j=i; j > 0 ;j--){
                        if(huruf[j] < huruf[j-1]){
                            char temp = huruf[j];
                            huruf[j] = huruf[j-1];
                            huruf[j-1] = temp;
                        }
                    }
                }

        // Tampilkan Ssudah
                System.out.println("\n\n===SESUDAH===");
                for(char bil : huruf){
                    System.out.print(bil + ", ");
                }
    }

}// End Class
