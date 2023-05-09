package javaapplication2;

import java.util.Scanner;

public class cPoldaarray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Masukkan Jumlah Baris : ");
        int baris = input.nextInt();
        System.out.print("Masukkan Jumlah Kolom : ");
        int kolom = input.nextInt();

        int[][] barisan = new int [baris][kolom];

        // Program 1

        for (int iBaris = 0; iBaris< baris; iBaris++){
            for(int iKolom = 0; iKolom < kolom; iKolom ++){
                if(baris % 2 ==0){
                    if(iBaris % 2 == 0){
                        barisan[iBaris][iKolom] = 0;
                    }else{
                        barisan[iBaris][iKolom] = 1;
                    }
                }else{
                    if(iBaris % 2 == 0){
                        barisan[iBaris][iKolom] = 1;
                    }else{
                        barisan[iBaris][iKolom] = 0;
                    }       
                }
            }
        }

        // Tampilkan Program 1
        for(int iBaris = 0; iBaris < baris; iBaris++){
            for(int iKolom = 0; iKolom < kolom; iKolom++){
                System.out.print(barisan[iBaris][iKolom] + " ");
            }
            System.out.println();
        }

        // Program 2 
        for(int iBaris = 0; iBaris < baris; iBaris++){
            for(int iKolom = 0; iKolom < kolom; iKolom++){
                if(iBaris == 0 || iBaris == baris - 1){
                    barisan[iBaris][iKolom] = 1;
                }else{
                    if(iKolom == 0 || iKolom == kolom -1){
                        barisan[iBaris][iKolom] = 1;
                    }else{
                        barisan[iBaris][iKolom] = 0;
                    }
                }
            }
        }

        System.out.println("\n");

        // Tampilkan Program 2
        for(int iBaris = 0; iBaris < baris; iBaris++){
            for(int iKolom = 0; iKolom < kolom; iKolom++){
                System.out.print(barisan[iBaris][iKolom] + " ");
            }
            System.out.println();
        }

        System.out.println("\n---------------------------------");
        System.out.println();

        for(int iBaris = 0; iBaris < baris; iBaris++){
            for(int iKolom = 0; iKolom < kolom; iKolom++){
                if(baris % 2 == 0){
                    if(iBaris % 2 == 0){
                        barisan[iBaris][iKolom] = 0;
                    }else{
                        barisan[iBaris][iKolom] = 3;
                    }
                }else{
                    if(iBaris % 2 == 0){
                        barisan[iBaris][iKolom] = 3;
                    }else{
                        barisan[iBaris][iKolom] = 0;
                    }
                }
            }
        }

        for(int ibaris = 0; ibaris < baris; ibaris++){
            for(int iKolom = 0; iKolom < kolom; iKolom++){
                System.out.print(barisan[ibaris][iKolom] + " ");
            }
            System.out.println();
        }

        System.out.println("\n");

        for(int iBaris = 0; iBaris < baris ; iBaris++){
            for(int iKolom = 0; iKolom < kolom; iKolom++){
                if(iBaris == 0 || iBaris == baris -1 ){
                    barisan[iBaris][iKolom] = 1;
                }else{
                    if(iKolom == 0 || iKolom == kolom -1){
                        barisan[iBaris][iKolom] = 1;
                    }else{
                        barisan[iBaris][iKolom] = 0;
                    }
                }
            }
        }

        for(int iBaris = 0; iBaris < baris; iBaris++){
            for(int iKolom = 0; iKolom < kolom; iKolom++){
                System.out.print(barisan[iBaris][iKolom] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
