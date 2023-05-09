package javaapplication2;

import java.util.Scanner;

public class cWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Batas : ");
        Short Batas = input.nextShort();

        int nilaiAwal = 1;

        while( nilaiAwal <= Batas ) {
            System.out.println(nilaiAwal);
            nilaiAwal++;
        }

        input.close();
    }
}
