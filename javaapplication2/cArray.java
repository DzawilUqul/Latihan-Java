package javaapplication2;

public class cArray {
    public static void main(String[] args) {
        
        // 1. Array satu Dimensi
            // Assignment
        int[] angka = {1,5,4,7,6,9,0,1};
        for(int i = 0; i < angka.length; i++){          //---> .lenght berfungsi menyesuaikan panjang array
            System.out.print(angka[i] + " ");
        }

            System.out.println();
            System.out.println("\n-----Menampilkan 1 Data Array-----");
            System.out.print(angka[1]);
            System.out.println();

            // Declaration
        String[] bilangan = new String[5];
            
        bilangan[0] = "1";
        bilangan[1] = "2";
        bilangan[2] = "3";
        bilangan[3] = "4";
        bilangan[4] = "5";
        
        System.out.println("\n-----Menampilkan Array Versi Declaration-----");
        for(int i = 0 ; i < bilangan.length; i++){
            System.out.print(bilangan[i] + " ");
        }

        System.out.println();
        System.out.println("\n-----Menampilkan Keseluruhan Array-----");

        // 2. Array dua dimensi
            // Assignment
            int[][] angka_2 = { {1,2,3,4,5},{22,33,44,55,66} };

                for(int i = 0; i < angka_2.length; i++){                 //---> lenght = 2
                    for(int j = 0; j < angka_2[i].length; j++){          //---> lenght ada 2, dari i=0 dan i=1
                        System.out.print(angka_2[i][j]   + "  ");        //---> [i] adalah baris [j] adalah kolom
                    }
                    System.out.println();
                }

                System.out.println("\n-----Menampilkan Array Pertama-----");

                for(int i = 0; i <= 0; i++){
                    for(int j = 0; j < angka_2[i].length; j++){
                        System.out.print(angka_2[i][j]   + "  ");
                    }
                    System.out.println();
                }

                System.out.println("\n-----Menampilkan Array Terakhir-----");

                for(int i = 0; i < 1; i++){
                    for(int j = 0; j < angka_2[i].length; j++){
                        System.out.print(angka_2[i+1][j]   + "  ");
                    }
                    System.out.println();
                }

                System.out.println("\n----Menampilkan Array 2D Versi Declaration----");

            // Declaration
            int[][] bilangan2 = new int[3][5];
            bilangan2[0][0] = 1;
            bilangan2[0][1] = 2;
            bilangan2[0][2] = 3;
            bilangan2[0][3] = 4;
            bilangan2[0][4] = 5;
            
            bilangan2[1][0] = 6;
            bilangan2[1][1] = 7;
            bilangan2[1][2] = 8;
            bilangan2[1][3] = 9;
            bilangan2[1][4] = 10;

            bilangan2[2][0] = 11;
            bilangan2[2][1] = 12;
            bilangan2[2][2] = 13;
            bilangan2[2][3] = 14;
            bilangan2[2][4] = 15;

            for(int i = 0 ; i < bilangan2.length; i++){
                for(int j=0; j<bilangan2[i].length; j++){
                    System.out.print(bilangan2[i][j] + " ");
                }
                System.out.println();
            }
    }
}
