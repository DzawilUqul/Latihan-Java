package pIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class latihan {
    public static void main(String[] args) throws IOException {
        // for(int i = 1; i <=25; i++){
        //     System.out.println(i + ".");
        // }

        Random ran = new Random();

        for(int j =0 ; j <=100; j++){
            int num = 10+ ran.nextInt(90);
            
            System.out.print(num);
            int num1 = 10+ ran.nextInt(90);

            System.out.print(" + " + num1 + " = ");
            int numTotal = num + num1;

            try
                {
                    Thread.sleep(10000);
                }
            catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }

                System.out.print(numTotal);
                System.out.println();
        }
        
    }
}