package javaapplication2;

public class cMeth_Func {
    public static void main(String[] args) {
        ucapan("Dzawil Uqul");

        System.out.println(perkalian(7, 8));
    }

    // Procedure
        // Sebuah function yg tidak mengembalikan nilai

        public static void ucapan(String nama){
            System.out.println("Selamat Malam " + nama);
        }

    // Function
        // Sebuah function yg dapat mengembalikan nilai

        public static int perkalian(int a,int b){
            return a * b;
        }
    
    // Method
        // Method adalah function yang berada di dalam Class

}
