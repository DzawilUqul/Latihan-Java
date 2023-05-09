package javaapplication2;

public class cBinarySearch {
    public static void main(String[] args) {
        int[] bilangan = {5,6,7,8,9,10};
        binarySearch(bilangan, 7);

        String[] nama = {"adi", "badi", "cadi", "dadi", "eadi"};
        binarySearchString(nama, "Adi");
    }

    public static void binarySearch(int[] angka, int key){
        int low = 0, high = angka.length-1, med;
        boolean status = false;

        while(low <= high){
            med = (low + high) / 2; 

            if(key == angka[med]){
                System.out.println(key + " ditemukan pada posisi ke-" + (med+1) 
                    + " dan ada pada index ke-" + med);
                status = true;
                break;
            }else{
                if( key > angka[med]){
                    low = med + 1;
                }else{
                    high = med -1;
                }
            }
        }// Akhir while

        if(status == false){
            System.out.println(key + " tidak ditemukan dalam array");
        }
    }

    public static void binarySearchString(String[] kata, String key) {
        int low = 0, high = kata.length-1, med;
        boolean status = false;
        while(low <= high){
            med = (low + high) / 2;

            if(key.equalsIgnoreCase(kata[med])){
                System.out.println(key + " ditemukan pada posisi ke-" + (med+1) 
                    + " dan ada pada index ke-" + med);
                status = true;
                break;
            }else{
                if( key.compareToIgnoreCase(kata[med]) > 0){
                    low = med + 1;
                }else{
                    high = med -1;
                }
            }
        }

        if(status == false){
            System.out.println(key + " tidak ditemukan dalam array");
        }
    }
}
