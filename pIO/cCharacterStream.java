package pIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class cCharacterStream {
    public static void main(String[] args) throws IOException {

        // char File
        FileReader inputKu = new 
            FileReader("D:\\EternityBee\\coding\\Latihan Java\\pIO\\input.txt");
        FileWriter outputKu = new
            FileWriter("D:\\EternityBee\\coding\\Latihan Java\\pIO\\output.txt");

        // byte File
        FileInputStream inputByte = new
            FileInputStream("D:\\EternityBee\\coding\\Latihan Java\\pIO\\input.txt");
        FileOutputStream outputByte = new
            FileOutputStream("D:\\EternityBee\\coding\\Latihan Java\\pIO\\output.txt");

        int buffer = inputKu.read();
        while(buffer != -1){
            // System.out.print((char)buffer);
            outputKu.write(buffer);
            buffer = inputKu.read();
        }
       
        
        // System.out.println((char)inputByte.read()) ;
        // System.out.println((char)inputKu.read()) ;
        // System.out.println((char)inputByte.read()) ;
        // System.out.println((char)inputKu.read()) ;
        // System.out.println((char)inputByte.read()) ;
        
        outputByte.close();
        outputKu.close();
        inputByte.close();
        inputKu.close();
        
    }
}
