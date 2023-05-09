package javaapplication2;

import java.util.Scanner;

public class cSwitchCase {
    
    public static void main(String[] args) {

        short Jumlah;                                       //---> Declare scanner untuk menghindari error duplicate
        int Harga;
        String Pilihan;
        
        Scanner input = new Scanner(System.in);

        System.out.print("==Menu Makanan==\n"
                + "Nasi Goreng : 12.000\n"
                + "Nasi Ayam : 13.000\n"
                + "Nasi Ikan : 14.000\n"
                + "Masukkan Pilihan Anda [1/2/3] : ");
        Pilihan = input.next();

            switch(Pilihan) {
                case "1" :
                    System.out.print("Masukkan Jumlah Pesanan Anda : ");
                    Jumlah = input.nextShort();
                    Harga = Jumlah * 12000;
    
                    System.out.print("Total Pembelian Anda Adalah = " + Harga);
    
                        break;
    
                 case "2" :
                    System.out.print("Masukkan Jumlah Pesanan Anda : ");
                    Jumlah = input.nextShort();
                    Harga = Jumlah * 13000;
    
                    System.out.print("Total Pembelian Anda Adalah = " + Harga);
    
                        break;
    
                 case "3" :
                    System.out.print("Masukkan Jumlah Pesanan Anda : ");
                    Jumlah = input.nextShort();
                    Harga = Jumlah * 14000;
    
                    System.out.print("Total Pembelian Anda Adalah = " + Harga);
    
                        break;
    
                    default :
                        System.out.print("Mohon Masukkan Pilihan 1/2/3 = ");
                        Pilihan = input.next();
                    
            }                                                                   //---> default tidak perlu diberi break
        input.close();
        }
    }
