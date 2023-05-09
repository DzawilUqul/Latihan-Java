package pIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class cStringTokenizer {
    public static void main(String[] args) throws IOException {
        // Import File input.txt
        FileReader fileInput = new
        FileReader("D:\\EternityBee\\coding\\Latihan Java\\pIO\\input.txt");

        BufferedReader buffInput = new BufferedReader(fileInput);
        buffInput.mark(400);
        Scanner inputScanner = new Scanner(buffInput);
        

        // System.out.println(inputScanner.hasNext());          //====》 true
        // System.out.println(inputScanner.next());
        // System.out.println(inputScanner.next());
        // System.out.println(inputScanner.next());
        // System.out.println(inputScanner.next());
        // System.out.println(inputScanner.hasNext());          //===》 false

        inputScanner.useDelimiter(",");

        // while(inputScanner.hasNext() == true){                  //===》== true bisa dihilangkan
        //     System.out.println(inputScanner.next());
        // }

        // String tokenizer
        // Baris 1
        String baris = buffInput.readLine();
        StringTokenizer stringToken = new StringTokenizer(baris, ",");     //===》argumen ke 2 berisi delimiter koma
        while(stringToken.hasMoreTokens() == true){                         //===》 == true bisa dihilangkan
            System.out.println(stringToken.nextToken());
        }

        // baris 2
        baris = buffInput.readLine();
        stringToken = new StringTokenizer(baris, ",");                       //===》argumen ke 2 berisi delimiter koma
        while(stringToken.hasMoreTokens() == true){                         //===》 == true bisa dihilangkan
            System.out.println(stringToken.nextToken());
        }

        buffInput.reset();

        inputScanner.close();
        fileInput.close();
        buffInput.close();
    }
}
