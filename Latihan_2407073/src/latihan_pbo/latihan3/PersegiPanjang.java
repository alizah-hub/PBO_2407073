package latihan_pbo.latihan3;

public class PersegiPanjang extends BangunDatar {

    public double luasPersegiPanjang() {
        return getPanjang() * getLebar();
    }
    
    public double kelilingPersegiPanjang() {
        return 2 * (getPanjang() + getLebar());
    }
}
