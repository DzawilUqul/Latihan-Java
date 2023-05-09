package javaapplication2;

import java.util.Scanner;

public class cIF_Majemuk {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // System.out.print("Masukkan Nama Anda : ");
    // String nama = input.nextLine();

    // System.out.print("Masukkan Pekerjaan Anda : ");
    // String pekerjaan = input.nextLine();

    // if (!nama.isEmpty() && pekerjaan.equalsIgnoreCase("programmer") || pekerjaan.equalsIgnoreCase("programer") ){
    //     System.out.print("Halo! " + nama + " Anda Menantu Idaman");
    // }

    // else if (!nama.isEmpty() && pekerjaan.equalsIgnoreCase("desainer")) {
    //     System.out.print("Halo! " + nama + " Anda Menantu yg Baik");
    // }

    // else {
    //     System.out.print("Maaf Anda Tidak Diterima");
    // }

    // input.close();
    
    System.out.print("Nama : ");
    String nama = input.nextLine();

    if (nama.isEmpty()) {
        System.out.print("Mohon Masukkan Nama : ");
        System.exit(0);
    }

    System.out.print("Pekerjaan : ");
    String pekerjaan = input.nextLine();

    if (pekerjaan.equalsIgnoreCase("programmer")) {
        System.out.print("ok");
    }

    else if (pekerjaan.equalsIgnoreCase("desainer")) {
        System.out.print("ok");
    }

    else {
        System.out.print("Anda tdk diterima");
    }

    input.close();
   }
}
