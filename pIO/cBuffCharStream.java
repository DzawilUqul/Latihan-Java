package pIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class cBuffCharStream {
    public static void main(String[] args) throws IOException {
        FileReader fileInput = new 
        FileReader("D:\\EternityBee\\coding\\Latihan Java\\pIO\\input.txt");

        BufferedReader buffInput = new 
        BufferedReader(fileInput);

        // Mark
        buffInput.mark(300);

        // Buktikan kalau buffered character fokus ke karakter
        char[] isiChar = new char[5];
        buffInput.read(isiChar,0,isiChar.length);

        // Tampilkan array isiChar
        System.out.println(Arrays.toString(isiChar));

    buffInput.reset();

        // Tampilkan perbaris
        System.out.println(buffInput.readLine());
        System.out.println(buffInput.readLine());

        
        
        // Koneksi dari fileOutput ke output.txt
        FileWriter fileOutput = new 
        FileWriter("D:\\EternityBee\\coding\\Latihan Java\\pIO\\output.txt");
        BufferedWriter buffOutput = new BufferedWriter(fileOutput);
        
        buffInput.reset();

        // Tulis ke file output.txt
        String baris1 = buffInput.readLine();
        buffOutput.write(baris1, 0, baris1.length());
        buffOutput.flush();

        buffOutput.newLine();

        String baris2 = buffInput.readLine();
        buffOutput.write(baris2, 0, baris2.length());
        buffOutput.flush();

        buffOutput.close();
        fileInput.close();
    }
}
