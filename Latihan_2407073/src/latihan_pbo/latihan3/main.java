package latihan_pbo.latihan3;

public class main {
    public static void main(String[] args) {
        
        // === Segitiga ===
        Segitiga segitiga = new Segitiga();  
        segitiga.setAlas(6);
        segitiga.setTinggi(4);
        
        System.out.println("Luas: " + segitiga.luasSegitiga());
        System.out.println("Keliling: " + segitiga.kelilingSegitiga());
    }
}