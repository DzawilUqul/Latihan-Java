package javaapplication2;

public class DoWhile {
    public static void main(String[] args) {
        int batas = 9;
        int nilaiAwal = 1;

        do {
            System.out.println(nilaiAwal);
            nilaiAwal++;
        }while(nilaiAwal <= batas);
    }
}
