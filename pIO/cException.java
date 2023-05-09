package pIO;

public class cException {
    public static void main(String[] args) {
        int[] bilangan = {4,3,2,1,};

        try {
            System.out.println(bilangan[5]);
        }catch(Exception pesan){                    //---> catch bisa ditambah berkali kali
            System.err.println(pesan);
        } finally {
            System.out.println("Ini adalah finally");   //---> finally akan tetap ada meskipun ada tidak nya exception
        }

        System.out.println("akhir code");
    }
}
