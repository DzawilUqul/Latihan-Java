package javaapplication2;
public class cMergeSort {
    public static void main(String[] args) {
            int[] nilai = {66, 43, 90, 76, 87, 21};
            mergeSortInt(nilai);
            }

    public static void mergeSortInt (int bilangan[]){
        // Tampilkan Sebelum
                System.out.println("===SEBELUM===");
                for(int bil : bilangan){
                    System.out.print(bil + " ");
                }
        
                bilangan = pisahInt(bilangan);

        // Tampilkan Sesudah
                System.out.println("\n\n===SESUDAH===");
                for(int bil : bilangan){
                    System.out.print(bil + " ");
                }
    }

    // Function pisahInt
    public static int[] pisahInt(int[] angka){
        // Kalo datanya sudah menjadi satuan
        if (angka.length <= 1){
            // Langsung kembalikan array
            return angka;
        }
        
        int nilaiTengah = angka.length / 2;
        int[] kiri = new int[nilaiTengah];
        int[] kanan;
    
        // Cek apakah data array ganjil atau genap
        if(angka.length % 2 == 0) {
            // Kalau genap
            kanan = new int[nilaiTengah];
        }else{
            // Kalau ganjil
            kanan = new int[nilaiTengah + 1];
        }

        // Isi array sisi kiri
        for(int i=0; i < kiri.length;i++){
            kiri[i] = angka[i];
        }

        // Isi array sisi kanan
        for(int i = 0; i < kanan.length; i++){
            kanan[i] = angka[nilaiTengah + i];
        }

        // Lakukan pemanggilan fungsi ini untuk memisahkan sisi kanan dan sisi kiri lagi
        kiri = pisahInt(kiri);
        kanan = pisahInt(kanan);

        // Siapan array untuk menampung pengembalian array dari fungsi gabung
        int hasil[] = new int[angka.length];
        
        
        // Isi array hasil dari data yang sudah digabung
        hasil = gabungInt(kiri, kanan);

        // Kembalikan array hasil 
        return hasil;

        
    }
    

    // Function gabungInt
    public static int[] gabungInt(int[] kiri, int[] kanan){
        // Siapin array kosong yang nantinya akan diisi data dari sisi kiri dan kanan yang sudah diurutkan
        int[] hasilGabung = new int[kiri.length + kanan.length];
        // Siapin penanda index kiri, index kanan, dan index hasil gabung
        int indexKiri = 0, indexKanan = 0, indexHasilGabung = 0;

        // Perulangan untuk mengisi array hasilGabung
        while(indexKiri < kiri.length || indexKanan < kanan.length){
            // Cek apakah sisi kiri dan kanan masih ada / belum dibandingkan
            if(indexKiri < kiri.length && indexKanan < kanan.length){
                if(kiri[indexKiri] < kanan[indexKanan]){
                    hasilGabung[indexHasilGabung] = kiri[indexKiri];
                    indexHasilGabung++;
                    indexKiri++;
                }else{
                    hasilGabung[indexHasilGabung] = kanan[indexKanan];
                    indexHasilGabung++;
                    indexKanan++;
                }


            }else if(indexKiri < kiri.length){
            // Kalau hanya sisi kiri saja yang masih tersedia
                    hasilGabung[indexHasilGabung] = kiri[indexKiri];
                    indexHasilGabung++;
                    indexKiri++;

            }else if(indexKanan < kanan.length){
                // Kalau hanya tersisa sisi kanan yang masih tersedia 
                    hasilGabung[indexHasilGabung] = kanan[indexKanan];
                    indexHasilGabung++;
                    indexKanan++;
            }

            // System.out.println();
            //         for(int bil : hasilGabung){
            //         System.out.println(bil + "...");
            //     }
        }// akhir while

        // Kembalikan nilai array gabung
        return hasilGabung;
    }
}
