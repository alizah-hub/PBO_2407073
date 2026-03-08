package latihan_pbo.latihan3;

public class Lingkaran extends BangunDatar {
    
    public double luasLingkaran() {
        return 3.14 * getSisi() * getSisi();
    }
    
    public double kelilingLingkaran() {
        return 2 * 3.14 * getSisi();
    }
}

