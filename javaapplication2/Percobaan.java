package javaapplication2;

public class Percobaan {
    public static void main(String[] args) {
        int batas = 5;
        
        int y = batas;
        while(y <= 1){
            for(int j = y; j <= 5; j++){
                System.out.print(j + " ");
            }
            y--;
        }
    }
}
