package latihan_pbo.latihan6;

public class Main {
    public static void main(String[] args) {

        // Satu tipe variabel (polymorphism)
        BangunDatar bd;

        bd = new Persegi(4);
        bd.tampilkan();
        System.out.println();

        bd = new PersegiPanjang(5, 3);
        bd.tampilkan();
        System.out.println();

        bd = new Segitiga(6, 4);
        bd.tampilkan();
    }
}