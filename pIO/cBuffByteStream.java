package pIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class cBuffByteStream {
    public static void main(String[] args) throws IOException{
        FileInputStream fileInput = new 
        FileInputStream("D:\\EternityBee\\coding\\Latihan Java\\pIO\\input.txt");

        // Tampung kedalam buffered
        BufferedInputStream buffInput = new BufferedInputStream(fileInput);

        // Tampilkan console
        byte[] isiFile = buffInput.readAllBytes();
        String byteString = new String(isiFile);                //===》Mengubah byte menjadi String
        System.out.print(byteString);
        
        byte[] isiFile2 = buffInput.readAllBytes();
        System.out.println(Arrays.toString(isiFile));           //===》 Hasil berupa byte

        // Koneksi antara file aplikasi dengan file Output
        FileOutputStream fileOutput = new
        FileOutputStream("D:\\EternityBee\\coding\\Latihan Java\\pIO\\output.txt");

        // Tampung kedalam buffered output stream
        BufferedOutputStream buffOutput = new BufferedOutputStream(fileOutput);

        // Simpan kedalam memori
        buffOutput.write(isiFile);
        buffOutput.flush();

        fileInput.close();
        buffOutput.close();
    }
}
