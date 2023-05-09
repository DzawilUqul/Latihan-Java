package javaapplication2;

import java.util.Scanner;

public class cFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Batas : ");
        short batas = input.nextShort();
        
        // int nilaiAwal = 1;                                            //---> Declarasi di luar parent untuk akses secara global

        // for( int nilaiAwal = 1; nilaiAwal <= batas; nilaiAwal++ ) {   //---> Increment
        //     System.out.print(nilaiAwal + "    ");
        // }

        // for( int nilaiAwal = batas; nilaiAwal >= 1; nilaiAwal-- ) {      //---> Decrement
        //     System.out.print(nilaiAwal + "    ");
        // }

        for(int nilaiAwal = 1; nilaiAwal <= batas; nilaiAwal++) {
            System.out.print(nilaiAwal);
        }

        // System.out.print(nilaiAwal + "    ");
        input.close();
    }
}
