package javaapplication2;

public class cPolaPerulangan {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int batas = 5;
        

        // // while(y <= batas){
        // //     int spasi = y;
        // //     while(spasi>1){
        // //         spasi--;
        // //         System.out.print(" ");
        // //     }

        // //     while(x <= batas){
        // //         System.out.print(x);
        // //         x++;
        // //     }

        // //     int spasi_1 = y;
        // //     while(spasi_1 < batas){
        // //         spasi_1++;
        // //         System.out.print(" ");
        // //     }

        // //     int spasi_2 = y;
        // //     while(spasi_2 < batas){
        // //         spasi_2++;
        // //         System.out.print(" ");
        // //     }

        // //     x=1;
        // //     while(x <= batas){
        // //         System.out.print(x);
        // //         x++;
        // //     }

        // //     System.out.println();
        // //     x = 1;
        // //     y++;
        // // }


        // // System.out.println();
        // // y=1;

        // // while(y < batas){
        // //     int spasi = y;
        // //     while(spasi < batas-1){
        // //         System.out.print(" ");
        // //         spasi++;
        // //     }
        // //     while(x <= batas) {
        // //         System.out.print(x);
        // //         x++;
        // //     }

        // //     int spasi_3 = y;
        // //     while(spasi_3 > 1){
        // //         spasi_3--;
        // //         System.out.print(" ");
        // //     }

        // //     int spasi_4 = y;
        // //     while(spasi_4 >= 1){
        // //         spasi_4--;
        // //         System.out.print(" ");
        // //     }

        // //     x=1;
        // //     while(x <= batas){
        // //         System.out.print(x);
        // //         x++;
        // //     }

        // //     System.out.println();
        // //     x = 1;
        // //     y++;
        // // }

        // System.out.println();
        // y = batas;
        // while(y>=1){                        //---> 12345 1234 123 12 1
        //     while(x<=y){
        //         System.out.print(x);
        //         x++;
        //     }

        //     int spasi_11 = y;
        //     while(spasi_11 <= batas){
        //         System.out.print(" ");
        //         spasi_11++;
        //     }

        //     int spasi_12= y;
        //     while(spasi_12 <= batas){
        //         System.out.print(" ");
        //         spasi_12++;
        //     }

        //     x=y;
        //     while(x>=1){
        //         System.out.print(x);
        //         x--;
        //     }

        //     System.out.println();
        //     y--;
        //     x=1;
        // }





        // while(x<=y){
        //     System.out.print(x);
        //     x++;
        // }

        // // y = 1;
        // while(y<=batas){                //---> 1 12 123 1234 12345
        //     while(x<=y){
        //         System.out.print(x);
        //         x++;
        //     }

        //     int spasi_11 = y;
        //     while(spasi_11 <= batas){
        //         System.out.print(" ");
        //         spasi_11++;
        //     }

        //     int spasi_12= y;
        //     while(spasi_12 <= batas){
        //         System.out.print(" ");
        //         spasi_12++;
        //     }

        //     x=y;
        //     while(x>=1){
        //         System.out.print(x);
        //         x--;
        //     }

        //     System.out.println();
        //     y++;
        //     x=1;
        // }
        
        y=batas;
        while(y>=1){                            //---> atas kiri
            int spasi_21 = y;
            while(spasi_21 >= 1){
                System.out.print(" ");
                spasi_21--;
            }

            x=y;
            while(x <= batas){
                System.out.print(x);
                x++;
            }

            System.out.print(" ");
            x=y;                                //---> atas kanan
            while(x <= batas){
                System.out.print(x);
                x++;
            }

            System.out.println();
            x=1;
            y--;
        }

        y=1;                                  //---> bawah kiri
        while(y<=batas){

            int spasi_21 = y;
            while(spasi_21 >= 1){
                System.out.print(" ");
                spasi_21--;
            }
            
            x=y;
            while(x<=batas){
                System.out.print(x);
                x++;
            }

            System.out.print(" ");
            x=y;                              //---> bawah kanan
            while(x<=batas){
                System.out.print(x);
                x++;
            }

            System.out.println();
            y++;
            x=1;
        }
    }   
}