package javaapplication2;

public class cBubble_Sort {
    public static void main(String[] args) {
        int nilai[] = {65, 61, 60, 64, 63, 62, 59};
        bubbleShortASCInt(nilai);

        System.out.println("\n");
        double[] ipk = {1.4, 4.0, 2.4, 3.4};
        bubbleShortASCInt(ipk);

        System.out.println("\n");
        String[] nama = {"badi", "eadi", "adi", "dadi", "cadi"};
        bubbleShortASCInt(nama);

        System.out.println("\n");
        char[] abjad = {'a', 'A', '1', 'z', 'f'};
        bubbleShortASCInt(abjad);
    }

    public static void bubbleShortASCInt(int[] bilangan){
        // Tampilkan Sebelum
        System.out.println("===SEBELUM===");
        for(int bil : bilangan){                                    //---> for-each loop in array
            System.out.print(bil + ", ");
        }

        // Logic
        for(int i=0; i < bilangan.length; i++){                                         //---> Pengecekan baris
            for(int j=0; j <bilangan.length-1; j++){                                    //---> Pengecekan kolom
                // Kalau nlai saat ini lebih besar daripada nilai selanjutnya
                if(bilangan[j] > bilangan[j+1]){
                    // Maka Ditukar
                    int tampungan = bilangan[j];
                    bilangan[j] = bilangan[j+1];
                    bilangan[j+1] = tampungan;
                }
            }
        }

        // Tampilkan Sesudah
        System.out.println("\n\n===SESUDAH===");
        for(int bil : bilangan){                                    //---> for-each loop in array
            System.out.print(bil + ", ");
        }
    }

    // Versi Double
    public static void bubbleShortASCInt(double[] angka){
        // Tampilkan Sebelum
                System.out.println("\n\n===SEBELUM===");
                for(double bil : angka){
                    System.out.print(bil + ", ");
                }

        // Logic
                for(int i=0; i < angka.length; i++){
                    for(int j=0; j < angka.length-1; j++){
                        if(angka[j] < angka[j+1]){                  //---> Descending
                            double temp = angka[j];
                            angka[j] = angka[j+1];
                            angka[j+1] = temp;
                        }
                    }
                }


        // Tampilkan Sesudah
                System.out.println("\n\n===SESUDAH===");
                for(double bil : angka){
                    System.out.print(bil + ", ");
                }
    }

    // Versi String
    public static void bubbleShortASCInt(String[] kata){
        // Menampilkan Sebelum
                System.out.println("\n\n===SEBELUM===");
                for(String bil : kata){
                    System.out.print(bil + ", ");
                }

        // Logic
        for(int i=0; i < kata.length; i++){
            for(int j=0; j < kata.length-1; j++){
                if(kata[j].compareTo(kata[j+1]) > 0){         //---> A > B = -1 || B > A = +1
                    String temp = kata[j];
                    kata[j] = kata[j+1];
                    kata[j+1] = temp;
                }
            }
        }

        // Menampilkan Sesudah
                System.out.println("\n\n===SESUDAH===");
                for(String bil : kata){
                    System.out.print(bil + ", ");
                }
    }

    // Versi Char
    public static void bubbleShortASCInt(char[] huruf){
        // Menampilkan Sebelum
                System.out.println("\n\n===SEBELUM===");
                for(char h : huruf){
                    System.out.print(h + ", ");
                }

        // Logic
                for(int i=0; i< huruf.length;i++){
                    for(int j=0; j<huruf.length-1;j++){
                        if(huruf[j] > huruf[j+1]){
                            char temp = huruf[j];
                            huruf[j] = huruf[j+1];
                            huruf[j+1] = temp;
                        }
                    }
                }

        // Menampilkan Sesudah
                System.out.println("\n\n===SESUDAH===");
                for(char h : huruf){
                    System.out.print(h + ", ");
                }
    }

}
