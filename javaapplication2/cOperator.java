package javaapplication2;

public class cOperator {
    
    public static void main(String[] args) {

     //  Operator Java

        //  1. Penegasan =
                //  int bilangan = 1;

        //  2. Aritmatika  +  -  /  %  ++  --  +=  -=
                int bil1 = 12;
                // int bil2 = 5;
                // int hasil = --bil1*--bil2;

                bil1++;
                bil1++;
                bil1 += 5;

                // int bil1 = 12,
                // bil2 = 5,                    //---> int bisa ditulis seperti ini
                // hasil = bil1 % bil2;

        //  3. Pembanding   <   >   <=  >=  ==  !=
                // int bil1 = 12,
                // bil2 == 5;                   //---> menghasilkan true/false (boolean)
                // boolean hasil = bil1 > bil2;

        //  4. Logika &&    ||  !
                // int totalBayar = 150000;
                // boolean shopingCard = false;
                // boolean hasil = totalBayar >= 100000 || shopingCard == true;
                // hasil = !hasil; //negasi true

        System.out.println(bil1);
    }
}
