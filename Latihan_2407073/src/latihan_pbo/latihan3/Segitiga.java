package latihan_pbo.latihan3;

public class Segitiga extends BangunDatar {

    public double luasSegitiga() {
        return 0.5 * getAlas() * getTinggi();
    }
    
    public double kelilingSegitiga() {  // ✅ Pastikan nama ini benar
        return 3 * getAlas();  // asumsi segitiga sama sisi
    }
}