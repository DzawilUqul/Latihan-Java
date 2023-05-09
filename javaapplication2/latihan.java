package javaapplication2;

public class latihan {
    public static void main(String[] args) {
        int batas = 5;
        int x = 1;
        int y = 1;

        // for(int i = y; i <= batas ; i++){
        //     System.out.println();

        //     for(int j = x; j <= i; j++){
        //         System.out.print(j + " ");
        //     }

        //     for(int j = i; j<batas; j++){
        //         System.out.print("..");
        //     }
        // }

        /////////////////////////////////////////////////////////

        for(int i = y; i <= batas ; i ++){
            System.out.println();

            for(int j = x; j<=i; j++){
                System.out.print(j + " ");
            }

            for(int j = i; j < batas; j++){
                System.out.print("..");
            }

            for(int j = i; j < batas; j++){
                System.out.print("..");
            }

            for(int j = i; j >= 1; j--){
                System.out.print(j +" ");
            }

            for(int j = x; j<=i; j++){
                System.out.print(j + " ");
            }

            for(int j = i; j < batas; j++){
                System.out.print("..");
            }

            for(int j = i; j < batas; j++){
                System.out.print("..");
            }

            for(int j = i; j >= 1; j--){
                System.out.print(j +" ");
            }
        }


        for(int i = y; i <= batas ; i ++){
            System.out.println();

            for(int j = i; j > 1; j--){
                System.out.print("..");
            }
            
            for(int j = i; j <= batas; j++){
                System.out.print(j + " ");
            }
            

            for(int j = batas; j>=i; j--){
                System.out.print(j + " ");
            }

            for(int j = i; j > 1; j--){
                System.out.print("..");
            }

            for(int j = i; j > 1; j--){
                System.out.print("..");
            }
            
            for(int j = i; j <= batas; j++){
                System.out.print(j + " ");
            }
            

            for(int j = batas; j>=i; j--){
                System.out.print(j + " ");
            }

            for(int j = i; j > 1; j--){
                System.out.print("..");
            }
        }

        // ------------------------------------------

        for(int i = batas; i >= 1; i--){
            System.out.println();
            for(int j = i; j > 1 ; j--){
                System.out.print("..");
            }

            for(int j = i; j <= 5 ; j++){
                System.out.print(j + " ");
            }

            
            for(int j = batas; j >= i; j--){
                System.out.print(j+ " ");
            }

            for(int j = i; j > 1 ; j--){
                System.out.print("..");
            }

            
            for(int j = i; j > 1 ; j--){
                System.out.print("..");
            }

            for(int j = i; j <= 5 ; j++){
                System.out.print(j + " ");
            }

            
            for(int j = batas; j >= i; j--){
                System.out.print(j+ " ");
            }

            for(int j = i; j > 1 ; j--){
                System.out.print("..");
            }
        }
        //----------------------------------------------

        for(int i = batas; i >= 1; i--){
            System.out.println();

            for(int j = x; j <= i ; j++){
                System.out.print(j + " ");
            }


            for(int j = batas; j > i; j--){
                System.out.print("..");
            }

            for(int j = batas; j > i; j--){
                System.out.print("..");
            }

            for(int j = i; j >= 1; j--){
                System.out.print(j + " ");
            }

            for(int j = x; j <= i ; j++){
                System.out.print(j + " ");
            }


            for(int j = batas; j > i; j--){
                System.out.print("..");
            }

            for(int j = batas; j > i; j--){
                System.out.print("..");
            }

            for(int j = i; j >= 1; j--){
                System.out.print(j + " ");
            }
        }
    }
}