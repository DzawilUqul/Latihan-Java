package javaapplication2;

public class cIF_Tunggal {
    public static void main(String[] args) {
            int nilai = 71;
            String jurusan = "Informatika";

            if (jurusan.equalsIgnoreCase("informatika") && nilai == 71) {  //----> IgnoreCase mengabaikan besar kecil (kapital) huruf
                System.out.println ("Nice");

            }
            else {
                System.out.println("Not Good");
            }
    }
    
}
