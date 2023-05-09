package pIO;
import java.util.Scanner;

public class cMusicProject {
    public static void main(String[] args){
        String[] Rock = {"Coldplay", "Imagine Dragons", "One Republic", "The Script", "The Changcuters"};
            String[] Coldplay = {"Parachutes", "Mylo Xyloto", "A Head Full of Dreams", "Ghost Story","Kaleidoscope EP"};
            String[] ImagineDragons = {"Mercury - Act 1", "Origins", "Evolve", "Night Vision", "Smoke + Mirrros", };
            String[] oneRepublic = {"Human", "Oh My My", "Native", "Waking Up"};
            String[] theScript = {"The Script", "Science & Faith", "#3", "No Sound Without Silence", "Freedom Child", "Sunsets And Moons", "Acoustic Sessions", "Acoustic Sessions 2"};

        String[] Pop = {"Aurora", "Ed Sheeran"};
            String[] aurora = {"Live Japan", "Unreleased Song", "Live Single", "Nidaros Domen", "Aurora HAIK Consert", "Bergen Orcestra", "Music For The Free Spirit"};
            String[] edSheeran = {"=", "+", "No.6", "x","Songs I Wrote With Amy", "Loose Change"};

        String[] Lawas = {"Queen", "Air supply"};
            String[] queen = {"Greatest Hits"};
            String[] airSupply = {"The Vanishing Race", "The Earth Is...", "Greatest Hits"};
        
            String[] RapHipHop = {"Rich Bryan","Post Malone"}; 

        System.out.println("=== Welcome to ||What Should I Hear Today|| Program ===");
        Scanner scan = new Scanner(System.in);
        System.out.println("Here is the option  " +
                            "\n 1. Rock" +
                            "\n 2. Pop" +
                            "\n 3. Old" +
                            "\n 4. Rap/Hip-Hop" );

        System.out.print("Type Your Option : ");
        String option = scan.nextLine();

        int index = 0;
        while(index != 1){
            if(option.equalsIgnoreCase("1")){
                System.out.println();
                for(int i =0; i < Rock.length; i++){
                    System.out.println(">" + Rock[i]);
                }

                System.out.print("\nSelect The Singer/Band : ");
                String option2 = scan.nextLine();
                if(option2.equalsIgnoreCase("coldplay")){
                    System.out.println("\n=== Enjoy your music ====");
                    for(String bil : Coldplay){
                        System.out.println(bil);
                    }
                    index++;

                }else if(option2.equalsIgnoreCase("Imagine Dragons")){
                    System.out.println("\n=== Enjoy your music ====");
                    for(String bil : ImagineDragons){
                        System.out.println(bil);
                    }
                    index++;

                }else if(option2.equalsIgnoreCase("One Republic")){
                    System.out.println("\n=== Enjoy your music ====");
                    for(String bil : oneRepublic){
                        System.out.println(bil);
                    }
                    index++;
                }else if(option2.equalsIgnoreCase("The Script")){
                    System.out.println("\n=== Enjoy your music ====");
                    for(String bil : theScript){
                        System.out.println(bil);
                    }
                    index++;
                }else if(option2.equalsIgnoreCase("The changcuters")){
                    System.out.println("\n=== Enjoy your music ====");
                    System.out.println("Playlist Is On Youtube");
                    index++;
                }else{
                    System.out.println("Please enter the band name");
                }
//===================================================================================================================================================
            }else if(option.equalsIgnoreCase("2")){
                System.out.println();
                for(int i =0; i < Pop.length; i++){
                    System.out.println(">" + Pop[i]);
                }

                System.out.print("\nSelect The Singer/Band : ");
                String option2 = scan.nextLine();
                if(option2.equalsIgnoreCase("aurora")){
                    System.out.println("\n=== Enjoy your music ====");
                    for(String bil : aurora){
                        System.out.println(bil);
                    }
                    index++;

                }else if(option2.equalsIgnoreCase("ed sheeran")){
                    System.out.println("\n=== Enjoy your music ====");
                    for(String bil : edSheeran){
                        System.out.println(bil);
                    }
                    index++;

                }else{
                    System.out.println("Please enter the band name");
                }
//==================================================================================================================================================
            }else if(option.equalsIgnoreCase("3")){
                System.out.println();
                for(int i =0; i < Lawas.length; i++){
                    System.out.println(">" + Lawas[i]);
                }

                System.out.print("\nSelect The Singer/Band : ");
                String option2 = scan.nextLine();
                if(option2.equalsIgnoreCase("Queen")){
                    System.out.println("\n=== Enjoy your music ====");
                    for(String bil : queen){
                        System.out.println(bil);
                    }
                    index++;

                }else if(option2.equalsIgnoreCase("air supply")){
                    System.out.println("\n=== Enjoy your music ====");
                    for(String bil : airSupply){
                        System.out.println(bil);
                    }
                    index++;
                }else{
                    System.out.println("Please enter the band name");
                }
//==================================================================================================================================================
            }else if(option.equalsIgnoreCase("4")){
                System.out.println();
                for(int i =0; i < RapHipHop.length; i++){
                    System.out.println(">" + RapHipHop[i]);
                }

                System.out.print("\nSelect The Singer/Band : ");
                String option2 = scan.nextLine();
                if(option2.equalsIgnoreCase("rich bryan")){
                    System.out.println("\n=== Enjoy your music ====");
                    System.out.println("Playlist Is On YT Music");
                    index++;

                }else if(option2.equalsIgnoreCase("Post Malone")){
                    System.out.println("\n=== Enjoy your music ====");
                    System.out.println("Playlist Is On YT Music");
                    index++;
                }else{
                    System.out.println("Please enter the band name");
                }
//===================================================================================================================================================
            }else{
                System.out.print("Please type [1/2/3/4] : ");
                option = scan.nextLine();
            }
        }// Akhir While   

        scan.close();
    }
}

