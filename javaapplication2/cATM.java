package javaapplication2;

import java.util.Scanner;

public class cATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short batasTransaksi = 5;

        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.println(nama);

        System.out.print("Masukkan Saldo : ");
        int saldo = input.nextInt();

        while(batasTransaksi > 0 ){
            int saldoSekarang = saldo;
            System.out.print("MENU\n"
            + "1. Penarikan Uang\n"
            + "2. Menabung\n"
            + "Pilih [1/2] : ");
            
            String menu = input.next();
            if(menu.equalsIgnoreCase("1")){
                System.out.print("Anda akan melakukann penarikan\n"
                + "Saldo anda sekarang adalah Rp " + saldoSekarang 
                + "\nMasukkan Jumlah Penarikan : ");
                int penarikan = input.nextInt();

                if(saldo - penarikan < 5000){
                    System.out.print("Sisa saldo harus minimal Rp.5000");
                }else if(penarikan < 2000){
                    System.out.print("Penarikan harus minimal Rp.2000");
                }else{
                    saldo = saldo - penarikan;
                    System.out.print("Saldo awal anda adalah Rp." +
                    saldoSekarang + "\nAnda melakukan penarikan sebesar Rp." +
                    penarikan + "\nSisa saldo anda masih Rp." + saldo);
                }

            }else if(menu.equalsIgnoreCase("2")){
                System.out.print("Anda akan melakukan penabungan\n"
                + "Saldo anda adalah Rp." + saldoSekarang + "\nMasukkan jumlah tabungan : ");
                    int penambahan = input.nextInt();
                    if(penambahan < 2000){
                        System.out.println("Sisa saldo harus minimal 2000");
                    }else{
                        saldo = saldo + penambahan; 
                        System.out.println("Sisa saldo anda adalah Rp. " + saldo +
                        "\nSisa transaksi anda masih " + (batasTransaksi-1) + " kali.");
                    }






            }else {
                System.out.print("Maaf menu transaksi yg anda pilih tidak ada");
            }

            System.out.println("\nApakah anda ingin melakukan transaksi lagi ? [y/n]");
            String pilihan = input.next();
            if(pilihan.equalsIgnoreCase("y")){
                System.out.println("Sisa transaksi anda masih : " + (batasTransaksi-1) + " kali");
                batasTransaksi--;
            }else if(pilihan.equalsIgnoreCase("n")){
                System.out.println("Terimakasih telah melakukan transaksi");
                batasTransaksi = 0;
            }else{
                System.out.println("Pilihan tidak ada");
                batasTransaksi=0;
            }
        }

        input.close();
    }
}
