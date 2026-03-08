package latihan_pbo.latihan3;

public class Persegi extends BangunDatar {

    public double luasPersegi() {
        return getSisi() * getSisi();
    }

    public double kelilingPersegi() {
        return 4 * getSisi();
    }
}