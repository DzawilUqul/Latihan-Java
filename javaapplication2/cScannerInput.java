package javaapplication2;
                                                    
    import java.util.Scanner;                       //--->import java.util

public class cScannerInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     //---> "input" adalah nama ruangan
       
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();             //---> next hanya untuk satu kata

        System.out.print("Masukkan Nilai : ");
        int nilai = input.nextInt();

        System.out.println("Selamat Datang : " + nama);

        System.out.println("Nilai yg ada di variabel adalah : " + nilai);

        input.close();
    }
}
