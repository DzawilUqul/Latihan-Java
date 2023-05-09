package javaapplication2;

public class cCasting {
    public static void main(String[] args) {
        // float a = 5 , b = 2;     //---> Data menjadi Float
        // float hasil = a/b;   

        int a = 5 , b = 2;          //---> Data tetap integer (Hasil Casting)
        float hasil = (float)a/b;   //---> atau float hasil = (float)a / (float)b;

        // int a = 5 , b= 2;
        // float hasil = 5f / 2;          //---> Hanya berlaku pada angka

        System.out.println(hasil);
    }
}
