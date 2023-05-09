package pIO;

import java.io.FileInputStream;
import java.io.IOException;

public class cThrows {
    public static void main(String[] args) throws IOException {
        int[] bilangan = {5,4,3,2,1};

        System.out.println(bilangan[5]);

        FileInputStream fileKu = new FileInputStream("biodata.txt");
        System.out.println("akhir code");

        fileKu.close();
    }
}
