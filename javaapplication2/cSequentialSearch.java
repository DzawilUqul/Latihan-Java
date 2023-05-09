package javaapplication2;

public class cSequentialSearch {
    public static void main(String[] args) {
        String[] nama = {"adi", "badi", "cadi", "dadi", "eadi"};
        sequentialSearch(nama, "cadi");
    }

    public static void sequentialSearch(String[] data, String keyword){
        boolean status = false;
        for(int i = 0; i < data.length; i++){
            if(keyword.equalsIgnoreCase(data[i])){
                System.out.println(keyword + "ditemukan pada posisi ke-" + (i+1) 
                + " dan pada index ke-" + i);
                status = true;
                break;
            }
        }

        if(status == false){
            System.out.println(keyword + " tidak ditemukan");
        }
    }
}
