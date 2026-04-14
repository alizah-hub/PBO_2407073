public class Main {
    public static void main(String[] args) {
        BangunRuang balok = new BangunRuang(10, 5, 4);

        System.out.println("Luas Alas: " + balok.hitungLuas());
        System.out.println("Volume: " + balok.hitungVolume());
    }
}