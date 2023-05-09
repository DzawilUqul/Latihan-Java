package pIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class cByteStream {
    public static void main(String[] args) throws IOException{
        
        FileInputStream inputKu = new 
        FileInputStream("D:\\EternityBee\\coding\\Latihan Java\\pIO\\input.txt");
        
        // System.out.println((char)inputKu.read());                   //===》Setelah akhir dari text maka akan tertulis -1
        // System.out.println((char)inputKu.read());
        // System.out.println(inputKu.read());
        // System.out.println(inputKu.read());
        // System.out.println(inputKu.read());
       
        
        // System.out.print(inputKu.available());                  //===》 Hasil berupa angka
        
        // 1. READ FILE
                // int huruf = inputKu.read();
                // while (huruf != -1){
                //     System.out.print((char) huruf);
                //     huruf = inputKu.read();
                // }

        // 2. WRITE FILE
                FileOutputStream outputKu = new 
                FileOutputStream("D:\\EternityBee\\coding\\Latihan Java\\pIO\\output.txt");
                
                // System.out.print("Kalimat yang ter write adalah : ");
                // int huruf = inputKu.read();
                // while (huruf != -1){
                //     System.out.print((char) huruf);
                //     huruf = inputKu.read();
                // }
                
                // int hurufKu = inputKu.read();                              //===》 Isi kalimat output berasal dari input
                // while (hurufKu != -1){
                //     outputKu.write(hurufKu);
                //     hurufKu = inputKu.read();
                // }

                


                Scanner inputConsole = new Scanner(System.in);               //===》 Isi kalimat akan me-rewrite output.txt
                System.out.print("Masukkan kalimat anda : ");
                String kalimat = inputConsole.nextLine(); 

                int hurufAnda = kalimat.charAt(0);
                int pangjangHuruf = kalimat.length();
                int index = 0;

                while(index < pangjangHuruf){
                    outputKu.write(hurufAnda);

                    if(index == pangjangHuruf-1){
                        break;
                    }else{
                        index++;
                        hurufAnda = kalimat.charAt(index);
                    }
                }

                System.out.println(kalimat);

        inputConsole.close();
        outputKu.close();
        inputKu.close();
    }
}
